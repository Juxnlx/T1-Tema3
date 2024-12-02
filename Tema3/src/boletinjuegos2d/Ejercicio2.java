package boletinjuegos2d;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Este programa simula el juego del conecta 4.
 */
public class Ejercicio2 {

	// Declaremos el Scanner a nivel de clase para utilizarlo en cualquier método
	// del programa.
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Creamos la constante TAM_TABLERO como int para indicar el tamaño de nuestro
		// tablero.
		final int TAM_TABLERO = 4;

		// Creamos el array tablero como String para almacenar las tiradas de cada
		// jugador. Lo inicializamos a la constante TAM_TABLERO, ya que el tamaño del
		// tablero siempre será el mismo.
		String tablero[][] = new String[TAM_TABLERO][TAM_TABLERO];

		// Creamos la variable columna como int para almacenar la columna donde desea
		// introducir el usuario una ficha.
		int columna;

		/*
		 * Mediante un for recorremos todas las filas del tablero y las inicializamos a
		 * un guion con el .fill de la clase Arrays.
		 */
		for (int i = 0; i < tablero.length; i++) {
			Arrays.fill(tablero[i], "-");
		}

		// Asignamos a la vaiable columna la función validarColum para comprobar si el
		// valor introducido es valido o no.
		columna = validarColum(TAM_TABLERO);

		// Imprimimos el tablero de juego, para PROBAR
		for (String[] valor : rellenarTablero(tablero, columna, "X")) {
			for (String ficha : valor) {
				System.out.print(ficha + " ");
			}
			System.out.println();
		}
		
		
		
	}

	public static int validarColum(int sizeTablero) {

		// Creamos la variable num como int para almacenar el número que introducimos
		// por teclado.
		int num = 0;

		// Creamos la variable valido como boolean para comprobar si el valor
		// introducido es valido o no.
		boolean valido;

		// Comprobamos mediante un do-while cuando seguir preguntando la columna y
		// siempre que valido sea true que será cuando se de algun error.
		do {
			// Con el try-catch y el assert comprobamos que el valor introducido sea
			// correcto y si no es así mostramos un mensaje de error.
			try {
				System.out
						.print("Introduce la columna donde deseas introducir tu ficha 0 - " + (sizeTablero - 1) + ": ");
				num = sc.nextInt();

				assert (num >= 0 && num < sizeTablero) : "El número introducido esta fuera de rango";
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

	public static String[][] rellenarTablero(String[][] t, int pos, String pieza) {

		int indiceFila = t.length - 1;

		boolean rellenado = false;

		while (indiceFila >= 0 && !rellenado) {
			if (t[indiceFila][pos].equals("-")) {
				t[indiceFila][pos] = pieza;
				rellenado = true;
			}

			indiceFila--;
		}

		return t;
	}
	
	public static boolean esGanador(String[][] t) {
		boolean ganador = false; 
		
		return ganador;
	}
}
