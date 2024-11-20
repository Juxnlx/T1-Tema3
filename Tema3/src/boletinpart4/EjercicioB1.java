package boletinpart4;

import java.util.Arrays;
import java.util.Random;

/**
 * Este programa genera un array bidimensional de 6 x 10 con número aleatorios
 * entre 0 y 1000 y crea una función que devuelve un array unidimensional con el
 * valor maximo y minimo de la tabla de random.
 */
public class EjercicioB1 {

	public static void main(String[] args) {
		// Creamos el array tablaRadom como int de longitud 6x10 para almacenar varios
		// números aleatorios.
		int tablaRandom[][] = new int[6][10];

		// Declaramos el array tablaMaxMin como int para almacenar la tabla devuelta por
		// la función calculoMaxYMin.
		int tablaMaxMin[];

		// Creamos la clase Radom para generar números aleatorios entre 0 y 1000 ambos
		// incluidos en nuestra tabla de random.
		Random rand = new Random();

		// Rellenamos e imprimos la tablaRandom con todos sus valores aleatorios.
		System.out.println("Tabla generada aleatoriamente:");
		// Creamos este for para recorrer cada fila de nuestro array.
		for (int i = 0; i < tablaRandom.length; i++) {
			// Creamos este for para recorrer cada columna de nuestra array.
			for (int j = 0; j < tablaRandom[i].length; j++) {
				// La vamos rellenando con valores entre 0 y 1000 aleatoriamente.
				tablaRandom[i][j] = rand.nextInt(0, 1001);
				System.out.print(tablaRandom[i][j] + "\t");
			}
			System.out.println();
		}

		// Asignamos a la tablaMaxMin el array devuelto por la función calculoMaxYMin.
		tablaMaxMin = calculoMaxYMin(tablaRandom);

		// Mostramos un salto de linea y la tablaMaxMin.
		System.out.println();
		System.out.print("Tabla con el MAX y min de nuestra tabla generada --> ");
		System.out.println(Arrays.toString(tablaMaxMin));

	}

	/**
	 * Esta función se encarga de obtener el max y el min de una tabla pasada como
	 * parametro y esos valores añadirlos a una nueva tabla unidimensional.
	 * 
	 * @param t Tabla rellena con números aleatorios
	 * @return tablaMaxYMin Tabla con la posición 0 el número min y la posición 1 al
	 *         max.
	 */
	public static int[] calculoMaxYMin(int[][] t) {
		// Creamos el array tablaMaxYMin con una dimensión de 2 para almacenar en la
		// posición 0 el valor mínimo y en la posición 1 el máximo.
		int[] tablaMaxYMin = new int[2];

		// Creamos la variable max para almacenar el valor maximo y la inicializamos al
		// valor mas pequeño para que siempre el primer número sea mas grande y a partir
		// de ahí hacer la comprobación.
		int max = Integer.MIN_VALUE;

		// Creamos la variable min para almacenar el valor mínimo y la inicializamos al
		// valor mas grande para que siempre el primer número sea mas pequeño y a partir
		// de ahí hacer la comprobación.
		int min = Integer.MAX_VALUE;

		// Recorremos el array dimensional pasado por parametro para ir comprobando
		// valor
		// a valor.
		for (int i = 0; i < t.length; i++) {

			for (int j = 0; j < t[i].length; j++) {
				// Comprobamos si el valor introducido es mayor que el max, si es así se
				// almacena ese valor en max.
				if (t[i][j] > max) {
					max = t[i][j];
				}

				// Comprobamos si el valor introducido es menor que el min, si es así se
				// almacena ese valor en min.
				if (t[i][j] < min) {
					min = t[i][j];

				}
			}
		}

		// Asignamos a la posición 0 del array tablaMaxYMin el valor mínimo calculado.
		tablaMaxYMin[0] = min;
		// Asignamos a la posición 1 del array tablaMaxYMin el valor máximo calculado.
		tablaMaxYMin[1] = max;

		// Devolvemos la tabla unidimensional creada con el valor max y min de la tabla
		// pasada como pararametro.
		return tablaMaxYMin;
	}

}
