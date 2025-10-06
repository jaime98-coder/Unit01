package pruebaexamen01;

import java.util.Scanner;

public class PruebaExamenCasa02 {

	public static void main(String[] args) {
		// Declaro la variable número de horas trabajadas de tipo entero
		int numHorasTrabajadas;
		// Declaro la variable precioHora en tipo Double ya que va con decimales
		double precioHora;
		// Declaro una constante indicando cual es el salario límite
		final double SALARIO_LIMITE = 1000;
		// Declaro la variable salario bruto (antes de impuestos)
		double salarioBruto;
		// Declaro la variable salario neto (después de impuestos)
		double salarioNeto;
		// Creo el Scanner
		Scanner reader = new Scanner(System.in);
		// Solicito al usuario que introduzca nº horas trabajadas en la semana y leo de
		// la consola el valor introducido
		System.out.println("Introduce nº horas trabajadas en la semana");
		numHorasTrabajadas = reader.nextInt();
		// Solicito al usuario que introduzca precio por hora trabajada y leo de
		// la consola el valor introducido
		System.out.println("Introduce precio por hora trabajada");
		precioHora = reader.nextDouble();
		// Le asigno a salarioBruto lo que va a cobrar el usuario en bruto multiplicando
		// horas trabajadas * precio por hora
		salarioBruto = numHorasTrabajadas * precioHora;
		// Le asigno a salarioNeto un ternario, para si se cumple la condición de cobrar
		// mas de 1000€ aplicarle un 15% de impuestos (0.85), y sino un 10% de impuestos (0.90).
		salarioNeto = (salarioBruto > SALARIO_LIMITE) ? salarioBruto * 0.85 : salarioBruto * 0.90;
		// Imprimo el mensaje final con el salario neto y le concateno el texto
		System.out.println("Vas a cobrar en la semana introducida: " + salarioNeto + "€");
		// Cierro el Scanner
		reader.close();

	}

}
