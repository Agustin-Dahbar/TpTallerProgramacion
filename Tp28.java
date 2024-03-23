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
		System.out.println("Ingresa " + cantidadDeNumerosAIngresar + " numeros. Te diré cual es el numero más grande de tu selección.");
		
		//Declaramos y asignamos la variable que al final almacenará al número más grande. Ahora, La asignamos con el menor posible.
		int posicionNumeroMasGrande = 0; //Variable que almacenará la posicion del numero mas grande.
		int numeroMasGrande =  Integer.MIN_VALUE; //Por que? Asi se cumple el IF y nos aseguramos que se actualice la variable con los numeroso entrados por el usuario
		//MIN_VALUE es una propiedad constante de la clase Integer, es estatica por lo tanto no requerimos de instanciar a su clase
		//para heredarla 
		
		//Bucle en el que imprimiremos al usuario la instruccion y el espacio para ingresar los numeros. Luego de esto comprobaremos cuál
		//es el numero mas grande de todos los que se iterarán al ser entrados por el usuario. El primer numero ingresado se tomará
		//si o si como nuevo valor de numeroMasGrande ya que esta var habia sido inicializada con MIN_VALUE, por lo que cualquier caso dará TRUE.
		for (int i = 1; i <= cantidadDeNumerosAIngresar; i++) 
		{ 
            System.out.println("Numero " + (i) + ":"); 
            int numero = scanner.nextInt();
            
            if (numero > numeroMasGrande) //Averiguamos cual es el numero más grande de los 3 ingresados en cada iteración.
            { 							
                numeroMasGrande = numero; //Asignamos el nuevo valor identificado por la condicion como el mas grande a la var correspondiente
                posicionNumeroMasGrande = i; //Obtenemos en la variable de su posicion el valor de posicion tradicional.
            }
        }
		//Variable con la posicion indexada. Uno menos que la obtenida en la sentencia if.
		int posicionIndexadaNumeroMasGrande = posicionNumeroMasGrande - 1;
		
		//Imprimimos el numero más grande averiguado en el IF.
		System.out.println("El numero mas grande de tu seleccion fue el " + numeroMasGrande + " y se creo en la posicion tradicional " + posicionNumeroMasGrande + " que sería la posición " + posicionIndexadaNumeroMasGrande + " en indexacion de corchetes.");
	}

}
