/**
 * 
 */
package cuatrovientos.org.dam.ed.ejercicio13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cuatrovientos.org.dam.ed.ejercicio13.Producto;

/**
 * @author Danie
 *
 */
class ProductoTest {

	/**
	 * Test method for {@link cuatrovientos.org.dam.ed.ejercicio13.Producto#precioTotal()}.
	 */
	@Test
	void testPrecioTotal() {
		Producto producto = new Producto("Patata", 2f, 5);
		//Expected
		float precioTotalReal = producto.precioTotal();
		
		//Actual
		float precioReal = producto.getPrecio();
		float cantidadReal = producto.getCantidad();
		float precioTotalActual = precioReal * cantidadReal;
		
		//Asserts
		assertEquals(precioTotalReal, precioTotalActual,"El precio total no saca exactamente lo que debe");
	}

}
