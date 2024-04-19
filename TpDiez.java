package trabajopractico;

import java.util.Scanner;

public class TpDiez {

	public static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		//Pedimos al usuario monto y nombre del primer socio
		System.out.println("Por favor ingrese el nombre y monto aportado por el primer socio.");
		
		//Almacenamos los datos ingresados por el usuario
		String nombreUno = scanner.nextLine();
		int montoUno = scanner.nextInt();
        scanner.nextLine();//Limpiamos el buffer del scaner para evitar problemas en la consola.
        
        //Pedimos la data del segundo socio
		System.out.println("Ahora nombre y monto del segundo socio."); 
		String nombreDos = scanner.nextLine(); 
		int montoDos = scanner.nextInt();
        
        //Mientras el aporte del segundo socio sea == al del primero, se pedirá el reingreso.
        while(montoDos == montoUno) 
        {
        	System.out.println("Los capitales aportados deben ser !=. Reingresa el capital del segundo socio.");
        	montoDos = scanner.nextInt();
        }
        
		//Pedimos datos del socio final.
		System.out.println("Finalmente, nombre y monto del tercer socio.");
		scanner.nextLine(); //Consumimos el carácter de nueva linea y evitamos problemas en la consola.
		String nombreTres = scanner.nextLine();
		int montoTres = scanner.nextInt();
		
        //Mismo while que el anterior.
        while(montoTres == montoDos || montoTres == montoUno) 
        {
        	System.out.println("Los capitales aportados deben ser !=. Reingresa el capital del tercer socio.");
        	montoTres = scanner.nextInt();
        }
        
		//Almacenamos en una variable el monto total aportado por los 3 socios y lo devolvemos.
		int montoTotal = montoUno + montoDos + montoTres;
		System.out.println("El valor total aportado es: " + montoTotal);
		
		//Almacenamos el % aportado por los socios y lo devolvemos.
		double porcentajeSocioUno = (montoUno * 100.0) / montoTotal;
		double porcentajeSocioDos = (montoDos * 100.0) / montoTotal;
		double porcentajeSocioTres = (montoTres * 100.0) / montoTotal;
		
		//Devolvemos los porcentajes aportados por cada socio.
		System.out.println("Porcentajes aportados: ");
		System.out.println(nombreUno + ": " + porcentajeSocioUno + "%");
		System.out.println(nombreDos + ": " + porcentajeSocioDos + "%");
		System.out.println(nombreTres + ": " + porcentajeSocioTres + "%");
		
	}
	
}
