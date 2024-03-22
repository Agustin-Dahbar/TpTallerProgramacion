package trabajopractico;

import java.util.Scanner;

public class Tp18 {

	public static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		//Instrucciones y variables que almacenarán los datos
		System.out.println("Por favor ingresa dos numeros enteros");
		int numeroMayor = scanner.nextInt();
		int numeroMenor = scanner.nextInt();
		
		//Sentencia IF que le da a la variable que esperamos que tenga el número mayor dicho número en caso de que el usuario lo haya agregado en la otra. Ahora tendrán el == valor.
		if(numeroMenor > numeroMayor) 
		{
			numeroMayor = numeroMenor;
		}
		
		System.out.println("El número mayor es " + numeroMayor); //Imprimimos el número más grande ingresado por el usuario.
		
		//Sentencia IF para resolver el problema. Dirá si el mayor es divisible por el menor
		if(numeroMayor % numeroMenor == 0) //Si el resto de la division da 0..
		{
			System.out.println("El numero mayor ES divisible por el menor.");
		}
		else 
		{
			System.out.println("El numero mayor NO es divisible por el menor.");
		}
		
	}
	
}
