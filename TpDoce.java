package trabajopractico;

import java.util.Scanner;

public class TpDoce {
	
	//Creamos un scanner para heredar el metodo que le permitirá al usuario ingresar datos.
	public static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		//Instrucciones para el usuario.
		System.out.println("Ingresa dos números. Se te indicara cuál es mayor.");
		
		//Variables que almacenarán los dos numeros brindados por el usuario.
		int primerNumero = scanner.nextInt();
		int segundoNumero = scanner.nextInt();
		
		//Si priNum es mayor a segNum 
		if(primerNumero > segundoNumero) 
		{
			System.out.println(primerNumero + " es el mayor"); //Se ejecuta este bloque de código
		}
		else if(segundoNumero > primerNumero)//Si no, se ejecuta el siguiente..
		{
			System.out.println(segundoNumero + " es el mayor");
		}
		else 
		{
			System.out.println("Son iguales");
		}
		
	}

}
