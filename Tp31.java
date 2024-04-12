package trabajopractico;

import java.util.Scanner;

public class Tp31 {
	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		//Inicializamos la var con a para que se ejecute el while donde se repetirá la entrada en caso de que ingrese una incorrecta.
		char respuestaUsuario = 'a';
		
		//Mientras no indique una N o S se repetirá el pedido de entrada. La capitalización no importa.
		while(respuestaUsuario != 'N' && respuestaUsuario != 'S' && respuestaUsuario != 'n' && respuestaUsuario != 's') 
		{
		System.out.println("¿Desea continuar? [S/N]"); //Pregunta al usuario
		respuestaUsuario = scanner.nextLine().charAt(0); //Almacenamos su respuesta.
		}
		
		System.out.println("Carácter válido. Enter para repetirlo con el bucle do.. while");

		scanner.nextLine(); //Necesario para eliminar el caracter de nueva linea que queda en el búfer de entrada luego de que el 
		//usuario ingresó su respuesta en la linea 16. Por lo tanto hay que consumirlo, asi evitamos que se ejecute la linea 28 de golpe
		//Logra la misma pausa que Console.ReadLine() en C Sharp.
		
		
		//Repetiremos el mismo proceso para el segundo bucle. Variable que tendrá la entrada del usuario donde esperamos S/s/N/n
		char respuestaUsuarioDos;
		
		do 
		{
		System.out.println("Desea continuar con alguna operacion? [S/N]"); //Pregunta al usuario
		respuestaUsuarioDos = scanner.nextLine().charAt(0); //Almacenamos su respuesta.
		}
		while(respuestaUsuarioDos != 'N' && respuestaUsuarioDos != 'S' && respuestaUsuarioDos != 'n' && respuestaUsuarioDos != 's');
			
		System.out.println("Por segunda vez una respuesta correcta fue seleccionada.");
	
	}
		
}

