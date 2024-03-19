package trabajopractico;

import java.util.Scanner;

public class Tp32 {

	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		
		//Instrucciones y almacen 
		System.out.println("Ingrese la nota del examen que debe estar entre 4 y 10 o ser 2.");
		double nota = 0;
		
		while(true) //Esta condicion da TRUE infinitamente. El bluce frenará solo cuando se llegue a un break, en este caso en el IF;
		{
			nota = scanner.nextDouble(); //El usuario asigna la nota
			
			if((nota == 2 ) || (nota >= 4 && nota <= 10)) // nota >= 4 ESTO DESCARTA EL 1 Y EL 3. nota <=10 descarta los +10. -> ELSE.
			{
				
				System.out.println("La nota del examen es " + nota); //Salida asociada al if
				scanner.close(); //Cerramos el scanner para liberar los recursos asociados a la entrada del usuario al ya no necesitarla. Es una buena práctica.
				break; //Salimos del bucle ya que es válida la nota entrada.
			}
			else if (nota == 0) //Descartamos el 0.
			{
				System.out.println("Esta nota es exclusiva para los ausentes. Reingrese una nota correcta.");
			}
			else  //Se repetirá el bucle while para estas ultimas dos sentencias. Solo el break del if parará la instrucción.
			{
				System.out.println("La nota no es válida. Por favor, reingrésela. Debe ser 2 o alguna cifra entre 4 y 10, inclusives.");
			}	
		}
	}
}
