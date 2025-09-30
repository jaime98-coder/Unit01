package englishexercises;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		/*
		 * Design a program that asks the user to enter values for the length and height
		 * of a rectangle and then displays the area and perimeter of that rectangle.
		 * 
		 */
		// Declaring the variables 
		double length;
		double heigth;
		double area;
		double perimeter;
		// Creating the Scanner
		Scanner reader = new Scanner(System.in);
		// Asking the user to introduce the length and reading the data introduced through the console
		System.out.println("Introduce the length of the rectangle");
		length = reader.nextDouble();
		// Asking the user to introduce the heigth and reading the data introduced through the console
		System.out.println("Introduce the heigth of the rectangle");
		heigth = reader.nextDouble();
		// Calculating the area of the rectangle
		area = length * heigth;
		// Calculating the perimeter of the rectangle
		perimeter = 2 * (length * heigth);
		// Printing the final message with the area of the rectangle
		System.out.println("The area of the rectangle is " + area);
		// Printing the final message with the perimeter of the rectangle
		System.out.println("The perimeter of the rectangle is " + perimeter);
		// Closing the Scanner
		reader.close();

	}

}
