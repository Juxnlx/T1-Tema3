package boletinjuegos2d;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Este programa consiste en el juego del tres en rayas, dos jugadores iran
 * introduciendo una posición por turnos y el juego se acabara cuando algun
 * jugador gane o no se hallan rellenado todas las posiciones.
 */
public class Ejercicio1 {

	// Creamos el Scanner a nivel de clase ya que pediremos varios valores al
	// usuario en distintas funciones.
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Creamos el array tablero como char para almacenar todas las posiciones
		// introducidas por cada jugador. Este tablero será de 3x3.
		char[][] tablero = new char[3][3];

		char[][] tabla;

		boolean jugador = true;

		int turno = 1;

		// Inicializamos nuestro tablero a guiones ya que no hay ninguna ficha
		// introducida.
		for (int i = 0; i < tablero.length; i++) {
			Arrays.fill(tablero[i], '-');
		}

		System.out.println("Bienvenidos al 3 en rayas ¡!VAMOS A JUGAR");
		;

		tabla = jugador(tablero, "Jugador I", 'X');

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + " ");
			}
			System.out.println();
		}

		while (!validar(tabla)) {

			if (turno % 2 == 0) {
				tabla = jugador(tablero, "Jugador I", 'X');

				for (int i = 0; i < tabla.length; i++) {
					for (int j = 0; j < tabla[i].length; j++) {
						System.out.print(tabla[i][j] + " ");
					}
					System.out.println();
				}
			} else {
				tabla = jugador(tablero, "Jugador II", 'O');

				for (int i = 0; i < tabla.length; i++) {
					for (int j = 0; j < tabla[i].length; j++) {
						System.out.print(tabla[i][j] + " ");
					}
					System.out.println();
				}
			}
			turno++;
		}

	}

	/**
	 * Esta función devuelve el tablero con la posición que ha introducido por
	 * teclado .
	 * 
	 * @param t       El tablero de juego.
	 * @param jugador Es una cadena indicando si es el jugador 1 o el 2.
	 * @param ficha   Es el tipo de caracter con el que juega cada jugador en el
	 *                caso del jugador 1 es la 'X' y en el caso del jugador 2 la
	 *                'O'.
	 * 
	 * @return Devuelve el tablero con el caracter correspondiente a cada jugador.
	 */
	public static char[][] jugador(char[][] t, String jugador, char ficha) {

		// Creamos la variable posValida como boolean para almacenar true o false
		// dependiendo de si se ha añadido el caracter a la tabla o no.
		boolean posValida = false;

		// Creamos la variable posFila para almacenar la posición de la fila introducida
		// por el usuario.
		int fila;

		// Creamos la variable posColm para almacenar la posición de la columna
		// introducida por el usuario.
		int columna;

		do {
			do {
				// Le pedimos al usuario que introduzca la posición de la fila y la leemos.
				System.out.print(jugador + " - Introduce la posición de la fila 0 - 2: ");
				fila = sc.nextInt();

				// Le pedimos al usuario que introduzca la posición de la columna y la leemos.
				System.out.print(jugador + "- Introduce la posición de la columna 0 - 2: ");
				columna = sc.nextInt();

				// Comprobamos si los valores introducidos se encuentran dentro del rando, si no
				// es así se volvera a pedir.
			} while ((fila < 0 || fila > 2) || (columna < 0 || columna > 2));

			// Comprobamos si el la posición introducida por el jugador no ha sido
			// utilizada, si es así podemos añadir el caracter a la tabla.
			if (t[fila][columna] == '-') {
				t[fila][columna] = ficha;

				// Ponemos nuestra variable posValida a false y nos salimos del bucle.
				posValida = false;

				// Si no
			} else {
				// Ponemos nuestra variable posValida a true y volvemos a preguntar por otra
				// posición.
				posValida = true;
			}

		} while (posValida);

		// Devolvemos la tabla pasada como parametro.
		return t;
	}

	/*
	 * public static char[][] jugador2(char[][] t) {
	 * 
	 * boolean posValida;
	 * 
	 * // Creamos la variable posFila para almacenar la posición de la fila
	 * introducida // por el usuario. int fila;
	 * 
	 * // Creamos la variable posColm para almacenar la posición de la columna //
	 * introducida por el usuario. int columna;
	 * 
	 * do {
	 * System.out.print("Jugador II - Introduce la posición de la fila 0 - 2: ");
	 * fila = sc.nextInt();
	 * 
	 * System.out.print("Jugador II - Introduce la posición de la columna 0 - 2: ");
	 * columna = sc.nextInt();
	 * 
	 * if (t[fila][columna] == '-') { t[fila][columna] = 'O'; posValida = false; }
	 * else { posValida = true; }
	 * 
	 * } while (posValida);
	 * 
	 * return t; }
	 */

	public static boolean validar(char[][] tablero) {

		boolean ganador = false;

		int cont = 0;

		int indiceI = 0;

		int indiceJ = 0;

		while (!ganador && indiceI < tablero.length) {

			cont = 0;
			indiceJ = 0;

			while (indiceJ < tablero[indiceI].length) {

				if (tablero[indiceI][indiceJ] == 'X') {
					cont++;
				}
				if (tablero[indiceI][indiceJ] == 'O') {
					cont++;
				}

				indiceJ++;
			}

			if (cont == 3) {
				ganador = true;
			}

			indiceI++;
		}

		return ganador;
	}

}
