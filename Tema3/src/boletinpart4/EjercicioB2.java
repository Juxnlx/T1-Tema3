package boletinpart4;

import java.util.Random;

/**
 * Este programa pasa como parametro una tabla bidimensional y crea una función
 * para devolver en otro array distinto su transposición.
 */
public class EjercicioB2 {

	public static void main(String[] args) {
		// Creamos el array tablaRadom como int de longitud 4x4 para almacenar varios
		// números aleatorios.
		int tablaRandom[][] = new int[4][4];

		// Creamos la clase Radom para generar números aleatorios entre 1 y 99 ambos
		// incluidos en nuestra tabla de random.
		Random rand = new Random();

		// Rellenamos e imprimos la tablaRandom con todos sus valores aleatorios.
		System.out.println("Tabla generada aleatoriamente:");
		// Creamos este for para recorrer cada fila de nuestro array.
		for (int i = 0; i < tablaRandom.length; i++) {
			// Creamos este for para recorrer cada columna de nuestra array.
			for (int j = 0; j < tablaRandom[i].length; j++) {
				// La vamos rellenando con valores entre 1 y 99 aleatoriamente.
				tablaRandom[i][j] = rand.nextInt(1, 100);
				System.out.print(tablaRandom[i][j] + "\t");
			}
			// Salto de linea despues de cada linea.
			System.out.println();
		}

		// Salto de linea
		System.out.println();

		// Mostramos la tabla devuelta por la función transposicionTabla con los valores
		// de nuestra tablaRandom pero transposicionados.
		System.out.println("Tabla transposicionada:");
		// Creamos este for para recorrer cada fila de nuestro array.
		for (int i = 0; i < transposicionTabla(tablaRandom).length; i++) {
			// Creamos este for para recorrer cada columna de nuestra array.
			for (int j = 0; j < transposicionTabla(tablaRandom)[i].length; j++) {
				System.out.print(transposicionTabla(tablaRandom)[i][j] + "\t");
			}
			// Salto de linea despues de cada linea.
			System.out.println();
		}

	}

	public static int[][] transposicionTabla(int[][] t) {
		// Creamos el array tablaTrans como int de longitud 4x4 para almacenar los
		// valores transposicionados.
		int tablaTrans[][] = new int[4][4];

		// Creamos este for para recorrer cada fila de nuestro array.
		for (int i = 0; i < tablaTrans.length; i++) {
			// Creamos este for para recorrer cada columna de nuestra array.
			for (int j = 0; j < tablaTrans[i].length; j++) {
				// La vamos rellenando con los valores de la tabla t pero leyendola de forma
				// contraria las columnas pasan a ser las filas y las filas las columnas.
				tablaTrans[i][j] = t[j][i];
			}
		}

		// Devolvemos la tablaTrans con los valores tansposicionados.
		return tablaTrans;
	}

}
