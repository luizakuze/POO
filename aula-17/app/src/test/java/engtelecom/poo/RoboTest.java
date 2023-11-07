// package engtelecom.poo;

// import org.junit.jupiter.api.Test;
// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertTrue;
// import static org.junit.jupiter.api.Assertions.assertFalse;

// public class RoboTest {

//     @Test
//     public void testarPosicionarRobo() {

//         Mapa mapa = new Mapa(100, 100, 1);
//         Robo robo = new Robo(mapa, 10, 10, 1, 2, 5);

//         assertTrue(robo.posicionarRoboNoMapa(mapa));

//         assertFalse(robo.posicionarRoboNoMapa(new Mapa(1, 100, 1)));
//         // mapa = new Mapa(1, 1, 1);
//         // assertFalse(robo.posicionarRoboNoMapa(mapa));

//         // tenta posicionar o robô em um mapa com altura inadequada (limite de altura = 1)
//         assertFalse(robo.posicionarRoboNoMapa(new Mapa(100, 1, 1)));
//     }

//     @Test
//     public void testarAdicionarTesouro() {
//         Mapa mapa = new Mapa(100, 100, 1);
//         Robo robo = new Robo(mapa, 10, 10, 1, 2, 5);

//         Tesouro tesouro = new Tesouro(10, 10, 10);

//         // adiciona tesouros até a capacidade máxima da mochila
//         for (int i = 0; i < robo.getCapacidadeMochila(); i++) {
//             assertTrue(robo.adicionarTesouro(tesouro));
//         }

//         // tenta adicionar um tesouro extra
//         assertFalse(robo.adicionarTesouro(tesouro));
//     }

//     @Test
//     public void testarRemoverTesouro() {
//         Mapa mapa = new Mapa(100, 100, 1);
//         Robo robo = new Robo(mapa, 1, 2, 5);
        
//         // adiciona um tesouro à mochila
//         Tesouro tesouro = new Tesouro(10, 10, 10);
//         robo.adicionarTesouro(tesouro);

//         // remove com tesouros na mochila
//         assertEquals(tesouro, robo.removerTesouro());

//         // remover com mochila vazia
//         assertEquals(null, robo.removerTesouro());
//     }

//     @Test
//     public void testarPontuacao() {
//         Mapa mapa = new Mapa(100, 100, 1);
//         Robo robo = new Robo(mapa, 1, 2, 5);
//         Tesouro tesouro = new Tesouro(10, 10, 10);

//         // verifica se a pontuação inicial é zero
//         assertEquals(0, robo.pontuacao());

//         // pontuação do robô com um tesouro
//         robo.adicionarTesouro(tesouro);
//         assertEquals(10, robo.pontuacao());
//     }

//     @Test
//     public void testarMovimentar() {
//         Mapa mapa = new Mapa(9, 9, 1);
//         Robo robo = new Robo(mapa, 5, 5, 5);

//         // para cima com sucesso
//         assertTrue(robo.movimentar(0));

//         // chega no limite, porém pode se movimentar até altura máxima
//         assertTrue(robo.movimentar(0));

//         // passando o limite para cima, não consegue mais se movimentar
//         assertFalse(robo.movimentar(0));

//         // para a direita com sucesso
//         assertTrue(robo.movimentar(1));

//         // para baixo com sucesso
//         assertTrue(robo.movimentar(2));

//         // para a esquerda com sucesso
//         assertTrue(robo.movimentar(3));
//     }
// }