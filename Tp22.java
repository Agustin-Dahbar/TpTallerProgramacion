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
		while (numero <= 5); 
		//Debido a que se ejecuta nuevamente al valer 5 y el bucle tiene un ++ al final. El valor al salir del bucle será de 6. Por lo que habrá que realizar la resta antes de la primer impresión del bucle inverso.
		
		System.out.println("Finalizó la primer vuelta realizada por el do..while"); //Mensaje para el usuario
		
		//Bucle for para variar, realizará el el sentido opuesto
		for(int i = 0; i < 5 ; i++)
		{
			numero--; //En la línea 20 se explica porque antes del println.
			System.out.println("El valor del numero es: " + numero );
			
		}
		
		System.out.println("Finalizó la vuelta inversa de los === numeros realizada por el FOR"); //Mensaje para el usuario
        
	}
}
