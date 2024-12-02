package aceptaelreto;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {

	// Creamos el Scanner a nivel de clase para leer el código y la cantidad
	// introducida por el usurio.
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Creamos un array simple con todos los códigos correspondientes.
		String codigo[] = { "A", "C", "D", "I", "M" };

		// Creamos un array simple para clasificar las categorias correspondientes a los
		// códigos.
		String categoria[] = { "Comidas", "Copas", "Desayunos", "Cenas", "Meriendas" };

		// Creamos la variable cod como String para almacenar el codigo introducido
		// por el usuario.
		String cod = "";
		// Creamos la variable cant como float para almacenar la cantidad introducida
		// por el usuario de cada categoría.
		float cant = 1;

		int contadorMax = 0;
		int contadorMin = 0;

		// Creamos la variable cantMax como float para almacenar la cantidad maxima
		// introducida por el usuario.
		float cantMax = Float.MIN_VALUE;
		// Creamos la variable cantMin como float para almacenar la cantidad minima
		// introducida por el usuario.
		float cantMin = Float.MAX_VALUE;
		// Creamos la variable catMax como String para almacenar la categoria maxima de
		// las introducidas.
		String catgMax = "";
		// Creamos la variable catgMin como String para almacenar la categoria minima de
		// las introducidas.
		String catgMin = "";

		// Creamos la variable media para almacenar en un principio la suma de todas las
		// cantidades introducidas por el usuario y leugo la media.
		float media = 0;
		// Creamos la variable cont para contabilizar las veces que el usuario introduce
		// una cantidad y un precio
		int cont = -1;

		float comida = 0;

		while (!cod.equals("N") && cant != 0) {

			cod = validarCod();
			cant = validaCant();

			// Comprobamos cual cantidad

			if (cantMax <= cant) {
				cantMax = cant;
				catgMax = cod;
				contadorMax = 0;
			} else if (cant == cantMax) {
				contadorMax++; // Incrementar contador si hay empate
			}

			if (cantMin >= cant && (!cod.equals("N") && cant != 0)) {
				cantMin = cant;
				catgMin = cod;
				contadorMin = 0;
			} else if (cant == cantMin) {
				contadorMin++; // Incrementar contador si hay empate
			}

			if (cod.equals("A")) {
				comida += cant;
			}

			media += cant;
			cont++;
		}

		if (cont > 0) {
			media /= cont;
		} else {
			media = 0;
		}

		Arrays.sort(codigo);

		System.out.print(
				(contadorMax > 0) ? "EMPATE" : (categoria[Arrays.binarySearch(codigo, catgMax)].toUpperCase()) + "#");
		System.out.print(
				(contadorMin > 0) ? "EMPATE" : (categoria[Arrays.binarySearch(codigo, catgMin)].toUpperCase()) + "#");
		System.out.println((comida > media) ? "SI" : "NO");

	}

	public static String validarCod() {

		String codigo = "";

		boolean continuar;

		do {
			try {
				System.out.print("Introduce el código correspondiente D, A, M, I, C, N --> ");
				codigo = sc.nextLine().toUpperCase();
				assert codigo.equals("D") || codigo.equals("A") || codigo.equals("M") || codigo.equals("I")
						|| codigo.equals("C") || codigo.equals("N") : "La cadena introducida es incorrecta";
				continuar = false;
			} catch (AssertionError e) {
				System.out.println(e.getMessage());
				continuar = true;
			}
		} while (continuar);

		return codigo;
	}

	public static float validaCant() {

		float cantidad = 0;

		boolean continuar;

		do {
			try {
				System.out.print("Introduce la cantidad correspondiente --> ");
				cantidad = sc.nextFloat();
				assert cantidad >= 0 : "La cantidad introducida es negativa";
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

		return cantidad;
	}

}
