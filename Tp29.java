package trabajopractico;

import java.util.Scanner;

public class Tp29 {
	
	
	
	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		
		//Instrucciones y almacen 
		System.out.println("Ingrese la nota del examen debe estar entre 0 y 10.");
		double nota = 0;
		
		while(true) //Esta condicion da TRUE infinitamente. El bluce frenará solo cuando se llegue a un break;
		{
			nota = scanner.nextDouble(); //El usuario asigna la nota
			if(nota >= 0 && nota <= 10) //Si esta entre 0 y 10
			{
				break; //Salimos del bucle ya que es válida
			}
			else  //Si no le indicamos que la reingrese y comienza de nuevo el while que se volverá a ejecutar hasta que se cumpla IF.
			{
				System.out.println("La nota no es válida. Por favor, reingrésela.");
			}	
		}
		
		//Instruccion final
		System.out.println("La nota del examen es " + nota);
		
		//Cerramos el scanner para liberar espacio.
		scanner.close();
	}

}
