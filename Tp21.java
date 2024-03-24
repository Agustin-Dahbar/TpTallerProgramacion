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
		
		
		//Variable String que el switch le dará el valor correspondiente del día de la semana según el número indicado por el usuario
		String diaDeLaSemana = "valor temporal usado para que la PC no asigne cosas indeseadas a esta variable y genere problemas";
		
		//Sentencia if que analiza si el numero esta entre 1 y 7. Si lo esta ejecuta una sentencia switch que itera por los 7 valores
		//posibles y en cada uno le da el valor correspondiente de dia de la semana, además de imprimirlo.		
			switch (numero) 
			{
	            case 1:
	                diaDeLaSemana = "Domingo";
	                System.out.println("El dia de la semana correspondiente al numero seleccionado es: " + diaDeLaSemana);
	                break;
	            case 2:
	                diaDeLaSemana = "Lunes";
	                System.out.println("El dia de la semana correspondiente al numero seleccionado es: " + diaDeLaSemana);
	                break;
	            case 3:
	                diaDeLaSemana = "Martes";
	                System.out.println("El dia de la semana correspondiente al numero seleccionado es: " + diaDeLaSemana);
	                break;
	            case 4:
	                diaDeLaSemana = "Miércoles";
	                System.out.println("El dia de la semana correspondiente al numero seleccionado es: " + diaDeLaSemana);
	                break;
	            case 5:
	                diaDeLaSemana = "Jueves";
	                System.out.println("El dia de la semana correspondiente al numero seleccionado es: " + diaDeLaSemana);
	                break;
	            case 6:
	                diaDeLaSemana = "Viernes";
	                System.out.println("El dia de la semana correspondiente al numero seleccionado es: " + diaDeLaSemana);
	                break;
	            case 7:
	                diaDeLaSemana = "Sábado";
	                System.out.println("El dia de la semana correspondiente al numero seleccionado es: " + diaDeLaSemana);
	                break;
			}
	}
}

