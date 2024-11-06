package boletinpart1;

import java.util.Scanner;

/**
 * Este programa solicita al usurio 10 números y los almacena en una tabla,
 * luego calcular la suma de todos los números y muestra el maximo y el minimo.
 */
public class Ejercicio5 {

	public static void main(String[] args) {

		// Creamos nuestro array tablaNum como float para almacenar 10 valores reales
		// ntroducidos por el usuario.
		float tablaNum[] = new float[10];

		// Creamos la variable num como float para almacenar de forma momentanea los
		// valores introducidos por el usuario.
		float num;

		// Creamos la variable max como float para almacenar el maximo posible. Lo
		// debemos inicializar al minimo posible para que asi cualquier número que
		// introduzcamos sea mayor.
		float max = Float.MIN_VALUE;

		// Creamos la variable min como float para almacenar el minimo posible. Lo
		// debemos de inicializar al mayor número posible para que así cualquier número
		// que introduzcamos sea menor.
		float min = Float.MAX_VALUE;

		// Creamos la variable suma como float para almacenar la suma de todos los
		// números introducidos en la tabla.
		float suma = 0;

		// Creamos el Scanner para leer dichos números por teclado.
		Scanner sc = new Scanner(System.in);

		// Creamos este for para recorrer cada posición de la tabla e ir rellenandola
		// con cada número introducido por el usuario.
		for (int i = 0; i < tablaNum.length; i++) {
			// Le pedimos al usuario que introduzca un número y lo leemos.
			System.out.print("Introduce un número --> ");
			num = sc.nextFloat();

			// Asignamos a la tabla cada valor introducido por el usuario.
			tablaNum[i] = num;

			// En cada iteración vamos sumando cada valor introducido a la tabla.
			suma += tablaNum[i];

			// Comprobamos si el número es mayor o igual al max si es así, asignamos a max
			// el número.
			if (num >= max) {
				max = num;
			}

			// Comprobamos si el número es menor o igual al min si es así, asignamos a min
			// el número.
			if (num <= min) {
				min = num;
			}
		}

		// Imprimimos la suma de todos los números de la tabla y mostramos el minimo y
		// el maximo.
		System.out.println();
		System.out.println("La suma de todos los números de la tabla es: " + suma);
		System.out.println("El máximo número de la tabla es: " + max);
		System.out.println("El mínimo número de la tabla es: " + min);

		// Cierre de Scanner
		sc.close();
	}

}
