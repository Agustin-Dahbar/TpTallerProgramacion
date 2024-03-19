package trabajopractico;

import java.util.Scanner;

public class Tp36 {
	
	public static void main(String[] args) 
	{
		//Variables que necesitaremos.
		Scanner scanner = new Scanner(System.in);
		
		int nota = 0; //Entrada del usuario 
		double sumaDeNotas = 0; // La suma total de las entradas iteradas (para sacar el promedio)
		int cantidadDeEntradas = 0; //Cuenta de valores ingresados. (será el divisor para sacar el promedio)
		double promedio = 0; 
		
		
		//Ingresa las notas a las que se les calculará el promedio.
		System.out.println("Por favor ingresa notas. Podrás hacerlo hasta que el promedio sea menor a 20, cuando lo alcances o lo superes, se parará el programa.");
		do 
		{
			nota = scanner.nextInt(); //Almacenamos la nota ingresada
			sumaDeNotas += nota; //Sumamos el valor de las notas para que el promedio se realice de forma correcta
			cantidadDeEntradas++; //Aumentamos un valor por cada iteración a la cantidad de entradas.
			promedio = sumaDeNotas / cantidadDeEntradas; // calculamos el promedio via division entre las notas y la cantidad de ingresos
			
			if(promedio < 20) //Esta condicional logra que al superar el promedio se imprima solo la linea de codigo 35 y no ambas. 
			{
			System.out.println("El promedio actual es " + promedio + ". Aún pudes continuar");
			}
			
		}
		while(promedio < 20); //Si el promedio es menor a 20, se seguirá permitiendo que el usuario entre numeros.
		
		System.out.println("No puedes continuar ya que superaste el promedio límite. Lo dejaste en " + promedio);
	}

}
