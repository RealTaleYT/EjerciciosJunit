package cuatrovientos.org.dam.ed.ejercicio22;

import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;

public class Trailer implements Transporte {
	private Random rnd = new Random();
	private int reccorido = rnd.nextInt(30) + 270;
	private Vector<Paquete> paquetes;
	private ArrayList<Camioneta> camionetas;

	@Override
	public void incluirPaquete(Paquete paquete) {
		paquetes.add(paquete);

	}

	@Override
	public float pesoTotal() {
		float pesoTotal = 0;
		for (int i = 0; i < paquetes.size() - 1; i++) {
			pesoTotal += paquetes.get(i).getPeso();
		}
		return pesoTotal;
	}

	@Override
	public int recorrerDistancia() {
		return 0;
	}

}
