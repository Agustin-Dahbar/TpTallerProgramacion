package trabajopractico;

import java.util.Scanner;

public class TpDiez {

	public static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		//Pedimos al usuario monto y nombre del primer socio
		System.out.println("Por favor ingrese el nombre y monto aportado por el primer socio.");
		
		//Almacenamos los datos ingresados por el usuario
		String nombreSocioUno = scanner.nextLine();
		int montoSocioUno = scanner.nextInt();
        scanner.nextLine(); //Limpiamos el buffer del scaner.
		
        //Pedimos la data del segundo socio
		System.out.println("Ahora nombre y monto del segundo socio."); 
		
		//Almacenamos los datos ingresados por el usuario
		String nombreSocioDos = scanner.nextLine(); 
		int montoSocioDos = scanner.nextInt();
        scanner.nextLine(); 
		
		//Pedimos datos del socio final
		System.out.println("Finalmente, nombre y monto del tercer socio.");
		
		//Almacenamos los datos.
		String nombreSocioTres = scanner.nextLine();
		int montoSocioTres = scanner.nextInt();
		
        scanner.nextLine();
		
		
		//Almacenamos en una variable el monto total aportado por los 3 socios y lo devolvemos.
		int valorTotalAportado = montoSocioUno + montoSocioDos + montoSocioTres;
		
		System.out.println("El valor total aportado es: " + valorTotalAportado);
		
		
		//Almacenamos el % aportado por los socios y lo devolvemos.
		double porcentajeSocioUno = (montoSocioUno * 100.0) / valorTotalAportado;
		double porcentajeSocioDos = (montoSocioDos * 100.0) / valorTotalAportado;
		double porcentajeSocioTres = (montoSocioTres * 100.0) / valorTotalAportado;
		
		System.out.println("Porcentajes aportados: ");
		System.out.println(nombreSocioUno + ": " + porcentajeSocioUno + "%");
		System.out.println(nombreSocioDos + ": " + porcentajeSocioDos + "%");
		System.out.println(nombreSocioTres + ": " + porcentajeSocioTres + "%");
		
	}
	
}
