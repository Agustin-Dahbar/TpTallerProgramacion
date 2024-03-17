package trabajopractico;

import java.util.Scanner;

public class TpDos {

	//Creamos un scanner para dejarle escribir al usuario en el futuro
	public static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) 
	{	
		//Instrucción para el usuario
		System.out.println("Ingresa tus tres notas a continuación.. ");
		
		// Declaramos y asignamos el valor de las variables con los valores ingresados por el user.
		int notaUno = scanner.nextInt();
		int notaDos = scanner.nextInt();
		int notaTres = scanner.nextInt();
		
		//Nueva variable que almacenará el promedio de las 3 variables anteriores.
		double promedioFinal = (notaUno + notaDos + notaTres) / 3;
		
		//Imprimimos el promedio del alumno.
		System.out.println("El promedio de tus 3 notas es " + promedioFinal);
	}
	
}
