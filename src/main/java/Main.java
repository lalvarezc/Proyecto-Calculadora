import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	static Calculadora c = new Calculadora();
	
	public static void main (String[]args){
		
		System.out.println("Ingrese el primer número");
		int primer = sc.nextInt();
		c.setPrimerNum(primer);
		System.out.println("Ingrese la operación (+,-,*,/)");
		String operacion = sc.next();
		c.setOperacion(operacion);
		System.out.println("Ingrese el segundo número");
		int segundo = sc.nextInt();
		c.setSegundoNum(segundo);
		System.out.println("El resultado es: " + c.Resultado());
		
		
	}
	

}
