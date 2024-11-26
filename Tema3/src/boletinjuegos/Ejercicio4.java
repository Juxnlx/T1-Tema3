package boletinjuegos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Este programa simulará algunos movimientos de algunas piezas del juego de
 * ajedrez. Tenemos varias funciones con el nombre de cada pieza y devemos de
 * devolver una tabla con las posiciones a la que se puede mover la pieza
 * concreta.
 */
public class Ejercicio4 {

	// Creamos el Scanner a nivel de clase para poder leer por teclado las
	// funciones que lo necesitemos.
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Creamos la variable posFila como int para almacenar la fila en la que
		// queremos que se encuentre nuestra pieza.
		int posFila;

		// Creamos la variable posColumna como int para almacenar la columna en la que
		// queremos que se encuentre nuestra pieza.
		int posColumna;

		// Creamos la variable pieza como char para almacenar con un caracter la pieza
		// que hemos seleccionado.
		char pieza;

		// Comprobamos si la posFila es correcta comprobandola con la función
		// validación.
		posFila = validarPos("fila");

		// Salto de linea
		System.out.println();

		// Comprobamos si la posColumna es correcta comprobandola con la función
		// validación.
		posColumna = validarPos("columna");

		// Salto de linea
		System.out.println();

		// Mostramos al usuario las posibilidades de piezas para elegir.
		System.out.println("Elige una de las piezas: ");
		System.out.println("T. Torre");
		System.out.println("A. Alfil");
		System.out.println("D. Dama");
		System.out.println("C. Caballo");
		System.out.println();

		// Comprobamos si la pieza introducida por el usuario es valida comprobandola
		// con la función validarPieza.
		pieza = validarPieza();

		// Comprobamos cual es la pieza introducida por el usuario. Y dependiendo de la
		// seleccionada se llamará a la función correspondiente y se mostrará mediante
		// un for-each la tabla devuelta por la función.
		switch (pieza) {
		case 'T' -> {
			for (char tabla[] : torre(posFila, posColumna, pieza)) {
				for (char valor : tabla) {
					System.out.print(valor + "|");
				}
				System.out.println();
			}
		}
		case 'A' -> {
			for (char tabla[] : alfil(posFila, posColumna, pieza)) {
				for (char valor : tabla) {
					System.out.print(valor + "|");
				}
				System.out.println();
			}
		}
		case 'D' -> {
			for (char tabla[] : dama(posFila, posColumna, pieza)) {
				for (char valor : tabla) {
					System.out.print(valor + "|");
				}
				System.out.println();
			}
		}
		case 'C' -> {
			for (char tabla[] : caballo(posFila, posColumna, pieza)) {
				for (char valor : tabla) {
					System.out.print(valor + "|");
				}
				System.out.println();
			}
		}
		}

		// Cierre de Scanner
		sc.close();
	}

	/**
	 * Esta función se encarga de comprobar que la posición de la fila o de la
	 * columna se encuentre entre 0 y 7 incluidos y si no es así mostrará un mensaje
	 * y se volverá a preguntar.
	 * 
	 * @param posTabla Un mensaje personalizado para cada comprobación.
	 * @return La posición valida introducida por el usuario.
	 */
	public static int validarPos(String posTabla) {

		// Creamos la variable num como int para almacenar el número que introducimos
		// por teclado.
		int num = 0;

		// Creamos la variable valido como boolean para comprobar si el valor
		// introducido es valido o no.
		boolean valido;

		// Comprobamos mediante un do-while cuando seguir preguntando la posición y
		// siempre que valido sea true que será cuando se de algun error.
		do {
			// Con el try-catch y el assert comprobamos que el valor introducido sea
			// correcto y si no es así mostramos un mensaje de error.
			try {
				System.out.print("Introduce la posición de la " + posTabla + " 0 - 7: ");
				num = sc.nextInt();

				// Comprobamos que la posición se encuentre entre 0 y 7 porque nuestro tablero
				// siempre tendra 8 posiciones.
				assert (num >= 0 && num <= 7) : "El número introducido es incorrecto";
				valido = false;
			} catch (AssertionError e) {
				System.out.println(e.getMessage());
				valido = true;
			} catch (InputMismatchException e) {
				System.out.println("El valor introducido no es valido");
				valido = true;
			} finally {
				sc.nextLine();
			}

		} while (valido);

		// Devolvemos el número que hemos comprobado.
		return num;
	}

	/**
	 * 
	 * @return
	 */
	public static char validarPieza() {
		// Creamos la variable piezaAjedrez como char para almacenar la pieza
		// sellecionada por el usuario.
		char piezaAjedrez;

		// Comprobamos si la piezaAjedrez es distinta a las que se encuentran en el
		// switch, si es así hacemos que se vuelva a preguntar al usuario.
		do {

			// Le preguntamos al usuario que introduzca la pieza que desea y la leemos.
			System.out.println("Introduce una pieza: ");
			piezaAjedrez = sc.nextLine().charAt(0);

			// Con el switch comprobamos si la pieza introducida es valida, si no es así
			// devolvemos la 'j', la del default y volvemos a preguntar de nuevo.
			switch (piezaAjedrez) {
			case 'T' -> {
				piezaAjedrez = 'T';
			}
			case 'A' -> {
				piezaAjedrez = 'A';
			}
			case 'D' -> {
				piezaAjedrez = 'D';
			}
			case 'C' -> {
				piezaAjedrez = 'C';
			}
			default -> piezaAjedrez = 'J';
			}

		} while (piezaAjedrez == 'J');

		// Devolvemos la pieza valida introducida por el usuario.
		return piezaAjedrez;
	}

	/**
	 * Esta función se encarga de devolver un tablero con la torre introducida por
	 * el usuario en la posición especifica. Ademas tambien se mostrara las
	 * posiciones hacia donde se puede mover la torre con una 'X'.
	 * 
	 * @param posFila    La fila donde se encuentra nuestra torre.
	 * @param posColumna La columna donde se encuentra nuestra torre.
	 * @param pieza      La cifra que representa la torre utilizada por el usuario.
	 * @return El array tablero con la torre representada y las posiciones a las que
	 *         se puede desplazar.
	 */
	public static char[][] torre(int posFila, int posColumna, char pieza) {
		// Creamos el array tablero como char para almacenar la pieza y los movimientos
		// que podemos hacer con la torre. El tamaño siempre será de 8x8.
		char[][] tablero = new char[8][8];

		// Recorremos el tablero entero para poder desplazarnos por cada linea y columna
		// del tablero.
		for (int i = 0; i < tablero.length; i++) {

			for (int j = 0; j < tablero[i].length; j++) {

				/*
				 * La torre se mueve en cruz para ello tenemos que imprimir una linea recta
				 * horizontal y vertical pasando por la torre.
				 */

				// Para imprimir la columna recta tenemos que marcar la columna que sea siempre
				// la misma e ir recorriendo cada fila para ir imprimiendo una x en vertical.
				tablero[i][posColumna] = 'X';

				// Para imprimir la fila recta tenemos que marcar la fila que sea siempre
				// la misma e ir recorriendo cada columna para ir imprimiendo x en horizontal.
				tablero[posFila][j] = 'X';
			}
		}

		// Por ultimo imprimimos el caracter que representa la torre en la posición
		// introducida por el usuario.
		tablero[posFila][posColumna] = pieza;

		// Devolvemos el tablero con la torre en la posición deseada y todas las
		// posiciones a las que se puede desplazar.
		return tablero;
	}

	/**
	 * Esta función se encarga de devolver un tablero con el alfil representado en
	 * la posición especificada por el usuario. También se muestra en el tablero
	 * todas las posiciones en forma de 'X' a las que se puede desplazar el alfil.
	 * 
	 * @param posFila    La fila donde se encuentra nuestro alfil.
	 * @param posColumna La columna donde se encuentra nuestro alfil.
	 * @param pieza      La cifra que representa el alfil utilizado por el usuario.
	 * @return El array tablero con el alfil representado y las posiciones a las que
	 *         se puede desplazar.
	 */
	public static char[][] alfil(int posFila, int posColumna, char pieza) {
		// Creamos el array tablero como char para almacenar la pieza y los movimientos
		// que podemos hacer con el alfil. El tamaño siempre será de 8x8.
		char[][] tablero = new char[8][8];

		// Recorremos el tablero entero para poder desplazarnos por cada linea y columna
		// del tablero.
		for (int i = 0; i < tablero.length; i++) {

			for (int j = 0; j < tablero[i].length; j++) {

				// Comprobamos si la posición de la fila menos la de la columna mas i esta
				// comprendida entre los limites del tablero. Si es así imprimirá la primera
				// diagonal pasando por la pieza. La fila siempre se recorrera pero la columna
				// solo se imprimirá cuando posición columna menos la de la fila mas i, esa es
				// la formula para imprimir de forma diagonal.
				if ((posColumna - posFila + i) < (tablero.length) && (posColumna - posFila + i) >= 0) {
					tablero[i][posColumna - posFila + i] = 'X';

				}

				// Es lo mismo pero ahora comprobando la otra diagonal para ello se hace
				// cambiando los signos de las comprobaciones y de la ecuación.
				if ((posColumna + posFila - i) < (tablero.length) && (posColumna + posFila - i) >= 0) {
					tablero[i][posColumna + posFila - i] = 'X';
				}

			}
		}

		// Por ultimo imprimimos el caracter que representa el alfil en la posición
		// introducida por el usuario.
		tablero[posFila][posColumna] = pieza;

		// Devolvemos el tablero con el alfil en la posición deseada y todas las
		// posiciones a las que se puede desplazar.
		return tablero;
	}

	/**
	 * Esta función se encarga de devolver un tablero con la dama representada en la
	 * posición especificada por el usuario. También se muestra en el tablero todas
	 * las posiciones en forma de 'X' a las que se puede desplazar la dama.
	 * 
	 * @param posFila    La fila donde se encuentra nuestra dama.
	 * @param posColumna La columna donde se encuentra nuestra dama.
	 * @param pieza      La cifra que representa la dama utilizada por el usuario.
	 * @return El array tablero con la dama representada y las posiciones a las que
	 *         se puede desplazar.
	 */
	public static char[][] dama(int posFila, int posColumna, char pieza) {
		// Creamos el array tablero como char para almacenar la pieza y los movimientos
		// que podemos hacer con la dama. El tamaño siempre será de 8x8.
		char[][] tablero = new char[8][8];

		/*
		 * En estos for se hace lo mismo que en las funciones de la torre y el alfil se
		 * recorre las filas y columnas y se mezclan los calculos que hemos hecho en las
		 * dos ya que la dema se mueve en forma de cruz y diagonal.
		 */
		for (int i = 0; i < tablero.length; i++) {

			for (int j = 0; j < tablero[i].length; j++) {
				tablero[i][posColumna] = 'X';

				tablero[posFila][j] = 'X';

				if ((posColumna - posFila + i) < (tablero.length) && (posColumna - posFila + i) >= 0) {
					tablero[i][posColumna - posFila + i] = 'X';

				}

				if ((posColumna + posFila - i) < (tablero.length) && (posColumna + posFila - i) >= 0) {
					tablero[i][posColumna + posFila - i] = 'X';
				}

			}
		}

		// Por ultimo imprimimos el caracter que representa la dama en la posición
		// introducida por el usuario.
		tablero[posFila][posColumna] = pieza;

		// Devolvemos el tablero con la dama en la posición deseada y todas las
		// posiciones a las que se puede desplazar.
		return tablero;
	}

	public static char[][] caballo(int posFila, int posColumna, char pieza) {
		// Creamos el array tablero como char para almacenar la pieza y los movimientos
		// que podemos hacer con ella.
		char[][] tablero = new char[8][8];

		for (int i = posFila - 2; i < posFila + 2; i++) {

			for (int j = 0; j < 2; j++) {
				tablero[posFila - 2][posColumna + 1] = 'X';
				tablero[posFila - 2][posColumna - 1] = 'X';
				tablero[posFila - 1][posColumna + 2] = 'X';
				tablero[posFila - 1][posColumna - 2] = 'X';

				tablero[posFila + 1][posColumna + 2] = 'X';
				tablero[posFila + 1][posColumna - 2] = 'X';
				tablero[posFila + 2][posColumna + 1] = 'X';
				tablero[posFila + 2][posColumna - 1] = 'X';
			}
		}

		tablero[posFila][posColumna] = pieza;
		// Devolvemos el tablero con la pieza en la posición deseada.
		return tablero;
	}

}
