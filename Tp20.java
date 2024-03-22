package trabajopractico;

import java.util.Scanner;

public class Tp20 {

	public static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		//Tipado char. Almacena un único caracter.
		System.out.println("Por favor..Ingresa la operacion a realizar.");
		char operacion = scanner.next().charAt(0);
		
		while(operacion != '+' && operacion != '-' && operacion != '/' && operacion != '*') 
		{
			System.out.println("Por favor ingresa un caracter correcto. ");
			operacion = scanner.next().charAt(0);
		}
		
		//Declaramos dos grupos de variables para almacenar los numeros. ya que las division dan con coma, debemos usar double en ellas.
		double numUnoCaseDivision = 0;
		double numDosCaseDivision = 0;
		int numUno = 0; 
		int numDos = 0;
		
		//Instruccion y almacen de datos
		System.out.println("Ahora ingresar los dos numeros enteros que se operarán en ella..");
		
		//Si la operacion es division, los numeros que ingrese se almacenarán en las variables double's.
		if(operacion == '/') 
		{
			numUnoCaseDivision = scanner.nextDouble();
			numDosCaseDivision = scanner.nextDouble();
		}
		else  //Si es != a / se almacenarán en las int's.
		{
			numUno = scanner.nextInt();
			numDos = scanner.nextInt();
		}
		
	
		//Lógica de sentencias condicionales con las que realizaremos la operacion seleccionada por el usuario.
		int resultado = 0;
		double resultadoDivision = 0;
		
		if (operacion == '+') //Suma
		{
			resultado = numUno + numDos;
			System.out.println("El resultado de la operación seleccionada entre ambos números es: " + resultado);
		}
		else if(operacion == '-') //Resta
		{
			resultado = numUno - numDos;
			System.out.println("El resultado de la operación seleccionada entre ambos números es: " + resultado);
		}
		else if(operacion == '/') //Division
		{ 
			if(numUnoCaseDivision != 0 && numDosCaseDivision != 0) //Si ninguno de los numeros son 0, se realiza la división correctamente.
			{
				resultadoDivision = numUnoCaseDivision / numDosCaseDivision;
				System.out.println("El resultado de la operación seleccionada entre ambos números es: " + resultadoDivision);
			}
			else //Si son 0 no se realiza.
			{
				System.out.println("No se puede dividir por 0.");
				//Este else fue creado para sustituir la respuesta de error que generaba dividir por 0 teniendo la misma logica que el resto de condiciones.
			}
		}
		else //Multiplicación
		{
			resultado = numUno * numDos;
			System.out.println("El resultado de la operación seleccionada entre ambos números es: " + resultado);
		}
		
	}
}
