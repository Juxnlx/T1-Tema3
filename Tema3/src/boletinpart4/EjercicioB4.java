package boletinpart4;

/**
 * Este programa crea una función que recibe una tabla bidimensional y nos
 * devuelve true si la suma de todas sus filas y columnas tienen el mismo valor.
 */
public class EjercicioB4 {

	public static void main(String[] args) {

		// Creamos el array tablaMagica para almacenar una serie de valores.
		int tablaMagica[][] = { { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 6 } };

		System.out.println(esMagica(tablaMagica));
		
	}

	public static boolean esMagica(int tabla[][]) {

		// Creamos la variable sol para devolver true o false dependiendo si la tabla es
		// magica o no.
		boolean sol = false;

		// Creamos la variable suma como int para almacenar la suma momentaneamente de
		// cada fila y columna.
		int suma = 0;
		
		int sumaAnterior = 0;

		// Creamos la variable indiceBusqueda como int para recorrer cada posicion de
		// nuestro array.
		int indiceI = 0;
		int indiceJ = 0;

		
		/*for (int i = 0; i < tabla.length; i++) {
			suma = 0;
			for (int j = 0; j < tabla[i].length; j++) {
				suma+= tabla[i][j];
			}
			if (i == 0) {
				sumaAnterior = suma;
			}
			
			if (sumaAnterior == suma) {
				sol = true;
			} else {
				sol = false;
			}
			
			sumaAnterior = suma;
			
		}*/
		
		while (indiceI < tabla.length) {
			suma = 0;
			indiceJ = 0;
			
			while (indiceJ < tabla[indiceI].length) {
				suma+= tabla[indiceI][indiceJ];
				indiceJ++;
			}
			
			if (indiceI == 0) {
				sumaAnterior = suma;
			}
			
			if (sumaAnterior == suma) {
				sol = true;
			} else {
				sol = false;
			}
			
			sumaAnterior = suma;
			indiceI++;
		}
		
		return sol;
	}

}
