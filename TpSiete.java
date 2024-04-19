package trabajopractico;

import java.util.Scanner;

public class TpSiete {
	
	public static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		
		//Instrucción
		System.out.println("Por favor ingresa el ancho y luego el largo de un terreno (expresado en metros).");
		
		//Datos que obtuvimos del usuario con los que averiguaremos los resultados exigidos.
		int anchoTerreno = scanner.nextInt();
		int largoTerreno =  scanner.nextInt();
		
		//Lo mismo con el valor faltante
		System.out.println("Ahora ingresa su valor por metro cuadrado.");
		int valorMetroCuadrado = scanner.nextInt();
		
		//Calculamos el valor total del terreno.
		int valorTotalTerreno = anchoTerreno + largoTerreno * valorMetroCuadrado;
		System.out.println("El valor total del terreno es: " + valorTotalTerreno);
		
		//Calculamos la cantidad de metros de alambre necesarios para cada altura.
		int metrosAlambrePrimerAltura = 2 * (anchoTerreno + largoTerreno) * 1;
		int metrosAlambreSegundaAltura = 2 * (anchoTerreno + largoTerreno) * 2;
		int metrosAlambreTercerAltura = 2 * (anchoTerreno + largoTerreno) * 3;
		
		//Los imprimimos.
		System.out.println("La cantidad de metros de alambre necesarios para cubrir la primer altura son: " + metrosAlambrePrimerAltura);
		System.out.println("La cantidad de metros de alambre necesarios para cubrir la segunda altura son: " + metrosAlambreSegundaAltura);
		System.out.println("La cantidad de metros de alambre necesarios para cubrir la tercer altura son: " + metrosAlambreTercerAltura);
	}

}
                