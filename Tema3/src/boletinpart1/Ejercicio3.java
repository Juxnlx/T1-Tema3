package boletinpart1;

import java.util.Scanner;

/**
 * Este programa solicita diez números al usuario los almacena en una tabla y
 * luego muestra la tabla de forma inversa.
 */
public class Ejercicio3 {

	public static void main(String[] args) {

		// Creamos la tabla tablaNum como int de 10 dimensiones para almacenar números
		// introducidos por el usuario.
		int tablaNum[] = new int[10];

		// Creamos la variable num como int para almacenar los números introducidos por
		// el usuario.
		int num;

		// Creamos el Scanner para leer los números inroducidos por el usuario.
		Scanner sc = new Scanner(System.in);

		// Creamos el for para recorrer y rellenar la tabla de diez dimensiones con los
		// valor que ira introduciendo el usuario.
		for (int i = 0; i < tablaNum.length; i++) {
			// Le pedimos al usuario que introduzca un número y lo leemos.
			System.out.print("Introduce un número --> ");
			num = sc.nextInt();
			// Le asignamos a cada posicón de nuestra tabla el valor que vaya introduciendo
			// el usuario.
			tablaNum[i] = num;
		}

		// Salto de linea y mensaje de lo que vamos a imprimir.
		System.out.println();
		System.out.println("Nuestra tabla a la inversa es: ");

		// Creamos otro for para leer la tabla de orden inverso vamos a recorrerla desde
		// la ultima posición hasta la primera.
		for (int i = tablaNum.length - 1; i >= 0; i--) {
			// Imprimimos cada posicón de la tabla pero desde el final hasta el principo (a
			// la inversa).
			System.out.print(tablaNum[i] + " ");
		}

		// Cierre de Scanner
		sc.close();
	}

}
