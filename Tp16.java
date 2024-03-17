package trabajopractico;

import java.util.Scanner;

public class Tp16 {
	
	public static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[]args) 
	{
		//Instrucciones para que el usuario indique los datos. Los almacenaremos en dos variables.
		System.out.println("Ingrese la cantidad de inscriptos a la conferencia");
		int cantidadDeInscriptos = scanner.nextInt(); 
		
		System.out.println("Ingrese la cantidad de asientos disponibles");
		int cantidadDeAsientos = scanner.nextInt(); 
		
		//Resta que devuelve los inscriptos sin asientos, es decir los asientos que necesitamos.
		int asientosFaltantes = cantidadDeInscriptos - cantidadDeAsientos;
		// Esta variable se usará solo si se ejecuta el else. Si se ejecuta el if, no se usará y su valor será negativo.
		
		//Sentencia if para resolver el problema.
		if(cantidadDeAsientos > cantidadDeInscriptos) 
		{
			System.out.println("Los cantidad de asientos es suficiente para la asistencias recibida.");
		}
		else 
		{
			System.out.println("No alcanzan los asientos. Necesitamos " + asientosFaltantes + " mas");
		}
		
	}

}
