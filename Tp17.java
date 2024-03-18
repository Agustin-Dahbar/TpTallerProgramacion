package trabajopractico;

import java.util.Scanner;

public class Tp17 {

	public static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		//Instrucciones y variables para almacenar lo ingresado
		System.out.println("Ingresa una edad entre 1 y 120 años");
		int edad = scanner.nextInt();
		
		scanner.nextLine(); //Con esto solucionamos el error de que las sentencias if se ejecutaban luego del scanner.nextInt() sin aun saber el genero por lo que siempre daba else.
		
		System.out.println("Ahora ingresa un genero F para mujer o M para hombre");
		String genero = scanner.nextLine();
		
		//Sentencia if que comprueba si edad esta entre 1 y 120 y si genero es M o F
		if((edad >=1 && edad <=120) && (genero.equals("M") || genero.equals("F")))
		{
			System.out.println("Datos correctos. Entre 1-120 y 'F' o 'M'");
		}
		else {
			System.out.println("Datos != a los pedidos");
		}
		
		
		//Sentencia if para comprobar si la persona según los requisitos de edad de su género se puede jubilar
		if(edad >= 60 && genero.equals("F") || edad >= 65 && genero.equals("M")) 
		{
			System.out.println("Esta en edad de jubilarse.");
		}
		else 
		{
			System.out.println("Aun no puede gozar de jubilacion.");
		}
		
	}
}
