package englishexercises;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		int tableOfValues[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		String character = "";
		
		int worth;
		
		int position;

		Scanner sc = new Scanner(System.in);

		do {
		System.out.println("MENU -->");
		System.out.println("a. Show values");
		System.out.println("b. Introduce a value");
		System.out.println("c. Exit");

		System.out.print("Enter the selected option: ");
		character = sc.nextLine();

		switch (character) {
		case "a" -> {
			System.out.println(Arrays.toString(tableOfValues));
		}
		case "b"-> {
			System.out.println("Enter the position in which you want to do it -->");
			position = sc.nextInt();
			
			System.out.println("Enter the value you want to rewrite --> ");
			worth = sc.nextInt();
			
			tableOfValues[position] = worth;
		}
		case "c"-> {
			System.out.println("Saliendo...");
		}
		default ->
			System.out.println("El valor introducido");
		}
		
		} while (!character.equals("c"));
		
		sc.close();
	}

}
