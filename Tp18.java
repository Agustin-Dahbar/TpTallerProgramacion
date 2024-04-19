package trabajopractico;

import java.util.Scanner;

public class Tp18 {

	public static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		//Instrucciones y variables que almacenarán los datos
		System.out.println("Por favor ingresa dos numeros enteros");
		int numeroUno = scanner.nextInt();
		int numeroDos = scanner.nextInt();
		
		//Variables que almacenarán cuál es el número mayor y cual el menor.
		int numeroMayor = 0;
		int numeroMenor = 0;
				
		
		//Bucle para que el usuario reingrese el segundo número en caso sean iguales.
		while(numeroUno == numeroDos) 
		{
			System.out.println("Los números son iguales. Debe ser uno mayor a otro. Vuelve a ingresarlos.");
			numeroDos = scanner.nextInt();
		}
		
		//Sentencia IF-ELSE que le da a la variable que esperamos que tenga el número mayor dicho número en caso de que el usuario lo haya agregado en la otra. Ahora tendrán el == valor.
		if(numeroUno > numeroDos) 
		{
			numeroMayor = numeroUno;
			numeroMenor = numeroDos;
		}
		else //Ya que con el while descartamos el caso de igualdad entre los números podemos usar else. Si no, deberíamos usar else if ya que habría dos opciones.
		{
			numeroMayor = numeroDos;
			numeroMenor = numeroUno;
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
