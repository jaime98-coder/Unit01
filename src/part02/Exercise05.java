package part02;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		/*
		 * Diseña una aplicación que solicite al usuario que introduzca una cantidad de
		 * segundos. La aplicación debe mostrar cuántas horas, minutos y segundos hay en
		 * el número de segundos introducidos por el usuario.
		 * 
		 */
		// Declaro las variables de los segundos iniciales, horas, minutos y segundos
		// finales (tras conversión a las otras unidades de tiempo.
		int segundosIniciales;
		int horas;
		int minutos;
		int segundosFinales;
		// Creo el Scanner
		Scanner reader = new Scanner(System.in);
		// Solicito al usuario que introduzca el nº de segundos para realizar la conversión
		System.out.println("Introduce el número de segundos para convertir a horas, minutos y segundos");
		// Leo de la consola los segundos introducidos
		segundosIniciales = reader.nextInt();
		// Hago el cálculo de horas que equivalen los segundos introducidos por el usuario
		horas = segundosIniciales / 3600;
		// Realizo el cálculo de los segundos sobrantes tras la conversión de segundos a horas
		segundosIniciales = segundosIniciales % 3600;
		// Hago el cálculo de minutos que equivalen los segundos restantes del valor introducido por el usuario
		minutos = segundosIniciales / 60;
		// Realizo el cálculo de los segundos sobrantes, asignándoselos a la variable segundos finales
		segundosFinales = segundosIniciales % 60;
		// Imprimo el mensaje final con la conversión hecha.
		System.out.println("Los segundos introducidos corresponden a " + horas + " horas, " + minutos + " minutos y "
				+ segundosFinales + " segundos.");
		// Cierro el Scanner
		reader.close();
	}

}
