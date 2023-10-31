## Anotações 📝
- E se chegar em um número máximo de tesouros?
- Algum robô vai ganhar? O com mais tesouros ou com tesouros mais valiosos.
- A dimensão inicial de um robô deve ser proporcional à área de exploração e aos tesouros.
- Robô tem um identificador
- Ao descartar um tesouro para pegar outro mais valioso, o robô pode descartar o tesouro na área de exploração

// dependencia nunca tem um atributo d tipo massa (m: mapa)

## Diagrama 🤖
```mermaid
classDiagram
    direction LR

    class Robo {
        -velocidadeX: int
        -velocidadeY: int
        -coordenadaX: int
        -coordenadaY: int
        -armazenamento: ArrayList < Tesouro >
        -capacidade: int
        +Robo(x: int, y: int, N: int)
        +totalTesouros()
        +movimentarRobo(o: string)
        +coletarTesouro(t: Tesouro)
        +descartarTesouro(t: Tesouro)
    }

    class Tesouro {
        -coordenadaX: int
        -coordenadaY: int
        -valor: int
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
        +removerTesouro(t: Tesouro)
    }

    class Principal {
        -area: AreaExploracao
        -robos: ArrayList < Robo >
        +movimentaRobo(o: string, r: Robo)
        -encontrouTesouro(r: Robo)
        +descartarTesouro()
        +exibirPontuacao()
    }

    AreaExploracao "1" *--> "1.." Tesouro
    Robo "1" *--> "1.." Tesouro
    Principal "1" *--> "1..*" Robo
    Principal "1" *--> "1" AreaExploracao

``` 