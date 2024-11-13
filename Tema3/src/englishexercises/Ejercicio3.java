package englishexercises;

import java.util.Random;
import java.util.Scanner;

/**
 * ¿Dónde está la mosca? Estamos intentando atrapar una mosca. La mosca elegirá
 * aleatoriamente una posición en nuestro array y tendremos que adivinar la
 * posición en la que se encuentra la mosca. El programa le preguntará al
 * usuario la posición en la que cree que está la mosca. Si la posición es
 * correcta, entonces el jugador gana y el programa termina. Si no es correcta,
 * entonces pueden suceder dos cosas:
 * 
 * La mosca está en una posición contigua. Entonces vuela a otra posición. El
 * programa debe decirle al jugador que estaba cerrado pero la mosca cambió su
 * posición.
 * 
 * La mosca no está en una posición contigua, entonces la mosca se queda donde
 * está. El programa debe decirle al jugador que la mosca está lejos de esa
 * posición.
 * 
 * El tamaño del array será 10, pero se puede cambiar.
 */
public class Ejercicio3 {

	public static void main(String[] args) {

		// Creamos el array tableroMosca como int para almacenar la posción en la que se
		// encontrara la mosca.
		int tableroMosca[] = new int[10];

		// Creamos la variable posUsuario como int para almacenar la posición que
		// introducira el usuario.
		int posUsuario;

		// Creamos la variable posMosca como int para almacenar la posición aleatoria
		// donde se pondra la mosca.
		int posMosca;

		// Creamos el Scanner para leer la posición de la mosca introducida por el
		// usuario.
		Scanner sc = new Scanner(System.in);

		// Creamos la clase random para elegir aleatoriamente la posición donde se
		// posará la mosca.
		Random rand = new Random();

		// Mostramos un mensaje del juego de atrapar la mosca
		System.out.println("¡¡BIENVENIDO! Este es el juego de la mosca!");
		
		//Generamos una posición aleatoria donde haya caido la mosca por primera vez.
		posMosca = rand.nextInt(0, 10);
		
		// Le pedimos al usuario que introduzca la posición donde cree que se encuentra
		// la mosca y la leemos.
		System.out.print("Introduce la posición donde crees que se encuentra la mosca 0 - 9 --> ");
		posUsuario = sc.nextInt();
		
		
		
		
		
	}

}
