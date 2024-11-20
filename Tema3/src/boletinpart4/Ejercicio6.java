package boletinpart4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Este programa devuelve una tabla con las sumas de los valores de otra tabla.
 * Esta suma se realizara empezando desde la primera posición y sumando tantos
 * números como indique el usuario.
 */
public class Ejercicio6 {

	public static void main(String[] args) {

		// Declaramos el array tablaRadom como int para almacenar varios
		// números aleatorios.
		int tablaRandom[];

		// Declaramos el array tSuma como int para almacenar la tabla devuelta por
		// la función suma.
		int tSuma[];

		// Creamos la variable valoresASumar como int para la cantidad de números a
		// sumar desde cada posición.
		int valoresASumar;

		// Creamos la variable size como int para almacenar el tamaño del array
		// introducido por el usuario.
		int size;

		// Creamos la variable finRandom como int para almacenar el número hasta donde
		// deseamos que llegue la generación de números aleatorios.
		int finRandom;

		// Creamos la clase Scanner para leer los valores a sumar introducido por el
		// usuario.
		Scanner sc = new Scanner(System.in);

		// Creamos la clase Radom para generar números aleatorios entre 1 y 10 en
		// nuestra tabla de random.
		Random rand = new Random();

		// Le pedimos al usuario que introduzca el tamaño de la tabla que desea.
		System.out.print("Introduce el tamaño de la tabla --> ");
		size = sc.nextInt();

		// Le pedimos al usuario que introduzca hasta donde desea que llegue la
		// generación de números aleatorios.
		System.out.print("Introduce hasta donde deseas generar aleatorios --> ");
		finRandom = sc.nextInt();

		// Le pedimos al usuario que introduzca la cantidad de valres a sumar y la
		// leemos.
		System.out.print("Introduce la cantidad de elementos consecutivos a sumar --> ");
		valoresASumar = sc.nextInt();

		// Creamos la tabla con la posición introducida por el usuario.
		tablaRandom = new int[size];

		// Creamos este for para recorrer nuestra tabla e ir rellenandola con valores
		// aleatorios que se vayan generando.
		for (int i = 0; i < tablaRandom.length; i++) {
			tablaRandom[i] = rand.nextInt(1, finRandom + 1);
		}

		// Imprimimos un salto de linea, un mensaje explicativo y nuestra tabla de
		// random generada.
		System.out.println();
		System.out.print("Tabla generada aleatoriamente --> ");
		System.out.println(Arrays.toString(tablaRandom));
		System.out.println();

		// Asignamos a la variable tSuma la tabla devuelta por la función suma.
		tSuma = suma(tablaRandom, valoresASumar);

		// Mostramos un mensaje explicativo y tSuma (la tabla devuelta por la función
		// suma). Mostrando así toda la suma de los valores con la secuencia
		// introducida por el usuario.
		System.out.print("Suma de valores con consecutivos de " + valoresASumar + " en " + valoresASumar + "--> ");
		System.out.println(Arrays.toString(tSuma));

		// Cierre de Scanner
		sc.close();

	}

	/**
	 * Esta función devuelve una tabla con la suma de los varoles de la tabla pasada
	 * como parametro pero la suma se va haciendo consecutivamente segun el número
	 * pasada por parametro y desde posición a posción hasta salirse de la tabla
	 * para hacer la suma.
	 * 
	 * @param t            Tabla con todos los valores random.
	 * @param numElementos Cuantos valores consecutivos debemos de ir sumando desde
	 *                     cada posición.
	 * @return Una nueva tabla con todos los valores de la suma.
	 */
	public static int[] suma(int t[], int numElementos) {

		// Creamos el array tablaSuma como int para almacenar la suma de números
		// consecutivos y con una dimensión de longitud de la tabla menos el número de
		// elementos introducidos por el usuario menos 1.
		int tablaSuma[] = new int[(t.length - (numElementos - 1))];

		// Creamos la varable suma para ir almacenando el valor de la suma de cada
		// número.
		int suma = 0;

		// Creamos este for para recorrer la tablaSuma e ir añadiendo la suma de los
		// números.
		for (int i = 0; i < tablaSuma.length; i++) {
			// Inicializamos la suma a 0 al principio de cada iteración para que en la nueva
			// posición no se vayan concatenando los números.
			suma = 0;

			// Con este for igualamos la j a i y comprobamos que la j sea menor que i mas
			// el número de elementos para siempre recorrer numElementos posiciones.
			for (int j = i; j < i + numElementos; j++) {
				// A suma le vamos sumando los números de cada posición segun numElementos.
				suma += t[j];
			}
			// A nuestra tabla le vamos añadiendo desde la posición cero el valor de suma.
			tablaSuma[i] = suma;
		}

		// Devolvemos la tablaSuma con todos los valores de la suma calculada.
		return tablaSuma;
	}

}
