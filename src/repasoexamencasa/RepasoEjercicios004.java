package repasoexamencasa;

import java.util.Scanner;

public class RepasoEjercicios004 {

	public static void main(String[] args) {
		/*
		 * A group of students has been told to get into teams of a specific size for
		 * their coursework. Design and implement a program that prompts for the number
		 * of students in the group and the size of the teams to be formed, and displays
		 * how many teams can be formed and how many students are left without a team.
		 * 
		 * 
		 */
		int students;
		int sizeTeams;
		int teamsFormed;
		int studentsWithNoTeam;
		Scanner reader = new Scanner(System.in);
		students = reader.nextInt();
		sizeTeams= reader.nextInt();
		teamsFormed=students/sizeTeams;
		studentsWithNoTeam=students%sizeTeams;
		System.out.println("Teams formed: "+teamsFormed);
		System.out.println("Students with no team: "+studentsWithNoTeam);
		
		
		reader.close();
		
	}

}
