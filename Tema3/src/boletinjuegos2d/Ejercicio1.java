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

		// Creamos el array tabla para almacenar la tabla devuelta por el jugador con la
		// ficha correspondiente al jugador.
		char[][] tabla;

		// Con esta variable asignamos cuando es la tirada del jugador 1 y cuando la del
		// jugador 2.
		int turno = 1;

		// Inicializamos nuestro tablero a guiones ya que no hay ninguna ficha
		// introducida.
		for (int i = 0; i < tablero.length; i++) {
			Arrays.fill(tablero[i], '-');
		}

		// Mensaje de bienvenida a los jugadores al juego del tres en rayas.
		System.out.println("Bienvenidos al 3 en rayas ¡!VAMOS A JUGAR");
		;

		/*
		 * Tenemos que poner la primera tirada del jugador 1 fuera, para no tener que
		 * inicializar el array tabla, No importaría hacer la comprobación de si es
		 * ganador o no, porque en la primera tabla es imponsible hacer un tres en
		 * rayas.
		 */
		tabla = jugador(tablero, "Jugador I", 'X');

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + " ");
			}
			System.out.println();
		}

		/**
		 * Comprobamos si la función validar nos devuelve true o false, si nos devuelve
		 * false, seguimos introducidendo ficha, hasta que devuelva true eso significa
		 * que alguno de los dos jugadores a realizado un 3 en rayas.
		 */
		while (!validar(tabla)) {

			// Comprobamos si el turno es par o no para que siempre le pregunte primero a 1
			// y luego a otro. En el caso de ser par empieza el jugador 1 y si es impar el
			// juagdor 2.
			if (turno % 2 == 0) {

				// Asignamos al array tabla el tablero devuelto por el jugador 1.
				tabla = jugador(tablero, "Jugador I", 'X');

				// Recorremos ese tablero y lo mostramos por pantalla.
				for (int i = 0; i < tabla.length; i++) {
					for (int j = 0; j < tabla[i].length; j++) {
						System.out.print(tabla[i][j] + " ");
					}
					System.out.println();
				}
				// Si el turno es impar hacemos lo mismo pero con el juagdor 2.
			} else {
				tabla = jugador(tablero, "Jugador II", 'O');

				for (int i = 0; i < tabla.length; i++) {
					for (int j = 0; j < tabla[i].length; j++) {
						System.out.print(tabla[i][j] + " ");
					}
					System.out.println();
				}
			}

			// Al final de turno incrementamos el contador a +1 para que en la siguiente
			// vuelta sea turno del siguiente juagdor.
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
