package engtelecom.poo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class RoboTest {

    @Test
    public void testarPosicionarRobo(int direcao) {

        Mapa mapa = new Mapa(100, 100, 1);
        Robo robo = new Robo(mapa, 1, 2, 5);

        assertTrue(robo.posicionarRoboNoMapa(mapa));

        assertFalse(robo.posicionarRoboNoMapa(new Mapa(1, 100, 1)));
        // mapa = new Mapa(1, 1, 1);
        // assertFalse(robo.posicionarRoboNoMapa(mapa));

        // Tenta posicionar o robô em um mapa com altura inadequada (limite de altura =
        // 1)
        assertFalse(robo.posicionarRoboNoMapa(new Mapa(100, 1, 1)));
    }

    @Test
    public void testarAdicionarTesouro() {
        Mapa mapa = new Mapa(100, 100, 1);
        Robo robo = new Robo(mapa, 1, 2, 5);
        Tesouro tesouro = new Tesouro(); // Supondo que você tenha uma classe Tesouro

        // Adiciona tesouros até a capacidade máxima da mochila
        for (int i = 0; i < robo.getCapacidadeMochila(); i++) {
            assertTrue(robo.adicionarTesouro(tesouro));
        }

        // Tenta adicionar um tesouro extra, o que deve falhar
        assertFalse(robo.adicionarTesouro(tesouro));
    }

    @Test
    public void testarRemoverTesouro() {
        Mapa mapa = new Mapa(100, 100, 1);
        Robo robo = new Robo(mapa, 1, 2, 5);
        Tesouro tesouro = new Tesouro(); // Supondo que você tenha uma classe Tesouro

        // Adiciona um tesouro à mochila
        assertTrue(robo.adicionarTesouro(tesouro));

        // Remove o tesouro da mochila
        Tesouro tesouroRemovido = robo.removerTesouro();

        // Verifica se o tesouro foi removido com sucesso
        assertNotNull(tesouroRemovido);
    }

    @Test
    public void testarPontuacao() {
        Mapa mapa = new Mapa(100, 100, 1);
        Robo robo = new Robo(mapa, 1, 2, 5);

        // Verifica se a pontuação inicial é zero
        assertEquals(0, robo.pontuacao());
    }

    @Test
    public void testarMovimentar() {
        Mapa mapa = new Mapa(100, 100, 1);
        Robo robo = new Robo(mapa, 1, 2, 5);

        // Verifica se o robô pode se mover para cima com sucesso
        assertTrue(robo.movimentar(0));

        // Verifica se o robô pode se mover para a direita com sucesso
        assertTrue(robo.movimentar(1));

        // Verifica se o robô pode se mover para baixo com sucesso
        assertTrue(robo.movimentar(2));

        // Verifica se o robô pode se mover para a esquerda com sucesso
        assertTrue(robo.movimentar(3));

        // Tenta mover o robô para fora dos limites do mapa, o que deve falhar
        assertFalse(robo.movimentar(0));
        assertFalse(robo.movimentar(1));
        assertFalse(robo.movimentar(2));
        assertFalse(robo.movimentar(3));
    }
}