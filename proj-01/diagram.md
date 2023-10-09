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
        -horario: Horario
        -displays: ArrayList< Display >
        -cor: string
        -tamanho: char
        -coordenadaX: int
        -coordenadaY: int
        +RelogioDigital(t: char, h: Horario)
    } 
    
    class Horario {
        -horas: int 
        -minutos: int
        -segundos: int
        +Horario (h: int, m: int, s: int);
    } 

    class Display{
        -segmentos: ArrayList< Segmento >
        +Display()
    }

    class Segmento{
        -coordenadaX: int
        -coordenadaY: int
        -estado: boolean
        +Segmento()
    }

    RelogioDigital *-- Horario
    RelogioDigital "1" *-- "6" Display
    Display "1" *-- "1" Segmento

    Principal ..> RelogioDigital

``` .

    <!-- class Horario {
        -horas: int 
        -minutos: int
        -segundos: int
        +Horario (h: int, s: int, s: int);
    } 
    
    
    RelogioDigital *-- Horario-->