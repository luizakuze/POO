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
aluno: terceiro$ 

o U cria o ramo
git push -u origin main

