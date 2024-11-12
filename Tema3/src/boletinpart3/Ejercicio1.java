package boletinpart3;

/**
 * Este programa crea un array num de 3 filas y 6 columanas. Le debemos de
 * asignar unos números a distintas posiciones y luego imprimir el array por
 * consola.
 */
public class Ejercicio1 {

	public static void main(String[] args) {

		// Creamos una array bidimensional num con 3 filas y 6 columanas para almacenar
		// ciertos valores,-.
		int num[][] = new int[3][6];

		// Vamos a asignar los distintos números a las posiciones indicadas en el
		// ejercicio.
		num[0][1] = 30;
		num[0][2] = 2;
		num[0][5] = 5;
		num[1][0] = 75;
		num[2][2] = -2;
		num[2][3] = 9;
		num[2][5] = 11;

		// Creamos un for para recorrer el número de filas.
		for (int i = 0; i < num.length; i++) {
			// Con este for recorremos las columanas que tiene cada una de neustras filas.
			for (int j = 0; j < num[0].length; j++) {
				// Imrimimos el valor de cada posición de nuestra tabla mas un espacio linea a
				// linea.
				System.out.print(num[i][j] + " ");
			}
			// Salto de linea porque cada iteración es una linea.
			System.out.println();
		}
	}

}
