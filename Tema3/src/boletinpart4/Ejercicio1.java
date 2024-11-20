package boletinpart4;

import java.util.Random;

/**
 * Este programa crea un array de enteros aleatorios hasta 10 y devuelve la suma
 * de todos los valores.
 */
public class Ejercicio1 {

	public static void main(String[] args) {

		// Creamos el array tablaRandom y la rellenamos con números aleatorios tendra un
		// recorrido de 10 dimensiones.
		int tablaRandom[] = new int[10];

		// Creamos la variable suma como int para almacenar la suma total devuelta por
		// la función sumaValoresTabla.
		int suma;

		// Creamos la clase Random para generar números aleatorios y almacenarlos en la
		// tabla.
		Random rand = new Random();

		// Creamos este for para recorrer la tabla y rellenarla con números aleatorios
		// entre 1 y 10.
		for (int i = 0; i < tablaRandom.length; i++) {
			tablaRandom[i] = rand.nextInt(1, 11);
		}

		// Asignamos a la variable suma la suma total devuelta por la función
		// sumaValoresTabla.
		suma = sumaValoresTabla(tablaRandom);

		// Imprimimos la variable suma para mostrar la suma total devuelta por la
		// función sumaValoresTabla.
		System.out.println("La suma de los valores de nuestra tabla es --> " + suma);

	}

	/**
	 * Creamos esta función para sumar todos los valores aleatorios de nuestra
	 * tabla.
	 * 
	 * @param tablaAleatorios nuestra tabla con los valores aleatorios almacenados.
	 * @return suma La suma del total de valores aleatorios.
	 */
	public static int sumaValoresTabla(int tablaAleatorios[]) {

		// Creamos la variable suma como int para almacenar la suma de todos los valores
		// aleatorios.
		int suma = 0;

		// Creamos un for-each para recorrer cada valor de la tabla.
		for (int valor : tablaAleatorios) {
			suma += valor;
		}

		// Devolvemos suma que es donde esta almacenada la suma de todos los valores.
		return suma;
	}

}
