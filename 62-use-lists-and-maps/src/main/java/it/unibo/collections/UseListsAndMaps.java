package it.unibo.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/**
 * Example class using {@link List} and {@link Map}.
 *
 */
public final class UseListsAndMaps {

    private UseListsAndMaps() {
    }

    /**
     * Program entry point.
     */
    public static void main() {
        /*
         * 1) Create a new ArrayList<Integer>, and populate it with the numbers
         * from 1000 (included) to 2000 (excluded).
         */

        ArrayList<Integer> array = new ArrayList<>();
        for(int i = 1_000 ; i < 2_000 ; i++){
            array.add(i);
        }
        /*
         * 2) Create a new LinkedList<Integer> and, in a single line of code
         * without using any looping construct (for, while), populate it with
         * the same contents of the list of point 1.
         */
        List<Integer> list = new LinkedList<>(array);
        
        /*
         * 3) Using "set" and "get" and "size" methods, swap the first and last
         * element of the first list. You can not use any "magic number".
         * (Suggestion: use a temporary variable)
         */
        int n = array.getFirst();
        array.set(array.size() - array.size(), array.getLast());
        array.set(array.size()-1, n);
        
        /*
         * 4) Using a single for-each, print the contents of the arraylist.
         
        for (int num : array){
            IO.println("numero: " + num);
        }*/
        /*
         * 5) Measure the performance of inserting new elements in the head of
         * the collection: measure the time required to add 100.000 elements as
         * first element of the collection for both ArrayList and LinkedList,
         * using the previous lists. In order to measure times, use as example
         * TestPerformance.java.
         */
         
        long time = System.nanoTime();

        final int ELEM = 100_000;
        for (int i = 0 ; i < ELEM ; i++){
            array.addFirst(i);
        }
        time = System.nanoTime() - time;
        IO.println("time di arraylist: " + time);

        time = System.nanoTime();

        for (int i = 0 ; i < ELEM ; i++){
            list.addFirst(i);
        }
        time = System.nanoTime() - time;
        IO.println("time di linkedlist: " + time);
        
        /*
         * 6) Measure the performance of reading 1000 times an element whose
         * position is in the middle of the collection for both ArrayList and
         * LinkedList, using the collections of point 5. In order to measure
         * times, use as example TestPerformance.java.
         
        final int NUM_TO_READ = 1_000;
        time = System.nanoTime();

        for (int i = 0 ; i < NUM_TO_READ ; i++){
            array.get(((int)array.size()) / 2);
        }
        time = System.nanoTime() - time;
        IO.println("time to read di arraylist: " + time);

        time = System.nanoTime();

        for (int i = 0 ; i < NUM_TO_READ ; i++){
            list.get(((int)array.size()) / 2);
        }
        time = System.nanoTime() - time;
        IO.println("time to read di linkedlist: " + time);
        

        /*
         * 7) Build a new Map that associates to each continent's name its
         * population:
         *
         * Africa -> 1,110,635,000
         *
         * Americas -> 972,005,000
         *
         * Antarctica -> 0
         *
         * Asia -> 4,298,723,000
         *
         * Europe -> 742,452,000
         *
         * Oceania -> 38,304,000
         */
        TreeMap<String, Long> map = new TreeMap<>();
        map.put("africa", 1_110_635_000L);
        map.put("america", 972_005_000L);
        map.put("antartica", 0L);
        map.put("asia", 4_298_723_000L);
        map.put("europe", 742_452_000L);
        map.put("oceania", 38_304_000L);
        /*
         * 8) Compute the population of the world
         */
        long sum = 0;
        String Key = map.firstKey();
        while (map.higherKey(Key) != null){
            sum += map.get(Key); 
            Key = map.higherKey(Key);
        }
        IO.println("somma è " + sum);
    }
}
