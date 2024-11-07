package boletinpart1;

import java.util.Scanner;

/**
 * Este programa solicita 8 números y los almacena en una tabla y el program
 * debe de mostrar por consola cada número introducido y al lado si es par o
 * impar.
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		// Creamos el array tablaNum como int de 8 dimensiones para almacenar los
		// números introducidos por el usuario.
		int tablaNum[] = new int[8];

		// Creamos las variable num com int para almacenar de forma temporal los números
		// introducidos por el usurio.
		int num;

		// Creamos el Scanner para leer los números introducidos por el usuario.
		Scanner sc = new Scanner(System.in);

		// Este for se encarga de solictar números al usuario e introducirlos en la
		// tabla.
		for (int i = 0; i < tablaNum.length; i++) {

			// Le pedimos al usuario que introduzca un número y lo leemos.
			System.out.print("Introduce un número --> ");
			num = sc.nextInt();

			// Vamos asignando a cada posición el números que vamos pidiendole al usuario.
			tablaNum[i] = num;
		}

		// Salto de linea y mensaje de lo que se mostrara a continuación.
		System.out.println();
		System.out.println("¿Cuales de los números introducidos son pares?");

		// Hacemos un for-each para recorrer la tabla que hemos rellenado anteriormente.
		for (int valor : tablaNum) {
			if (valor % 2 == 0) {
				System.out.println("El número " + valor + " es PAR");
			} else {
				System.out.println("El número " + valor + " es IMPAR");
			}
		}

		// Cierre de Scanner
		sc.close();
	}

}
