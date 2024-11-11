package englishexercises;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		// We create the tableOfValues ​​as an int of size 10 to store a series of
		// values.
		int tableOfValues[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// We create the character variable as a String to store the option selected by
		// the user from the menu.
		String character = "";

		// We create the variable worth as int to store the new value entered by the
		// user.
		int worth;

		// We create the variable position as int to store the new position in which we
		// will insert the new value entered by the user.
		int position;

		// We create the Scanner to read the option, the new value and the new position.
		Scanner sc = new Scanner(System.in);

		// We create a do-while loop to repeat the menu and ask for an option again
		// until the user selects it.
		do {
			// We show the menu.
			System.out.println("MENU -->");
			System.out.println("a. Show values");
			System.out.println("b. Introduce a value");
			System.out.println("c. Exit");

			// We ask the user to enter a menu option and read it.
			System.out.print("Enter the selected option: ");
			character = sc.next();

			// With this switch we check all the menu options and depending on what the user
			// enters, one thing or another will be done.
			switch (character) {

			// In the case of "a" only the table is shown.
			case "a" -> {
				System.out.println(Arrays.toString(tableOfValues));
			}

			// In the case of "b" a value and a position are requested and that new value is
			// inserted into the table in that new position.
			case "b" -> {
				System.out.println("Enter the position in which you want to do it -->");
				position = sc.nextInt();

				System.out.println("Enter the value you want to rewrite --> ");
				worth = sc.nextInt();

				tableOfValues[position] = worth;
			}

			// In the case of "c" only a message is printed indicating that we are exiting
			// the program.
			case "c" -> {
				System.out.println("Leaving...");
			}

			// If one of the above values ​​is not entered, we display a message indicating
			// that the entered value is incorrect.
			default -> System.out.println("The entered value is incorrect");
			}

			// Line break
			System.out.println();

			// We check if the selected option is different from "c" to execute the code
			// again.
		} while (!character.equals("c"));

		// Closing Scanner
		sc.close();
	}

}
