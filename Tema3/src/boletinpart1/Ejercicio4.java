package boletinpart1;

import java.util.Arrays;

/**
 * Este programa crea una tabla de 12 dimensiones y asignamos ciertos valores a
 * esa tabla ya creda.
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		// Creamos la tabla num como int con 12 dimensiones para almacenar dichos
		// valores.
		int num[] = new int[12];

		// Vamos asignando a algunas posiciones unos valores concretos.
		num[0] = 39;
		num[1] = -2;
		num[4] = 0;
		num[6] = 14;
		num[8] = 5;
		num[9] = 120;

		// Imprimos la tabla que hemos creado.
		System.out.println(Arrays.toString(num));

	}

}
