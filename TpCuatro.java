package trabajopractico;

import java.util.Scanner;

public class TpCuatro {
		
	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa cuantas horas trabaja y cuanto gana por cada una de ellas. Te calcularé la ganancia semanal.");
		//Declaramos 2 variables que contendrán los datos de entrada con los que operar.
		int sueldoPorHora = scanner.nextInt();
		int horasPorDia = scanner.nextInt();
	
		//Realizamos la multiplicación correspondiente para obtener el resultado deseado.
		double salarioSemanal = sueldoPorHora * horasPorDia * 5.5; //5.5 simula ser los 6 dias de trabajo, pero usamos medio para representar al último y
		
		//Imprimimos el resultado final.
		System.out.println("El salario semanal es: $" + salarioSemanal);
	}
}
