package trabajopractico;

import java.util.Scanner;

public class Tp24 {
	
	public static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) 
	{	
		//Numeros para el primer bucle.
		
		System.out.println("Ingresa dos numeros.. El primero debe ser menor o igual al segundo que ingreses.");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();

		scanner.nextLine(); //Este nextLine() es necesario para que funcione el de la línea 40. 
			//Por lo que le entendí a gpt, tiene que ver con que al dar enter (por el anterior next() se crea un caracter de nueva línea
			//Y este nextLine() lo almacena. En la línea de codigo 40 no es necesario repetir esto ya que no no hay un next..() 
			// anterior que haya provocado un reciente enter que genere un caracter de nueva línea que deba ser almacenado.
				
		//Sentencias if-else que comprueban que num1 sea menor o igual a num2.
		while(num1 > num2) { //Si num1 es mayor se repetirá el bucle..
			System.out.println("El primer numero debe ser menor o igual al segundo. Ingresa un nuevo valor para ambos números...");
			num1 = scanner.nextInt();
			num2 = scanner.nextInt();
		}
		
		//Los números han sido ingresados correctamente a partir de aquí.
		//Almacenamos sus valores en backups antes de que en el primer bucle se  los cambie .
		int num1BucleDos = num1;
		int num2BucleDos = num2;

			System.out.println("Seleccionaste los numeros: " + num1 + " y " + num2);
			System.out.println("");
			System.out.println("La lista de los numeros seleccionados y sus numeros de en medio es: "); //Realizamos la primer lista en el else

		for(;num1 <= num2; num1++) //Inciamos el bucle desde num1 para incluirlo y lo terminamos con el num2 gracias al = de la condición. el valor de num1 aumentará en cada iteración.
		{
			System.out.println(num1);
		}
			
		System.out.println("Enter cuando quieras ver la segunda lista sin incluir a los numeros que brindaste"); //Movemos esto aquí para que no aparezca al ejecutarse el if
				
		//Pasamos con el segundo ciclo. El inverso.
		
		scanner.nextLine(); //Para que no se muestren a la vez ambas listas y el usuario vaya a su tiempo con el programa.
		
		//Bucle for que iterará entre num1 y num2 para imprimir el valor de cada iteración.
		System.out.println("Los numeros que se encuentran entre los mencionados son: ");
		for(num1BucleDos += 1; num1BucleDos < num2BucleDos; num1BucleDos++) //Iniciamos el numero con un valor más, la condición es mayor sin el igual asi no incluimos al segundo.
		{
			System.out.println(num1BucleDos);
		}
		//Explicación bucle:
			//Inicialización: indicamos un valor más que num1, ya que esta es la devolución donde no se incluyen. Debe empezar por el siguiente.
			//Condicion: Si num2 es mayor a num1, aún estamos entre numeros del medio, ya que si num1 ya tendría el valor de num2, se hubiera acabado el bucle.
			//Ejecución de la iteración: en este caso el suceso será el aumento en un valor de num1. Ya que queremos ir de uno en uno.

	}
	

}
