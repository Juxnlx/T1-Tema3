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

		// Inicializamos nuestro tablero a guiones ya que no hay ninguna ficha
		// introducida.
		for (int i = 0; i < tablero.length; i++) {
			Arrays.fill(tablero[i], '-');
		}

		do {
			tabla = jugador1(tablero);

			for (int i = 0; i < tabla.length; i++) {
				for (int j = 0; j < tabla[i].length; j++) {
					System.out.print(tabla[i][j] + " ");
				}
				System.out.println();
			}
			
			tabla = jugador2(tablero);

			for (int i = 0; i < tabla.length; i++) {
				for (int j = 0; j < tabla[i].length; j++) {
					System.out.print(tabla[i][j] + " ");
				}
				System.out.println();
			}
		} while (false);

		// Cierre de Scanner
		sc.close();

	}

	public static char[][] jugador1(char[][] t) {

		boolean posValida;

		// Creamos la variable posFila para almacenar la posición de la fila introducida
		// por el usuario.
		int fila;

		// Creamos la variable posColm para almacenar la posición de la columna
		// introducida por el usuario.
		int columna;

		do {
			System.out.print("Jugador I - Introduce la posición de la fila 0 - 2: ");
			fila = sc.nextInt();

			System.out.print("Jugador I - Introduce la posición de la columna 0 - 2: ");
			columna = sc.nextInt();

			if (t[fila][columna] == '-') {
				t[fila][columna] = 'X';
				posValida = false;
			} else {
				posValida = true;
			}

		} while (posValida);

		return t;
	}

	public static char[][] jugador2(char[][] t) {

		boolean posValida;

		// Creamos la variable posFila para almacenar la posición de la fila introducida
		// por el usuario.
		int fila;

		// Creamos la variable posColm para almacenar la posición de la columna
		// introducida por el usuario.
		int columna;

		do {
			System.out.print("Jugador I - Introduce la posición de la fila 0 - 2: ");
			fila = sc.nextInt();

			System.out.print("Jugador I - Introduce la posición de la columna 0 - 2: ");
			columna = sc.nextInt();

			if (t[fila][columna] == '-') {
				t[fila][columna] = 'O';
				posValida = false;
			} else {
				posValida = true;
			}

		} while (posValida);

		return t;
	}

	public static boolean validar(char[][] tablero) {

		boolean ganador = false;

		return ganador;
	}

}
