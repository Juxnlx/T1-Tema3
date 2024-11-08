package boletinpart2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Este programa solicita al usuario 20 valores, 10 en un array y el resto en
 * otro y luego nos muestra si son iguales o no.
 */
public class Ejercicio2 {

	public static void main(String[] args) {

		// Creamos el array tablaMenor10 como int de tamaño 10 para almacenar los
		// primeros 10 números.
		int tablaMenor10[] = new int[10];

		// Creamos el array tablaMayor10 como int de tamaño 10 para almacenar los
		// ultimos 10 números.
		int tablaMayor10[] = new int[10];

		// Creamos la variable valor como int para almacenar de forma momentanea el
		// valor introducido por el usuario.
		int valor;

		// Creamos el Scanner para leer los 20 números introducidos por el usuario.
		Scanner sc = new Scanner(System.in);

		// Con este for recorremos la primera tabla y la rellenamos con el valor que le
		// vamos pidiendo al usuario.
		for (int i = 0; i < tablaMenor10.length; i++) {
			// Le pedimos al usuario que introduzca un número y lo leemos.
			System.out.println("Introduce un valor --> ");
			valor = sc.nextInt();
			tablaMenor10[i] = valor;
		}

		// Con este for recorremos la segunda tabla y la rellenamos con el valor que le
		// vamos pidiendo al usuario.
		for (int i = 0; i < tablaMayor10.length; i++) {
			// Le pedimos al usuario que introduzca un número y lo leemos.
			System.out.println("Introduce un valor --> ");
			valor = sc.nextInt();
			tablaMayor10[i] = valor;
		}

		// Salto de linea y mensaje explicatorio de lo que se va a mostrar.
		System.out.println();
		System.out.println("¿Seran iguales nuestra tablas?");

		// Comprobamos mediante un if y la clase arrays.equal si las dos tablas son
		// iguales, si es así mostramso que son iguales. Si no mostramos que no son
		// iguales.
		if (Arrays.equals(tablaMenor10, tablaMayor10)) {
			System.out.println("Las tablas son IGUALES");
		} else {
			System.out.println("Las tablas NO SON IGUALES");
		}

		// Cierre de Scanner
		sc.close();

	}

}
