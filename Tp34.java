package trabajopractico;

import java.util.Scanner;

public class Tp34 {
	
	public static void main(String[] args) 
	{
		//Creamos las variables que se usarán para obtener y almacenar los resultados.
		Scanner scanner = new Scanner(System.in);
		
		double sumaAlturas = 0;
		double estatura = -1;
		int cantidadJugadores= 0;
		
		//Instrucciones para el usuario
		System.out.println("Por favor ingresa la estatura de todos los jugadores de tu equipo de basket. Te daré el promedio al final. Debes presionar 0 para finalizar.");
		
		while(estatura != 0) 
		{
			estatura = scanner.nextDouble();
			sumaAlturas += estatura;
			cantidadJugadores++;
		}
		
		//Obtenemos e imprimimos el promedio de altura.
		double promedioDeAltura = sumaAlturas / (cantidadJugadores - 1) ; //El -1 es obligatorio ya que el 0 ingresado por el usuario para cancelar el programa se añade a cantidadJugadores y no es uno de ellos, por lo que debemos eliminarlo.
		System.out.println("El promedio de altura de tu equipo es de " + promedioDeAltura);
	}

}
