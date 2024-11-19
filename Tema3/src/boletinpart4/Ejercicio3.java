package boletinpart4;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Este programa genera una función en la cual se crea una tabla rellena con
 * números pares hasta un número pasado como parametro "fin" y la longitud
 * tambien pasada como parametro. Finalmente devuelve la tabla rellena con
 * números pares.
 */
public class Ejercicio3 {

	public static void main(String[] args) {

		// Creamos la variable longitud como int para el almacenar el valor del tamaño
		// de nuestra tabla que sera generado por el usuario.
		int longitud = validacion();

		// Creamos la variable fin como int para almacenar el valor hasta donde se debe
		// de generar el número aleatorio.
		int fin = validacion();

		System.out.println(rellenaPares(longitud, fin));

	}

	/**
	 * Esta función se encarga de comprobar si el número introducido por el usuario
	 * es par o no. Si no es par se lo pregunta otra vez.
	 * 
	 * @param sc
	 * @return
	 */
	public static int validacion() {

		boolean continuar;

		// Creamos el Scanner para leer la longitud y el fin introducidos por el
		// usuario.
		Scanner sc = new Scanner(System.in);

		int numero = 0; 
		
		do {
			try {
				// Le pedimos al usuario que introduzca el valor hasta donde llegar nuestra
				// secuencia de pares y la leemos por teclado.
				System.out.print("Introduce el valor de fin de la tabla --> ");
				numero = sc.nextInt();
				// Le pedimos al usuario que introduzca la longitud de la tabla y la leemos por
				// teclado.
				//System.out.print("Introduce el la longitud de la tabla --> ");
				//longitud = sc.nextInt();
				assert (numero > 0) : "El valor introducido no es PAR";
				continuar = false;

			} catch (AssertionError e) {
				System.out.println(e.getMessage());
				continuar = true;

			} catch (InputMismatchException e) {
				System.out.println("El valor introducido es incorrecto");
				continuar = true;

			} finally {
				sc.nextLine();
			}

		} while (continuar);

		sc.close();

		return numero;
	}

	/**
	 * Esta función se encarda de rellenar nuestra tabla con números impares hasta
	 * uno que introduzcamos nosotros. Nos devuelve la tabla ordenada.
	 * 
	 * @param longitud El tamaño que tendra nuestra tabla.
	 * @param fin      El valor par hasta donde debe de llegar nuestra tabla.
	 * @return tablaPar Devolvemos nuestra tabla rellena de número pares y ordenada
	 *         de forma creciente.
	 */
	public static int[] rellenaPares(int longitud, int fin) {

		// Creamos el array tablaPar de tamaño "longitud" (pasada por parametro) para
		// almacenar la secuencia de valores pares.
		int tablaPar[] = new int[longitud];

		// Creamos la clase random para generar números random.
		Random rand = new Random();

		// Creamos la variable numRandom como int para almacenar números aleatorios
		// entre 2 y fin.
		int numRandom;

		// Inicializamos la tabla al valor de fin.
		Arrays.fill(tablaPar, fin);

		// Con este for recorremos la tabla hasta una posición menos porque el ultimo
		// valor siempre sera el introducido por el usuario. Y vamos añadiendo los
		// valores par hasta terminar de recorrer la tabla.
		for (int i = 0; i < (tablaPar.length - 1); i++) {

			// Creamos este do-while para comprobar si el número aleatorio que generamos es
			// impar y se encuentra en la tabla. Si es alguno de esas dos cosas y solo uno
			// debe de generarse un número aleatorio nuevo. Solo deja almacenar el valor
			// del número si es par y no esta en la tabla.
			do {
				// Generamos un número aleatorio entre 2 y 1 menos que el introducido por el
				// usuario.
				numRandom = rand.nextInt(2, fin);
			} while (numRandom % 2 != 0 || (Arrays.binarySearch(tablaPar, numRandom) >= 0));

			// Se asi
			tablaPar[i] = numRandom;
			Arrays.sort(tablaPar);
		}

		// Devolvemos nuestra tabla con toda la secuencia de números pares.
		return tablaPar;

	}
}
