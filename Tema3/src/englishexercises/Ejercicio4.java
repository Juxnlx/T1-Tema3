package englishexercises;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		// We create the minesweeper array as an int to store the board with the clues
		// and the mines.
		String minesweeper[] = new String[20];

		// We create the tracks array as int to show the tracks on the board.
		String tracks[] = new String[20];

		// We create the variable userPosition as int to store the position entered by
		// the user.
		int userPosition;

		int minas;

		Random rand = new Random();

		// We create the Scanner to read the position entered by the user.
		Scanner sc = new Scanner(System.in);

		Arrays.fill(minesweeper, "0");

		minas = rand.nextInt(0, 19);

		for (int i = 1; i <= 6; i++) {

			while (minesweeper[minas] == "*") {
				minas = rand.nextInt(0, 19);
			}
			minesweeper[minas] = "*";
		}

		System.out.println(Arrays.toString(minesweeper));
		System.out.println();

		if (minesweeper[0].equals("*")) {
			minesweeper[1] = "1";
		}

		if (minesweeper[minesweeper.length - 1].equals("*")) {
			minesweeper[minesweeper.length - 2] = "1";
		}

		for (int i = 1; i < minesweeper.length - 1; i++) {
			if (minesweeper[i].equals("*") && (minesweeper[i + 1].equals("*") || minesweeper[i + 1].equals("*"))) {
				minesweeper[i] = "*";

			}
			if (minesweeper[i - 1].equals("*") && minesweeper[i + 1].equals("*")) {
				minesweeper[i] = "2";

			} else if (minesweeper[i + 1].equals("*") || minesweeper[i + 1].equals("*")) {
				minesweeper[i] = "1";
			}

		}

		System.out.println(Arrays.toString(minesweeper));

		// We initialize the tracks table to ▒.
		Arrays.fill(tracks, "▒");

		// We ask the user to enter the position they want to discover and we readit.
		System.out.print("Enter the position to discover 0 - 19 -->");
		userPosition = sc.nextInt();

		// With this while we check if the value found in the entered position
		// isdifferent from "*".
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
