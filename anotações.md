# Introdução 1 - Terminal e Git

###  Usuário associado a commits
```
git config --global user.name "Luiza Kuze" 
git config --global user.email "luizakuze08@gmail.com"
git config --global alias.tree "log --oneline --graph --decorate --all"
```

###  Mostrando variável de ambiente
cat $HOME/.gitconfig

### Parte Inicial 

|Símbolo|Significado|
----|----
| ~ | Diretório "home" |
| $ | Usuário regular |
| # | Superusuário |

### Conceitos Diretórios

| x | Nomenclatura |
----|----
| . | Diretório atual |
| .. | Diretório pai |
| / ou c:/ | raíz |
| /home/usuarios/luiza | Caminho absoluto para 'luiza' |
| /||
- O diretório atual também pode se chamar diretório relativo.

### Comandos Terminal

| Comando | Função |
----|----
| pwd | Listar o diretório que está |
| cd | Sem parâmetros, volta pro home |
| cat | Exibir o conteúdo de arquivos de texto |




### Explicação de avançar nos diretórios 

Ao utilizar o ``cd ..`` volta para o diretório pai.

Diretório atual: /home/aluno/ <br>
Ao usar ``cd ..`` será levado para /home/

### Maneiras de usar o comando "cat"
cat /home/aluno/.gitconfig
cat ../../../home/aluno/.gitconfig^C
cat $HOME/.gitconfig
cat ~/.gitconfig

imprime variável
echo $HOME

echo $SHELL
mostra qual shell está usando

export POO="Aula"
aluno: jvm$ echo $POO

### Comandos ls-cd-mkdir

printenv Mostra todas as varívaeis.


mkdir cria arquivo

cd primeiro/


ls -la Mostra oq tem dentro



(> rediresiona p onde sai a msg)
echo "Olá mundo" > ola.txt


ls -l

cat ola.txt mostra arquivo

git init (mostra q vai querer controlar arquivos pelo git)

aluno: primeiro$ git branch -m main                   /trocar nome bracnh



aluno: primeiro$ cat ~/.gitconfig
[user]
	name = Luiza Kuze
	email = luizakuze08@gmail.com
[alias]
	tree = log --online --graph --decorate --all

****

aluno: primeiro$ tree


comando tree


cd.git 
tree



git status         

aluno: primeiro$ git status
On branch main

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
	ola.txt

nothing added to commit but untracked files present (use "git add" to track)
aluno: primeiro$ git add ola.txt
aluno: primeiro$ git status 
On branch main

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
	new file:   ola.txt

aluno: primeiro$ 





luno: primeiro$ git commit -m "Adicionando ola"
[main (root-commit) 56dce63] Adicionando ola
 1 file changed, 1 insertion(+)
 create mode 100644 ola.txt


///


git config 

cat $HOME/.gitconfig

cd /tmp
pwd
cd

cd /home/aluno

cd ../home/aluno

cd ../aluno

cd ../home/aluno

cd ../../usr/lib/jvm

cat /home/aluno/.gitconfig

echo $SHELL

export POO = "Aula"

echo $POO

ls -la

echo "Ola mundo" > ola.txt

cat ola.txt

git init

git branch -m main

cat ~/.gitconfig

tree

git add ola.txt

git status

git commit -m "adicionando ola"

git tree

git log


