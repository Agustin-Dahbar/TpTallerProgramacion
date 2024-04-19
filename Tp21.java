package trabajopractico;

import java.util.Scanner;

public class Tp21 {

	public static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		//Instruccion para que el usuario entre un número.
		System.out.println("Elige un número entre 1 y 7 inclusives");
		int numero = scanner.nextInt();
		
		//Bucle while para que el usuario tenga oportunidad de reingresar el número hasta que sea el indicado.
		while(numero < 1 && numero > 7)
		{
			System.out.println("Reingrese el valor. Tiene que ser entre 1 y 7 como indiqué.");
			numero = scanner.nextInt();
		}
		
		//Variable a la que se le asignará un valor en los cases del switch según el número indicado en la variable de entrada. 
		String diaDeLaSemana = "undefined";
			
			//Sentencia switch, acepta una variable de entrada para asignarle un valor a diaDeLaSemana.
			switch (numero) 
			{
	            case 1:
	                diaDeLaSemana = "domingo";
	                break;
	            case 2:
	                diaDeLaSemana = "lunes";
	                break;
	            case 3:
	                diaDeLaSemana = "martes";
	                break;
	            case 4:
	                diaDeLaSemana = "miércoles";
	                break;
	            case 5:
	                diaDeLaSemana = "jueves";
	                break;
	            case 6:
	                diaDeLaSemana = "viernes";
	                break;
	            case 7:
	                diaDeLaSemana = "sábado";
	                break;
			}
			//Los valores en minúsculas es porque uno de esos 7 se concatenará en la salida final.
			
			//Devolvemos el dia obtenido por la sentencia switch mediante el valor de la variable de entrada.
			System.out.println("El dia de la semana convertido a string es el " + diaDeLaSemana);
	}
}

