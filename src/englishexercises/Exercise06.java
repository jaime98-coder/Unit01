package englishexercises;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		/*
		 * A group of students has been told to get into teams of a specific size for
		 * their coursework. Design and implement a program that prompts for the number
		 * of students in the group and the size of the teams to be formed, and displays
		 * how many teams can be formed and how many students are left without a team.
		 * 
		 */
		// Declaring the variables
		int studentNumbers;
		int teamSize;
		int teamsFormed;
		int studentsWithNoTeam;
		// Creating the Scanner
		Scanner reader = new Scanner(System.in);
		// Asking the user to introduce number of students and reading it through the console
		System.out.println("Introduce the number of students in the class");
		studentNumbers = reader.nextInt();
		// Asking the user to introduce the team size and reading it through the console
		System.out.println("Introduce the team size");
		teamSize = reader.nextInt();
		// Calculating the teams formed
		teamsFormed = studentNumbers/teamSize;
		// Calculating the students which aren't in a team
		studentsWithNoTeam = studentNumbers-(teamSize*teamsFormed);
		// Printing the final messages with the values that the exercise needs
		System.out.println("The number of teams formed are: "+teamsFormed);
		System.out.println("The number of students with no team are: "+studentsWithNoTeam);
		// Closing the Scanner
		reader.close();
	}

}
