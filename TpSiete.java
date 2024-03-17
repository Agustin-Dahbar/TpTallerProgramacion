package trabajopractico;

import java.util.Scanner;

public class TpSiete {
	
	public static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		
		//Instrucción
		System.out.println("Por favor ingresa el ancho y el largo de un terreno en metros.");
		
		//Datos que obtuvimos del usuario con los que averiguaremos los resultados exigidos.
		int anchoTerreno = scanner.nextInt();
		int largoTerreno =  scanner.nextInt();
		
		//Lo mismo con el valor faltante
		System.out.println("Ahora ingresa su valor por metro cuadrado.");
		int valorMetroCuadrado = scanner.nextInt();
		
		//Calculamos el valor total del terreno.
		int valorTotalTerreno = anchoTerreno + largoTerreno * valorMetroCuadrado;
		System.out.println("El valor total del terreno es: " + valorTotalTerreno);
		
		//Creamos las 3 alturas a las que se cercará.
		int primerAltura = 1;
		int segundaAltura = 2;
		int tercerAltura = 3;
		
		//Calculamos la cantidad de metros de alambre necesarios para cada altura.
		int metrosAlambrePrimerAltura = 2 * (anchoTerreno + largoTerreno) * primerAltura;
		int metrosAlambreSegundaAltura = 2 * (anchoTerreno + largoTerreno) * segundaAltura;
		int metrosAlambreTercerAltura = 2 * (anchoTerreno + largoTerreno) * tercerAltura;
		
		//Los imprimimos.
		System.out.println("La cantidad de metros de alambre necesarios para cubrir la primer altura son: " + metrosAlambrePrimerAltura);
		System.out.println("La cantidad de metros de alambre necesarios para cubrir la segunda altura son: " + metrosAlambreSegundaAltura);
		System.out.println("La cantidad de metros de alambre necesarios para cubrir la tercer altura son: " + metrosAlambreTercerAltura);
	}

}
                