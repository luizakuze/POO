- Lógica do jogo em JavanoidOO (?), uma classe para a lógica do jogo.
- Elementos em JavanoidOO ou AreaDeJogo
- TelaCompleta ----> AreaDeJogo -----> Jogo (?)

```mermaid
classDiagram
    direction LR

    class Principal {
        +main()
    }

    class Jogador {
        -nome: int
        -vidas: int
        -pontuacao: int
        +Jogador()
        +pausarJogo(e: KeyEvent): boolean
        +sairDoJogo(e: KeyEvent): boolean
        +inserirNome(): void
        +adicionarVida(): void
        +removerVida(): boolean
        +avancarNivel(): boolean
        +AumentarPontuacao(t: Tijolo): void
        +getPontuacao(): void
        +moverPlataforma(e: KeyEvent): boolean
    }

    class JavanoidOO {
        -areas: ArrayList~Areas~
        -jogador: Jogador
        -pausado: boolean
        -somLigado: boolean
        +JavanoidOO()
        +pausar(): boolean
        +fechar(): void
        +keyPressed(e: KeyEvent): void
        +keyReleased(e: KeyEvent): void
        +keyTyped(e: KeyEvent): void
        +processaTeclaPressionada(e: KeyEvent): void
    }

    class AreaDeJogo {
        -nivel: int
        -Mapa: Tijolos[][]
        -elementos: ArrayList ~Elementos~
        +AreaJogo()
        -posicionarTijolos(): void
        +pausarElementos(): boolean
        +avancarProximaAreaJogo(t: Tijolos[][]): boolean
        -reiniciarNivel(v: int): boolean
    }

    class Area {
        << Abstract >>
        -coordenadaX: int
        -coordenadaY: int
        -largura: int
        -altura: int
        +desenharArea()
    }

    class AreaPlacar {
        +AreaPlacar()
        +atualizarPlacar(j: Jogador): void
        -atualizarVida(j: Jogador): void
        -atualizarPontuacao(j: Jogador): void
    }

    class Tijolos {
        <<Enumeration>>
        FRACO
        FORTE
        INDESTRUTIVEL
        +cor(c: Color)
    }

    class Plataforma{
        -VELOCIDADE_X: final int
        -VELOCIDADE_Y: final int
        -MIN_TAM: final int
        -MAX_TAM: final int
        +Plataforma(l: largura)
        +rebaterBolinha(b: Bolinha): boolean
        +aumentarTamanho(): boolean
        +diminuirTamanho(): boolean
        -capturarPoder(p: Poder): boolean
    } 
    
    class Bolinha {
        -VELOCIDADE_X: final int
        -VELOCIDADE_Y: final int
        +Bolinha()
        +ReiniciarPosicao()
    } 

    class Tijolo {
        -estado: boolean
        -durabilidade: int
        -poder: boolean
        -tipo: Tijolos
        -valor: int
        +Tijolo()
        -derrubarPoder(): boolean
        +getDurabilidade(): int
        +colisaoBolinha(): void
    }

    class Poder {
        -VELOCIDADE_X: final int
        -VELOCIDADE_Y: int
        -tipo: Poderes
        +Poder()
        +getTipo(): void
        +encostarNaPlataforma(): boolean
    }

    class Elemento {
        <<Abstract>>
        -coordenadaX: int
        -coordenadaY: int
        -altura: int
        -largura: int
        -cor: Color
        -imagem: Image
        +desenhar(a: AreaJogo): void
        +carregarImagem(a: String): Image
    }

    class Movimento {
        <<Interface>>
        +movimentar()
    }

    class Poderes {
        <<Enumeration>>
        MAX_VELOCIDADE
        MIN_VELOCIDADE
        VIDA_EXTRA
    }

    Tijolo --|> Elemento
    Tijolo --* Poder
    Poder --|> Elemento
    Bolinha --|> Elemento
    Plataforma --|> Elemento

    Poder ..|> Movimento 
    Bolinha ..|> Movimento 
    Plataforma ..|> Movimento
    AreaDeJogo --* Plataforma
    AreaDeJogo --* Bolinha
    AreaDeJogo --* Tijolo

    JavanoidOO --* AreaDeJogo
    JavanoidOO --* AreaPlacar
    JavanoidOO --* Jogador

    AreaDeJogo --|> Area 
    AreaPlacar --|> Area 

    Principal --* JavanoidOO
    

```
