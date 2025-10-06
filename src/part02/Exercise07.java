package part02;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		/*
		 * Una empresa que gestiona un parque acuático te solicita una aplicación que
		 * les ayude a calcular el importe que hay que cobrar en la taquilla por la
		 * compra de una serie de entradas (cuyo número será introducido por el
		 * usuario). Existen dos tipos de entradas: infantiles, que cuestan 15,50€; y de
		 * adultos, que cuestan 20€. En el caso de que el importe total sea igual o
		 * superior a 100€, se aplicará automáticamente un bono descuento del 5%.
		 * 
		 * 
		 */
		// Declaro las variables num Entradas y las constantes con el precio de cada tipo de entrada
		int numEntradasInfantil;
		int numEntradasAdulto;
		final double ENTRADA_INFANTIL = 15.50;
		final double ENTRADA_ADULTO = 20;
		final double LIMITE = 100;
		// Ceclaro la variable con el descuento del 5% si llega a >= 100€
		final double DESCUENTO = 0.05;
		// Declaro los importes totales antes y después del descuento del 5%
		double importeTotal;
		double importeAPagar;
		// Creo el Scanner
		Scanner reader = new Scanner(System.in);
		// Solicito al usuario el nº de entradas infantiles y leo de la consola el valor introducido
		System.out.println("Introduce el número de entradas infantiles que vas a comprar");
		numEntradasInfantil = reader.nextInt();
		// Solicito al usuario el nº de entradas para adultos y leo de la consola el valor introducido
		System.out.println("Introduce el número de entradas para adultos que vas a comprar");
		numEntradasAdulto = reader.nextInt();
		// Calculo el importe total sin descuentos
		importeTotal = (numEntradasInfantil*ENTRADA_INFANTIL)+(numEntradasAdulto*ENTRADA_ADULTO);
		// Calculo el importe total con el descuento del 5% en caso de que se cumpla la ternaria
		importeAPagar= importeTotal >= LIMITE ? importeTotal-(importeTotal*DESCUENTO) : importeTotal;
		// Imprimo el mensaje final indiciando importe con descuento y sin descuento
		System.out.println("Importe total sin descuento: "+importeTotal+" euros\n"+"Importe total con descuento: "+importeAPagar+" euros");
		// Cierro el Scanner
		reader.close();
	}

}
