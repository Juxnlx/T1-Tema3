package boletinpart2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Este programa solicita al usuario 8 puntuaciones distintas cada una de un
 * jugador diferente. Y las debe mostrar en una tabla de forma decreciente.
 */
public class Ejercicio4 {

	public static void main(String[] args) {

		// Creamos el array tablaPuntuaciones como int de tamaño 8 para almacenar la
		// puntuación de cada jugador, que son 8 en total.
		int tablaPuntuaciones[] = new int[8];

		// Creamos la variable puntuación como int para almacenar el valor introducido
		// por el usuario.
		int puntuacion;

		// Creamos la variable continuar como boolean para indicar mediante true o false
		// si la puntuación introducidda por el usuario es correcta o no.
		boolean continuar = false;

		// Creamos el Scanner para leer las puntuaciones introducidas por el usuario.
		Scanner sc = new Scanner(System.in);

		// Creamos el for para rellenar la tabla con las puntuaciones de cada jugador
		// introducidas por el usuario.
		for (int i = 0; i < tablaPuntuaciones.length; i++) {

			// Mediante el do-while y el try-catch comprobamos que el valor introducido sea
			// correcto o no. Si el valor no es correcto se vuelve a preguntar, si no se
			// almacena en la tabla.
			do {
				try {
					// Le pedimos al usuario que introduzca la puntuación de cada juagdor y la
					// leemos.
					System.out.print("Intruduce la puntuación del jugador " + (i + 1) + " --> ");
					puntuacion = sc.nextInt();
					assert (puntuacion >= 1000 && puntuacion <= 2800) : "La puntuación introducida es incorrecta";
					tablaPuntuaciones[i] = puntuacion;
					continuar = false;
				} catch (AssertionError e) {
					System.out.println(e.getMessage());
					continuar = true;
				} catch (InputMismatchException e) {
					System.out.println("El valor introducido es incorrecto");
					continuar = true;
				} finally {
					sc.nextLine();
				}
			} while (continuar);

		}

		// Ordenamos la tabla de forma creciente con nuestra clase Arrays utilizamos el
		// sort.
		Arrays.sort(tablaPuntuaciones);

		// Salto de linea y mostramos un mensaje indicando lo que vamos mostrar.
		System.out.println();
		System.out.print("Puntuaciones de los jugadores --> ");

		// Creamos este for para para leer la tabla de forma decreciente.
		for (int i = tablaPuntuaciones.length - 1; i >= 0; i--) {
			System.out.print(tablaPuntuaciones[i] + ", ");
		}

		// Cierre de Scanner
		sc.close();
	}

}
