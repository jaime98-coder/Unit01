package englishexercises;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		/*
		 * Implement in Java the next program:
		 * (image in the document)
		 */
		// Declare the variables
		String title;
		double price;
		double tax;
		double newPrice;
		// Creating the Scanner
		Scanner reader = new Scanner(System.in);
		// Asking to the user to introduce the title
		System.out.println("Introduce the title");
		// Reading the title introduced by the user through the console
		title = reader.nextLine();
		// Asking to the user to introduce the price	
		System.out.println("Introduce the price");
		// Reading the price introduced by the user through the console
		price = reader.nextDouble();
		// Asking to the user to introduce the tax
		System.out.println("Introduce the tax");
		// Reading the price introduced by the user through the console		
		tax = reader.nextDouble();
		// Calculating the new Price (price with taxes)
		newPrice = price*(1+tax/100);
		// Printing the final message with the new price.
		System.out.println("The new price is: "+newPrice);
		// Closing the Scanner
		reader.close();
		
	}

}
