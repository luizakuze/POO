package engtelecom.poo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MapaTest {

    @Test
    public void testarPosicionaTesouros() {
        Mapa mapa = new Mapa(10, 10, 5);
        mapa.posicionaTesouros();
        int totalTesouros = mapa.getTesouros().size();
        assertEquals(5, totalTesouros);
    }

    // @Test
    // public void testarColetarTesouro() {
    // Mapa mapa = new Mapa(10, 10, 1);
    // Tesouro tesouro = new Tesouro(5, 5, 100);

    // }
}
