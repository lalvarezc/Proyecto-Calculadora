import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	static Calculadora c = new Calculadora();
	
	public static void main (String[]args){
		
		System.out.println("Ingrese el primer n�mero");
		int primer = sc.nextInt();
		c.setPrimerNum(primer);
		System.out.println("Ingrese la operaci�n (+,-,*,/)");
		String operacion = sc.next();
		c.setOperacion(operacion);
		System.out.println("Ingrese el segundo n�mero");
		int segundo = sc.nextInt();
		c.setSegundoNum(segundo);
		System.out.println("El resultado es: " + c.Resultado());
		
		
	}
	

}
