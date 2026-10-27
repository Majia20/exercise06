# Esercizio di risoluzione di un merge conflict

**Il tempo massimo in laboratorio per questo esercizio è di _20 minuti_.
Se superato, sospendere l'esercizio e riprenderlo per ultimo!**

Si visiti https://github.com/APICe-at-DISI/OOP-git-merge-conflict-test.
Questo repository contiene due branch: `master` e `feature`

Per ognuna delle seguenti istruzioni, si annoti l'output ottenuto.
Prima di eseguire ogni operazione sul worktree o sul repository,
si verifichi lo stato del repository con `git status`.

1. Si cloni localmente il repository
    git clone git@github.com:APICe-at-DISI/OOP-git-merge-conflict-test.git eser61
   
3. Ci si assicuri di avere localmente entrambi i branch remoti
    git branch
   git checkout -b myfeature git@github.com:APICe-at-DISI/OOP-git-merge-conflict-test.git/feature

5. Si faccia il merge di `feature` dentro `master`, ossia: si posizioni la `HEAD` su `master`
   e da qui si esegua il merge di `feature`
    git merge myfeature
Auto-merging HelloWorld.java
CONFLICT (content): Merge conflict in HelloWorld.java
Automatic merge failed; fix conflicts and then commit the result.

 MINGW64 ~/eser61 (master|MERGING)
$ git add HelloWorld.java

 MINGW64 ~/eser61 (master|MERGING)
$ git commit -m "resolve conflict"
[master 74a782c] resolve conflict

7. Si noti che viene generato un **merge conflict**!
8. Si risolva il merge conflict come segue:
   - Il programma Java risultante deve stampare sia il numero di processori disponibili
     (funzionalità presente su `master`)
     che il nome dell'autore del file
     (funzionalità presente su `feature`)
9. Si crei un nuovo repository nel proprio github personale
10. Si aggiunga il nuovo repository creato come **remote** e si elenchino i remote
     git remote add myorigin git@github.com:eser61.git

12. Si faccia push del branch `master` sul proprio repository
     git push myorigin master

14. Si setti il branch remoto `master` del nuovo repository come *upstream* per il proprio branch `master` locale
 git branch --set-upstream-to=myorigin/master
