package trabajopractico;

import java.util.Scanner;

public class Tp35 {
	
	public static void main(String[] args) {
		
		//Declaramos las variables a utilizar.
		Scanner scanner = new Scanner(System.in);
		
		String nombre = "";
		int edad = 0;
		String personaMasJoven = ""; //Almacenará el nombre de la persona más joven.
		int edadMasJoven = Integer.MAX_VALUE; //Le damos el máximo valor posible para asegurarnos que en la primer iteracion su valor sea sustituido por el ingresado por el usuario.
	
		//Instrucciones
		System.out.println("Te pediré que ingreses nombre y edad de múltiples personas. Te diré cual es el nombre de la más joven. Para finalizar usa un * en el nombre.");
		
		//Bucle do while. TRUE al while para que se ejecute automaticamente y ya con el break nos encargamos de finalizarlo cuando deseamos. 
		do {
			//Pedimos entrada de nombre
			System.out.println("Ingresa el nombre: ");
			nombre = scanner.nextLine(); 
			
			if(nombre.contains("*")) //Si el nombre contiene el asterisco, 
			{
				break; //damos por finalizado el programa.
			}
			
			//Pedimos entrada de edad.
			System.out.println("Ingresa la edad: ");
			edad = scanner.nextInt();
			scanner.nextLine(); //Tuve que agregar eso para limpiar el bufer eliminando la nueva linea generada por el enter y que no me saltee la segunda entrada de nombre.
			
			
			//Ya con sus datos, evaluamos si es la persona mas joven iterada hasta ahora
			if (edad < edadMasJoven) // En la primer iteracion la edad ingresada por el usuario automáticamente tomará el valor de edadMasJoven. Recién a partir de la segunda iteración del bucle empezarán a compararse las edades. 
			{ 
				personaMasJoven = nombre; //Si es la mas persona mas joven actualizamos las dos propiedades que indican
				edadMasJoven = edad; // los datos de la persona mas joven 
			}
			
		}
		while(true); //Indicamos que automáticamente se cumpla la condición y se ejecute el DO. Manejamos el cierre con un break dentro de el.
		
		System.out.println("La persona más joven es " + personaMasJoven + ", su edad es: " + edadMasJoven); //Al ejecutarse el break por el usuario indicar el fin con un *, imprimimos la consiga.
		
		
	}
	
	

}
