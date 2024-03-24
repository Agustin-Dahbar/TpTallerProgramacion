package trabajopractico;

import java.util.Scanner;

public class Tp37Malo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Instrucción y variables de almacen.
        System.out.println("Ingresa los sueldos mensuales del empleado (ingresa un valor negativo para terminar):");

        int totalSueldos = 0; //Almacenará el valor total de los sueldos cobrados por el empleado.
        int mes = 0; //Almacenará los meses que se han iterado.  Se devolverá una vez al final.
        int mesPrint = 1; //Almacenará el numero mostrado en cada entrada.. 
        

        // Bucle para ingresar los sueldos mensuales uno por uno
        while (mes < 12) 
        {
            System.out.print("Sueldo del mes " + mesPrint + ": ");
            int sueldo = scanner.nextInt(); //Entrada del usuario, sueldo mensual del empleado.

            // Si el sueldo ingresado por el user es negativo se detiene la entrada ya que no se cobró más de lo que ya realizamos.
            if (sueldo < 0) {
                System.out.println("Se ha detectado un sueldo negativo. Fin del ingreso de datos.");
                break; //Sale del bucle while
            }

            totalSueldos += sueldo; // En cada iteración sumamos el sueldo ingresado por el usuario a la variable que almacenará el total del sueldo.
            	mes++;  // Sumamos una unidad a mes para representar numéricamente cuantos meses hemos iterado hasta ahora. Es otra manera
                //de salir del while, dando false la condición (mes == 13). La otra manera era el break del ingreso de sueldo negativo. 	
            mesPrint++; 
        }

        // Mostrar el monto percibido por el empleado hasta ese momento
        System.out.println("Monto percibido por el empleado: $" + totalSueldos + " obtenido en " + mes + " meses.");

        scanner.close(); //Cerramos el scaner para liberar el espacio que utiliza.
    }
}
