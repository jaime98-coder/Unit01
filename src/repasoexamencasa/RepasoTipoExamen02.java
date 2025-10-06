package repasoexamencasa;

import java.util.Scanner;

public class RepasoTipoExamen02 {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que calcule la puntuación final de un jugador en un
		 * videojuego. Para ello, ten en cuenta lo siguiente:
		 * 
		 * Debe preguntar al usuario el nivel completado (número entero del 1 al 10)
		 * 
		 * Debe preguntar el número de enemigos eliminados (número entero)
		 * 
		 * Debe preguntar el número de coleccionables obtenidos (número entero)
		 * 
		 * Debe preguntar el multiplicador de dificultad (número con decimales)
		 * 
		 * La puntuación base se calcula así:
		 * 
		 * Cada nivel completado vale 100 puntos
		 * 
		 * Cada enemigo eliminado vale 10 puntos
		 * 
		 * Cada coleccionable obtenido vale 50 puntos
		 * 
		 * A la puntuación total (puntuación base × multiplicador de dificultad) hay que
		 * aplicarle un descuento por penalización:
		 * 
		 * Si la puntuación total es menor de 5000 puntos, se le descuenta un 10%
		 * 
		 * Si la puntuación total es 5000 puntos o más, se le descuenta un 20%
		 * 
		 * Se mostrará por pantalla la puntuación final después de aplicar el descuento.
		 * 
		 */
		// Declaro las variables;
		int nivelCompletado;
		int enemigosEliminados;
		int coleccionablesObtenidos;
		double multiplicadorDificultad;
		final int LIMITE = 5000;
		final int PUNTOS_NIVEL = 100;
		final int PUNTOS_ENEMIGO_ELIMINADO = 10;
		final int PUNTOS_COLECCIONABLES = 50;
		double puntuacionBase;
		double puntuacionTotal;
		double puntuacionTotalTrasPenalización;
		Scanner reader = new Scanner(System.in);
		System.out.println("Introduce nivel completado del 1 al 10");
		nivelCompletado = reader.nextInt();
		System.out.println("Introduce nº enemigos eliminados");
		enemigosEliminados = reader.nextInt();
		System.out.println("Introduce nº coleccionables obtenidos");
		coleccionablesObtenidos = reader.nextInt();
		System.out.println("Introduce el multiplicador de dificultad con el que que has jugado");
		multiplicadorDificultad = reader.nextDouble();
		puntuacionBase = (nivelCompletado * PUNTOS_NIVEL) + (enemigosEliminados * PUNTOS_ENEMIGO_ELIMINADO)
				+ (coleccionablesObtenidos * PUNTOS_COLECCIONABLES);
		puntuacionTotal=puntuacionBase*multiplicadorDificultad;
		System.out.println("Tu puntuación total antes de penalización es de "+puntuacionTotal);
		puntuacionTotalTrasPenalización=(puntuacionTotal<LIMITE) ? puntuacionTotal*0.9 : puntuacionTotal* 0.8;
		System.out.println("Tu puntuación total trás penalización es de "+puntuacionTotalTrasPenalización);
		reader.close();
	}

}
