package boletinpart1;

import java.util.Scanner;

/**
 * Este programa solicita una temperatura media de cada mes y nos muestra
 * mediante asteriscos la tamperatura de cada mes como si fuera un grafico de
 * barras.
 */
public class Ejercicio7 {

	public static void main(String[] args) {
		// Creamos el array tablaTemp como int de 12 posiciones para almacenar la
		// temperatura media de cada mes.
		int tablaTemp[] = new int[12];

		// Creamos la variable temp como int para alamcenar temporalmente la temperatura
		// introducida por el usuario.
		int temp;

		// Creamos el Scanner para leer la temperatura introducida por el usuario.
		Scanner sc = new Scanner(System.in);

		// Con este for vamos rellenando la tabla con las temperaturas introducidas por
		// el usuario. Recorremos posición por posición.
		for (int i = 0; i < tablaTemp.length; i++) {
			// Le pedimos al usuario que introduzca la temperatura del primer mes.
			System.out.print("Introduce una temperatura --> ");
			temp = sc.nextInt();
			// Asignamos a cada posición de la tabla la temperatura que vayamos
			// introduciendo.
			tablaTemp[i] = temp;
		}

		// Salto de linea
		System.out.println();
		// Mostramos un mensaje diciendo lo que vamos a mostrar a continuación.
		System.out.println("Grafico de barras temperatura media de cada mes --> ");

		// Creamos este for para leer todos los valores de la tabla.
		for (int i = 0; i < tablaTemp.length; i++) {
			// Con este switch comprobamos en que posición estamos de la tabla y dependiendo
			// de la posición en la que nos escontremos sera un mes u otro. Y lo imprimimos
			// por consola.
			switch (i) {
			case 0 -> System.out.print("Enero:      | ");
			case 1 -> System.out.print("Febrero:    | ");
			case 2 -> System.out.print("Marzo:      | ");
			case 3 -> System.out.print("Abril:      | ");
			case 4 -> System.out.print("Mayo:       | ");
			case 5 -> System.out.print("Junio:      | ");
			case 6 -> System.out.print("Julio:      | ");
			case 7 -> System.out.print("Agosto:     | ");
			case 8 -> System.out.print("Septiembre: | ");
			case 9 -> System.out.print("Octubre:    | ");
			case 10 -> System.out.print("Noviembre:  | ");
			case 11 -> System.out.print("Diciembre:  | ");
			}

			// Con este for recorremos desde uno hasta el valor de la posición en la que nos
			// encontremos en la iteración e imprime tantos asteriscos como valor de dicha
			// posición.
			for (int j = 1; j <= tablaTemp[i]; j++) {
				System.out.print("* ");
			}

			// Salto de linea entre linea y linea.
			System.out.println();
		}

		// Cierre de Scanner
		sc.close();
	}

}
