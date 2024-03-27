package trabajopractico;

import java.util.Scanner;

public class TpQuince {
	
	public static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[]args) 
	{
		//Instrucciones y variables que almacenarán la edad y altura indicada por el usuario.
		System.out.println("Ingresa la edad del infante");
		int edad = scanner.nextInt();
		
		System.out.println("Ahora ingresa su altura");
		double altura = scanner.nextDouble();
		
		//Validamos si puede o no acceder a la montaña rusa.
		if(edad > 6 || altura > 1.50 ) 
		{
			System.out.println("Puede acceder");
		}
		else 
		{
			System.out.println("No puede acceder");
		}
	}

}
