# Introdução Java

Código fonte -> bytecode -> JVM

- Bytecode: Còdigo intermediário 
- JVM: Executa o bytecode

`tiobe.com/tiobe-index`

CamelCase classe
nome do arquivo java tem que ser o mesmo da classe

 - métodos = funções

para compilar arquivo java
    javac programa.java

nao precisa escrever .class
java programa

já compila e executa
java OlaMundo.java

//////////

gradle permite abrir projeto em outro lugar fora da idea

p criar projeto

gradle - groovy

//////

package -> Um pacote (diretório)
Guarda classes java
Convensão: Domínio da empresa invertido
poo.engtelecom.sj.ifsc.edu.br
no pacote
br.edu.ifsc.aj.engtelecom.poo

groupld
nas aulas:
engtelecom.poo

Uma classe sempre tem que estar dentro de um pacote


src/main/java/engtelecom.poo/Main.java

src/main/java/engtelecom/poo/Main.java

///////


comando kill terminal

## Retirar excesso de informações gradle

arquivo gradel.properties <br> <br>
org.gradle.console=plain <br>
org.gradle.logging.level=quiet <br>

Onde colocar o arquivo em casa:
$HOME/.gradle/gradel.properties

p exeutar em windowns
gradlew.bat

p compilar
./gradlew.bat build 


apaga script 
./gradlew clean

/










arquivo build.gradle

repositories {
(...)
}

indica de onde da internet pode baixar biliotecas de terceiros
se nao tiver ainda no projeto


dependencies  { (...) }
bibliotecas q tem q usar



plugins {
    ///////id 'java'
    id 'application'
}

c isso criamos 


explica p gradle qual a classe princial q deve ser executada
application {
    mainClass = 'engtelecom.poo.App'
}

$ ./gradlew run
Hello world!

mostra as tarefas
 ./gradlew tasks


//////
cria diretorio vazio,
dentro dele:

gradle init


Project name (default: aula-06a): 
Source package (default: aula.a): engtelecom.poo


jre
ambiente de execução java
n precisa do jdk, mas jre sim


distribuir o codigo 
installDist - Installs the project as a distribution as-is.
/gradlew installDist
meio q cria e descompacta o zip

ls -lh
total 2,8M
-rw-r--r-- 1 aluno aluno 2,7M ago 15 10:48 app.zip

 cp app.zip ~
copia p home o zip

descompactar arquivo pelo terminal
unzip app.zip


p executar aplicacao 
  inflating: app/bin/app             
  inflating: app/bin/app.bat         
aluno: ~$ cd app/
aluno: app$ ls
bin  lib
aluno: app$ ./bin/app


cat gradle/wrapper/gradle-wapper.properties
ver versao gradle


baixar biblioteca internet
dependencies {
    
    implementation 'org.fusesource.jansi:jansi:2.4.0' ///////////////
    
    testImplementation 'org.junit.jupiter:junit-jupiter:5.9.2'
    testRuntimeOnly 'org.junit.platform:junit-platform-launcher'
    implementation 'com.google.guava:guava:31.1-jre'
}


asterisco é p importar tudo q tem dentro do diretorio do asterisco
import static org.fusesource.jansi.Ansi.*;







///////


Criando gradle c vscode

mkdir aula-06b
cd aula-06b
code .

extensoes 
java auel principal  +
Gradle Extension Pack


aluno: aula-06b$ ./gradlew run --args "Luiza"
bash: ./gradlew: Arquivo ou diretório inexistente
aluno: aula-06b$ ./gradlew run --args "Luiza"


ctrl shift p 
gradle java


junit jupyter
ultimo engtelecom.poo
