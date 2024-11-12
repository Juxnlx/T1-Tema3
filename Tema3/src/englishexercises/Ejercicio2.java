package englishexercises;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		// We declare the arithmeticSequence array as int to later create our table with
		// the indicated size.
		int arithmeticSequence[];

		// We create the variable tableSize as int to store the size that our table will
		// have.
		int tableSize;

		// We create the variable initialValue as int to store the initial value entered
		// by the user.
		int initialValue;

		// We create the variable increase as int to store the value that we must
		// increase to the initial value.
		int increase;

		// We create the variable increase Value as int to store the value to be entered
		// in each position of the table.
		int increasedValue;

		// We create the Scanner to read the table size, the initial value and the
		// increment.
		Scanner sc = new Scanner(System.in);

		// We ask the user to enter the size of the table and read it.
		System.out.print("Enter the size of the table --> ");
		tableSize = sc.nextInt();

		// We create the arithmeticSequence table with a size entered by the user to
		// store the sequence of numbers.
		arithmeticSequence = new int[tableSize];

		// We ask the user to enter the initial value with which to start the sequence
		// of numbers and we read it.
		System.out.print("Enter the initial value --> ");
		initialValue = sc.nextInt();

		// We ask the user to enter the increment that our table will have.
		System.out.print("Enter the increment of our table --> ");
		increase = sc.nextInt();

		// We assign to the variable increasedValue the starting value entered by the
		// user.
		increasedValue = initialValue;

		// With this for we go through the entire table and in each iteration we add the
		// numbers.
		for (int i = 0; i < arithmeticSequence.length; i++) {
			// We assign the incremented value to the table position.
			arithmeticSequence[i] = increasedValue;

			// On each turn we add to the increased value the increment entered by the user
			// previously.
			increasedValue += increase;
		}

		// Line break and explanatory message.
		System.out.println();
		System.out.print("Secuencia de números --> ");
		System.out.println(Arrays.toString(arithmeticSequence));

		// Closing Scanner
		sc.close();

	}

}
