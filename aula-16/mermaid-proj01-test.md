# Diagrama projeto 01

```mermaid
classDiagram
    direction LR

    class Principal {
        -relogio: ArrayList< RelogioDigital >
        +menu()
        +main()
    }

    class RelogioDigital{
        -tamanho: char
        -horario: Horario
        +RelogioDigital(t: char, h: Horario)
    } 
    
    class Horario {
        -horas: int 
        -minutos: int
        -segundos: int
        +Horario (h: int, s: int, s: int);
    }

    class Display{
        -segmentos: ArrayList< Segmento >
        +Display()
    }

    class Segmento{
        -estado: boolean
        +Segmento()
    }

    RelogioDigital *-- Horario
    RelogioDigital *-- Display
    Display *-- Segmento

    Principal ..> RelogioDigital

``` .
