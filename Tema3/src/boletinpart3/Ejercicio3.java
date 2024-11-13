package boletinpart3;

import java.util.Scanner;

/**
 * Este programa pide las dimensiones de la tabla por teclado y crea la tabla.
 * Ahora rellena la tabla de la sigueinte forma, cada posición contrendra el
 * valor 10 * i + j.
 */
public class Ejercicio3 {

	public static void main(String[] args) {

		// Declaramos el array tablaSecuencia como int para almacenar una secuencia de
		// valores.
		int tablaSecuencia[][];

		// Creamos la variable fila como int para almacenar el número de filas de
		// nuestra tabla.
		int fila;

		// Creamos la variable columna como int para almacenar el número de columnas de
		// nuestra tabla.
		int columna;

		// Creamos el Scanner para leer la fila y la columna por teclado.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca el valor de la fila y la leemos.
		System.out.print("Introduce el valor de la fila --> ");
		fila = sc.nextInt();

		// Le pedimos al usuario que introduzca el valor de la columna y la leemos.
		System.out.print("Introduce el valor de la columna --> ");
		columna = sc.nextInt();

		// Creamos la tabla con las dimensiones introducidas por el usuario.
		tablaSecuencia = new int[fila][columna];

		// Creamos este for para recorrer las filas de nuestra tabla
		for (int i = 0; i < tablaSecuencia.length; i++) {
			// Creamos este for para recorrer las posciones de cada fila (columanas).
			for (int j = 0; j < tablaSecuencia[0].length; j++) {
				tablaSecuencia[i][j] = 10*i+j;
				System.out.print(tablaSecuencia[i][j] + "\t");
			}
			// Salto de linea
			System.out.println();
		}
		
		//Cierre de Scanner
		sc.close();

	}

}
