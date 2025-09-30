package englishexercises;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		/*
		 * Implement a program that prompts for the user’s age and then attempts to work
		 * out the year in which the user was born.
		 * 
		 */
		// Declaring the variables
		int age;
		int yearOfBorn;
		// Declaring the constant with the actual year (2025)
		final int ACTUALYEAR = 2025;
		// Creating the Scanner
		Scanner reader = new Scanner(System.in);
		// Asking the user to introduce an age and reading it through the console
		System.out.println("Introduce an age");
		age = reader.nextInt();
		// Calculating the year in which the user was born
		yearOfBorn = ACTUALYEAR-age;
		// Printing the final message with the year which the user was born
		System.out.println("The user was borned in "+yearOfBorn);
		// Closing the Scanner
		reader.close();
		

	}

}
