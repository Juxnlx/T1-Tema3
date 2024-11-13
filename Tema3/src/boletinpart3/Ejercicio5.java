package boletinpart3;

import java.util.Random;

/**
 * Este programa genera un array de 4 filas y 5 columnas, genera 20 números
 * aleatorios entre 100 y 999. Y muestra la suma de cada columna y fila al lado
 * de cada una.
 */
public class Ejercicio5 {

	public static void main(String[] args) {

		// Creamos el array sumaNumAleatorios como int de tamaño 4 filas y 5 columnas
		// para alamcenar 20 números aleatorios.
		int sumaNumAleatorios[][] = new int[4][5];

		// Creamos la variable sumaFila para almacenar la suma de cada fila.
		int sumaFila = 0;

		// Creamos la clase random para generar números aleatorios entre 100 y 999.
		Random rand = new Random();

		// Creamos el siguiente for para recorrer cada fila de nuestra tabla.
		for (int i = 0; i < sumaNumAleatorios.length; i++) {
			sumaFila = 0;
			// Creamos el sigueinte for para recorrer cada columna de nuestra tabla.
			for (int j = 0; j < sumaNumAleatorios[0].length; j++) {
				// Asignamos a cada espacio la un valor entre 100 y 999.
				sumaNumAleatorios[i][j] = rand.nextInt(100, 1000);
				sumaFila += sumaNumAleatorios[i][j];
				System.out.print(sumaNumAleatorios[i][j] + "\t");
			}
			System.out.print(sumaFila);
			System.out.println();
		}

		for (int i = 0; i < sumaNumAleatorios.length; i++) {
			int sumaColumna = 0;
			for (int j = 0; j < sumaNumAleatorios[0].length; j++) {
				
				if (i == 0) {
					sumaColumna += sumaNumAleatorios[i][j];
				}
				if (i == 1) {
					sumaColumna += sumaNumAleatorios[i][j];
				}
				if (i == 2) {
					sumaColumna += sumaNumAleatorios[i][j];
				}
				if (i == 3) {
					sumaColumna += sumaNumAleatorios[i][j];
				}
				if (i == 4) {
					sumaColumna += sumaNumAleatorios[i][j];
				}

			}
			System.out.print(sumaColumna + "\t");
		}

	}

}
