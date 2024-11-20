package boletinpart4;

/**
 * Este programa crea una función que recibe una tabla bidimensional y nos
 * devuelve true si la suma de todas sus filas y columnas tienen el mismo valor.
 */
public class EjercicioB4 {

	public static void main(String[] args) {

		// Creamos el array tablaMagica para almacenar una serie de valores.
		int tablaMagica[][] = { { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 6 } };

		// Creamos la variable magica como boolean para almacenar el resueltado que nos
		// devuelve nuestra función esMágica.
		boolean magica = esMagica(tablaMagica);

		//Mostramos un mensaje
		System.out.print("¿Es simetrica nuestra tabla? --> ");
		
		// Comprobamos si nuestra variable magica es true, eso significa que la tabla es
		// magica.
		if (magica) {
			System.out.println("La tabla es SIMETRICA");
			// Si no, no es mágica.
		} else {
			System.out.println("La tabla es NO SIMETRICA");
		}

	}

	/**
	 * Esta función se encarga de comprobar que la suma de columnas y filas es
	 * siempre la misma.
	 * 
	 * @param tabla El array donde estan todos los valores de nuestra tabla.
	 * @return True si la suma de cada fila es igual a las demas filas y columnas.
	 *         False en caso contrario.
	 */
	public static boolean esMagica(int tabla[][]) {

		// Creamos la variable sol para devolver true o false dependiendo si la tabla es
		// magica o no. Se inicializa a true porque siempre será true a no ser que se
		// demuestre lo contrario.
		boolean sol = true;

		// Creamos la variable suma como int para almacenar la suma momentaneamente de
		// cada fila.
		int sumaFila = 0;

		// Creamos la variable suma como int para almacenar la suma momentaneamente de
		// cada columna.
		int sumaColumna = 0;

		// Creamos la variable indiceI como int para recorrer cada fila de nuestra
		// tabla.
		int indiceI = 0;

		// Creamos la variable indiceJ como int para recorrer cada columna de nuestra
		// tabla.
		int indiceJ = 0;

		// Comprobamos si la suma de una fila y columnas es igual, y indiceI es menor
		// que la longitud de la tabl.
		while (sol && indiceI < tabla.length) {

			// Inicializamos cada suma a 0 antes de comprobar otra nueva fila.
			sumaFila = 0;
			sumaColumna = 0;

			indiceJ = 0;

			// Comprobamos si el indiceJ es menor que la longitud de la tabla.
			while (indiceJ < tabla[indiceI].length) {

				// Calculamos la suma de la primera fila y la primera columna.
				sumaFila += tabla[indiceI][indiceJ];
				sumaColumna += tabla[indiceJ][indiceI];

				// Incrementamos el indice de J.
				indiceJ++;
			}

			// Comprobamos si la suma de la fila y columna es distinta si el así, devolvemos
			// false y nos salimos del bucle.
			if (sumaFila != sumaColumna) {
				sol = false;
			}

			// Incrementamos el indice de I
			indiceI++;
		}

		// Devolvemos si la tabla es mágica o no.
		return sol;
	}

}
