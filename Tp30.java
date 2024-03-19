package trabajopractico;

import java.util.Scanner;

public class Tp30 {
	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		// Bucle para realizar varias operaciones
        while (true) {
            // Solicitar la operación al usuario
            System.out.println("Ingrese la operación a realizar (+, -, *, /) o 'F' para finalizar:");
            char operacion = scanner.next().charAt(0);

            // Comprobar si se desea finalizar el programa
            if (operacion == 'F' || operacion == 'f') 
            {
                System.out.println("Finalizando el programa...");
                break; // Este break se utiliza para salir del bucle while. 
            }

            // Solicitar dos números enteros
            System.out.println("Ingrese el primer número:");
            int numero1 = scanner.nextInt();
            System.out.println("Ingrese el segundo número:");
            int numero2 = scanner.nextInt();

            // Ya que solo hay 4 opciones conocidas por nosotros usamos un switch que cambiará el valor de operacion.
            switch (operacion) {
                case '+':
                    System.out.println("Resultado: " + (numero1 + numero2));
                    break;
                case '-':
                    System.out.println("Resultado: " + (numero1 - numero2));
                    break;
                case '*':
                    System.out.println("Resultado: " + (numero1 * numero2));
                    break;
                case '/':
                    if (numero2 != 0) //En el caso de la division desarrollamos una logica para verificar que el divisor no sea 0. 
                    { 
                        System.out.println("Resultado: " + (numero1 / numero2));
                    } 
                    else //Si es 0..
                    {
                        System.out.println("Error: No se puede dividir por cero.");
                    }
                    break; //Estos break se utilizan para salir del switch.
                default:
                    System.out.println("Operación no válida."); //Si el programa recibe un caracter que no sean los 4 del switch o la F mostrará este aviso.
            }
        }

        // Cerrar el scanner
        scanner.close();
		
	}

}
