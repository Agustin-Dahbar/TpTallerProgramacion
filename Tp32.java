package trabajopractico;

import java.util.Scanner;

public class Tp32 {

	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		
		//Instrucciones y almacen 
		System.out.println("Ingrese la nota del examen que debe estar entre 4 y 10 inclusives o ser 2.");
		double nota = scanner.nextDouble(); //El usuario asigna la nota.
		
		while(!(nota == 2 || (nota >= 4 && nota <= 10))) //Indicamos dos condiciones que indican las notas correctas. Anidamos estas condiciones con un (!) que indicará que se dará el TRUE SI NO SE CUMPLEN DICHAS CONDICIONES INDICADAS (la entrada de las notas correctas). Entonces se repetirá el bucle hasta que se indique alguna de las notas indicadas en la condicional.
		{												
			System.out.println("Dije que debe estar entre 4 y 10 inclusives o ser 2. Ingresa una nota correcta");
			nota = scanner.nextDouble();
		}
		
		System.out.println("La nota del examen es " + nota); //Salida asociada al if
		scanner.close(); //Cerramos el scanner para liberar los recursos asociados a la entrada del usuario al ya no necesitarla. Es una buena práctica.
		
		
	}
}
