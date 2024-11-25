package boletinjuegos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Este programa crea una tabla unidimensional y crea una función que se encarga
 * de desordenar la misma tabla.
 */
public class Ejercicio2 {

	// Creamos la clase Random para generar números aleatorios. La creamos a nivel
	// de clase ya que la utilizaremos en el main y en la función desordenaTabla..
	static Random rand = new Random();

	public static void main(String[] args) {

		// Declaramos el array tablaOrd como int para almacenar valores aleatorios
		// ordenados.
		int tablaOrd[];

		// Creamos la varible size como int para almacenar el tamaño de nuestra tabla.
		int size;

		// Creamos la variable finRandom para almacenar el número hasta donde queremos
		// generar números aleatorios.
		int finRandom;

		// Creamos la variable numAleatorio como int para almacenar el valor que va
		// generando el random.
		int numAleatorio;

		// Creamos el Scanner para leer el tamaño de la tabla y el finRandom del
		// usuario.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca el tamaño de la tabla y lo leemos.
		System.out.print("Introduce el tamaño de la tabla --> ");
		size = sc.nextInt();

		// Le pedimos al usuario que introduzca el valor hasta donde desea generar
		// números aleatorios y lo leemos.
		System.out.print("Hasta donde quieres generar aleatorios --> ");
		finRandom = sc.nextInt();

		// Creamos nuestro array tablaOrd con el tamaño introducido por el usuario.
		tablaOrd = new int[size];

		// Inicializamos la tabla al valor aleatorio mas alto que se puede generar.
		Arrays.fill(tablaOrd, finRandom);

		// Recorremos cada posición para ir generando un número aleatorio e introducirlo
		// en la tabla.
		for (int i = 0; i < tablaOrd.length; i++) {
			// Generamos un número aleatorio.
			numAleatorio = rand.nextInt(1, finRandom + 1);

			// Comprobamos si el número introducido ya se encuentra en la tabla haciendo una
			// busqueda binaria, si no es así, en la posición donde nos encontremos
			// guardamos el valor generado.
			if (Arrays.binarySearch(tablaOrd, numAleatorio) < 0) {
				tablaOrd[i] = numAleatorio;
				// Ordenamos la tabla de forma creciente.
				Arrays.sort(tablaOrd);
				// Si no, nos quedamos en la posición actual y volvemos a generar otro valor
				// aleatorio.
			} else {
				i--;
			}
		}

		// Mostramos la tabla generada con valores aleatorios y ordenada.
		System.out.println();
		System.out.println("Tabla ordenada: ");
		for (int valor : tablaOrd) {
			System.out.print(valor + ", ");
		}

		System.out.println();
		
		for (int valor : desordenarTabla(tablaOrd)) {
			System.out.print(valor + ", ");
		}
		
		// Cierre de Scanner
		sc.close();
	}

	public static int[] desordenarTabla(int t[]) {
		
		int posAleatoria;
		
		for (int i = 0; i < t.length; i++) {
			posAleatoria = rand.nextInt(1, t.length);
			t[i] = t[posAleatoria];
		}
		
		return t;
	}
}
