package boletinpart2;

import java.util.Arrays;
import java.util.Random;

/**
 * Este programa crea dos tablas 1 con una combinación de 6 números generados
 * aleatoriamente y la otra con otra combinación de 6 números declarados a la
 * hora de crear la tabla. El programa devolvera el número de aciertos.
 */
public class Ejercicio6 {

	public static void main(String[] args) {

		// Creamos el array tablaPremio como int de tamaño 6 para almacenar la
		// combinación de números ganadores.
		int tablaPremio[] = { 4, 12, 19, 26, 32, 43 };

		// Creamos el array tablaIntento como int de tamaño 6 para almacenar la
		// combinación de números aleatorios entre 1 y 49.
		int tablaIntento[] = new int[6];

		// Creamos la variable cont como int para contabilizar el número de aciertos del
		// boleto aleatorio.
		int cont = 0;

		// Creamos la clase Random para generar números aleatorios para la TablaIntento.
		Random rand = new Random();

		// Ordenamos la tablaPremio de forma ascendente con la clase Arrays y usamos el
		// sort.
		Arrays.sort(tablaIntento);

		// Creamos este for para recorrer la tablaIntento y rellenarla con números
		// aleatorios entre 1 y 49.
		for (int i = 0; i < tablaIntento.length; i++) {
			tablaIntento[i] = rand.nextInt(1, 50);
			// Comprobamos si cada número de la tablaIntento se encuentra en la tablaPremio,
			// si es así nos devuelve la posición que siempre sera mayor o igual a 0 y el
			// contador +1, si no prueba con otro número.
			if (Arrays.binarySearch(tablaPremio, tablaIntento[i]) >= 0) {
				cont++;
			}
		}

		// Mostramos la combinación de números ganadora y el boleto con números
		// aleatorios.
		System.out.println("Boleto premiado -->  " + Arrays.toString(tablaPremio));
		System.out.println("Boleto aleatorio --> " + Arrays.toString(tablaIntento));

		System.out.println("Numero de aciertos: " + cont);

	}

}
