package trabajopractico;

import java.util.Scanner;

public class Tp38Mejorado {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		//Valores a coincidir 
		String nombre = "admin";
		int password = 123456;
		
		//Valores ingresados por el usuario
		String nombreIngresado = "hola";
		int passwordIngresada = 0;
		
		//Variable que almacenará si se realizaron 3 intentos.
		boolean menos3Intentos = true;
		boolean credencialesCorrectas = false;
		
		System.out.println("Por favor, ingresa tu nombre de usuario");
		nombreIngresado = scanner.nextLine();
		
		System.out.println("Ahora tu contraseña..");
		passwordIngresada = scanner.nextInt();
		
		//Evaluamos si las credenciales son válidas mediante la ejecución de una condición en la variable booleana.
		credencialesCorrectas = nombreIngresado.equals(nombre) && passwordIngresada == password; 
		
		int intentos = 1; //La inicializamos con uno debido a que ya se realizó un intento.
		
		//Bucle while que repetirá el ingreso en caso de que haya sido incorrecto o se hayan realizado menos de 3 intentos
		while(!credencialesCorrectas && menos3Intentos) //Mientras credencialesCorrectas sea falso (es decir, mientras los datos ingresados no hayan sido correctos.
		{
			scanner.nextLine(); //Consumimos el caracter de nueva línea provocado por el enter, si no lo hacemos saltará una excepción.
			System.out.println("Datos incorrectos. Reintentalo, comienza con el usuario..");
			nombreIngresado = scanner.nextLine(); 
			
			System.out.println("Ahora la password..");
			passwordIngresada = scanner.nextInt();
			
			intentos++; //Sumamos en el conteo de intentos.
			menos3Intentos = intentos < 3; //Evalúa si los intentos son menos que 3. Deben serlo para que se siga cumpliendo el bucle while, una vez llegue a 3 dará FALSE, entonces no se ejecutará una 4ta vez y rompemos la repetición del while por el lado de los intentos.
			
			//Evaluamos los datos entrados. El valor obtenido se evaluará en el while como una de las condiciones para ejecutarse o no.
			credencialesCorrectas = nombreIngresado.equals(nombre) && passwordIngresada == password;
			
		}
		
		//Si salimos del bucle se debe a uno de dos motivos, porque accedimos correctamente o porque fallamos los 3 intentos. 
		
		//Caso en el que fallamos todos los intentos.
		if(!menos3Intentos && !credencialesCorrectas) 
		{
			System.out.println("Lo siento.. Fallaste tu límite de 3 intentos..");
		}
		
		
		//Caso en el que accedido correctamente las credenciales.
		if(credencialesCorrectas) 
		{
		//Sentencia if-else interna. Si los datos fueron correctos bifurcamos en 2 la impresión en consola. En singular o plural.
			if(intentos == 1) 
			{
				System.out.println("Credenciales correctas. Ingresadas en " + intentos + " intento."); 
			}
			else 
			{
				System.out.println("Credeciales correctas. Ingresadas en " + intentos + " intentos.");	
			}
		}
		
	
}

}