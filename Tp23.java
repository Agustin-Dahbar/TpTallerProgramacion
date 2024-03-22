package trabajopractico;

import java.util.Scanner;

public class Tp23 {
	
	public static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		//Instrucciones y variable que almacena.
		System.out.println("Por favor ingresa un numero");
		int numero = scanner.nextInt();
		
		//Bucle que itera por el multiplicador/factor para realizar las 10 primeras múltiplicaciones con el numero ingresado por el user.
		//la variable de ámbito privada del bucle for representará a este multiplicador, su primer valor será 1 como indica su inicialización y el último 10.
		for(int i = 1; i <= 10; i++) 
		{
			int resultado = numero * i; //Multiplicamos al numero por el primer multiplicador. 
			System.out.println(numero + " * " + i + " = " + resultado);
			//System.out.println("Los 10 primeros múltiplos del numero son " + resultado);
			//En cada iteración el multiplciador aumentará un valor. 
		}
	}

}
