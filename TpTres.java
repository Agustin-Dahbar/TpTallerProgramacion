package trabajopractico;

import java.util.Scanner;

public class TpTres {

	public static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//Instrucciones para el usuario.
		System.out.println("Ingresa un numero entero..");
		
		//Le permitimos al usuario ingresar un número, le asignamos ese valor a la variable declarada.
		int numero = scanner.nextInt(); 
		
		//Variable que almacena el producto. Int ya que es imposible que de con coma.
		int multiplicacionCinco = numero * 5;
		
		//Variable que almacenará la division. Double para que la división pueda dar con coma.
		double divisionDos = numero / 2.0;
		//Además del tipe double, necesitamos que el divisor tenga decimal (.0) para que de con coma.
		
		//Imprimimos el resultado de las operaciones.
		System.out.println("Seleccionaste el numero: " + numero);
		System.out.println("El numero multiplicado por 5: " + multiplicacionCinco);
		System.out.println("El numero dividido por 2: " + divisionDos);
	}
}
