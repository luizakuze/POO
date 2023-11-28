package engtelecom.poo;

import java.awt.Color;
import java.awt.Image;

public abstract class Elemento {
    private int coordenadaX;
    private int coordenadaY;
    private int altura;
    private int largura;
    private Color cor;
    private Image imagem;

    public abstract void desenhar(AreaDoJogo area);
    public abstract Image carregarImagem();
}


//         <<Abstract>>
//         -coordenadaX: int
//         -coordenadaY: int
//         -altura: int
//         -largura: int
//         -cor: Color
//         -imagem: Image
//         +desenhar(a: AreaJogo): void
//         +carregarImagem(a: String): Image