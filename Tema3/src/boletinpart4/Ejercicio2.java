package boletinpart4;

import java.util.Random;

/**
 * Este programa nos devuelve el número maximo de una tabla que nosotros hemos
 * generado.
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		// Creamos el array tablaRandom y la rellenamos con números aleatorios que
		// tendra una dimensión de 20 posiciones. 
		int tablaRandom[] = new int[10];

		// Creamos la clase Random para generar números aleatorios y almacenarlos en la
		// tabla.
		Random rand = new Random();

		// Creamos este for para recorrer la tabla y rellenarla con números aleatorios
		// entre 1 y 10.
		for (int i = 0; i < tablaRandom.length; i++) {
			tablaRandom[i] = rand.nextInt(1, 11);
		}

	}

}
