package entornos;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculadoraRiesgoTest {
    CalculadoraRiesgo calc = new CalculadoraRiesgo();

    @Test
    void testEdadNegativa() {
        assertEquals("Error", calc.evaluarEdad(-5));
    }

    @Test
    void testAdulto() {
        assertEquals("Adulto", calc.evaluarEdad(25));
    }
    
    @Test
    void testSenior() {
        assertEquals("Senior", calc.evaluarEdad(70));
    }

    @Test
    void testLimiteDe18() {
        // En 18 años exactos, entra en la categoría "Adulto" porque no es < 18.
        assertEquals("Adulto", calc.evaluarEdad(18));
    }
    
    @Test
    void testLimiteJoven() {
        assertEquals("Joven", calc.evaluarEdad(17));
    }
}
