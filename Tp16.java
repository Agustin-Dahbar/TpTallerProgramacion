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
		
		//Sentencia if para resolver el problema.
		if(cantidadDeAsientos > cantidadDeInscriptos) 
		{
			int asientosSobrantes = cantidadDeAsientos - cantidadDeInscriptos; //Variable privada y temporal, almacenará cuantos asientos sobran.
			System.out.println("Los cantidad de asientos es suficiente para la asistencias recibida. Nos sobran " + asientosSobrantes + ".");
		}
		else 
		{
			int asientosFaltantes = cantidadDeInscriptos - cantidadDeAsientos; //Variable privada y temporal, almacenará cuantos asientos faltan.
			System.out.println("No alcanzan los asientos. Nos faltan " + asientosFaltantes + " más.");
		}
		
	}

}
