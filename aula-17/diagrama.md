## Anotações 📝
- E se chegar em um número máximo de tesouros?
- Algum robô vai ganhar? O com mais tesouros ou com tesouros mais valiosos.
- A dimensão inicial de um robô deve ser proporcional à área de exploração e aos tesouros.
- Robô tem um identificador
- Ao descartar um tesouro para pegar outro mais valioso, o robô pode descartar o tesouro na área de exploração

## Diagrama 🤖
```mermaid
classDiagram
    direction LR

    class Robo {
        -id: char
        -velocidadeX: int
        -velocidadeY: int
        -coordenadaX: int
        -coordenadaY: int
        -armazenamento: ArrayList < Tesouro >
        +tamanho: int
        +Robo(id: char, x: int, y: int)
        +totalTesouros()
        +movimentarRobo(o: string)
        +coletarTesouro(t: Tesouro)
        +descartarTesouro(t: Tesouro)
    }

    class Tesouro {
        -coordenadaX: int
        -coordenadaY: int
        -valor: int
        +tamanho: int
        +Tesouro(x: int, y: int)
        +mostraValor()
    }

    class AreaExploracao {
        -tesouros: ArrayList < Tesouro >
        -largura: int
        -altura: int
        +AreaExploracao(l: int, a: int)
        -registrarTesouros()
        +receberTesouro(t: Tesouro)
        +removerTesouro(x: int, y: int)
    }

    class Principal {
        -area: AreaExploracao
        -robos: ArrayList < Robo >
        +movimentaRobo(id: char)
        -encontrouTesouro(id: char, t: Tesouro)
        +descartarTesouro()
        +exibirPontuacao()
    }

    AreaExploracao "1" *--> "1.." Tesouro
    Robo "1" *--> "1.." Tesouro
    Principal "1" *--> "1..*" Robo
    Principal "1" *--> "1" AreaExploracao

``` 