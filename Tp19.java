package trabajopractico;

import java.util.Scanner;

public class Tp19 {
	
	public static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.println("Ingresa un numero");
		int numero = scanner.nextInt();
		
		//Dejamos en false las variables para solo activar la correcta mediante los condicionales
		boolean esDeUnSoloDigito = false;
		boolean esImpar = false;
		boolean estaEnAmbosGrupos = false;
		boolean noEstaEnNingunGrupo = false;
		
		//Sentencias para darle true a la variable correcta
		if(numero < 10) //Si es menor a 10, significa que tiene un digito
		{
			esDeUnSoloDigito = true;
		}	
		if(numero % 2 != 0) // si la division por 2 del numero, da resto diferente a 0, es impar.
        {
	            esImpar = true;
        }
		if(numero < 10 && numero % 2 != 0) 
		{
			estaEnAmbosGrupos = true;
		}
		else //Si se ejecuta else, significa que las condiciones no se cumplieron, por lo que es mayor a 10 (1ra condicion) y es par (2da condicion), es decir, no esta en ningun grupo.
		{
			noEstaEnNingunGrupo = true;
		}
		
		//Uso de múltiples if´s para mantener la independencia en las condiciones, si usase un else if por ejemplo en el tercer caso, me daría false a pesar de tener la lógica condicional correcta.
		
		//Instrucciones que mostrarán 1. El numero.. 2. Cuales variables se cumplen y cuales no mediante 'true'
		System.out.println("El numero seleccionado fue " + numero);
		System.out.println("¿Es de un solo digito? " + esDeUnSoloDigito); 
		System.out.println("¿Es impar? " + esImpar);
		System.out.println("¿Entra en ambos? " + estaEnAmbosGrupos);
		System.out.println("No entra en ningun grupo? " + noEstaEnNingunGrupo);
	}

}
