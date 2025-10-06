package repasoexamencasa;

import java.util.Scanner;

public class RepasoEjercicios001 {

	public static void main(String[] args) {
		// Implement the next program
		// Declaring the program Title variable
		String programTitle;
		// Declaring the price variable
		double price;
		// Declaring the tax variable
		double tax;
		// Declaring the new price (price with taxes) variable
		double newPrice;
		// Creating the Scanner
		Scanner reader = new Scanner(System.in);
		// Requesting the user to introduce the program title and reading the answer
		// through the console
		System.out.println("Introduce the program title");
		programTitle = reader.nextLine();
		// Requesting the user to introduce the price of the program and reading the
		// answer through the console
		System.out.println("Introduce the price of the program");
		price = reader.nextDouble();
		// Requesting the user to introduce the tax and reading the answer through the console
		System.out.println("Enter the tax");
		tax = reader.nextInt();
		// Calculating the new price (price with taxes)
		newPrice = price * (1 + tax / 100);
		// Printing the final message with the new price
		System.out.println("The new price is " + newPrice + "€");
		// Closing the Scanner
		reader.close();

	}

}
