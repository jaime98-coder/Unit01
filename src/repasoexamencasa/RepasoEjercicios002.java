package repasoexamencasa;

import java.util.Scanner;

public class RepasoEjercicios002 {

	public static void main(String[] args) {
		/*
		 * Implement a program that prompts for the user’s age and then attempts to work
		 * out the year in which the user was born.
		 * 
		 */
		int userAge;
		int birthYear;
		int actualYear;
		Scanner reader = new Scanner(System.in);
		userAge = reader.nextInt();
		actualYear = reader.nextInt();
		birthYear=actualYear-userAge;
		System.out.println("The user was born in "+birthYear);
		reader.close();
	}

}
