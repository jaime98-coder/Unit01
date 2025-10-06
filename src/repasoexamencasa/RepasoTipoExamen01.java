package repasoexamencasa;

import java.util.Scanner;

public class RepasoTipoExamen01 {

	public static void main(String[] args) {
		int minsVideo1;
		int segsVideo1;
		int minsVideo2;
		int segsVideo2;
		int minsVideo3;
		int segsVideo3;
		int duracionTotalEnSegundos;
		int minutosTotales;
		int segundosRestantes;
		Scanner reader = new Scanner(System.in);

		// Solicitar datos para los tres videos
		System.out.println("Introduce minutos del video 1");
		minsVideo1 = reader.nextInt();
		System.out.println("Introduce segundos del video 1");
		segsVideo1 = reader.nextInt();

		System.out.println("Introduce minutos del video 2");
		minsVideo2 = reader.nextInt();
		System.out.println("Introduce segundos del video 2");
		segsVideo2 = reader.nextInt();

		System.out.println("Introduce minutos del video 3");
		minsVideo3 = reader.nextInt();
		System.out.println("Introduce segundos del video 3");
		segsVideo3 = reader.nextInt();

		// Calcular duración total en segundos
		duracionTotalEnSegundos = (minsVideo1 * 60 + segsVideo1) + (minsVideo2 * 60 + segsVideo2)
				+ (minsVideo3 * 60 + segsVideo3);

		// Convertir a minutos y segundos
		minutosTotales = duracionTotalEnSegundos / 60;
		segundosRestantes = duracionTotalEnSegundos % 60;

		// Mostrar resultado
		System.out.println("La duración total de todos los videos es " + minutosTotales + " minutos y "
				+ segundosRestantes + " segundos");

		reader.close();
	}
}