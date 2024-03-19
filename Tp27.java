package trabajopractico;

import java.util.Scanner;

public class Tp27 {
	
	public static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		//Instrucciones y almacen de los datos de entrada.
		System.out.println("Por favor ingresa 5 edades. Empecemos con la primera: ");
		int primerEdad = scanner.nextInt(); //El usuario ingresa una edad y se almacena en la variable.
		verificarEdad(primerEdad); //Verificamos si el numero ingresado por el usuario es mayor a 18 e impar, si lo es se imprime un msj.
		
		System.out.println("Sigamos con la segunda");
		int segundaEdad = scanner.nextInt();
		verificarEdad(segundaEdad);
		
		System.out.println("Tercera por favor..");
		int terceraEdad = scanner.nextInt();
		verificarEdad(terceraEdad);
		
		System.out.println("Ante ultima..");
		int cuartaEdad = scanner.nextInt();
		verificarEdad(cuartaEdad);
		
		System.out.println("Finalicemos con los datos necesarios, dame la ultima edad");
		int quintaEdad = scanner.nextInt();
		verificarEdad(quintaEdad);
		
		//Mediante una operación aritmetica averiguamos el promedio de edades.
		double promedioDeEdades = (primerEdad + segundaEdad + terceraEdad + cuartaEdad + quintaEdad) / 5;
		
		//El programa devuelve la solución: 
		System.out.println("El promedio de edad es de " + promedioDeEdades + " años.");
		
	}

	//Metodo que comprobará si las edades ingresadas son mayores a 18 e impares.
	public static void verificarEdad(int edad) 
	{
		if(edad > 18 && edad % 2 != 0) //si edad mayor 18 y si la division de edad por 2 da un resto diferente a 0.
		{
			System.out.println("Esta edad es mayor de 18 y además es impar."); //Si es TRUE, este metodo devolverá esta linea en la consola.
		}
	}
}
