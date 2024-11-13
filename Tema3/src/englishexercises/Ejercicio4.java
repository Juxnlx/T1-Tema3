package englishexercises;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		// We create the minesweeper array as an int to store the board with the clues
		// and the mines.
		String minesweeper[] = { "0", "1", "*", "1", "1", "*", "*", "2", "*", "1", "1", "0", "1", "*", "1", "0", "0",
				"0", "1", "*" };

		// We create the tracks array as int to show the tracks on the board.
		String tracks[] = new String[20];

		// We create the variable userPosition as int to store the position entered by
		// the
		// user.
		int userPosition;

		// We create the Scanner to read the position entered by the user.
		Scanner sc = new Scanner(System.in);

		// We initialize the tracks table to ▒.
		Arrays.fill(tracks, "▒");

		// We ask the user to enter the position they want to discover and we read it.
		System.out.print("Enter the position to discover 0 - 19 -->");
		userPosition = sc.nextInt();

		// With this while we check if the value found in the entered position is
		// different from "*".
		while (!minesweeper[userPosition].equals("*")) {
			// We match in our tracks table the same track that is on our game table.
			tracks[userPosition] = minesweeper[userPosition];

			// We show the game board only the track that the array tracks[] has entered.
			System.out.println(" 0  1  2  3  4  5  6  7  8  9 10 11 12 13 14 15 16 17 18 19");
			System.out.println(Arrays.toString(tracks));

			// Line break.
			System.out.println();

			// We ask the user again to enter the position they want to discover.
			System.out.print("Enter the position to discover 0 - 19 -->");
			userPosition = sc.nextInt();

		}

		// Message displayed if the while has ended due to entering a position where one
		// of the 6 mines was located.
		System.out.println("BOOOOOM!! Sorry, you stepped on a mine.");

		// Closing Scanner
		sc.close();
	}

}
