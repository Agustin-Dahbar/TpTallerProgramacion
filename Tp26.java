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
		int numero = scanner.nextInt();

		//Se hará sin lista, solo con variables. Tengo otra version con un ArrayList.
		int cuentaDeMultiplos= 1; 
		int iteracionActual = numero++;
		int primerMultiplo = 0;
		int segundoMultiplo = 0;
		int tercerMultiplo = 0;
		
		//el bucle se ejecutará 3 veces. para los valores de 1 2 3 en cuentaDeMultiplos.
		while(cuentaDeMultiplos <= 3) 
		{
			//Dentro del bucle creamos un if externo que verifica si el número iterado es múltiplo de 3 y no lo es de 5.
			if(iteracionActual % 3 == 0 && iteracionActual % 5 != 0) 
			{
				//Dentro del if externo creamos un if interno que identificará si es el primer, segundo o tercer múltiplo encontrado, para saber en que variable almacenarlo.
				if(cuentaDeMultiplos == 1)  
				{
					primerMultiplo = iteracionActual;
				}
				else if(cuentaDeMultiplos == 2)
				{
					segundoMultiplo = iteracionActual;
				}
				else 
				{
					tercerMultiplo = iteracionActual;
				}
				cuentaDeMultiplos++; //Ya que entramos en el if externo significa que encontramos multiplo asi que aumentamos su valor
			}
			
			iteracionActual++; //Con esta línea de código dentro del while aseguramos que en la siguiente iteracion del bucle se itere al siguiente numero y no al mismo 
			
		}
		
	
		System.out.println("Los siguientes tres múltiplos de 3 pero no de 5 son " + primerMultiplo + ", " + segundoMultiplo + " y " + tercerMultiplo);
		
		//26 es un gran ejemplo para verificar el funcionamiento del programa. Su siguiente numero es múltiplo de 3. 
		// el próximo múltiplo de 3 lo es de 5 también por lo que se lo debe ignorar, y termina de llenar la lista con el 33 y 36.
		//La devolución de los 3 numeros se realiza entre [] ya que declaramos 
	}

}
