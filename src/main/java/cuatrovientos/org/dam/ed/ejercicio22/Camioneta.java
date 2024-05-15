package cuatrovientos.org.dam.ed.ejercicio22;

import java.util.Random;

public class Camioneta implements Transporte {
	private Random rnd = new Random();
	private int recorrido = rnd.nextInt(30) + 70;

	@Override
	public void incluirPaquete(Paquete paquete) {
	}

	@Override
	public float pesoTotal() {
		return 0;
	}

	@Override
	public int recorrerDistancia() {
		return recorrido;
	}
}
