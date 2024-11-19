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
		boolean sol = true;

		// Creamos la variable suma como int para almacenar la suma momentaneamente de
		// cada fila y columna.
		int suma = 0;
		
		int sumaAnterior = 0;

		// Creamos la variable indiceBusqueda como int para recorrer cada posicion de
		// nuestro array.
		int indiceBusqueda = 0;

		while (indiceBusqueda < tabla.length) {
			
			while (indiceBusqueda < tabla[0].length) {
				suma+= tabla[indiceBusqueda][indiceBusqueda];
			}
			
			if (suma != )
			
			indiceBusqueda = 0;
		}
		
		return sol;
	}

}
