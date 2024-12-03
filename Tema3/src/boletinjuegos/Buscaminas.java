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

		// Creamos la variable cont para saber las figuras que quedan sin introducir.
		int cont;

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

		// Le pedimos al usuario que introduzca el número de la fila y lo leemos.
		System.out.print("Introduce el número de la fila: ");
		fila = sc.nextInt();

		// Le pedimos al usuario que introduzca el número de la columna y lo leemos.
		System.out.print("Introduce el número de la columna: ");
		columna = sc.nextInt();

		// Inicializamos el cont a todas las posiciones del tablero - 1, ya que es la
		// primera.
		cont = (size * size) - 1;

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

		/*
		 * Inicializamos nuestro array pistas a ▒.
		 * 
		 * Creamos un for para recorres cada fila de nuestro array.
		 */
		for (int i = 0; i < pistas.length; i++) {
			// Hacemos uso de la clase Arrays para usar el fill y añadir a cada fila 0.
			Arrays.fill(pistas[i], '▒');
		}

		// Añadimos las pistas a nuestro tablero haciendo un llamamiento a la función
		// generadorPistas, para añadir las pistas a nuestro tablero.
		generadorMinas(buscaMinas, numMinas);

		// Llamamos a la función generarPistas para añadir las respectivas pistas a
		// nuestro array buscaMinas.
		generarPistas(buscaMinas);

		// Comprobamos el tablero completo y solucionado

		for (int i = 0; i < buscaMinas.length; i++) {
			for (int j = 0; j < buscaMinas[i].length; j++) {
				System.out.print(buscaMinas[i][j] + " ");
			}
			System.out.println();
		}

		// Comprobamos si la posición introducida es distinta a una mina y si el
		// contador es distinto a el número de minas, porque si llega al número de minas
		// restantes significa que ya ha ganado porque las minas que quedan sin
		// descubrir son las minas.
		while (buscaMinas[fila][columna] != '*' && cont != numMinas) {
			// Mostramos el tablero haciendo un llamamiento a nuestra función
			// imprimirTablero.
			imprimirTablero(buscaMinas, pistas, fila, columna);

			// Le pedimos al usuario que introduzca el número de la fila y lo leemos.
			System.out.print("Introduce el número de la fila: ");
			fila = sc.nextInt();

			// Le pedimos al usuario que introduzca el número de la columna y lo leemos.
			System.out.print("Introduce el número de la columna: ");
			columna = sc.nextInt();

			cont--;
		}

		if (cont == numMinas) {
			System.out.println("¡Felicidades! No has hecho explotar ninguna mina");
		} else {
			System.out.println("BOOOOOM!! Lo siento has pisado una mina.");
		}

		// Cierre de Scanner
		sc.close();
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

		int filaVecina;
		int columnaVecina;

		// Recorremos todo el tablero.
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				// Si la celda actual no es una mina, calculamos la cantidad de minas alrededor.
				if (t[i][j] != '*') {
					int cont = 0;

					// Recorremos las 8 posibles direcciones alrededor de la celda actual.
					for (int x = -1; x <= 1; x++) {
						for (int y = -1; y <= 1; y++) {
							filaVecina = i + x;
							columnaVecina = j + y;

							// Verificamos si la celda vecina está dentro del tablero y es una mina.
							if (filaVecina >= 0 && filaVecina < t.length && columnaVecina >= 0
									&& columnaVecina < t[i].length && t[filaVecina][columnaVecina] == '*') {
								cont++;
							}
						}
					}

					// Si hay minas alrededor, asignamos el número correspondiente a la celda.
					t[i][j] = Integer.toString(cont).charAt(0);
				}

			}
		}

	}

	public static void imprimirTablero(char[][] tablero, char[][] pistas, int fila, int columna) {

		pistas[fila][columna] = tablero[fila][columna];

		for (char[] valores : pistas) {
			for (char valor : valores) {
				System.out.print(valor + " ");
			}
			System.out.println();
		}

	}
}
