package boletinpart3;

import java.util.Scanner;

/***
 * Este programa crea un array bidimensional para almacenar las notas de 5
 * asignaturas de cada alumno. El usuario introducirá las notas por teclado y
 * por ultimo se muestra la tabla y la nota minima, maxima y media de cada
 * alumno.
 */
public class Ejercicio2 {

	public static void main(String[] args) {

		// Creamos el array bidimensional notasAlumnos como int con 4 filas y 5 columnas
		// para alamcenar cada nota de cada asignatura del alumno.
		double notasAlumnos[][] = new double[4][5];

		// Creamos la variable nota como int para almacenar la nota que irá
		// introduciendo el usuario de cada alumno.
		double nota;

		// Creamos la variable notaMedia como int para almacenar la nota media de cada
		// alumno.
		double notaMedia;

		// Creamos la variable sumaNotaAlum como int para almacenar la suma de todas las
		// notas de cada alumno.
		double sumaNotaAlum;

		// Creamos la variable max para almacenar la nota mas alta de cada alumno.
		double max;

		// Creamos la variable min para almacenar la nota mas baja de cada alumno.
		double min;

		// Creamos el Scanner para leer las notas de cada alumno que irá introduciendo
		// el usuario.
		Scanner sc = new Scanner(System.in);

		// Creamos este for para recorrer las filas que serian cada alumno.
		for (int i = 0; i < notasAlumnos.length; i++) {
			// Creamos este for para recorrer las columnas que serian cada posición en la
			// que se almacenaría las notas que introduciremos a continuación.
			for (int j = 0; j < notasAlumnos[0].length; j++) {
				// Le pedimos al usuario que vaya introduciendo la nota de cada alumno y la
				// leemos.
				System.out.println("Introduce la nota " + (j + 1) + " del alumno " + (i + 1) + " --> ");
				nota = sc.nextDouble();

				// Asignamos a la posición en la que nos encontremos la nota introducida
				// anteriormente.
				notasAlumnos[i][j] = nota;
			}
		}

		// Mostramos un mensaje de que vamos a mostrar la tabla completa.
		System.out.println();
		System.out.println("Tabla completa --> ");
		// Creamos un for-each para recorrer cada valor de la tabla y mostrarla de forma
		// bonita.
		for (double[] fila : notasAlumnos) {
			for (double valor : fila) {
				System.out.print(valor + " ");
			}
			System.out.println();
		}

		// Salto de linea.
		System.out.println();

		// Creamos este for para recorrer las filas de nuestra tabla.
		for (int i = 0; i < notasAlumnos.length; i++) {
			// Al principio de cada iteración debemos de asignar la sumaNotaAlum a 0 porque
			// en cada vuelta es un nuevo alumno.
			sumaNotaAlum = 0;
			// También asignamos en cada vuelta el valor del max al valor mas pequeño para
			// volver a hacer la comprobación con cada alumno.
			max = Integer.MIN_VALUE;
			// También asignamos en cada vuelta el valor del min al valor mas grande para
			// volver a hacer la comprobación con cada alumno.
			min = Integer.MAX_VALUE;

			// Con este for recorremos las columanas (cada nota del alumno).
			for (int j = 0; j < notasAlumnos[0].length; j++) {

				// Almacenamos la suma de cada nota del mismo alumno.
				sumaNotaAlum += notasAlumnos[i][j];

				// Comprobamos si el valor introducido es mayor que el max, si es así se
				// almacena ese valor en max.
				if (notasAlumnos[i][j] > max) {
					max = notasAlumnos[i][j];
				}

				// Comprobamos si el valor introducido es menor que el min, si es así se
				// almacena ese valor en min.
				if (notasAlumnos[i][j] < min) {
					min = notasAlumnos[i][j];

				}
			}

			// Imprimimos la nota media, la máxima y la mínima del alumno correspondiente.
			System.out.println("Alumno " + (i + 1) + " --> ");
			notaMedia = sumaNotaAlum / 5;
			System.out.println("Nota media --> " + notaMedia);
			System.out.println("Nota máxima --> " + max);
			System.out.println("Nota mínima --> " + min);
			System.out.println();

		}

		// Cierre de Scanner
		sc.close();
	}

}
