# Anotações - Gradle e pacotes

## Gradle 
O gradle permite abrir um projeto java fora da idea.

Caso o gradle mostre muitas mensagens na saída, <br>
proceder da seguinte forma:

1 - Criar um arquivo chamado `gradel.properties`; <br>
2 - Escrever nesse arquivo: 
```
org.gradle.console=plain
org.gradle.logging.level=quiet
```

_Durante as aulas, ocorreu um erro ao inicializar o Intellij (IDE utilizada), pois foi instalado utilizando o "snap" que pode ocasionar alguns erros para alguns programas instalados. Então, solucionamos o problema com o comando "kill" para encerrar o processo e abrir novamente a IDE._

## Package (pacote)

Os pacotes servem para organizar a aplicação java. <br>
Um pacote pode ser visto como um diretório do projeto.

Os pacotes "empacotam" classes.

Convensão:
Utilizar o domínio da impresa invertido.


Exemplo - Domínio do ifsc 

`poo.engtelecom.sj.ifsc.edu.br` <br>

Invertendo:<br>
`br.edu.ifsc.aj.engtelecom.poo`<br>

Para nossas aulas:<br>
`engtelecom.poo`<br>

O caminho ficou da seguinte forma no projeto:
`src/main/java/engtelecom/poo/Main.java`
