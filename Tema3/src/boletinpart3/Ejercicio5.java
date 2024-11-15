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

		// Creamos la variable suma para almacenar la suma de cada fila y columna.
		int suma = 0;

		// Creamos la variable sumaTotal para almacenar la suma total de cada fila y
		// columna.
		int sumaTotal = 0;

		// Creamos la clase random para generar números aleatorios entre 100 y 999.
		Random rand = new Random();

		// Creamos el siguiente for para recorrer cada fila de nuestra tabla y
		// rellenarla con aleatorios.
		for (int i = 0; i < sumaNumAleatorios.length; i++) {

			// Creamos el siguinte for para recorrer cada columna de nuestra tabla e ir
			// generando el aleatorio.
			for (int j = 0; j < sumaNumAleatorios[0].length; j++) {
				// Asignamos a cada espacio la un valor entre 100 y 999.
				sumaNumAleatorios[i][j] = rand.nextInt(100, 1000);

			}

		}

		// Creamos el siguiente for para recorrer cada fila de nuestra tabla.
		for (int i = 0; i < sumaNumAleatorios.length; i++) {
			// En cada iteración (en cada fila) reiniciamos este valor para que empieze
			// desde .
			suma = 0;

			// Creamos el siguiente for para recorrer cada columna de nuestra tabla.
			for (int j = 0; j < sumaNumAleatorios[0].length; j++) {
				// Al valor de sumaFila le vamos sumando cada valor que se va generando.
				suma += sumaNumAleatorios[i][j];
				// Imprimimos el número aleatorio generado.
				System.out.print(sumaNumAleatorios[i][j] + "\t");

			}
			// A suma total le vamos sumando el total de cada fila.
			sumaTotal += suma;
			// Imprimimos despues de cada fila el total de cada número generado en la fila.
			System.out.print(suma);
			// Imprimimos un salto de linea para saltar a otra linea.
			System.out.println();
		}

		// Salto de linea
		System.out.println();

		// Con este for recorremos la columna primero.
		for (int j = 0; j < sumaNumAleatorios[0].length; j++) {
			// Suma columna lo inicializamos a 0 para en cada iteración el valor se
			// reinicie.
			suma = 0;
			// Con este for recorremos las filas.
			for (int i = 0; i < sumaNumAleatorios.length; i++) {
				// Va sumando cada valor de una columna y lo va almacenando en sumaColumna.
				suma += sumaNumAleatorios[i][j];

			}

			// Imprimimos la suma total de cada columna.
			System.out.print(suma + "\t");
		}

		// Por ultimo imprimimos la sumaTotal que contiene la suma total de cada fila y
		// cada columna.
		System.out.print(sumaTotal);
	}

}
