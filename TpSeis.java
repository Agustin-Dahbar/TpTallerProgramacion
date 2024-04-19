package trabajopractico;

import java.util.Scanner;

public class TpSeis {

	public static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) 
	{	
		int sueldoVendedor = 44000; //Sueldo fijo del vendedor
		
		//Instrucción para el usuario
		System.out.println("Ingresa el monto total vendido por el trabajador durante el ultimo mes.");
		System.out.println("Calcularé su parte y le sumaré su sueldo fijo para obtener su ganancia total.");
		
		//Variable que almacena lo que le corresponde la vendedor por las ventas mensuales
		double totalVendido= scanner.nextInt();
		
		//Sumamos el sueldo fijo y su correspondencia por ventas para obtener su sueldo mensual total.
		double totalCobrarPorVendedor = sueldoVendedor + totalVendido * 0.16;
		
		//Imprimimos el sueldo total del vendedor
		System.out.println("El vendedor ganará " + totalCobrarPorVendedor + " este mes.");
		
		
	}
}
