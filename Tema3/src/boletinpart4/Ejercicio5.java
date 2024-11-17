package boletinpart4;

import java.util.Arrays;
import java.util.Scanner;

/***
 * Este programa crea una función que nos devuelve una tabla con los indices
 * donde se encuentra el valor en otra tabla repetidas veces.
 */
public class Ejercicio5 {

	public static void main(String[] args) {

		// Creamos el array tablaNumRept como int para almacenar una serie de números
		// que se repiten varias veces.
		int tablaNumRept[] = { 1, 2, 8, 9, 5, 4, 6, 1, 1, 4, 5, 8, 9, 9, 8, 2, 1, 8, 5, 5, 1 };

		// Creamos la variable valor como int para almacenar el valor que deseeamos
		// buscar en la tabla.
		int valor;

		// Creamos el Scanner para leer el valor introducido por el usuario por teclado.
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca el valor que desea buscar en la tabla y
		// lo leemos por teclado.
		System.out.print("Introduce le valor que deseas buscar en la tabla --> ");
		valor = sc.nextInt();

		// Mostramos un mensaje de lo que vamos a mostrar a continuación.
		System.out.println();
		System.out.println("Tabla con las posiciones donde se encuentra el valor " + valor + "--> ");
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
		int tablaBusqueda[] = new int[5];

		// Creamos la variable indiceBusqueda como int para almacenar el indice que se
		// vaya comprobando en el momento.
		int indiceBusqueda = 0;

		// Creamos la variable cont como int para almacenar las veces que hemos
		// encontrado el número introducido en la tabla.
		int cont = 0;

		// Recorremos el for tantas veces como encontremos el mismo número en la tabla.
		for (int i = 0; i <= cont; i++) {

			// Hacemos una busqueda secuencial comprobando que el indice de busqueda sea
			// menor que la longitud de la tabla y el valor no se haya encontrado todavia.
			while (indiceBusqueda < t.length && valor != t[indiceBusqueda]) {
				indiceBusqueda++;
			}

			// Luego comprobamos si el indice sigue siendo menor que la longitud de la tabla
			// donde se encuentran todos los valores.
			if (indiceBusqueda < t.length) {
				// Asignamos a la primera posición de la tabla el indice de busqueda.
				tablaBusqueda[cont] = indiceBusqueda;
				// Incrementamos el indice de busqueda para que en la comprobación del while
				// empieze con el valor siguiente y no vuelva al mismo.
				indiceBusqueda++;
				// Incrementamos contador porque ya tenemos una posición.
				cont++;
			}
		}

		// Copiamos todos los valores encontados en una nueva tabla (tablaIndices) desde
		// 0 hasta el contador.
		int tablaIndices[] = Arrays.copyOfRange(tablaBusqueda, 0, cont);

		// Devolvemos la tabla con todas las posiciones encontradas.
		return tablaIndices;
	}

}
