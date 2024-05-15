package cuatrovientos.org.dam.ed.ejercicio13;

import java.util.ArrayList;

public class Factura extends Producto{
	public ArrayList<Producto> productos;

	public Factura(String nombre, float precio, int cantidad) {
		super(nombre, precio, cantidad);
		this.productos = new ArrayList<Producto>();
	}
	public void meterProducto(Producto p) {
		productos.add(p);
	}
	public float totalFactura() {
		float total = 0;
		for (int i = 0 ; i < productos.size() -1; i++) {
			total += productos.get(i).precioTotal();
		}
		return total;
	}
	public float aplicarIva(float iva) {
		float total = 0;
		for (int i = 0 ; i < productos.size() -1; i++) {
			total += productos.get(i).precioTotal();
		}
		total = total * iva;
		return total;
	}
}
