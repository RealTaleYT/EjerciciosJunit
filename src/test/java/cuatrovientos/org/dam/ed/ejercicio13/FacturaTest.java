/**
 * 
 */
package cuatrovientos.org.dam.ed.ejercicio13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cuatrovientos.org.dam.ed.ejercicio13.Factura;

/**
 * @author Danie
 *
 */
class FacturaTest {

	/**
	 * Test method for {@link cuatrovientos.org.dam.ed.ejercicio13.Factura#totalFactura()}.
	 */
	@Test
	void testTotalFactura() {
		Factura factura = new Factura("Patata", 2f, 5);
		
		//Expected
		float precioTotalReal = factura.totalFactura();
		
		//Actual
		float precioTotalActual = 0;
		for (int i = 0 ; i < factura.productos.size() -1; i++) {
			precioTotalActual += factura.productos.get(i).precioTotal();
		}
		
		//Asserts
		assertEquals(precioTotalReal, precioTotalActual,"El precio total no saca exactamente lo que debe");
	}

	/**
	 * Test method for {@link cuatrovientos.org.dam.ed.ejercicio13.Factura#aplicarIva(float)}.
	 */
	@Test
	void testAplicarIva() {
		Factura factura = new Factura("Patata", 2f, 5);
		float iva = 0.12f;
		//Expected
		float precioTotalReal = factura.aplicarIva(iva);
		
		//Actual
		float precioTotalActual = 0;
		for (int i = 0 ; i < factura.productos.size() -1; i++) {
			precioTotalActual += factura.productos.get(i).precioTotal();
		}
		precioTotalActual *= iva;
		//Asserts
		assertEquals(precioTotalReal, precioTotalActual,"El precio total con el iva no saca exactamente lo que debe");
	}

}
