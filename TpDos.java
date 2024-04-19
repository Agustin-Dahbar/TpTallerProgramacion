package trabajopractico;

import java.util.Scanner;

public class TpDos {

	//Creamos un scanner para que el usuario ingrese las notas mediante un metodo heredado de la clase.
	public static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) 
	{	
		//Instrucción para el usuario
		System.out.println("Ingresa tus tres notas a continuación.. ");
		
		// Declaramos y asignamos el valor de las variables con los valores ingresados por el user.
		double notaUno = scanner.nextDouble();
		double notaDos = scanner.nextDouble();
		double notaTres = scanner.nextDouble();
		
		//Nueva variable que almacenará el promedio de las 3 variables anteriores.
		double promedioFinal = (notaUno + notaDos + notaTres) / 3;
		
		//Imprimimos el promedio del alumno.
		System.out.println("El promedio de tus 3 notas es " + promedioFinal);
	}
	
}
