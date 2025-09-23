package unit01;
// Importo el Scanner
import java.util.Scanner;
public class Exercise05 {
/*
* Diseñar una aplicación que calcule la longitud y el área de
* una circunferencia. Para ello, el usuario debe introducir
* el radio, que puede contener decimales. Usa Math.PI para
* tomar el valor de PI. (longitud = 2πr, área=πr^2)
*/
	public static void main(String[] args) {
		// Creo el Scanner
		Scanner reader = new Scanner(System.in);
		// Declaro variables
		// La longitud de la circunferencia
		double longitudCircunferencia;
		// El área de la circunferencia
		double areaCircunferencia;
		// El radio de la circunferencia
		double radio;
		// Solicito al usuario que introduzca el radio
		System.out.println("Introduce el radio de la circunferencia");
		// Leo de la consola el radio introducido
		radio=reader.nextDouble();	// En este paso el usuario introduce el radio
		// Calculo la longitud de la circunferencia
		longitudCircunferencia = 2 * Math.PI * radio;
		
		// Calculo el área de la circunferencia
		areaCircunferencia = Math.PI * radio * radio;
		// El área puedo hacerlo tambien: areaCircunferencia = Math.PI * Math.pow(radio, 2);
		//En la base pongo radio, y el exponente sería 2 en este caso
		
		// Imprimo los 2 mensajes finales donde se muestra la longitud y el área de la circunferencia.
		System.out.println("La longitud de la circunferencia es: "+longitudCircunferencia);
		System.out.println("El área de la circunferencia es: "+areaCircunferencia);
		// Cierro el scanner
		reader.close();
	}
}
