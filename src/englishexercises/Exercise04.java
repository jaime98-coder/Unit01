package englishexercises;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		/*
		 * The following pseudocode has been arrived at for a program that converts
		 * pounds to kilos (1 kilo = 2.2 lb):
		 * BEGIN PROMPT for value in pounds
		 * ENTER value in pounds
		 * SET value to old value ÷ 2.2
		 * DISPLAY value in kilos
		 * END
		 * Implement this program, remembering to declare any variables that are
		 * necessary.
		 * 
		 * 
		 */
		// Declaring the variables
		double pounds;
		double kilos;
		// Creating the Scanner
		Scanner reader = new Scanner(System.in);
		// Asking the user to introduce the pounds and reading it throught the console
		System.out.println("Introduce the pounds");
		pounds = reader.nextDouble();
		// Assigning to the variable kilos the formula to convert pounds in kilos
		kilos = pounds/2.2;
		// Printing the final message with the conversion
		System.out.println("That pounds are "+kilos+"kilos");
		// Closing the Scanner
		reader.close();
		
	}

}
