/**
 * 
 */
package cuatrovientos.org.dam.ed.ejercicio22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cuatrovientos.org.dam.ed.ejercicio13.Producto;

/**
 * @author Danie
 *
 */
class TransporteTest {

	/**
	 * Test method for {@link cuatrovientos.org.dam.ed.ejercicio22.Transporte#pesoTotal()}.
	 */
	@Test
	void testPesoTotal() {
		Camioneta camioneta = new Camioneta();
		//Expected
		float pesoReal = camioneta.pesoTotal();
		//Actual
		float pesoActual = 0;
		//Asserts
		assertEquals(pesoReal, pesoActual, "El precio total no saca exactamente lo que debe");
	}

	/**
	 * Test method for {@link cuatrovientos.org.dam.ed.ejercicio22.Transporte#recorrerDistancia()}.
	 */
	@Test
	void testRecorrerDistancia() {
		Camioneta camioneta = new Camioneta();
		//Expected
		float recorridoReal = camioneta.recorrerDistancia();
		//Actual
		float recorridoActual = 70;
		//Asserts
		assertEquals(recorridoReal, recorridoActual, "El precio total no saca exactamente lo que debe");
	}

}
