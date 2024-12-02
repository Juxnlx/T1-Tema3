package boletinjuegos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Buscaminas {

	public static void main(String[] args) {

		// Declaramos el array buscaMinas como char para almacenar en dicho tablero las
		// minas y las pistas pertinentes.
		char[][] buscaMinas;

		// Declaramos el array pistas como char para almacenar el mismo tablero en
		// blanco.
		char[][] pistas;

		// Creamos la variable size como int para almacenar el tamaño del tablero
		// introducido por el usuario.
		int size;

		// Creamos al variable numMinas como int para almacenar el número de minas que
		// desea el usuario tener en el tablero.
		int numMinas;

		// Creamos la variable fila para almacenar la fila seleccionada por el usuario.
		int fila;

		// Creamos la variable columna para almacenar la columna seleccionada por el
		// usurio.
		int columna;

		// Creamos el Scanner para leer el tamaño del tablero por teclado.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca el tamaño que quiere para el tablero y
		// lo leemos.
		System.out.print("Introduce el tamaño del tablero: ");
		size = sc.nextInt();

		// Le pedimos al usuario que introduzca el número de minas que quiere que tenga
		// su tablero y las leemos.
		System.out.print("Introduce el número de minas: ");
		numMinas = sc.nextInt();

		// Creamos el array con el tamaño introducido por el usuario.
		buscaMinas = new char[size][size];

		// Creamos el array pistas con el tamaño introducido por el usuario.
		pistas = new char[size][size];

		/*
		 * Inicializamos nuestro array buscaMinas a 0.
		 * 
		 * Creamos un for para recorres cada fila de nuestro array.
		 */
		for (int i = 0; i < buscaMinas.length; i++) {
			// Hacemos uso de la clase Arrays para usar el fill y añadir a cada fila 0.
			Arrays.fill(buscaMinas[i], '0');
		}

		// Añadimos las pistas a nuestro tablero haciendo un llamamiento a la función
		// generadorPistas, para añadir las pistas a nuestro tablero.
		generadorMinas(buscaMinas, numMinas);

		// Llamamos a la función generarPistas para añadir las respectivas pistas a
		// nuestro array buscaMinas.
		generarPistas(buscaMinas);

		// Mostramos el tablero haciendo un llamamiento a nuestra función
		// imprimirTablero.
		imprimirTablero(buscaMinas);

	}

	public static void generadorMinas(char[][] t, int numM) {

		// Creamos la clase Random para generar de forma aleatoria las posiciones donde
		// colocar tantas minas como las introducidas por el usuario.
		Random rand = new Random();

		// Creamos la variable fila como int para almacenar la posición de la fila
		// aleatoria donde colocar una mina.
		int fila;

		// Creamos la variabel columna como int para almacenar la posición de la columna
		// aleatoria donde colocar la mina.
		int columna;

		// Creamos al variable contMinas como int para contabilizar las veces que se
		// añade una mina la tablero.
		int contMinas = 0;

		// Creamos un while para comprobar que el array se recorra tantas veces como sea
		// necesario hasta que introduzca todas las minas.
		while (contMinas < numM) {

			// Generamos una fila aleatoria de nuestro tablero y se la asignamos a nuestra
			// variable fila.
			fila = rand.nextInt(0, t.length);

			// Generamos una columna aleatoria de nuestro tablero y se la asignamos a
			// nuestra variable columna.
			columna = rand.nextInt(0, t[0].length);

			// Comprobamos si la posición generada aleatoriamente en nuestro tablero
			// mediante la fila y la columna es distinta de '*'.
			if (t[fila][columna] != '*') {

				// Si se cumple esta condición añadimos a esa posición generada una mina.
				t[fila][columna] = '*';

				// Incrementamos el contMinas +1;
				contMinas++;
			}
		}

	}

	public static void generarPistas(char[][] t) {

		int cont = 0;

		for (int i = 1; i < t.length - 1; i++) {
			
			for (int j = 1; j < t[i].length - 1; j++) {
				cont = 0;
				
				if (t[i][j] == '*') {

					if (t[i][j - 1] != '*') {
						t[i][j - 1] = '1';
					}

					if (t[i][j + 1] != '*') {
						t[i][j + 1] = '1';
					}

					if (t[i - 1][j] != '*') {
						t[i - 1][j] = '1';
					}

					if (t[i + 1][j] != '*') {
						t[i + 1][j] = '1';
					}

					if (t[i - 1][j - 1] != '*') {
						t[i - 1][j - 1] = '1';
					}

					if (t[i + 1][j + 1] != '*') {
						t[i + 1][j + 1] = '1';
					}

					if (t[i - 1][j + 1] != '*') {
						t[i - 1][j + 1] = '1';
					}

					if (t[i + 1][j - 1] != '*') {
						t[i + 1][j - 1] = '1';
					}

				} else if (t[i][j] != '*') {

					if (t[i][j - 1] == '*') {
						cont++;
					}

					if (t[i][j + 1] == '*') {
						cont++;
					}

					if (t[i - 1][j] == '*') {
						cont++;
					}

					if (t[i + 1][j] == '*') {
						cont++;
					}

					if (t[i - 1][j - 1] == '*') {
						cont++;
					}

					if (t[i + 1][j + 1] == '*') {
						cont++;
					}

					if (t[i - 1][j + 1] == '*') {
						cont++;
					}

					if (t[i + 1][j - 1] == '*') {
						cont++;
					}
					
				}
				if (cont >= 2) {
						t[i][j] = '2';
					}
			}
		}
	}

	public static void imprimirTablero(char[][] t) {

		// Mediante este for-each recorremos cada posición de nuestro array y lo vamos
		// mostrando.
		for (char[] filasTablero : t) {
			for (char valor : filasTablero) {
				System.out.print(valor + " ");
			}
			System.out.println();
		}
	}

}
