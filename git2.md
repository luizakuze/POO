mkdir -p poo/aula-01 poo/aula-02 poo/aula-03
aluno: terceiro$ 
aluno: terceiro$ mkdir -p red1/aula-01 red1/aula-02


for i in $(seq 1 9); do touch poo/aula-01/$i.java; done


class é gerado a partir de um arquivo java

Adiciona arquivos com extensão .java
git add * .java

No arquivo escreve arquivos q quer ignorar
Ao criar um repositório, crir um arquivo desse
nome arquivo: .gitignore

*.class

*.class
*.log
!aula/*.log nao exclui o ponto log de aula

gitignore.io


"git rm --cached <file>" tira esses arquivos se colocar
https://www.toptal.com/developers/gitignore/api/java,linux,windows,intellij,visualstudiocode

mudar p maina master
git branch -M main



aluno: terceiro$ git remote add origin https://github.com/luizakuze/aula-poo-git.git

aluno: terceiro$ git remote -v
origin	https://github.com/luizakuze/aula-poo-git.git (fetch)
origin	https://github.com/luizakuze/aula-poo-git.git (push)


o U cria o ramo
git push -u origin main

aluno: terceiro$ git tree
* ba30c08 (HEAD -> master) Iniciando Repositório
aluno: terceiro$ git status
On branch master
nothing to commit, working tree clean
aluno: terceiro$ git branch -M main
aluno: terceiro$ git remote add origin https://github.com/luizakuze/aula-poo-git.git
aluno: terceiro$ git remote -v
origin	https://github.com/luizakuze/aula-poo-git.git (fetch)
origin	https://github.com/luizakuze/aula-poo-git.git (push)
aluno: terceiro$ git push -u origin main
Username for 'https://github.com': luizakuze 
Password for 'https://luizakuze@github.com': 
remote: Support for password authentication was removed on August 13, 2021.
remote: Please see https://docs.github.com/en/get-started/getting-started-with-git/about-remote-repositories#cloning-with-https-urls for information on currently recommended modes of authentication.
fatal: Authentication failed for 'https://github.com/luizakuze/aula-poo-git.git/'
aluno: terceiro$ git push -u origin main
Username for 'https://github.com': luizakuze
Password for 'https://luizakuze@github.com': 
Enumerating objects: 9, done.
Counting objects: 100% (9/9), done.
Delta compression using up to 4 threads
Compressing objects: 100% (8/8), done.
Writing objects: 100% (9/9), 2.33 KiB | 797.00 KiB/s, done.
Total 9 (delta 0), reused 0 (delta 0), pack-reused 0
To https://github.com/luizakuze/aula-poo-git.git
 * [new branch]      main -> main
Branch 'main' set up to track remote branch 'main' from 'origin'.
aluno: terceiro$ 















touch novo.txt
aluno: terceiro$ git add novo.txt
aluno: terceiro$ git commit -m "novo arquivo"



p deixar na mesma linha :
*** 5661561 (HEAD -> main) novo arquivo
* ba30c08 (origin/main) Iniciando Repositório
****
git push
