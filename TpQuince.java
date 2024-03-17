package trabajopractico;

import java.util.Scanner;

public class TpQuince {
	
	public static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[]args) 
	{
		System.out.println("Ingresa la edad y altura del infante");
		
		//Variables que almacenarán la edad y altura indicada por el usuario.
		int edad = scanner.nextInt();
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
