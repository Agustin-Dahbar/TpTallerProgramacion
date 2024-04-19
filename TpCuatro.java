package trabajopractico;

import java.util.Scanner;

public class TpCuatro {
		
	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa el pago por hora y las horas trabajadas por un empleado. Te devolveré la ganancia semanal.");
		//Declaramos 2 variables que contendrán los datos de entrada con los que operar.
		int sueldoPorHora = scanner.nextInt();
		int horasDiariasTrabajadas = scanner.nextInt();
	
		//Realizamos la multiplicación correspondiente para obtener el resultado deseado. 
		double salarioSemanal = sueldoPorHora * horasDiariasTrabajadas * 5.5; //5.5 simula ser los 6 dias de trabajo, pero usamos medio para representar al último y
		
		//Imprimimos el resultado final.
		System.out.println("El salario semanal es: $" + salarioSemanal);
		
		scanner.close();
	}
}
