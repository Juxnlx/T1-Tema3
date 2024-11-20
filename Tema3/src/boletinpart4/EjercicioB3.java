package boletinpart4;

import java.util.Scanner;

/**
 * Este programa crea una tabla bidimensional pasada como parametro y una
 * función se encarga de devolvernos true o false si la matriz es simetrica o
 * no.
 */
public class EjercicioB3 {

	public static void main(String[] args) {

		// Declaramos el array tabla como int para almacenar una serie de números.
		int tabla[][];

		// Creamos la variable size para almacenar la cantidad de lineas y columnas que
		// tendra nuestra tabla.
		int size;

		// Creamos la variable valor como int para ir rellenando nuestro array por
		// completo.
		int valor;

		// Creamos la variable esSimetrica como boolean para almacenar la respuesta
		// generada por la función simetrica.
		boolean esSimetrica;

		// Creamos el Scanner para leer la el número de lineas y columnas, y los valores
		// introducidos por teclado.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca el tamaño que desea que tenga el array
		// tabla.
		System.out.print("Introduce la cantidad de lineas y columnas del array --> ");
		size = sc.nextInt();

		// Creamos nuestra tabla con las lineas y columnas introducidas por teclado para
		// almacenar los valores introducidos por el usuario.
		tabla = new int[size][size];

		// Creamos este for para recorrer las lineas de nuestro array.
		for (int i = 0; i < tabla.length; i++) {
			// Creamos este for para recorrer las columnas de nuestro array.
			for (int j = 0; j < tabla[i].length; j++) {
				// Le pedimos al usuario que vaya introduciendo cada valor para cada posición.
				System.out.println("Introduce el valor para la linea " + i + " y la columna " + j + " --> ");
				valor = sc.nextInt();
				tabla[i][j] = valor;
			}
		}

		// Mostramos la tabla ya rellena con los números introducidos por el usuario.
		System.out.println();
		System.out.println("Tabla introducida por usuario:");
		// Creamos este for-each para recorrer cada valor de la tabla e imprimirlo de
		// forma bonita.
		for (int x[] : tabla) {
			for (int y : x) {
				System.out.print(y + "\t");
			}
			System.out.println();
		}

		// Salto de linea y asignamos a la variable esSimetrica la respuesta de la
		// función simetrica.
		System.out.println();
		esSimetrica = simetrica(tabla);

		// Comprobamos el resultado que nos devuelve la función simetrica y si es true
		// muestra un mesaje de que es simetrica. Si no, nos devuelve que no es
		// simetrica.
		if (esSimetrica) {
			System.out.println("La tabla es SIMETRICA");
		} else {
			System.out.println("La tabla NO ES SIMETRICA");
		}

		// Cierre de Scanner
		sc.close();
	}

	/**
	 * Esta función comprueba si la tabla pasada como parametro es simetrica o no.
	 * 
	 * @param t la tabla que ha rellenado el uusario.
	 * @return Devuelve true si la tabla es simetrica, false si no lo es.
	 */
	public static boolean simetrica(int[][] t) {

		// Creamos la variable esSimetrica y la inicializamos a true.
		boolean esSimetrica = true;

		// Creamos la variable fila para recorrer las filas en nuestro while.
		int fila = 0;

		// Creamos la variable columna para recorrer las columnas en nuestro while.
		int columna = 0;

		// Comprobamos si nuestra variable es simetrica y si el número de filas es menor
		// que la longitud de la tabla.
		while (esSimetrica && fila < t.length) {

			// Incicializamos columna a 0;
			columna = 0;

			// Comprobamos si nuestra variable es simetrica y si el número de columnas es
			// menor que la longitud de la tabla.
			while (esSimetrica && columna < t[fila].length) {

				// Comprobamos si las filas y columnas de nuestra tabla son distintas que el
				// recorrido por columna y filas.
				if (t[fila][columna] != t[columna][fila]) {
					// Ponemos que simetrica es false y nos salimos de bucle.
					esSimetrica = false;
				}
				columna++;
			}

			fila++;
		}

		// Devolvemos esSimetrica que puede contener true o false.
		return esSimetrica;

	}

}
