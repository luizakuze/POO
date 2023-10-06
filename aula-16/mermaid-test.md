# Usando mermaid para criar um diagrama UML
Exemplo abaixo utilizando uma classe Aluno e outra classe Matrícula.

```mermaid
classDiagram
    direction LR

    class Aluno{
      -String nome
      -LocalDate dataDeNascimento
      -Matricula matricula
      +obterIdade() int
      +alterDataDeNascimento(data) boolean
    }

    class Matricula{
      -int numero
      -int digitoVerificador
    }

    Aluno *-- Matricula
``` .
