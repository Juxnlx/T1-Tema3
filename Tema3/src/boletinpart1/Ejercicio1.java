package boletinpart1;

import java.util.Random;

/**
 * Este programa nos rellena una tabla de longitud 10 con números aleatorios del
 * 1 al 100.
 */
public class Ejercicio1 {

	public static void main(String[] args) {

		// Creamos la tabla de tablaAleatorios con 10 dimensiones.
		int tablaAleatorios[] = new int[10];

		// Creamos el Random para generar números aleatorios y almacenarlos en nuestra
		// tabla.
		Random rand = new Random();

		// Creamos un for para introducir los datos aleatoros en nuestra tabla de 10
		// dimensiones.
		for (int i = 0; i < tablaAleatorios.length; i++) {
			
			// Vamos recorriendo cada hueco de nuestra tabla y lo vamos rellenando con
			// números aleatorios.
			tablaAleatorios[i] = rand.nextInt(1, 101);
		}

		// Creamos un for-each para recorrer la tabla y mostrarla.
		for (int valorAleatorio : tablaAleatorios) {
			System.out.print(valorAleatorio + " ");
		}
	}

}
