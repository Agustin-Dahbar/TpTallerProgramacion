package trabajopractico;

import java.util.Scanner;

public class TpNueve {
	
	public static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		//Instrucciones
		System.out.println("Por favor ingresa el valor en grados de 2 angulos interiores de un triangulo. El programa devolvera el restante");
		
		//Variables que almacenarán los dos grados dados por el usuario.
		int anguloUno = scanner.nextInt();
		int anguloDos = scanner.nextInt();
		//Variable que almacenará el valor del angulo restante.
		int gradosRestantes = 180 - anguloUno - anguloDos;
		
		//Devolución del último angulo.
		System.out.println("El valor del ultimo angulo es: " + gradosRestantes);
	} 

}