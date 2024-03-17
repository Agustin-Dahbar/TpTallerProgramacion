package trabajopractico;

import java.util.Scanner;

public class TpOnce {

	//Instancia de clase Scanner que usaremos para heredar el metodo nextInt()
	public static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) 
	{
		//Instrucciones para el usuario.
		System.out.println("Ingrese un numero, se le indicara si es par || impar.");
		
		//Almacenamos el valor ingresado por el usuario
		int numero = scanner.nextInt();
		
		if(numero % 2 == 0) //Si el resto de la división entre el numero y 2 da 0, es par.
		{
			System.out.println("El numero es par");
		}
		else //Si no, es impar.
		{
			System.out.println("El numero es impar");
		}
	}
	
}
