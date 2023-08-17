# Programação Orientada a Objetos

_LEMBRETE: Comparar strings usando o equals `str1.equals(str2);`_

## Paradigmas

Um paradigma é uma abordagem/estilo de escrever um código de programação.

- **Paradigma sequencial** - Usar uma sequência (goto, jump..)
- **Paradigma procedural/estruturada** - Sequências e repetições.
- **Paradigma poo** -  Cada objeto tem uma tarefa específica e esses objetos trocam mensagens entre si.

## Objetos
- **Identificável** - 
- **Estado** - Características - `atributo`
- **Comportamento** - Função - `método`

Inicialmente...<br>
Classes - PUBLIC <br>
Atributos - PRIVATE <br>

## Atributos
- São as características do objeto.
- Podemos ver no código os atributos como variáveis privadas dentro de um objeto.
- Sendo privadas, não são acessíveis de fora da classe. É preciso do método `getter` e `setter` para acessar e alterar o seu valor.


Então... dada uma classe Pessoa que tem o atributo "nome"
```java
public class Pessoa {
    private String nome;
    ///(...)
}
```

### Getter 
Poderiamos usar o getter para acessar o atributo.
```java
public String getNome() {
    return nome;
}
```
  abobora
### Setter
Além disso, utilizar o setter para modificar o atributo.
```java
    public void setNome(String novoNome) {
        nome = novoNome;
```

## Métodos
Quando é preciso que esse objeto realize alguma função, é preciso criar um método para isso. <br> No exemplo abaixo, foi criado um método para uma classe chamada Calculadora.
```java
public class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }
}
```