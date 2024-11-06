package boletinpart1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Este programa solicita al usuario 5 números decimales y los ordena en una
 * tabla de la misma forma que son introducidos.
 */
public class Ejercicio2 {

	public static void main(String[] args) {

		// Creamos la tabla tablaNum como float con 5 dimensiones, para almacener unos
		// números introducidos por el usuario.
		float tablaNum[] = new float[5];

		// Creamos la variable num como float para almacenar de forma momentanea un
		// número introducido por el usuario.
		float num;

		// Creamos el Scanner para leer los número introducidos por el usuario.
		Scanner sc = new Scanner(System.in);

		// Creamos un for para recorrer la tabla e ir pidiendo números e introducirlos
		// al mismo tiempo.
		for (int i = 0; i < tablaNum.length; i++) {
			// Le preguntamos al usuario que introduzca un número y lo leemos.
			System.out.print("Introduce un número --> ");
			num = sc.nextFloat();

			// Vamos almacenando en cada posición de nuestra tabla los números que vamos
			// introduciendo.
			tablaNum[i] = num;
		}
		
		//Imprimimos nuestra tabla de 5 dimensiones.
		System.out.println();
		System.out.println(Arrays.toString(tablaNum));
		
		//Cierre de Scanner
		sc.close();
	}

}
