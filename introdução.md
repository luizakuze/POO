# Introdução 1 - Terminal e Git

##  Usuário associado a commits
```
git config --global user.name "Luiza Kuze" 
git config --global user.email "luizakuze08@gmail.com"
git config --global alias.tree "log --oneline --graph --decorate --all"
```

## Parte Inicial 

### Simbologias 

|Símbolo|Significado|
----|----
| ~ | Diretório "home" |
| $ | Usuário regular |
| # | Superusuário |
| . | Diretório atual |
| .. | Diretório pai |
| / ou c:\ | raíz |
| /home/usuarios/luiza | Caminho absoluto para 'luiza' |
| usuarios/luiza/| Caminho relativo para 'luiza' |

### Comandos pwd-cd-cat...

| Comando | Função |
----|----
| pwd | Listar o diretório que está |
| cd | Sem parâmetros, volta pro home |
| cat | Exibir o conteúdo de arquivos de texto |
| echo | Exibir mensagem de texto e variáveis |
| tree | Visualizar todos os diretórios a partir de um diretório específico |

### Comandos ls-cd-mkdir

| Comando | Função |
----|----
| printenv | Mostra todas as varívaeis |
| mkdir | Criar um arquivo |
| gedit | Abre arquivo para edição |
| ls -la | Mostra conteúdo do arquivo |

- **OBS:** Caso o gedit não encontre um arquivo existente com aquele nome, ele cria um.

## Explicação de avançar nos diretórios 

Ao utilizar o ``cd ..`` volta para o diretório pai.

Diretório atual: /home/aluno/ <br>
Ao usar ``cd ..`` será levado para /home/

## Maneiras de usar o comando "cat"
```
cat /home/aluno/.gitconfig 
cat ../../../home/aluno/.gitconfig^C
cat $HOME/.gitconfig
cat ~/.gitconfig
```

## Comando ECHO x CAT

### ECHO
Visualiza o conteúdo texto diretamente e variáveis. Mensagens curtas.

#### Exemplo 1:
```
echo $HOME
echo $SHELL 
echo Olá, mundo!
```
#### Exemplo 2 - Variável de ambiente:
```
export POO="Aula"
echo $POO 
```
(nesse caso, aparece "Aula" no terminal)
#### Exemplo 3 - Redimensionando a saída da mensagem:
```
echo "Olá mundo" > ola.txt
```
(nesse caso, a mensagem sai no arquivo "ola.txt")

### **CAT** 
Conteúdo texto de um arquivo.

#### Exemplo 1:

```
cat arquivo.txt
```
#### Exemplo 2 - Chamando variável de ambiente:
```
cat $HOME/.gitconfig
```

## Comandos GIT

| Comando | Função |
----|----
| git init | Inicializar o git |
| git branch -m main | Renomear a branch |
| cat ~/.gitconfig | Mostra o arquivo de configuração global do Git | 
| git status | Mostra o estado atual do repositório |
| git commit | Faz um commit |
| git commit -m "Adicionando ola" | Faz um commit com mensagem |
| git log | Mostra o histórico de commits |

- **OBS:** (o comando 'git init' mostra que vamos controlar arquivos pelo git.

### Comando cat ~/.gitconfig 
```
[user]
	name = Luiza Kuze
	email = luizakuze08@gmail.com
[alias]
	tree = log --online --graph --decorate --all
```

### Comando git status
#### Sem modificações 
```
git status       

On branch master
Your branch is up to date with 'origin/master'.

nothing to commit, working tree clean
```

#### Novo arquivo não rastreado 
```
On branch master
Your branch is up to date with 'origin/master'.

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        script.js

nothing added to commit but untracked files present (use "git add" to track)
```
