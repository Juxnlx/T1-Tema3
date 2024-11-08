package boletinpart2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Este programa solicita al usuario un tamaño y un valor y el programa debe de
 * mostrar un array con el tamaño y rellena con el valor introducido por el
 * usuario.
 */
public class Ejercicio1 {

	public static void main(String[] args) {

		// Declaramos nuestra tabla como int para almacenar valores enteros.
		int tabla[];

		// Creamos la variable tamaño como int para almacenar el valor introducido por
		// el usuario que sera el tamaño del array.
		int size;

		// Creamos la variable valor como int para almacenar el valor introducido por el
		// usuario que sera el valor con el que rellenaremos la tabla.
		int valor;

		// Creamos el Scanner para leer el tamaño y el valor introducidos por el
		// usuario.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca un tamaño y lo leemos.
		System.out.print("Introduce el tamaño de la tabla --> ");
		size = sc.nextInt();

		// Le pedimos al usuario que introduzca el valor con el que desea ordenar
		// rellenar la tabla.
		System.out.print("Introduce el valor con el que rellenar la tabla --> ");
		valor = sc.nextInt();

		// Creamos la tabla ya declarada con el tamaño introducido por el usuario.
		tabla = new int[size];

		// Utilizamos el array .fill del la clase array para rellenar la tabla con el
		// valor introducido por el usuario.
		Arrays.fill(tabla, valor);

		// Salto de linea y mensaje explicatorio de lo que se va a mostrar.
		System.out.println();
		System.out.println("Tabla de tamaño " + size + " y rellena con el valor " + valor + " -->");

		// Mostramos la tabla con sus posiciones ya rellenadas
		System.out.println(Arrays.toString(tabla));

		// Cierre de Scanner
		sc.close();
	}

}
