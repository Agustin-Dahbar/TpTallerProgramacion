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
		
		//Intentos de log in. Al llegar a 3 se cancela el bucle while y no deja un 4to intento de login. 
		int intentos = 0;
		
		//Bucle do.. while. Se obtendrán los datos del usuario y se sumará un intento. Luego de esto se evaluarán los datos en un IF-ELSE IF-ELSE para continuar con el programa.
		do 
		{
			System.out.println("Por favor, ingresa tu nombre de usuario");
			nombreIngresado = scanner.nextLine();
			
			System.out.println("Ahora tu contraseña..");
			passwordIngresada = scanner.nextInt();
			
			scanner.nextLine(); //Consumimos el caracter de nueva línea provocado por el enter, si no lo hacemos saltará una excepción.
			
			intentos++; //Agregamos el intento para imprimirlo en las dos posibles salidas.
			
			//If que comprueba si los datos son correctos. Si lo son se saldrá del bucle por no cumplirse la condición.
			if(nombreIngresado.equals(nombreIngresado) && passwordIngresada == password) 
			{
			//Si los datos fueron correctos bifurcamos en 2 la impresión en consola. En singular si fue un intento o en plural para el resto (2,3)
				if(intentos == 1) 
				{
					System.out.println("Credenciales correctas. Ingresadas en " + intentos + " intento."); 
				}
				else 
				{
					System.out.println("Credeciales correctas. Ingresadas en " + intentos + " intentos.");	
				}
			}
			else if(intentos == 3) 
			{
				System.out.println("Se ha bloqueado tu cuenta por alcanzar el límite de " + intentos + " intentos máximos."); 
				break;
			}
			else 
			{
				System.out.println("Credenciales incorrectas. Intentalo nuevamente.");
			}
			
		}

		while(!(nombreIngresado.equals(nombreIngresado) && passwordIngresada == password)); //Siempre se cumplirá por lo que deberemos
		

	}
	
}
