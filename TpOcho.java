package trabajopractico;

import java.util.Scanner;

public class TpOcho {
	
	public static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		//Instrucción para usuario
		System.out.println("Ingresa dos numeros. Se realizarán las 4 operaciones aritméticas entre ellos.");
		
		//Declaración de variables e inicialización con los valores que ingresen los usuarios.
		int numeroUno = scanner.nextInt();
		int numeroDos = scanner.nextInt();
		
		//Lógica para llevar a cabo las 4 operaciones aritméticas.
		int producto = numeroUno * numeroDos; 
		double division = numeroUno / numeroDos;
		int suma = numeroUno + numeroDos;
		int resta = numeroUno - numeroDos;
		
		//Devolución de resultados.
		System.out.println("El producto entre ambos numeros es: " + producto);
		System.out.println("El cociente entre ambos numeros es: " + division);
		System.out.println("La suma entre ambos numeros es: " + suma);
		System.out.println("La resta entre ambos numeros es: " + resta);
	}

}
