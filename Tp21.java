package trabajopractico;

import java.util.Scanner;

public class Tp21 {

	public static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.println("Elige un número entre 1 y 7");
		int numero = scanner.nextInt();
		String diaDeLaSemana = "valor temporal e inútil";
		
		if(numero >= 1 && numero <= 7) 
		{
			switch (numero) {
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
		else 
		{
			System.out.println("Error. Dije entre 1 y 7.");
		}
		
	}
}
