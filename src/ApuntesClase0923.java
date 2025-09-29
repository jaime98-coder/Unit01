

public class ApuntesClase0923 {
public static void main(String[] args) {
	int a = 4;
	int b = 5;
	
	System.out.println(a++); // Mostrará 4, ya que primero imprime,
							//y después suma 1 con el ++
	System.out.println(a); // Mostrará 5
	
	System.out.println(b--); // Mostrará 5, ya que primero imprime,
							//y después resta 1 con el --
	
	System.out.println(b); // Mostrará 4
	
	// Según si pones a++ o ++a ocurrirá la suma antes o despues e igual pasa con la resta
	
	// Apuntes continuados, no es código
	int a = 4;
	int b = 5;
	
	a +=3;	// Aquí sería 4+3= 7. Primero se suma y luego se asignará y a=7
	// igual pasa con -= , *= , o %=
	}
}
