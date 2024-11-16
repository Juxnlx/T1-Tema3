package boletinpart4;

import java.util.Arrays;
import java.util.Random;

/**
 * Este programa nos devuelve el número maximo de una tabla que nosotros hemos
 * generado.
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		// Creamos el array tablaRandom y la rellenamos con números aleatorios que
		// tendra una dimensión de 20 posiciones.
		int tablaRandom[] = new int[20];

		// Creamos la clase Random para generar números aleatorios y almacenarlos en la
		// tabla.
		Random rand = new Random();

		// Creamos este for para recorrer la tabla y rellenarla con números aleatorios
		// entre 1 y 99.
		for (int i = 0; i < tablaRandom.length; i++) {
			tablaRandom[i] = rand.nextInt(1, 100);
		}

		// Mostramos la tabla generada con los números aleatorios
		System.out.print("Tabla con valores random --> ");
		System.out.println(Arrays.toString(tablaRandom));

		// Llamamos a la función para que nos devuelva el valor mas alto y lo mostramos
		// por consola.
		System.out.println("El valor mas alto de la tabla es --> " + maximo(tablaRandom));
	}

	/**
	 * Esta función se encarda de calcular el número mas grande generado en la tabla
	 * aleatoriamente.
	 * 
	 * @param t es la tabla donde se encuentran los valores almacenados.
	 * @return devolvemos el valor mas alto de la tabla.
	 */
	public static int maximo(int t[]) {

		// Ordenamos la tabla pasada como parametro de forma ascendente.
		Arrays.sort(t);

		// Devolvemos el ultimo valor porque siempre sera el mas alto, una vez ya
		// ordenada la tabla.
		return t[t.length - 1];
	}

}
