package boletinjuegos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BarcoUndido {

	// Creamos el Scanner a nivel de clase para solicitar información al usuario en
	// el resto de las funciones, si es lo que se requiere.
	static Scanner sc = new Scanner(System.in);

	static Random rand = new Random();

	public static void main(String[] args) {

		// Declaramos el array tablero1 como char para almacenar los barcos del jugador
		// 1.
		char[][] tablero1;

		// Creamos la variable size para almacenar el tamaño de nuestro tablero que sera
		// introducido por el usuario.
		int size;

		// Creamos la variable letraA como char para almacenar la primera letra del
		// abecedario.
		char letraA = 'A';

		// Creamos la variable letraB como char para almacenar las letras que se iran
		// imprimiendo a la hora de imprimir el tablero.
		char letra = '0';

		// Creamos la variable fila como char para almacenar la posición en la fila como
		// char.
		char fila;

		// Creamos la variable columna como char para almacenar la posición en la
		// columna como char.
		char columna;

		// Creamos la variable filaTablero como int para almacenar el valor de posición
		// de la fila introducida por el usuario pero en númerico.
		int filaTablero;

		// Creamos la variable columnaTablero como int para almacenar el valor de
		// posición de la columna introducida por el usuario pero en númerico.
		int columnaTablero;

		// Creamos la variable barco como int para almacenar el número de barcos con los
		// que quiere jugar el usuario.
		int barco;

		// Le pedimos al usuario que introduzca el tamaño del número y lo leemos.
		System.out.print("Introduce el tamaño del tablero: ");
		size = sc.nextInt();

		System.out.println("Introduce con cuantos barcos jugar: ");
		barco = sc.nextInt();

		// Le pedimos al usuario que introduzca una posición en caracter para la fila y
		// lo leemos.
		System.out.print("Introduce el caracter de la fila que desees --> ");
		fila = sc.next().toUpperCase().charAt(0);

		// Le pedimos al usuario que introduzca una posición en caracter para la columna
		// y lo leemos.
		System.out.print("Introduce el caracter de la columna que desees --> ");
		columna = sc.next().toUpperCase().charAt(0);

		// A la variable filaTablero le indicamos la posición númerrica que corresponde
		// a la letra introducida por el usuario.
		filaTablero = (fila - letraA);

		// A la variable ColumnaTablero le indicamos la posición númerica que
		// corresponde a la letra introducida por el usuario.
		columnaTablero = (columna - letraA);

		// Creamos el tablero1 con el tamaño que nos ha introducido el usuario por
		// teclado.
		tablero1 = new char[size][size];

		/**
		 * Mediante este for y la clase Arrays vamos a utilizar el metodo fill para
		 * inicializar el array a guiones.
		 */
		for (int i = 0; i < tablero1.length; i++) {
			Arrays.fill(tablero1[i], '-');
		}

		colocarBarcos(tablero1, barco);

		realizarDisparo(tablero1, filaTablero, columnaTablero, 'X');
		/*
		 * Llamamos a la función imprimirTablero para mostrar nuestro tablero.
		 */
		imprimirTablero(tablero1, letraA, letra);

		// Cierre de Scanner
		sc.close();
	}

	public static void colocarBarcos(char[][] tablero, int numBarco) {

		// Creamos la variable contBarco para contabilizar las veces que añadimos un
		// barco a nuestro tablero.
		int contBarco = 0;

		// Creamos la variable fila para generar una fila aleatoria donde almacenar
		// nuestros barcos.
		int fila;

		// Creamos la variable columna para generar una columna aleatoria donde
		// almacenar nuestros barcos
		int columna;

		// Creamos la variable sizeBarco como int para almacenar el tamaño del barco.
		int sizeBarco;

		while (contBarco != numBarco) {
			fila = rand.nextInt(0, tablero.length);
			columna = rand.nextInt(0, tablero.length);

			if (tablero[fila][columna] != '⚓' && (columna + 1) < tablero[0].length) {
				tablero[fila][columna] = '⚓';
				tablero[fila][columna + 1] = '⚓';
				contBarco++;
			}
		}

	}

	public static void realizarDisparo(char[][] tablero, int fila, int columna, char pieza) {

		if (tablero[fila][columna] == '⚓') {
			tablero[fila][columna] = '▄';
		} else  {
			tablero[fila][columna] = pieza;
		}
	}

	public static void imprimirTablero(char[][] tablero, char letraA, char letra) {

		for (int i = 0; i < tablero.length; i++) {
			letra = (char) (letraA + i);
			System.out.print("\t" + letra);
		}

		// Salto de linea.
		System.out.println();

		for (int i = 0; i < tablero.length; i++) {
			letra = (char) (letraA + i);
			System.out.print(letra + "\t");
			for (int j = 0; j < tablero[i].length; j++) {
				System.out.print(tablero[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
