package trabajopractico;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Tp26 {
	
	public static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		//Instrucciones
		System.out.println("Ingresa un numero natural");
		int num1 = scanner.nextInt();
		
		List<Integer> multiplosTresNoCinco = new ArrayList<>(); //Lista de int's que almacenará los 3 resultados.
		
		int numerosIterados = num1++; //Declaramos el numero desde el que se empezará a iterar (el siguiente al indicado por el user).
		
		do {
			if(numerosIterados % 3 == 0 && numerosIterados % 5 != 0) //Si el resto de la division por 3 es 0 y de la div por 5 es diferente a 0, significa que es multiplo de 3 y no de 5. Entonces se añade a la lista.
			{
				multiplosTresNoCinco.add(numerosIterados);
			}
			numerosIterados++;			
		}
		while(multiplosTresNoCinco.size() < 3 ); //Una vez el tamaño de la lista sea igual o mayor a 3 se cancelará el bucle.
		
	
		System.out.println("Los primeros numeros multiplos de 3 y no de 5 a partir del ingresado son: " + multiplosTresNoCinco);
		//26 es un gran ejemplo para verificar el funcionamiento del programa. Su siguiente numero es múltiplo de 3. 
		// el próximo múltiplo de 3 lo es de 5 también por lo que se lo debe ignorar, y termina de llenar la lista con el 33 y 36.
		//La devolución de los 3 numeros se realiza entre [] ya que declaramos 
	}

}
