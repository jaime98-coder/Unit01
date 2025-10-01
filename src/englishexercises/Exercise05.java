package englishexercises;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		/*
		 * An individual’s Body Mass Index (BMI) is a measure of a person’s weight in
		 * relation to their height. It is calculated as follows: Divide a person’s
		 * weight (in kg) by the square of their height (in meters) Design and implement
		 * a program to allow the user to enter their weight and height and then print
		 * out their BMI.
		 * 
		 */
		// Declaring the variables
		double height;
		double weight;
		double BMI;
		// Creating the Scanner
		Scanner reader = new Scanner(System.in);
		// Asking the user to introduce his height and reading it through the console
		System.out.println("Introduce your height (in meters), please");
		height = reader.nextDouble();
		// Asking the user to introduce his height and reading it through the console
		System.out.println("Now introduce your weight (in kilos), please");
		weight = reader.nextDouble();
		// Calculating the BMI with the values introduced by the user
		BMI = weight / (Math.pow(height, 2));
		// Printing the final message with user's BMI
		System.out.println("Your BMI is: " + BMI);
		reader.close();

	}

}
