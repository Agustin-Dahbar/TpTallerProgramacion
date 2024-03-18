package trabajopractico;

import java.util.Scanner;

public class Tp24 {
	
	public static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		//Instrucciones para el usuario.
		System.out.println("Ingresa dos numeros.. El primero debe ser menor o igual al segundo que ingreses.");
		
		//Numeros para el primer bucle.
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		scanner.nextLine(); //Este nextLine() es necesario para que funcione el de la línea 40. 
			//Por lo que le entendí a gpt, tiene que ver con que al dar enter (por el anterior next() se crea un caracter de nueva línea
			//Y este nextLine() lo almacena. En la línea de codigo 40 no es necesario repetir esto ya que no no hay un next..() 
			// anterior que haya provocado un reciente enter que genere un caracter de nueva línea que deba ser almacenado.
		
		//Numeros para el segundo bucle. Los almacenamos en un backup almacenamos antes de que en el primer bucle se cambie su valor.
		int num1BucleDos = num1;
		int num2BucleDos = num2;
		
		
		//Sentencias if-else que comprueban que num1 sea menor o igual a num2.
		if(num1 > num2) { //Si num1 es mayor se tirá el error.
			System.out.println("Lo siento.. Como dije, el primer numero debe ser menor o igual al segundo.");
		}
		else //Si es == o menor se indican los numeros seleccionados.
		{
			System.out.println("Seleccionaste los numeros: " + num1 + " y " + num2);
			
			System.out.println("La lista de los numeros seleccionados y sus numeros de en medio es: "); //Realizamos la primer lista en el else
			
			for(;num1 <= num2; num1++) //Eliminamos la asignación ya que usamos variables existentes en la condición y ejecución.
			{
				System.out.println(num1);
			}
		}
		
		System.out.println("Enter cuando quieras ver la segunda lista sin incluir a los numeros que brindaste");
		scanner.nextLine(); //Para que no se muestren a la vez ambas listas y el usuario vaya a su tiempo con el programa.
		
		
		
		
		//Bucle for que iterará entre num1 y num2 para imprimir el valor de cada iteración.
		System.out.println("Los numeros que se encuentran entre los mencionados son: ");
		
		for(num1BucleDos += 1; num1BucleDos < num2BucleDos; num1BucleDos++) 
		{
			System.out.println(num1BucleDos);
		}
		//Explicación bucle:
			//Inicialización: indicamos un valor más que num1, ya que esta es la devolución donde no se incluyen. Debe empezar por el siguiente.
			//Condicion: Si num2 es mayor a num1, aún estamos entre numeros del medio, ya que si num1 ya tendría el valor de num2, se hubiera acabado el bucle.
			//Ejecución de la iteración: en este caso el suceso será el aumento en un valor de num1. Ya que queremos ir de uno en uno.

	}
	

}
