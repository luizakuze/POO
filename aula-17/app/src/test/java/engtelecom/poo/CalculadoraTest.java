package engtelecom.poo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
    
    @Test
    public void testarSomaPositivos(){
        assertEquals(3, Calculadora.soma(1, 2));
        assertEquals(3, Calculadora.soma(2, 1));
        assertEquals(1, Calculadora.soma(0, 1));
        assertEquals(1, Calculadora.soma(1, 0));
        assertEquals(0, Calculadora.soma(0, 0));

    }

    @Test
    public void testarSomaNegativos(){
        assertEquals(-3, Calculadora.soma(-1, -2));
        assertEquals(-3, Calculadora.soma(-2, -1));
        assertEquals(1, Calculadora.soma(-1, 2));
        assertEquals(0, Calculadora.soma(1, -1));
        assertEquals(1, Calculadora.soma(-0, 1));
        assertEquals(0, Calculadora.soma(-0, -0));

    }

    @Test
    public void testarTipoEquilatero(){
        assertEquals("Equilátero", Calculadora.tipoDoTriangulo(1, 1, 1));

    }

    @Test
    public void testarTipoIsosceles(){
        assertEquals("Isósceles", Calculadora.tipoDoTriangulo(1, 1, 2));
        assertEquals("Isósceles", Calculadora.tipoDoTriangulo(2, 1, 1));
        assertEquals("Isósceles", Calculadora.tipoDoTriangulo(1, 2, 1));
    }

    @Test 
    public void testarTipoEscaleno(){
        assertEquals("Escaleno", Calculadora.tipoDoTriangulo(8, 4, 5));
    }

    @Test
    public void testarTipoNaoExistente(){
        assertEquals("Triângulo não existe", Calculadora.tipoDoTriangulo(1, 2, 3));
        assertEquals("Triângulo não existe", Calculadora.tipoDoTriangulo(2, 3, 1));
        assertEquals("Triângulo não existe", Calculadora.tipoDoTriangulo(3, 1, 2));
        assertEquals("Triângulo não existe", Calculadora.tipoDoTriangulo(1, 1, 1));
        assertEquals("Triângulo não existe", Calculadora.tipoDoTriangulo(-1, -2, -3));
        assertEquals("Triângulo não existe", Calculadora.tipoDoTriangulo(-1, -2, 3));
        assertEquals("Triângulo não existe", Calculadora.tipoDoTriangulo(-1, 2, 3));
        
    }

}
