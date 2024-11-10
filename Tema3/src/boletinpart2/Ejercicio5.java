package boletinpart2;

import java.util.Random;
import java.util.Scanner;

/**
 * Este programa crea una tabla de tamaño 1000 relleno de números aleatorios
 * entre 0 y 99. El usuario introduce un número y el programa devuelve si existe
 * y si es así cuantas veces.
 */
public class Ejercicio5 {

	public static void main(String[] args) {

		// Creamos un array tablaAleatorios como int para almacenar números aleatorios
		// entre 0 y 99.
		int tablaAleatorios[] = new int[1000];

		// Creamos la variable valorUsuario como int para almacenar el número
		// introducido por
		// el usuario, ese que debemos de buscar en la tabla y saber cuantas veces se
		// repite.
		int valorUsuario;

		// Creamos la variable cont como int para almacenar cuantas veces se repite el
		// número en la tabla.
		int cont = 0;

		// Creamos el Scanner para leer la el valor introducido por el usuario.
		Scanner sc = new Scanner(System.in);

		// Creamos la clase random para generar numeros aleatorios entre 0 y 99.
		Random rand = new Random();

		// Creamos este for para recorrer el array y rellenarlo con números aleatorios
		// entre 0 y 99.
		for (int i = 0; i < tablaAleatorios.length; i++) {
			tablaAleatorios[i] = rand.nextInt(0, 100);
		}

		// Le pedimos al usuario que introduzca un valor entre 0 y 99 y lo leemos.
		System.out.println("Introduce el valor que deseas buscar --> ");
		valorUsuario = sc.nextInt();

		// Creamos un for-each para leer todos los valores de la tabla y comprobar
		// cuantas veces se repite el introducido por el usuario.
		for (int valorTabla : tablaAleatorios) {

			// Vamos comprobando todos los valores de la tabla con el introducido por el
			// usuario, si es igual vamos incrementando el contador a +1.
			if (valorTabla == valorUsuario) {
				cont++;
			}
		}

		// Aqui comprobamos si el contador es distinto a 0 si es así es que el múmero
		// existe y mostramos cuantas veces se repite.
		if (cont != 0) {
			System.out.println("El número " + valorUsuario + " aparece " + cont + " veces");
			
			//Si es igual a 0 significa que el número no existe.
		} else if (cont == 0) {
			System.out.println("El valor introducido no se encuentra en la tabla");
		}

		// Cierre de Scanner
		sc.close();
	}

}
