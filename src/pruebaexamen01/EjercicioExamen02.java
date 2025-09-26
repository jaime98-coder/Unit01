package pruebaexamen01;

import java.util.Scanner;

public class EjercicioExamen02 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int horasTrabajadas;
		double precioPorHora;
		double impuestos;
		double salarioSemanalBruto;
		double salarioSemanalNeto;
		System.out.println("Introduce nº de horas trabajadas");
		horasTrabajadas = reader.nextInt();
		System.out.println("Introduce cuantos cobras por hora");
		precioPorHora = reader.nextDouble();
		salarioSemanalBruto = horasTrabajadas * precioPorHora;
		impuestos = salarioSemanalBruto < 1000 ? salarioSemanalBruto*0.1 : salarioSemanalBruto*0.15;

		salarioSemanalNeto = salarioSemanalBruto - impuestos;
		System.out.println("Tu salario semanal neto es "+salarioSemanalNeto);
		reader.close();

	}

}
