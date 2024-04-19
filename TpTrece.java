package trabajopractico;

import java.util.Scanner;

public class TpTrece 
{
	//Scanner usado para heredar el metodo nextInt().
	public static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		//Instrucciones
		System.out.println("Ingresa 3 numeros. Se te dira cual es el mayor.");
		
		//Variables que almacenarán los valores ingresados por el usuario 
		int primerNumero = scanner.nextInt();
		int segundoNumero = scanner.nextInt();
		int tercerNumero = scanner.nextInt();

		//Sentencias if- else if- else donde se evaluarán mediante operador AND 
		//dos condiciones en la misma linea de codigo. 
		if(primerNumero > segundoNumero && primerNumero > tercerNumero) //Si primerNumero es el mayor
		{
			System.out.println("El numero mas grande es " + primerNumero);
		}
		else if(segundoNumero > primerNumero && segundoNumero > tercerNumero) //Si segundo numero es el mayor
		{
			System.out.println("El numero mas grande es " + segundoNumero);
		}
		else  //Si tercerNumero es el mayor
		{
			System.out.println("El numero mayor es " + tercerNumero);
		}
		
	}
	
}
