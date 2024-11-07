package boletinpart1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Este programa crea un array de 100 posiciones y lo rellena con números
 * aleatorios entre 1 y 100. El usuario debe de introducir un número y el
 * programa debe mostrar en que posiciones se encuentra ese número.
 */
public class Ejercicio8 {

	public static void main(String[] args) {

		// Creamos el array tablaAleatorios como int con un tamaño de 100 posiciones
		// para almacenar valores entre 1 y 10 números.
		int tablaAleatorios[] = new int[100];

		// Creamos la variable num como int para almacenar el valor introducido por el
		// usurio, que sera el que debemos de encontrar en la tabla y mostrar sus
		// posiciones.
		int num = 0;

		// Creamos la variable solucion como String para almacenar las posiciones y
		// mostrarlas al uusario.
		String solucion = "";

		// Creamos la variable continuar como boolean para controlar si el valor
		// introducido no es valido y se debe de volver a preguntar al usuario.
		boolean continuar = false;

		// Creamos el Scanner para leer el número introducido por el usuario.
		Scanner sc = new Scanner(System.in);

		// Creamos la clase Random para generar los números aleatorios para la tabla.
		Random rand = new Random();

		// Creamos este for para recorrer la tabla e ir añadiendo números aleatorios a
		// cada una de su posición.
		for (int i = 0; i < tablaAleatorios.length; i++) {
			tablaAleatorios[i] = rand.nextInt(1, 11);
		}

		// Creamos este do-while para controlar cuando tenemos que volver a preguntar al
		// usuario y cuando no.
		do {
			// Creamos el bucle try-catch para controlar las excepciones.
			try {
				// Le pedimos al usuario que introduzca el número del que desea saber cada una
				// de sus posiciones en la tabla y lo leemos.
				System.out.print("Introduce el número que deseas encontrar --> ");
				num = sc.nextInt();
				// En el assert comprobamos que el valor este correcto si no es así se lanza una
				// excepcion y se vuelve a preguntar al usuario.
				assert (num >= 1 && num <= 10) : "El número introducido es erroneo.";
				// Ponemos el continuar a false para que se salgo, esto ocurre si el assert es
				// correcto.
				continuar = false;

				// Controlamos si se introduce un valor número fuera de nuestro rango deseeado.
			} catch (AssertionError e) {
				System.out.println(e.getMessage());
				continuar = true;
				// Controlamos si se introduce un valor como una cadena.
			} catch (InputMismatchException e) {
				System.out.println("El valor introducido no es valido.");
				continuar = true;
				// Limpiamos el buffer.
			} finally {
				sc.nextLine();
			}
			// Comprobamos si nuestra variable continuar esta a true o false para volver a
			// preguntar al usuario o no.
		} while (continuar);

		// Creamos un for normal para recorrer la tabla y ver que números son iguales
		// que el introducido por el usuario y en que posición se encuentran.
		for (int i = 0; i < tablaAleatorios.length; i++) {
			if (tablaAleatorios[i] == num) {
				solucion += i + ", ";
			}
		}

		// Salto de linea.
		System.out.println();

		// Imprimimos la solución por consola.
		System.out.println("Las posiciones de " + num + " son: " + solucion);

		// Cierre de Scanner
		sc.close();

	}

}
