# Diagrama projeto 01

- Principal: Classe que vai desenhar os ;
- Horario: Tempo atual;
- RelogioDigital: Conjunto de displays;
- Display: Conjunto de segmentos;
- Segmento: A, B, C, D, E, F, G.

```mermaid
classDiagram
    direction LR

    class Principal {
        -relogio: RelogioDigital
    }

    class RelogioDigital{
        -tamanho: char
        -horario: Horario
    } 
    
    class Horario {
        -horas: String 
        -minutos: String
        -segundos: String
    }

    class Display{
        -segmentos: ArrayList
    }

    class Segmento{
        -estado: boolean
    }

    Principal --* RelogioDigital
    RelogioDigital *-- Horario
    RelogioDigital *-- Display
    Display *-- Segmento

``` .


//Aluno *-- Matricula