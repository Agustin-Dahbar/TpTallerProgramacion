package trabajopractico;

import java.util.Scanner;

public class Tp22 {

	public static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		//Bucle do.. while (único bucle que garantiza una ejecución si o si, ya que la tarea esta declarada antes de la condición, y 
		//el programa se lee de abajo hacia arriba.
		int numero = 1;
		
		do { 
            System.out.println("El valor del numero es: " + numero);
            numero++;
        	} 
		while (numero < 5); 
		
		//print que use temporalmente para mayor facilidad al construir el programa.
		System.out.println("Valor actual de numero: " + numero);
		
		System.out.println("Finalizó la primer vuelta realizada por el do..while"); //Mensaje para el usuario
		
		//Bucle for para variar, realizará el el sentido opuesto
		for(int i = 0; i <= 4 ; i++)
		{
			System.out.println("El valor del numero es: " + numero );
			numero--; //Obligatorio que sea luego del print asi se repite el 5 y lo toma como primer caracter de la cuenta inversa.
			//Si estuviese antes del print el primer numero inverso seria el 4, ya que ya se habría realizado la extracción del valor.
		}
		
		System.out.println("Finalizó la vuelta inversa de los === numeros realizada por el FOR"); //Mensaje para el usuario
        
	}
}
