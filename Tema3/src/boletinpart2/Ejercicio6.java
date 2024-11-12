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

		// Creamos la clase Random para generar números aleatorios para la TablaIntento.
		Random rand = new Random();

		// Creamos la variable contAciertos como int para contabilizar el número de
		// aciertos del boleto aleatorio.
		int contAciertos = 0;

		// Creamos la variable valorAleatorio como int para almacenar el valor que nos
		// va generando el random
		int valorAleatorio;

		// Creamos la varible posBuscada como int para almacenar la posición de un
		// número si es que se encuentra en nuestra tablaIntento.
		int posBusqueda;

		// Creamos la variable cont como int para contabilizar los números aleatorios no
		// repetidos se guardan en nuestra tabla.
		int cont = 0;

		// Comprobamos que el contador siempre sea 6 para que siempre se generen 6
		// números aleatorios que no se repitan.
		while (cont < 6) {
			// A nuestra variable valorAleatorio le asignamos un número aleatorio entre 1 y
			// 49 incluidos.
			valorAleatorio = rand.nextInt(1, 50);
			// Ordenamos la tabla.
			Arrays.sort(tablaIntento);
			// En la variable posBusqueda almacenamos la posición donde se encuentra el
			// número en nuestra tabla de random si es que se encuentra.
			posBusqueda = Arrays.binarySearch(tablaIntento, valorAleatorio);
			// Comprobamos si la posición es negativa, si es así es que no se ha encontrado
			// por lo tanto a la primera posición de la tabla le asignamos el valor
			// aleatorio y el contador lo ponemos a +1.
			if (posBusqueda < 0) {
				tablaIntento[0] = valorAleatorio;
				cont++;
			}
		}

		// COn este for recorremos la tabla con todos los random y vamos comprobando 1 a
		// 1 si se encuentra en la tabla premiada. Si es así devuelve una posición
		// positiva entra en el if y el contador de aciertos lo pone a +1.
		for (int valor : tablaIntento) {
			posBusqueda = Arrays.binarySearch(tablaPremio, valor);
			if (posBusqueda >= 0) {
				contAciertos++;
			}
		}

		// Mostramos la combinación de números ganadora y el boleto con números
		// aleatorios.
		System.out.println("Boleto premiado -->  " + Arrays.toString(tablaPremio));
		System.out.println("Boleto aleatorio --> " + Arrays.toString(tablaIntento));

		System.out.println("Numero de aciertos: " + contAciertos);

	}

}
