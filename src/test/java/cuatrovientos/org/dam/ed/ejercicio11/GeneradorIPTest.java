package cuatrovientos.org.dam.ed.ejercicio11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import cuatrovientos.org.dam.ed.ejercicio12.GeneradorIP;

public class GeneradorIPTest {

    @Test
    void testGenerarNumero() {
        GeneradorIP generador = new GeneradorIP();

        // Expected
        int min = 0;
        int max = 254;

        // Actual
        int actual = generador.generarNumero(min, max);

        // Assertions
        assertTrue(actual >= min && actual <= max, "El número creado no está entre 0 y 254");
    }
/**

@throws*/@Test
  void testGeneraIp() {
      GeneradorIP generador = new GeneradorIP();

        // Actual
        String ipGenerada = generador.generarIp();

        // Assertions
        assertFalse(ipGenerada.startsWith("0") || ipGenerada.endsWith("0"), "La IP no debe empezar ni terminar con 0");
    }

}
