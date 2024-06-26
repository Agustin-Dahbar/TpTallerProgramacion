package trabajopractico;

import java.util.Scanner;

public class Tp29 {
	
	
	
	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		
		//Instrucciones y almacen 
		System.out.println("Ingrese la nota del examen debe estar entre 0 y 10.");
		double nota = scanner.nextDouble();
		
		//While que se ejecutará cuando la nota no este entre 0 y 10 inclusives. (Menor 0, mayor 10).
		while(nota < 0 || nota > 10) 
		{
			System.out.println("La nota no es válida. Por favor, reingrésela.");
			nota = scanner.nextDouble(); //El usuario asigna la nota
		}
		
		//Instruccion final
		System.out.println("La nota del examen es " + nota);
		
		//Cerramos el scanner para liberar los recursos asociados a la entrada del usuario al ya no necesitarla. Es una buena práctica.
		scanner.close();
	}

}
