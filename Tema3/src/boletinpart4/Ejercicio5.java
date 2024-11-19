package boletinpart4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/***
 * Este programa crea una función que nos devuelve una tabla con los indices
 * donde se encuentra el valor en otra tabla repetidas veces.
 */
public class Ejercicio5 {

	public static void main(String[] args) {

		// Creamos el array tablaNumRept como int para almacenar una serie de números
		// que se repiten varias veces.
		int tablaNumRept[];

		// Creamos la variable valor como int para almacenar el valor que deseeamos
		// buscar en la tabla.
		int valor;

		// Creamos la varariable size como int para almacenar el tamaño del array
		// introducido por el usuario.
		int size;

		// Creamos la variable finRandom como int para almacenar el número hasta
		// deseamos que llegue la generación de números aleatorios.
		int finRandom;

		// Creamos el Scanner para leer el valor introducido por el usuario por teclado.
		Scanner sc = new Scanner(System.in);

		// Creamos la clase Random para generar números aleatorios para nuestra tabla.
		Random rand = new Random();

		// Le pedimos al usuario que introduzca el tamaño de la tabla que desea.
		System.out.print("Introduce el tamaño de la tabla --> ");
		size = sc.nextInt();

		// Le pedimos al usuario que introduzca hasta donde desea que llegue la
		// generación de números aleatorios.
		System.out.print("Introduce hasta donde deseas generar aleatorios --> ");
		finRandom = sc.nextInt();

		// Le pedimos al usuario que introduzca el valor que desea buscar en la tabla y
		// lo leemos por teclado.
		System.out.print("Introduce el valor que deseas buscar en la tabla --> ");
		valor = sc.nextInt();

		// Creamos la tabla con la posición introducida por el usuario.
		tablaNumRept = new int[size];

		// Recorremos cada posición del array y lo vamos rellenando con valores
		// aleatorios entre 1 y el finRandom que hemos solicitado al usuario.
		for (int i = 0; i < tablaNumRept.length; i++) {
			tablaNumRept[i] = rand.nextInt(1, finRandom + 1);
		}

		// Mostramos un mensaje de lo que vamos a mostrar y un salto de linea -->
		System.out.println("Tabla con datos aleatorios: ");
		System.out.println(Arrays.toString(tablaNumRept));

		// Mostramos un mensaje de lo que vamos a mostrar a continuación.
		System.out.println();
		System.out.print("Tabla con las posiciones donde se encuentra el valor " + valor + "--> ");
		// Llamamos a la función buscarTodos y devolvemos la tabla con todos los indices
		// donde se encuentra el valor.
		System.out.println(Arrays.toString(buscarTodos(tablaNumRept, valor)));

		// Cierre de Scanner
		sc.close();
	}

	/**
	 * Función que se encarga de almacenar las posiciones donde se encuentra un
	 * valor en la tabla pasada como parametro y luego la devuelve.
	 * 
	 * @param t     La tabla donde estan almacenados todos los valores.
	 * @param valor El número que tenemos que buscar en esa tabla.
	 * @return Devolvemos una tabla vacia si el valor no se encuentra en la tabla t.
	 *         Devolvemos otra tabla con todas las posiciones donde se encuentra el
	 *         número si es que aparece.
	 */
	public static int[] buscarTodos(int t[], int valor) {
		// Declararemos el array tablaBusqueda donde almacenaremos los indices donde se
		// encuentra el valor introducido por teclado.
		int tablaBusqueda[];

		// Creamos la variable indiceBusqueda como int para almacenar el indice que se
		// vaya comprobando en el momento.
		int indiceBusqueda = 0;

		// Creamos la variable cont como int para almacenar las veces que hemos
		// encontrado el número introducido en la tabla.
		int cont = 0;

		// Creamos este for para recorrer todas las posiciones de la tabla.
		for (int i = 0; i < t.length; i++) {
			// Comprobamos si el valor que hay que buscar se encuentra en la tabla, si es
			// así incrementamos el cont a +1.
			if (valor == t[i]) {
				cont++;
			}
		}

		// Creamos nuestra tabla tablaBusqueda donde almacenaremos las posiciones donde
		// se encuentra el valor. Y tendra la longitud almacenada en cont.
		tablaBusqueda = new int[cont];

		// Recorremos cada posición de nuestra tablaBusqueda.
		for (int i = 0; i < tablaBusqueda.length; i++) {

			// Hacemos una busqueda secuencial comprobando que el indice de busqueda sea
			// menor que la longitud de la tabla y el valor no se haya encontrado todavia.
			while (indiceBusqueda < t.length && valor != t[indiceBusqueda]) {
				indiceBusqueda++;
			}
			// Luego comprobamos si el indice sigue siendo menor que la longitud de la tabla
			// donde se encuentran todos los valores.
			if (indiceBusqueda < t.length) {
				// Asignamos a la primera posición de la tabla el indice de busqueda.
				tablaBusqueda[i] = indiceBusqueda;
				// Incrementamos el indice de busqueda para que en la comprobación del while
				// empieze con el valor siguiente y no vuelva al mismo.
				indiceBusqueda++;
			}
		}

		// Devolvemos la tabla con todas las posiciones encontradas.
		return tablaBusqueda;
	}

}
