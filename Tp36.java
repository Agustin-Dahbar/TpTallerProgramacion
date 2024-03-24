package trabajopractico;

import java.util.Scanner;

public class Tp36 {
	
	public static void main(String[] args) 
	{
		//Variables que necesitaremos.
		Scanner scanner = new Scanner(System.in);
		
		int nota = 0; //Entrada del usuario 
		double sumaDeNotas = 0; // La suma total de las entradas iteradas (para sacar el promedio)
		int notasIngresadas = 0; //Cuenta de valores ingresados. (será el divisor para sacar el promedio)
		double promedio = 0; 
		
		
		//Ingresa las notas a las que se les calculará el promedio.
		System.out.println("Por favor ingresa notas. Podrás hacerlo hasta que el promedio sea menor a 20, cuando lo alcances o lo superes, se parará el programa.");
		do 
		{
			nota = scanner.nextInt(); //Almacenamos la nota ingresada
			sumaDeNotas += nota; //Sumamos el valor de las notas para que el promedio se realice de forma correcta
			notasIngresadas++; //Aumentamos un valor por cada iteración a la cantidad de entradas.
			promedio = sumaDeNotas/notasIngresadas;
			
			if(promedio < 20) //Solucionamos el problema ocasionado porque la condición este al final de que se impriman una vez más cosas que no queremos.
			{				  //A partir de ahora simplemente se debe dejar a lo último esa instrucción que no queremos agregar una última vez y encerrarla en un if que tenga
							  // la misma condición que el while.
			System.out.println("El promedio actual es " + promedio + ". Aún pudes continuar");
			}
			
		}
		while(promedio < 20); //Si el promedio es menor a 20, se seguirá permitiendo que el usuario entre numeros.
		
		System.out.println("La cantidad de notas leídas fue de " + notasIngresadas + "No puedes continuar ya que superaste el promedio límite. Lo dejaste en " + promedio);
	}

}
