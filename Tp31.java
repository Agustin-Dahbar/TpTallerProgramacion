package trabajopractico;

import java.util.Scanner;

public class Tp31 {
	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		//
		char respuestaUsuario = 'a';
		
		while(respuestaUsuario != 'N' && respuestaUsuario != 'S' && respuestaUsuario != 'n' && respuestaUsuario != 's') 
		{
		System.out.println("Desea continuar con alguna operacion? [S/N]"); //Pregunta al usuario
		respuestaUsuario = scanner.nextLine().charAt(0); //Almacenamos su respuesta.
		}
		
		System.out.println("Una respuesta correcta fue seleccionada. Enter para continuar con el bucle do.. while");
		//El bucle se repetirá hasta que el usuario eliga una de las 4 opciones vistas en la condición while.
		
		scanner.nextLine(); //Necesario para eliminar el caracter de nueva linea que queda en el búfer de entrada luego de que el 
		//usuario ingresó su respuesta en la linea 16. Por lo tanto hay que consumirlo, asi evitamos que se ejecute la linea 28 de golpe
		
		
		char respuestaUsuarioDos = 'a';
		do {
		System.out.println("Desea continuar con alguna operacion? [S/N]"); //Pregunta al usuario
		respuestaUsuarioDos = scanner.nextLine().charAt(0); //Almacenamos su respuesta.
		}
		while(respuestaUsuarioDos != 'N' && respuestaUsuarioDos != 'S' && respuestaUsuarioDos != 'n' && respuestaUsuarioDos != 's');
			
		System.out.println("Por segunda vez una respuesta correcta fue seleccionada.");
	
	}
		
}