package boletinjuegos;

import java.util.Random;
import java.util.Scanner;

/**
 * Este programa crea una tabla de bidimensionales y una función nos devuelve
 * true o false si el dicho valor se enceuntra en la tabla o no.
 */
public class Ejercicio1 {

	public static void main(String[] args) {

		// Declaramos el array tablaRadom como int para almacenar varios
		// números aleatorios.
		int tablaRandom[][];

		// Creamos la variable size como int para almacenar el tamaño del array
		// introducido por el usuario.
		int size;

		// Creamos la variable finRandom como int para almacenar el número hasta donde
		// deseamos que llegue la generación de números aleatorios.
		int finRandom;

		// Creamos la variable valor como int para almacenar el múmero que queremos
		// buscar en la tabla introducido por el usuario.
		int valor;

		// Creamos la variable valorEnc como boolean para almacenar lo que nos devuelve
		// la función valorEncontrado.
		boolean valorEnc;

		// Creamos la clase Scanner para leer el tamaño de la tabla, hasta donde
		// queremos que se generen los random y el valor que queremos buscar.
		Scanner sc = new Scanner(System.in);

		// Creamos la clase Radom para generar números aleatorios entre 1 y el número
		// que nos introduzcan incluido.
		Random rand = new Random();

		// Le pedimos al usuario que introduzca el tamaño de la tabla que desea.
		System.out.print("Introduce el tamaño de la tabla --> ");
		size = sc.nextInt();

		// Le pedimos al usuario que introduzca hasta donde desea que llegue la
		// generación de números aleatorios.
		System.out.print("Introduce hasta donde deseas generar aleatorios --> ");
		finRandom = sc.nextInt();

		// Le pedimos al usuario el número que queremos buscar en la tabla y lo leemos.
		System.out.print("Introduce el número a buscar --> ");
		valor = sc.nextInt();

		// Creamos la tabla con la posición introducida por el usuario.
		tablaRandom = new int[size][size];

		// Creamos este for para recorrer nuestra tabla e ir rellenandola con valores
		// aleatorios que se vayan generando.
		for (int i = 0; i < tablaRandom.length; i++) {

			for (int j = 0; j < tablaRandom[i].length; j++) {
				tablaRandom[i][j] = rand.nextInt(1, finRandom + 1);
				System.out.print(tablaRandom[i][j] + "\t");
			}

			System.out.println();
		}

		// Asignamos a la variable valorEnc la solución que devuelve nuestra función
		// valorEncontrado.
		valorEnc = valorEncontrado(tablaRandom, valor);

		// Imprimimos el resultado que nos devuelve la función.
		System.out.println();
		System.out.println("¿Esta en la tabla el valor " + valor + "? --> " + valorEnc);

		// Cierre de Scanner
		sc.close();

	}

	/**
	 * Esta función nos busca un valor en una tabla bidimensional.
	 * 
	 * @param t     Tabla con valores aleatorios.
	 * @param valor Número que tenemos que buscar en la tabla.
	 * @return True si encuentra el valor | False si no lo encuentra.
	 */
	public static boolean valorEncontrado(int t[][], int valor) {

		// Creamos la variable enc como boolean para comprobar cuando nos salimos del
		// bucle.
		boolean enc = false;

		// Creamos la variable indiceFila como int para almacenar el indice por el que
		// se va recorriendo nuestras filas.
		int indiceFila = 0;

		// Creamos la variable indiceCol como int para almacenar el indice por el que
		// se va recorriendo nuestras columnas.
		int indiceCol = 0;

		// Creamos este while para recorrer cada fila y comprobar si enc es igual a
		// true, si es así significa que ha encontrado el número, por lo tanto nos
		// salimos del bucle.
		while (!enc && indiceFila < t.length) {

			// Ponemos el indice de columnas a 0 antes de cada recorrido de una nueva fila.
			indiceCol = 0;

			// Creamos este while para recorrer cada valor que se enceuntra en nuestra
			// tabla.
			while (indiceCol < t[indiceFila].length) {

				// Comprobamos si el valor introducido por el usuario es el que estamos leyendo
				// en este momento de la tabla. Si es así, indicamos que lo hemos encontrado,
				// ponemos la variable enc a true, para en la siguiente fila salirnos de la
				// lectura de mas números.
				if (valor == t[indiceFila][indiceCol]) {
					enc = true;
				}

				indiceCol++;
			}

			indiceFila++;
		}

		// Devolvemos enc donde se almacena true o false dependiendo de si se ha
		// encontrado el número o no.
		return enc;
	}

}
