package boletinpart4;

import java.util.Random;
import java.util.Scanner;

/**
 * Este programa crea una tabla con el mismo número de filas y columnas y una
 * función se encarga de girarla 90º y mostrarnosla por teclado.
 */
public class EjercicioB5 {

	public static void main(String[] args) {
		// Declaramos el array tabla como int para almacenar una serie de números
		// aleatorios.
		int tabla[][];

		// Declaramos el array tablaGirada como int para almacenar la tabla girada que
		// nos devuelve la función gira90.
		int tablaGirada[][];

		// Creamos la variable size para almacenar la cantidad de lineas y columans que
		// tendra nuestra tabla.
		int size;

		// Creamos al variable finRandom para almacenar el valor hasta donde queremos
		// que se generen números aleatorios en nuestra tabla.
		int finRandom;

		// Creamos el Scanner para leer las filas y columnas que sera el mismo número
		// introducido por el usuario.
		Scanner sc = new Scanner(System.in);

		// Creamos la clase Random para generar números aleatorios.
		Random rand = new Random();

		// Le pedimos al usuario que introduzca el tamaño que desea que tenga el array
		// tabla.
		System.out.print("Introduce la cantidad de lineas y columnas del array --> ");
		size = sc.nextInt();

		// Le pedimos al usuario que introduzca hasta que valor deseea que se genere un
		// número aleatorio.
		System.out.print("Introduce hasta que valor generar aleatorios --> ");
		finRandom = sc.nextInt();

		// Creamos nuestra tabla con las lineas y columnas introducidas por teclado para
		// almacenar los valores aleatorios.
		tabla = new int[size][size];

		// Mostramos un salto de linea y lo que vamos a mostrar a continuación.
		System.out.println();
		System.out.println("Tabla generada de forma aleatoria --> ");

		// Creamos este for para recorrer las lineas de nuestro array.
		for (int i = 0; i < tabla.length; i++) {
			// Creamos este for para recorrer las columnas de nuestro array.
			for (int j = 0; j < tabla[i].length; j++) {

				// Generamos números valores aleatorios para cada posición de nuestro array.
				tabla[i][j] = rand.nextInt(1, (finRandom + 1));
				// Imprimimos el número de forma bonita y ordenada.
				System.out.print(tabla[i][j] + "\t");
			}
			// Salto de linea despues de terminar cada linea.
			System.out.println();
		}

		// Mostramos un salto de linea y lo que vamos a mostrar a continuación.
		System.out.println();
		System.out.println("Tabla girada 90 grados --> ");

		// A nuestra variable tablaGirada le asignamos el valor que nos devuelve la
		// función gira90.
		tablaGirada = gira90(tabla);

		// Recorremos la tabla devuelta por la función gira90 para mostrar cada uno de
		// sus valores.
		for (int x[] : tablaGirada) {
			for (int y : x) {
				System.out.print(y + "\t");
			}
			System.out.println();
		}

		// Cierre de Scanner
		sc.close();

	}

	/**
	 * Esta función se encarga de girar 90º la tabla pasada como parametro.
	 * 
	 * @param tablaInicio Tabla generada con valores aleatorios.
	 * @return tablaGirada Una nueva tabla con los valores de la tablaIncio
	 * 					   girados 90º.
	 */
	public static int[][] gira90(int tablaInicio[][]) {
		// Creamos el array tablaGirada con las mismas dimensiones que la tabla pasada
		// como parametro. En esta tabla almacenaremos la girada 90º.
		int tablaGirada[][] = new int[tablaInicio.length][tablaInicio.length];

		// Recorremos la tabla pasada como parametro con todos los valores aleatorios de
		// forma normal.
		for (int i = 0; i < tablaInicio.length; i++) {

			for (int j = 0; j < tablaInicio[i].length; j++) {

				// A la fila de la nueva tabla le asignamos la j ya que la recorremos por
				// columnas y las columnas es la longitud de la tabla menos 1, menos i. Esto es
				// porque en cada recorrido las columnas deben de valer lo mismo.
				// tablaGirada 0, 0				tablaInicio 0, 4
				//			   0, 1				tablaInicio 1, 4
				tablaGirada[j][(tablaInicio.length - 1) - i] = tablaInicio[i][j];

			}
		}
		
		// Devolvemos la nueva tabla girada.
		return tablaGirada;
	}

}
