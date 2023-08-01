code . 

. diretorio q esta abre


/////////


dtrl j abre terminal vscode


está na branch master

mostra arquivos q n esta controlndo 

On branch master

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        primeiro.md

////
adicionando arquivo

aluno: segundo$ git add primeiro.md
aluno: segundo$ git commit -m "Adicionando primeiro"

////


git tree historico de commits

tree arvore do diretorio atual

/////


* 817ed09 (HEAD -> main) Adicionando terceiro
* c278ee7 Adicionando segundo
* 9b38b62 Adicionando primeiro

git lod dá mais detalhes
////////

fechar vscode salvando 

dando 2 comandos ao mesmo tempo
se o primeiro tiver sucesso, faz o outro
git add arquivo.md && git commit -m "mensagem de commit"
add ou restore

On branch main
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
	modified:   primeiro.md

no changes added to commit (use "git add" and/or "git commit -a")
aluno: segundo$ git restore primeiro.md
aluno: segundo$ git status
On branch main
nothing to commit, working tree clean
aluno: segundo$ cat primeiro.md
# Aula de git

aluno: segundo$ 



////////
EXPLICACAO HEAD

Se der ls, são os commits do HEAD

* 817ed09 (HEAD -> main) Adicionando terceiro

muda p onde o head olha
git checkout 9b38b62

aluno: segundo$ git tree
* 817ed09 (main) Adicionando terceiro
* c278ee7 Adicionando segundo
* 9b38b62 (HEAD) Adicionando primeiro


aluno: segundo$ git checkout main
 p voltar p main


git diff primeiro.md alterações que teve no commit

Changes tem mudanças 
Staged Changes

extensao GitLens — Git supercharg
markdown github


noa brach

aluno: segundo$ git branch dev

aluno: segundo$ git branch
  dev
* main
qualk esta


 git checkout dev

muda ramo dev


/////////

mesclar tdo do dev p main
 git merge dev


apos fazer o merge n faz sentiod manter essa branch, 
agora p excluir o dev
 git branch -d dev

///
cria novo ramo e muda p ele ja no head
 git checkout -b dev

tira um arquivo do commit
git restore --staged segundo.md


to no main
tras o dev 

aluno: segundo$ git merge dev
Auto-merging segundo.md
CONFLICT (content): Merge conflict in segundo.md
Automatic merge failed; fix conflicts and then commit the result.
