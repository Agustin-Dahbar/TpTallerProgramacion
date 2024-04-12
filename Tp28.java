package trabajopractico;

import java.util.Scanner;

public class Tp28 {
	
	public static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		//Instrucciones y almacen de valores.
		System.out.println("Ingresa un numero entero. Reflejará la cantidad de números que se te pedirá que ingreses.");
		int cantidadDeNumerosAIngresar = scanner.nextInt();
		
		//Nuevas instrucciones
		System.out.println("Ingresa " + cantidadDeNumerosAIngresar + " números. Te diré cuál es el número más grande de tu selección.");
		
		//Declaramos y asignamos la variable que al final almacenará al número más grande. Ahora, La asignamos con el menor posible.
		int numeroMasGrande =  Integer.MIN_VALUE; // Al darle el mínimo valor posible nos aseguramos que en la primer iteración tome el primer valor ingresado por el usuario.
		//MIN_VALUE es una propiedad constante de la clase Integer, es estatica por lo tanto no requerimos de instanciar a su clase para heredarla 		
		int posicionNumeroMasGrande = 0; //Variable que almacenará la posición del número más grande.
		
		//Bucle en el que imprimiremos al usuario la instruccion y el espacio para ingresar los números. Luego de esto comprobaremos cuál
		//es el número más grande de todos los que se iterarán al ser entrados por el usuario. 
		for (int i = 1; i <= cantidadDeNumerosAIngresar; i++)
		{ 
            System.out.println("Numero " + (i) + ":"); 
            int numero = scanner.nextInt();
            
            if (numero > numeroMasGrande) //Si el actual número ingresado en la iteración es el mayor, lo almacenamos en la variable de número mayor.
            { 							
                numeroMasGrande = numero; //Asignamos el nuevo valor identificado por la condición como el más grande a la variable correspondiente. 
                posicionNumeroMasGrande = i; //Obtenemos la posición natural (no indexada) en donde se encuentra mediante el valor de i (var privada).
            }
        }
		
		//Variable con la posicion indexada. Uno menos que la obtenida en la sentencia if.
		int posicionIndexadaNumeroMasGrande = posicionNumeroMasGrande - 1;
		
		//Imprimimos el numero más grande averiguado en el IF.
		System.out.println("El numero mas grande de tu seleccion fue el " + numeroMasGrande + " y se creo en la posicion tradicional " + posicionNumeroMasGrande + " que sería la posición " + posicionIndexadaNumeroMasGrande + " en indexacion de corchetes.");
	}

}
