package trabajopractico;

import java.util.Scanner;

public class TpCinco {
	
	public static final Scanner scanner = new Scanner(System.in);
	
	public static void main (String[] args) 
	{
		//Instruccion para el usuario y variables que almacenarán los valores entrados por el usuario.
		System.out.println("Asigna 2 valores a 2 variables");
		int num1 = scanner.nextInt(); 
		int num2 = scanner.nextInt();
		
		//Impresión de los valores seleccionados por el usuario
		System.out.println("Los valores seleccionados son: " + num1 + " y " + num2);
		
		//Variable que almacenará el valor de num1 para no perderlo.
		int backupDelValor= num1;
		
		//Le damos el valor de num2 a num1.
		num1 = num2; 
		
		//Le asignamos el valor de num1 (ahora en otra variable) a num2.
		num2 = backupDelValor; 
		
		// En javascript: [num1, num2] = [num2, num1];
		
		//Mensaje para el usuario
		System.out.println("Inverti los valores de las variables, el actual para el primer numero es " + num1 + " y el valor actual de num2 es " + num2);

	}
}
