package trabajopractico;

import java.util.Scanner;

public class Tp27 {
	
	public static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		//Instrucciones y almacen de los datos de entrada.
		System.out.println("Por favor ingresa 5 edades. Empecemos con la primera: ");
		int primerEdad = scanner.nextInt(); //El usuario ingresa una edad y se almacena en la variable.
		verificarEdad(primerEdad); //Verificamos si el numero ingresado por el usuario es mayor a 18 e impar, si lo es se imprime un msj.
								   //Esto lo hacemos mediante el llamado a la función y su argumentación con la variable que guarda la entrada.
		
		System.out.println("Sigamos con la segunda");
		int segundaEdad = scanner.nextInt();
		verificarEdad(segundaEdad);
		
		System.out.println("Tercera por favor..");
		int terceraEdad = scanner.nextInt();
		verificarEdad(terceraEdad);
		
		System.out.println("Ante ultima..");
		int cuartaEdad = scanner.nextInt();
		verificarEdad(cuartaEdad);
		
		System.out.println("Finalicemos con los datos necesarios, dame la ultima edad"); 
		int quintaEdad = scanner.nextInt();
		verificarEdad(quintaEdad);
		
		//Mediante una operación aritmetica averiguamos el promedio de edades.
		double promedioDeEdades = (primerEdad + segundaEdad + terceraEdad + cuartaEdad + quintaEdad) / 5.0;
		
		//El programa devuelve la solución: 
		System.out.println("El promedio de edad es de " + promedioDeEdades + " años.");
	}

	//Metodo que comprobará si las edades ingresadas son mayores a 18 e impares. Tendrá que ser argumentado con un int. Su parametro es "edad".  
	public static void verificarEdad(int edad) //Explicación de argumentos y parámetros enfunciones explicación:  El parametro es el valor temporal y no final que será reemplazado por el argumento. Se usa en el backend del lado del desarrollador ya que no se sabe cuál será el argumento que tomará ese valor (brindado en el futuro como una entrada por el usuario) en este caso esas entradas son las edades brindadas por el usuario. Como se ve en cada llamado anterior de esta función se argumenta la variable que almacena estas edades entradas. Esto sucedió en las líneas de código 14, 19, 23, 27, 31.
	{
		if(edad > 18 && edad % 2 != 0) //si edad mayor 18 y si la division de edad por 2 da un resto diferente a 0.
		{
			System.out.println("Esta edad es mayor de 18 y además es impar."); //Si es TRUE, este metodo devolverá esta linea en la consola.
		}
		else if(edad > 18) 
		{
			System.out.println("Esta edad es mayor a 18 pero no es impar."); //Como sabemos que no es impar si en la condicion solo se se evalúa la edad? Porque es un ELSE IF, eso significa que solo se ejecutará si no pasó su anterior if. En el anterior if se obtiene mayor 18 e impar, por lo tanto si se ejecutó este else if significa que no se cumplió ese if de mayor 18 e impar, y si en el else if evalúamos mayor 18 y da TRUE significa que es par si o si, ya que si fuese impar, hubiese sido obtenido por el if anterior.
		}
		else if(edad % 2 != 0) 
		{
			System.out.println("Esta edad es impar y menor a 18");
		}
		else 
		{
			System.out.println("Ni es mayor a 18 ni es impar.");
		}
	}
}
