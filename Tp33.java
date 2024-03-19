package trabajopractico;

import java.util.Scanner;

public class Tp33 {

	public static void main(String[] args)
	{
		System.out.println("Ingresarás los numeros que desees, cuando quieras finalizar ingresa 0. Te diré el número más grande de los ingresados. ");
		
		Scanner scanner = new Scanner(System.in);
		int numeroMasGrande = Integer.MIN_VALUE;
		int numeroIngresado = 0;
				
		//Bucle do while, le pedirá al usuario que ingrese numero hasta que sea 0.
		do {
			numeroIngresado = scanner.nextInt();
			if(numeroIngresado > numeroMasGrande) 
			{
				numeroMasGrande = numeroIngresado;
			}
		}
		while(numeroIngresado != 0);
		
		
		System.out.println("El numero más grande ingresado fue el " + numeroMasGrande);
	}
	
}
	
	




