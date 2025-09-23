package unit01;
import java.util.Scanner;
public class Exercise06 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		double num1;
		double num2;
		double suma;
		double resta;
		double multiplicacion;
		double division;
		System.out.println("Introduzca número 1");
		num1 = reader.nextDouble();
		System.out.println("Introduzca número 2");
		num2 = reader.nextDouble();
		suma = num1+num2;
		resta = num1-num2;
		multiplicacion = num1*num2;
		division = num1/num2; //Duda de si poner Math.round(num1/num2); para que redondee
		System.out.println("El resultado de la suma es: "+suma);
		System.out.println("El resultado de la resta es: "+resta);
		System.out.println("El resultado de la multipicación es: "+multiplicacion);
		System.out.println("El resultado de la división es: "+division);
		
		reader.close();
	}
}
