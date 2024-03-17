package trabajopractico;

import java.util.Scanner;

public class TpCinco {
	
	public static final Scanner scanner = new Scanner(System.in);
	
	public static void main (String[] args) 
	{
		//Instruccion para el usuario
		System.out.println("Asignale valores a dos variables tipadas en int (num1 & num 2)");
		
		//Declaración y asignación de variables. (La asignación la realiza el user en la consola).
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		//Impresión de los valores seleccionados por el usuario
		System.out.println("Los valores seleccionados son: " + num1 + " y " + num2);
		
		
		//Variable que almacenará el valor de num1 para no perderlo.
		int almacenDeValorTemporal = num1;
		
		//Le damos el valor de num2 a num1.
		num1 = num2; 
		
		//Le asignamos el valor de num1 (ahora en otra var) a num2.
		num2 = almacenDeValorTemporal;
		
		// Así lo haria en C# [num1, num2] = [num2, num1];
		
		//Mensaje para el usuario
		System.out.println("Inverti los valores de las variables, el actual para num1: " + num1 + " el actual de num2: " + num2);

	}
}
