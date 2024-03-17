package trabajopractico;

import java.util.Scanner; 

public class TpCatorce {
	
	public static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		//Instrucciones. Almacenaremos los valores ingresados por el usuario.
		System.out.println("Por favor ingrese la edad del chico.");
		int edad = scanner.nextInt();
		
		System.out.println("Por favor ingrese la altura del chico");
		double altura = scanner.nextDouble();
		
		//Evaluamos si cumple con las condiciones para ingresar.
		if(edad >= 7 && altura > 1.50 ) 
		{
			System.out.println("Puede acceder");
		}
		else 
		{
			System.out.println("No puede acceder");
		}
		
		
	}

}

