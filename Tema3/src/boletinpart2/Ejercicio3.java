package boletinpart2;

import java.util.Arrays;
import java.util.Random;

/**
 * Creamos una tabla de tamaño 30 y la rellenamos con valores aleatorios entre 0
 * y 9. Y luego la mostramos ordenada por consola.
 */
public class Ejercicio3 {

	public static void main(String[] args) {

		// Creamos un array tablaAleatoria como int de tamaño 30 para almacenar valores
		// aleatorios de forma ordenada.
		int tablaOrdenada[] = new int[30];

		// Creamos la clase random para generar los números aleatorios entre 0 y 9.
		Random rand = new Random();

		// Este for recorre la tabla y la rellena con números aleatorios entre 01 y 9.
		for (int i = 0; i < tablaOrdenada.length; i++) {
			tablaOrdenada[i] = rand.nextInt(0, 10);
		}

		// Utilizamos la clase Arrays para con el sort ordenar la tabla de forma
		// ascendente.
		Arrays.sort(tablaOrdenada);
		
		//Imprimimos la tabla ya ordenada.
		System.out.println(Arrays.toString(tablaOrdenada));
	}

}
