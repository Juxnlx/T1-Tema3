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

		// Declaramos el array tablaTrans como int para almacenar la tabla devuelta por
		// la función transposicionTabla.
		int tablaTrans[][];

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

		// Imprimimos un salto de linea y un mensaje mostrando lo que vamos a imprimir.
		System.out.println();
		System.out.println("Tabla transposicionada:");
		
		//Asignamos a la variable tablaTrans la tabla devuelta por la función transposicionTabla.
		tablaTrans = transposicionTabla(tablaRandom);
		
		// Creamos este for para recorrer cada fila del array tablaTrans.
		for (int x[] : tablaTrans) {
			for (int y : x) {
				System.out.print(y + "\t");
			}
			System.out.println();
		}

	}

	/**
	 * Esta función se encarga de devolver una tabla que seria la transposición de
	 * la tabla pasada como parametro.
	 * 
	 * @param t Tabla rellena con valores generados aleatoriamente.
	 * @return Devolvemos tablaTrans con los valores tansposicionados.
	 */
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
