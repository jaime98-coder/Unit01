package repasoexamencasa;

import java.util.Scanner;

public class RepasoEjercicios003 {
	public static void main(String[] args) {
		/*
		 * The following pseudocode has been arrived at for a program that converts
		 * pounds to kilos (1 kilo = 2.2 lb): BEGIN PROMPT for value in pounds ENTER
		 * value in pounds SET value to old value ÷ 2.2 DISPLAY value in kilos END
		 * Implement this program, remembering to declare any variables that are
		 * necessary.
		 * 
		 */
		float pounds;
		float kilos;
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduce the pounds");
		pounds = reader.nextFloat();
		kilos = pounds/2.2f;
		System.out.println(pounds+" pounds = "+kilos+" kilos.");
		
		
		reader.close();
	}
}
