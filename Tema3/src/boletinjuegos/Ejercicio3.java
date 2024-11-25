package boletinjuegos;

import java.util.Random;
import java.util.Scanner;

/**
 * Este programa genera una tabla bidimensional con valores aleatorios ordenados
 * y una función que crearemos nos devuelve la misma tabla pero desordenada.
 */
public class Ejercicio3 {

	// Creamos la clase Random para generar números aleatorios. La creamos a nivel
	// de clase ya que la utilizaremos en el main y en la función desordenaTabla..
	static Random rand = new Random();

	public static void main(String[] args) {

		// Declaramos el array tablaOrd como int para almacenar valores aleatorios
		// ordenados.
		int tablaOrd[][];

		// Declaramos el array tablaDesd como int para almacenar esta misma tabla pero
		// desordenada por la función desordenarTabla.
		int tablaDesd[][];

		// Creamos la varible filas como int para almacenar el número de filas de
		// nuestra tabla.
		int filas;

		// Creamos la varible columnas como int para almacenar el número de columnas de
		// nuestra tabla.
		int columnas;

		// Creamos la variable finRandom para almacenar el número hasta donde queremos
		// generar números aleatorios.
		int finRandom;

		// Creamos el Scanner para leer el número de filas y columans de la tabla y el
		// finRandom del usuario.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca el número de filas.
		System.out.print("Introduce el número de filas --> ");
		filas = sc.nextInt();

		// Le pedimos al usuario que introduzca el número de filas.
		System.out.print("Introduce el número de columnas --> ");
		columnas = sc.nextInt();

		// Le pedimos al usuario que introduzca el valor hasta donde desea generar
		// números aleatorios y lo leemos.
		System.out.print("Hasta donde quieres generar aleatorios --> ");
		finRandom = sc.nextInt();

		// Creamos nuestro array tablaOrd con el número de filas y columanas
		// introducidas por el usuario.
		tablaOrd = new int[filas][columnas];

		// Recorremos la tabla para guardar números aleatorios entre 1 y el introduido
		// por el usuario.
		for (int i = 0; i < tablaOrd.length; i++) {

			for (int j = 0; j < tablaOrd[i].length; j++) {
				// Recorremos cada posición de nuestra tabla y generamos números aleatorios
				// entre 1 y el introducido por el usuario, ambos incluidos.
				tablaOrd[i][j] = rand.nextInt(1, finRandom + 1);

			}
		}

		// Mostramos la tabla generada con valores aleatorios.
		System.out.println();
		System.out.println("Tabla ordenada: ");
		for (int tabla[] : tablaOrd) {
			for (int valor : tabla) {
				System.out.print(valor + "\t");
			}
			System.out.println();
		}

		// Salto de linea.
		System.out.println();

		// En la tablaDesd guardamos la misma tabla pero desordenada que nos devuelve la
		// función desordenarTabla.
		tablaDesd = desordenarTabla(tablaOrd);

		// Imprimimos nuestra tabla generada con valores aleatorios pero desordenada.
		System.out.println();
		System.out.println("Tabla desordenada: ");
		for (int tabla[] : tablaDesd) {
			for (int valor : tabla) {
				System.out.print(valor + "\t");
			}
			System.out.println();
		}

		// Cierre de Scanner
		sc.close();
	}

	/**
	 * Esta función se encarga de desorganizar los valores de una tabla
	 * bidimensional.
	 * 
	 * @param t Tabla bidimensional con valores aleatorios
	 * @return La misma tabla pasada como parametro pero con los valores
	 *         desordenados.
	 */
	public static int[][] desordenarTabla(int t[][]) {

		// Creamos la variable posFilaAux como int para almacenar una posición aleatoria
		// de filas de nuestra tabla.
		int posFilaAux;

		// Creamos la variable posColmAux como int para almacenar una posición aleatoria
		// de columnas de nuestra tabla.
		int posColmAux;

		// Creamos la variable numAux como int para almacenar el valor de la posición
		// que estamos recorriendo.
		int numAux;

		// Recorremos cada posición de la tabla para desorganizar la tabla (cambiar los
		// valores).
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {

				// En la variable numAux guardamos el valor que estamos recorriendo ahora mismo
				// para utilizarlo mas tarde.
				numAux = t[i][j];

				// En la variable posFilaAux guardamos una posición aleatoria entre 0 y el
				// número de filas de la tabla.
				posFilaAux = rand.nextInt(0, t.length);

				// En la variable posColmAux guardamos una posición aleatoria entre 0 y el
				// número de columnas de la tabla.
				posColmAux = rand.nextInt(0, t[i].length);

				// En la posición que estamos recorriendo guardamos el valor que se encuentra en
				// la posición aleatoria que hemos generado.
				t[i][j] = t[posFilaAux][posColmAux];

				// En la posición aleatoria guardamos el valor que se encontraba antes en la
				// posición que estabamos recorriendo.
				t[posFilaAux][posColmAux] = numAux;
			}
		}

		// Devolvemos la tabla pasada como parametro desordenada.
		return t;
	}

}
