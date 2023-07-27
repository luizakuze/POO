## Anotações


git config --global alias.tree "log --oneline --graph --decorate --all"

cat $HOME/.gitconfig
-> Variaǘel de ambiente
/home/aluno

~$   

$ Usuário regular

~   É o diretório "home"

pwd -> Lista diretorio que está ///////

cd -> Sem parâmetro, volta pro home

cd .. -> Sobe 

cd /home/aluno -> Diretório absoluto (Smpre começa coma  raíz (/) (no windowns c::/)) //////

. -> Diretório atual
.. -> Diretório pai

Diretório relativo -> Atual

cd ../aluno -> volta p home se estiver no aluno //////

/////////////

cd /usr/lib/jvm

cd ../../usr/lib/jvm


cat -> listar conteudo de um arquivo

cat /home/aluno/.gitconfig caminho absoluto
cat ../../../home/aluno/.gitconfig^C
cat $HOME/.gitconfig
cat ~/.gitconfig

////////


imprime variável
echo $HOME

echo $SHELL
mostra qual shell está usando

aluno: jvm$ export POO="Aula"
aluno: jvm$ echo $POO


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





