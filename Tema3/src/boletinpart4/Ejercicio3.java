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

	// Creamos el Scanner para leer el número introducido por el usuario.
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Declaramos el array tPar como int para almacenar la tabla devuelta por
		// la función rellenaPares.
		int tPar[];

		// Creamos la variable longitud como int para el almacenar el valor del tamaño
		// de nuestra tabla que sera introducido por el usuario y comprobado por nuestra
		// función validacion si es correcto o no. Por ello asignamos a longitud la
		// función.
		int longitud = validacion("longitud");

		// Creamos la variable fin como int para almacenar el valor hasta donde se debe
		// de generar el número aleatorio es introducido por el usuario y validado por
		// la función validación. Para ello asignamos la variable a fin.
		int fin = validacion("fin");

		// Asignamos a la tabla tPar la tabla devuelta por la función rellenaPares.
		tPar = rellenaPares(longitud, fin);

		// Mostramos un mensaje de lo que vamos a mostrar
		System.out.println();
		System.out.println("La tabla generada con números aleatorios es: ");
		// Imprimimos la tabla tPar porque es donde se almacena la tabla con todos los
		// pares devuelta por la función rellenaPares.
		System.out.println(Arrays.toString(tPar));

		// Cierre de Scanner
		sc.close();
	}

	/**
	 * Esta función se encarga de comprobar si el número introducido por el usuario
	 * es par o no. Si no es par se lo pregunta otra vez.
	 * 
	 * @param cadena Es una cadena que pasamos por parametro para un mensaje mas
	 *               personalizado.
	 * @return numero El valor comprobado (si no es negativo)
	 */
	public static int validacion(String cadena) {

		// Creamos la variable continuar para indicar a nuestro bucle cuando tiene que
		// salir de el.
		boolean continuar;

		// Creamos la variable número como int para almacenar el número introducido por
		// el usuario (longitud y fin).
		int numero = 0;

		// Mediante este bucle do-while comprobamos si la variable continuar es true o
		// false, para ver si debemos de volver a preguntar el número o es correcto.
		do {

			// Mediante el try-catch controlamos las excepciones que pueden saltar y las
			// corregimos mostrando un mensaje por consola.
			try {
				// Le pedimos al usuario que introduzca el valor hasta donde llegar nuestra
				// secuencia de pares y la leemos por teclado.
				System.out.print("Introduce el valor de " + cadena + " --> ");
				numero = sc.nextInt();

				// Comprobamos que el número introducido por teclado no sea negativo.
				assert (numero > 0) : "El valor introducido es negativo";

				// Si no es negativo continuar devuelve false por la tanto salimos del bucle y
				// devolvemos el número.
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

		// Devolvemos el número comprobado.
		return numero;
	}

	/**
	 * Esta función se encarda de rellenar nuestra tabla con números pares hasta uno
	 * que introduzcamos nosotros. Nos devuelve la tabla ordenada.
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

		Arrays.fill(tablaPar, (fin + 1));

		// Con este for recorremos la tabla hasta una posición menos porque el ultimo
		// valor siempre sera el introducido por el usuario. Y vamos añadiendo los
		// valores par hasta terminar de recorrer la tabla.
		for (int i = 0; i < tablaPar.length; i++) {

			// Creamos este do-while para comprobar si el número aleatorio que generamos es
			// impar y se encuentra en la tabla. Si es alguno de esas dos cosas y solo uno
			// debe de generarse un número aleatorio nuevo. Solo deja almacenar el valor
			// del número si es par y no esta en la tabla.
			do {
				// Generamos un número aleatorio entre 2 y 1 menos que el introducido por el
				// usuario.
				numRandom = rand.nextInt(2, (fin + 1));
			} while (numRandom % 2 != 0 || (Arrays.binarySearch(tablaPar, numRandom) >= 0));

			// Se asi
			tablaPar[i] = numRandom;
			Arrays.sort(tablaPar);
		}

		// Devolvemos nuestra tabla con toda la secuencia de números pares.
		return tablaPar;

	}
}
