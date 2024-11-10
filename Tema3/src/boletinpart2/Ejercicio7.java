package boletinpart2;

import java.util.Arrays;

/**
 * Este programa crea una tabla para almacenar esta secuencia de números 1, 2,
 * 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. Hasta llegar a 10 y luego la imprime
 * por consola.
 */
public class Ejercicio7 {

	public static void main(String[] args) {

		// Creamos el Array tablaSecuencia como int de tamaño 55 para almacenar esa
		// secuencia de números hasta llegar al 10 diez veces.
		int tablaSecuencia[] = new int[55];

		// Creamos la variable inicio para indicar en el .fill cuando comenzar,
		// comenzamos en 0.
		int inicio = 0;

		// Creamos la variable fin para indicar hasta donde debemos de llegar con cada
		// número. En el primer caso en 1.
		int fin = 1;

		// Con este for recorremos desde el número 1 hasta el 10 que son los que hay que
		// rellenar en la tabla. Por lo tanto son 10 iteraciones.
		for (int i = 1; i <= 10; i++) {
			// Rellenamos la tablaSecuencia desde el indice inicio hasta fin y el valor que
			// incrementamos en cada iteración es i, que en la primera vuelta sera 1 luego
			// 2, etc.
			Arrays.fill(tablaSecuencia, inicio, fin, i);
			// En cada iteración el incio pasará a ser el fin y el fin sera la cantidad
			// donde estaba mas i y mas 1 es hay hasta donde debe de llegar y el +1 es
			// porque el final nunca se incluye y es necesario.
			inicio = fin;
			fin += i + 1;
		}

		//Mensaje explicatorio y salto de linea.
		System.out.println("Tabla con la secuencia 1, 2, 2, 3, 3, 3, etc -->");
		System.out.println();
		// Por ultimo imprimimos la tabla con la secuencia deseada.
		System.out.println(Arrays.toString(tablaSecuencia));

	}

}
