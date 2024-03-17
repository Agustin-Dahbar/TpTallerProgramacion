package trabajopractico;


public class TpCuatro {
		
	
	public static void main(String[] args) 
	{
		//Declaramos las 3 variables que contendrán los datos con los que operar.
		int sueldoPorHora = 10;
		int horasPorDia = 8;
		double diasTrabajados = 5.5;
		
		//Realizamos la multiplicación correspondiente para obtener el resultado deseado.
		double salarioSemanal = sueldoPorHora * horasPorDia * diasTrabajados;
		
		//Imprimimos el resultado final.
		System.out.println("El salario semanal es: $" + salarioSemanal);
	}
}
