package cuatrovientos.org.dam.ed.ejercicio12;

import java.util.Random;

public class GeneradorIP {
	private Random rnd;
	public GeneradorIP() {
		this.rnd = new Random();
	}
	public String generarIp() {
		return generarNumero(0, 255) + "." + generarNumero(0, 255) + "." +generarNumero(0, 255) + "." + generarNumero(0, 255);
	}
    public int generarNumero(int min, int max) {
    	int num = rnd.nextInt(max - min + 1) + min;
    	return num;
    }
}
