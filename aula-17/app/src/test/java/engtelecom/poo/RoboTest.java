package engtelecom.poo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class RoboTest {
    
    @Test
    public void posicionarRobo(int direcao){

        Mapa mapa = new Mapa(100, 100, 1);
        Robo robo = new Robo(mapa, 1, 2, 5);

        assertTrue(robo.posicionarRoboNoMapa(mapa));
        
        assertFalse(robo.posicionarRoboNoMapa(new Mapa(1,100,1)));
        //mapa = new Mapa(1, 1, 1);
        //assertFalse(robo.posicionarRoboNoMapa(mapa));

        assertFalse(robo.posicionarRoboNoMapa(new Mapa(100,1,1)));

        // aqui não testamos valores negativos
    }

}
