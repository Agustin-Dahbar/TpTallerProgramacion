package trabajopractico;

import java.util.Scanner;

public class Tp18 {

	public static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		//Instrucciones y variables que almacenarán los datos
		System.out.println("Por favor ingresa dos numeros enteros");
		int numUno = scanner.nextInt();
		int numDos = scanner.nextInt();
		
		//Declaramos las dos variables que almacenaran los valores de los numeros pero nos indicaran cual es el mayor y el menor.
		int numeroMayor = 0;
		int numeroMenor = 0;
		
		
		
		//Sentencia que almacena al numero mayor en una variable. Ya con estos datos podemos resolver el problema.
		if(numUno > numDos) 
		{
			numeroMayor = numUno;
			numeroMenor = numDos;
		}
		else if(numDos > numUno) 
		{
			numeroMayor = numDos;
			numeroMenor = numUno;
		}
		
		
		
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
