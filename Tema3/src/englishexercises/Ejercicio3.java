package englishexercises;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		// We create the flyBoard array as a String to store the fly.
		String flyBoard[] = new String[10];

		// We create the variable userPosition as int to store the position entered by
		// the user.
		int userPosition;

		// We create the variable flyPosition as int to store the random position where
		// the fly will be placed.
		int flyPosition;

		// We create the Scanner to read the position of the fly entered by the user.
		Scanner sc = new Scanner(System.in);

		// We create the random class to randomly choose the position where the fly will
		// land.
		Random rand = new Random();

		// We show a message from the game of catching the fly.
		System.out.println("WELCOME! This is the game of catch the fly");

		// We initialize our array flyBoard to an empty string.
		Arrays.fill(flyBoard, " ");

		// We generate a random position and store it in flyPosition and store in that
		// position an asterisk simulating the fly.
		flyPosition = rand.nextInt(0, 10);
		flyBoard[flyPosition] = "*";

		// We ask the user to enter the position where he thinks the fly is located and
		// we read it.
		System.out.print("Enter the position where you think the fly is located 0 - 9 -->");
		userPosition = sc.nextInt();

		// We check if the position where the fly is located is different from the one
		// entered by the user.
		while (flyPosition != userPosition) {

			// We check if the fly is one position higher or lower than the one entered by
			// the user. If so, we do the following:
			if (((userPosition + 1) == flyPosition) || ((userPosition - 1) == flyPosition)) {
				// We initialize the array to a space because that means the fly has flown to
				// another place.
				Arrays.fill(flyBoard, " ");

				// We generate another random position and equate the fly's position (*) to that
				// position.
				flyPosition = rand.nextInt(0, 10);
				flyBoard[flyPosition] = "*";

				// We indicate to the user that the fly was nearby but has changed its position.
				System.out.println("It was close! You are close but it has flown to another position");

				// If the position is not found one position more or less than that entered by
				// the user, we show the following message.
			} else {
				// We print that the fly is far from the position entered by the user.
				System.out.println("The fly is far from its position");
			}

			// We print a line break.
			System.out.println();

			// We show a message to the user to try again, try another position and read the
			// response.
			System.out.println("Please try again --> ");
			System.out.print("Enter the position where you think the fly is located 0 - 9 -->");
			userPosition = sc.nextInt();
		}

		// Line break.
		System.out.println();

		// Congratulatory message to the user for having discovered the position where
		// the fly was located.
		System.out.println("CONGRATULATIONS! You have caught the fly");

		// Closing Scanner
		sc.close();

	}

}
