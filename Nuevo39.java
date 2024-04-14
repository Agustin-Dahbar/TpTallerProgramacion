package trabajopractico;

import java.util.Scanner;

public class Nuevo39 {
	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		
		int puntajeTotal = 0; //Inicializamos con este valor para que se cumpla el if de la línea 37 en el primer caso y el total del primer jugador sea el puntajeMasAlto, ya que no hay ningun otro para comparar y en la segunda iteración del bucle EXTERNO ya tenemos el valor anterior para compararlo con el nuevo (hablando de puntajesTotales)
		//Declaramos esta variable OBGLIATORIAMENTE EN EL AMBITO GLOBAL (fuera de todos los bucles) ya que necesitamos usarla en ambos. 
		//Si la hubiesemos declarado en alguno de los dos, no podriamos usarla en el otro, ya que sería PRIVADA.
		
		
		//Variables de salida que imprimiremos.
		String ganador = "valor temporal"; //Mismo caso que el anterior, ambito global obligatorio.
		int tirosAlCentro = 0; //Variable de conteo (de uno en uno de forma positiva).
		int puntajeMasAlto = Integer.MIN_VALUE;//Variable que almacenará el puntaje ganador. La inicializamos con min value para que en el primer caso el puntaje total del jugador tome su lugar cumpliendose el if 100%.
		
		
		//Instrucción para el usuario y su entrada
		System.out.println("Ingresa la cantidad de jugadores"); //Instrucción
		int cantidadJugadores = scanner.nextInt(); //Representará la cantidad de jugadores. Siempre tendrá el mismo valor.
		
		//Bucle while que se ejecutará si la cantidad de jug ingresada por el usuario es menor a 2. Pidiendole que sean al menos 2.
		while(cantidadJugadores < 2) 
		{
			System.out.println("Debe ingresar al menos 2 jugadores. Reintentelo, por favor..");
			cantidadJugadores = scanner.nextInt();
		}
		
		//Bucle externo que iterará una vez por cada jugador. En el evaluaremos los nombres y los puntajes finales (suma de sus 3 tiros que estarán en el buce interno)
		for(int i = 0; i < cantidadJugadores; i++) 
		{
			System.out.println("Ingresa el nombre del jugador " + (i + 1));
			String nombre = scanner.nextLine(); //Almacenará el nombre de los jugadores por cada iteración del bucle externo tendrá un valor !=.
			
			scanner.nextLine();
			//Bucle interno que iterará por los tiros del jugador. Se ejecutará todas las veces para recién continuar con el bucle externo. Es decir, por cada ejecución del interno, este se ejecutará 3 veces. Luego de estas 3 el interno continua y finaliza su ejecución.
			for(int tiroActual = 0; tiroActual < 3; tiroActual++) 
			{
				System.out.println("Dame la distancia del tiro " + (tiroActual + 1) + " de " + nombre ); //Instrucción.
				int distancia = scanner.nextInt(); //Entrada del usuario.
				
				int puntajeDelTiro = calcularPuntaje(distancia); //Llamamos a la función que nos devolverá el puntaje del tiro según su distancia. Lo almacenamos en la nueva variable declarada.
				puntajeTotal += puntajeDelTiro; //Suma total de los 3 tiros. Usaremos esta variable para compararla con sus otros valores y ver quien tuvo el mayor puntaje.
				System.out.println("Valor puntaje total : "+ puntajeTotal);
				
				//If que verificará si fue un tiro al centro, en ese caso lo contará para imprimirlo al final del programa.
				if(distancia == 0) 
				{
					tirosAlCentro++;
				}
				
			} //Fin bucle interno
			
			//If que evalúa si el puntaje final del jugador es el más alto hasta ahora.
			if(puntajeTotal > puntajeMasAlto) 
			{
				puntajeMasAlto = puntajeTotal;
				ganador = nombre;
			}

        } //Fin bucle externo	

		//Ya obtenidos la información final con los datos que se nos han brindado devolvemos
		System.out.println("El ganador del torneo es: " + ganador + " con un puntaje de " + puntajeMasAlto);
        System.out.println("La cantidad total de tiros al centro es: " + tirosAlCentro);
		
	} //Fin metodo principal Main		
		
	//Metodo que calculará el puntaje		
	public static int calcularPuntaje(int distancia) 
	{
		if(distancia == 0)
		{
			System.out.println("Tiro al centro!");
			return 1;
		}
		else if(distancia < 10) 
		{
			System.out.println("Menos de 10");
			return 2;
		}
		else if(distancia < 20) 
		{
			System.out.println("A partir de 10 y menos de 20.");
			return 3;
		}
		else 
		{
			System.out.println("A partir 20");
			return 20;
		}
	

	}

	
}