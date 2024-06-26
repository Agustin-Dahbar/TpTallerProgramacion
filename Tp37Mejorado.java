package trabajopractico;

import java.util.Scanner;

public class Tp37Mejorado {
	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		//Declaración de instrucción y variables que almacenarán los datos necesarios para resolver el problea.
		System.out.println("Ingresa todos los sueldos cobrados por el empleado en el año. Al no haber más ingresa un número negativo.");
		int sueldo = 0;
		int sueldoTotal = 0;
		int meses = 0;
		
		while(sueldo >= 0 && meses < 12) //Bucle while que permitirá el ingreso de los sueldos por parte del usuario. 
		{
			sueldo = scanner.nextInt(); //Entrada del usuario que determinará si se ejecuta o no el resto del bloque del código.
			
			//Ingresamos esta sentencia if para que en la última iteración donde el usuario cancela el programa con un número negativo, no se ejecuten estas dos líneas y no se reste ese número negativo a la suma ni se cuente ese ingreso como un mes.
			if(sueldo >= 0)   
			{				
			sueldoTotal += sueldo;
			meses++;
			System.out.println("El sueldo parcial es " + sueldoTotal);
			}
			//Simula ser un break con la != de que el corte es programado por nosotros en la iteración deseada y no cuando llegué por primera vez.
			
		}
		//FIN BUCLE WHILE.
		
		System.out.println("El sueldo total es " + sueldoTotal + " y se obtuvo en " + meses + " meses."); 
	}

}
