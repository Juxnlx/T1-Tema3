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

		// Creamos la variable sumaColumna para almacenar la suma de cada columna.
		int sumaColumna = 0;

		// Creamos la variable sumaTotal para almacenar la suma total de cada fila y
		// columna.
		int sumaTotal = 0;

		// Creamos la clase random para generar números aleatorios entre 100 y 999.
		Random rand = new Random();

		// Creamos el siguiente for para recorrer cada fila de nuestra tabla.
		for (int i = 0; i < sumaNumAleatorios.length; i++) {
			// En cada iteración (en cada fila) reiniciamos este valor para que empieze
			// desde .
			sumaFila = 0;
			// Creamos el sigueinte for para recorrer cada columna de nuestra tabla.
			for (int j = 0; j < sumaNumAleatorios[0].length; j++) {
				// Asignamos a cada espacio la un valor entre 100 y 999.
				sumaNumAleatorios[i][j] = rand.nextInt(100, 1000);
				// Al valor de sumaFila le vamos sumando cada valor que se va generando.
				sumaFila += sumaNumAleatorios[i][j];
				// Imprimimos el número aleatorio generado.
				System.out.print(sumaNumAleatorios[i][j] + "\t");

			}
			// A suma total le vamos sumando el total de cada fila.
			sumaTotal += sumaFila;
			// Imprimimos despues de cada fila el total de cada número generado en la fila.
			System.out.print(sumaFila);
			// Imprimimos un salto de linea para saltar a otra linea.
			System.out.println();
		}

		// Salto de linea
		System.out.println();

		// Con este for recorremos la columna primero.
		for (int j = 0; j < sumaNumAleatorios[0].length; j++) {
			// Suma columna lo inicializamos a 0 para en cada iteración el valor se
			// reinicie.
			sumaColumna = 0;
			// Con este for recorremos las filas.
			for (int i = 0; i < sumaNumAleatorios.length; i++) {
				// Va sumando cada valor de una columna y lo va almacenando en sumaColumna.
				sumaColumna += sumaNumAleatorios[i][j];

			}
			// En sumaTotal concatena la suma total de cada columna.
			sumaTotal += sumaColumna;
			// Imprimimos la suma total de cada columna.
			System.out.print(sumaColumna + "\t");
		}

		// Por ultimo imprimimos la sumaTotal que contiene la suma total de cada fila y
		// cada columna.
		System.out.print(sumaTotal);
	}

}
