package boletinpart3;

/**
 * Este programa crea una tabla bidimensonal de tamaño diez e imprime las tablas
 * de multiplicar del 1 al 10.
 */
public class Ejercicio4 {

	public static void main(String[] args) {

		// Creamos el array tablaMult como int para almacenar las tablas de multiplicar
		// en nuestra de tabla con 10 filas y 10 columnas.
		int tablaMult[][] = new int[10][10];

		// Creamos este for para recorrer las filas de nuestra tabla
		for (int i = 0; i < tablaMult.length; i++) {
			// Creamos este for para recorrer las posciones de cada fila (columanas).
			for (int j = 0; j < tablaMult[0].length; j++) {
				// Asignamos a cada posición de la tabla la correspondiente multiplicación entre
				// la posición +1 de la fila y columna.
				tablaMult[i][j] = (i + 1) * (j + 1);
				// Imprimimos la posición mas un espacio entre valor y valor.
				System.out.print(tablaMult[i][j] + "\t");
			}
			// Salto de linea
			System.out.println();
		}

	}

}
