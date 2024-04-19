package trabajopractico;

import java.util.Scanner;

public class Tp17 {

	public static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		//Instrucciones y variables para almacenar lo ingresado
		System.out.println("Ingresa una edad entre 1 y 120 años");
		int edad = scanner.nextInt();
		scanner.nextLine(); //Con esto solucionamos el error de que las sentencias if se ejecutaban luego del scanner.nextInt() sin aun saber el genero por lo que siempre daba else.
		
		System.out.println("Ahora ingresa un genero F para mujer o M para hombre");
		String genero = scanner.nextLine().toUpperCase(); //Convertimos a mayúscula la letra ingresada.
				
		//Sentencia if que comprueba si los datos son correctos o no.
		if((edad >=1 && edad <=120) && (genero.equals("M") || genero.equals("F")))
		{
			System.out.println("Datos correctos. Entre 1-120 y 'F' o 'M'");
			
			//If-else que comprobará si se puede jubilar o no.
			if((genero.equals("F") && edad >= 60) || (genero.equals("M") && edad >= 65)) 
			{
				//Puede, averiguamos hace cuantos años.
				if(genero.equals("F")) //Si es mujer.
				{
					int añosSobrantes = edad - 60; //Restamos a su edad la edad requierida, lo que sobra serán los años extra.
					
					if(añosSobrantes == 0) //Verificamos si no le sobran años y esta en la misma edad de jubilación. 
					{
						System.out.println("Tiene la misma edad que se requiere para jubilarse");
					}
					else 
					{
						System.out.println("Esta en edad de jubilarse. Hace " + añosSobrantes + " años que lo puede hacer.");
					}
					
				}
				else //Si es hombre.
				{
					int añosSobrantes = edad - 65; // Obtenemos los años que le sobren para jubilarse.
					
					if(añosSobrantes == 0) //Si no le sobran años..
					{
						System.out.println("Tiene la misma edad que se requiere para jubilarse"); 
					}
					else //Si le sobran..
					{
						System.out.println("Esta en edad de jubilarse. Hace " + añosSobrantes + " años que lo puede hacer.");
					}
				}
				
			}
			else //No se puede jubilar.
			{
				//If-else que averigua cuantos años le resta para jubilarse.
				if(genero.equals("F")) 
				{
					int añosRestantes = 60 - edad;
					System.out.println("Aun no puede gozar de jubilacion. Le faltán " + añosRestantes + " años.");
				}
				else 
				{
					int añosRestantes = 65 - edad;
					System.out.println("Aun no puede gozar de jubilacion. Le faltán " + añosRestantes + " años.");
				}	
			}
		}
		else //Si ingresó datos incorrectos.
		{
			System.out.println("Datos != a los pedidos");
		}		
	}
}
