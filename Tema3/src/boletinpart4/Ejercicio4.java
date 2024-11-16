package boletinpart4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Este programa devuelve la posición donde se encuentra el valor que hemos
 * introducido por teclado. Esta busqueda es realizada por la función buscar.
 */
public class Ejercicio4 {

	public static void main(String[] args) {

		// Creamos el array tablaRandom de tamaño 15 donde almacenanaremos valores
		// random.
		int tablaRandom[] = new int[15];

		// Creamos la variable clave como int para almacenar el valor que ha introducido
		// el usuario y queremos saber si esta en la tabla.
		int clave;

		// Creamos el Scanner para leer la clave introducida por el usuario.
		Scanner sc = new Scanner(System.in);

		// Creamos la clase Radom para generar números aleatorios con los que rellenar
		// nuestro array tablaRadom.
		Random rand = new Random();

		// Creamos este for para recorrer la tabla e ir introduciendo valores.
		for (int i = 0; i < tablaRandom.length; i++) {
			// Generamos números aleatorios entre 1 y 21 y los asignamos a nuestro array
			// tablaRadom.
			tablaRandom[i] = rand.nextInt(1, 21);
		}

		// Le pedimos al usuario que introduzca el valor que desea encontrar y lo leemos
		// por teclado.
		System.out.print("Introduce el valor a encontrar entre 1 - 20 --> ");
		clave = sc.nextInt();
		
		System.out.println(Arrays.toString(tablaRandom));

		// Comprobamos si la posición que nos ha devuelto la función buscar es mayor o
		// igual a 0.
		if (buscar(tablaRandom, clave) >= 0) {
			// Imprimimos un mensaje mostrando en la posición en la que se encuentra la
			// clave.
			System.out.println("El valor " + clave + " se encuentra en la posición " + buscar(tablaRandom, clave));
			// Si no... (-1).
		} else {
			// Imprimimos el mensaje de que ese valor no se encuentra en nuestra tabla.
			System.out.println("El valor " + clave + " no se encuentra en la tabla");
		}

		// Cierre de Scanner
		sc.close();
	}

	/**
	 * Esta función se encarga de buscar un valor introducido por el usuario en la
	 * tabla que se encuentra desordenada.
	 * 
	 * @param t     La tabla en la que se encuentran todos los valores aleatorios.
	 * @param clave El número introducido por el uuario y que desea encontrar en la
	 *              tabla.
	 * @return sol La posición donde se encuentra esa clave, en caso de no ser
	 *         encontrada devuelve -1.
	 */
	public static int buscar(int t[], int clave) {

		// Creamos la variable indiceBusqueda para ir recorriendo cada posición de
		// nuestra tabla.
		int indiceBusqueda = 0;

		// Creamos la variable sol como int para devolver la posición donde se encuentra
		// nuestra clase o -1 en caso de no encontrar nada.
		int sol;

		// Cromprobamos si el indice de busqueda es menor que la longitud de la tabla y
		// si el valor que queremos buscar es distinto al que se encuentra en la posción
		// de la tabla.
		while (indiceBusqueda < t.length && clave != t[indiceBusqueda]) {
			// Incrementamos el indice de busqueda en +1.
			indiceBusqueda++;
		}

		// Comprobamos si el indice es menor que la longitud de la tabla, esto significa
		// que el número introducido se encuentra en alguna posición de la tabla.
		if (indiceBusqueda < t.length) {
			// A nuestra variable sol le indicamos la posición de la tabla donde se
			// encuentra el número que hemos introducido.
			sol = indiceBusqueda;
			// Si no, significa que el indice es igual o superior a la longitud de la tabla
			// por lo tanto no se encantrado ese número dentro de ella.
		} else {
			// A sol le asignamos el valor de menos uno.
			sol = -1;
		}

		// Devolvemos el la solucón que es la posición donde se encuentra el valor si es
		// que lo ha encontrado.
		return sol;
	}
}
