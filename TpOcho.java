package trabajopractico;

import java.util.Scanner;

public class TpOcho {
	
	public static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		//Instrucción para usuario
		System.out.println("Ingresa dos numeros. Se realizarán las 4 operaciones aritmeticas entre ellos.");
		
		//Declaración de variables e inicialización con los valores que ingresen los usuarios.
		int numeroNaturalUno = scanner.nextInt();
		int numeroNaturalDos = scanner.nextInt();
		
		//Lógica para llevar a cabo las 4 operaciones aritmeticas.
		int producto = numeroNaturalUno * numeroNaturalDos; 
		double division = numeroNaturalUno / numeroNaturalDos;
		int suma = numeroNaturalUno + numeroNaturalDos;
		int resta = numeroNaturalUno - numeroNaturalDos;
		
		//Devolución de resultados.
		System.out.println("El producto entre ambos numeros es: " + producto);
		System.out.println("La division entre ambos numeros es: " + division);
		System.out.println("La suma entre ambos numeros es: " + suma);
		System.out.println("La resta entre ambos numeros es: " + resta);
		
	}

}
