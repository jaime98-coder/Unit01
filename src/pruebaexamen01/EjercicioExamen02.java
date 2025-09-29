package pruebaexamen01;

import java.util.Scanner;

public class EjercicioExamen02 {

	public static void main(String[] args) {
		//Creo el Scanner
		Scanner reader = new Scanner(System.in);
		// Extra info optimización post exercise, almacenar impuestos en constantes,
		// de esta forma si en un futuro cambian los impuestos a aplicar, puedo cambiar directamente
		// en las constantes, sin tener que meterme a modificar el código
		final double IMPUESTO_MENOR_1000=0.1;
		final double IMPUESTO_MAYOR_1000=0.15;
		//Declaro la variable para almacenar las horas trabajadas
		int horasTrabajadas;
		//Declaro la variable para almacenar el precio por hora
		double precioPorHora;
		//Declaro la variable para almacenar los impuestos
		double impuestos;
		//Declaro la variable para almacenar el salario semanal antes de impuestos (bruto)
		double salarioSemanalBruto;
		//Declaro la variable para almacenar el salario semanal después de impuestos (neto)
		double salarioSemanalNeto;
		//Solicitamos al usuario el nº de horas trabajadas
		System.out.println("Introduce nº de horas trabajadas esta semana");
		//Leemos el nº de horas trabajadas por el usuario
		horasTrabajadas = reader.nextInt();
		//Solicitamos al usuario cuanto cobra por hora
		System.out.println("Introduce cuantos cobras por hora");
		//Leemos lo que cobra por hora del usuario
		precioPorHora = reader.nextDouble();
		// Calculamos el salario semanal bruto
		salarioSemanalBruto = horasTrabajadas * precioPorHora;
		// Calculamos el importe a restar según la condición del sueldo (impuestos)
		impuestos = salarioSemanalBruto < 1000 ? IMPUESTO_MENOR_1000 : IMPUESTO_MAYOR_1000;

		salarioSemanalNeto = salarioSemanalBruto - salarioSemanalBruto*impuestos;
		System.out.println("Tu salario semanal neto es "+salarioSemanalNeto);
		reader.close();

	}

}
