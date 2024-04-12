package trabajopractico;

import java.util.Scanner;

public class SimulacroParcial {

	    public static void main(String[] args) 
	    {
	        Scanner scanner = new Scanner(System.in);

	        int totalDias = 10; //Variable que almacenará la cantidad de días en los que se realizará la prueba. Se usará en la condición del bucle for.
	        int menorTiempoDia = 0; //Variable que almacenará el dia en el que sucedió el menor tiempo.
	        int menorTiempo = Integer.MAX_VALUE; //Variable que obtendrá el menor tiempo. La inicializamos con el máximo valor posible para que en la primer evaluación obtenga el valor ingresado y a partir de la 2da iteración comiencen las comparaciones.
	        int totalTiempo = 0;
	        
	        //Variables que representarán los requisitos para saber si está apto o no. (Una vez menos de 15, nunca mas de 20 y promedio 18 o menos. 
	        boolean mayorVeinteMinutos = false; //Esto debe quedar en false para que este apto.
	        boolean menorQuinceMinutos = false; //Esto tiene que quedar en true es una de las tantas condiciones para que este apto.
	        boolean apto = false;
	        
	        //Bucle for que iterará por los 10 días.
	        for (int dia = 1; dia <= totalDias; dia++) 
	        {
	            int tiempoPrueba; //Variable temporal y privada del bucle for. La != con la anterior es que está representará el tiempo de cada prueba individualmente.
	            
	            do //Bucle do while que comprobará que el usuario haya ingresado entre 0 y 99 inclusives. Si no repetirá el pedido de entrada de minutos de la prueba.
	            {
	                System.out.print("Ingrese el tiempo de la prueba del día " + dia + " en minutos (mayor que 0 y menor a 100): ");
	                tiempoPrueba = scanner.nextInt(); //Almacenamos el tiempo de la prueba en la variable privada que para eso esta.
	                
	            } while (tiempoPrueba <= 0 || tiempoPrueba >= 100); //Mientras el tiempo de la prueba sea menor a 0 o 0 o mayor a 100 o 100.

	            totalTiempo += tiempoPrueba; //Le sumamos los minutos de esta prueba a la variable que almacenará el total de los minutos. Se realizarán 10 sumas.

	            //Sentencia if que comprobará si el tiempo de la prueba en esta iteración es el menor o si el menor tiempo hasta ahora continúa siendolo.
	            if (tiempoPrueba < menorTiempo) 
	            {
	                menorTiempo = tiempoPrueba; //Actualizamos el valor del menorTiempo con el tiempo de la prueba actual ya que se cumplió la condición.
	                menorTiempoDia = dia; //Obtenemos el dia en el que se ocurrió el menor tiempo, lo encontramos en la variable privada y temporal del bucle for. La usamos para inicializar la variable global que esta destinada a almacenar este día.
	            }

	            
	            //Sentencias if en donde averiguaremos si esta apto o no.
	            if (tiempoPrueba <= 15) //Si el tiempo es 15 o menor 
	            {
	                menorQuinceMinutos= true; //Obtiene una de las condiciones para estar apto.
	            }

	            if (tiempoPrueba > 20) //Si el tiempo es mayor a 20 ya no podrá estar apto.
	            {
	                mayorVeinteMinutos = true; //Al finalizar el for se identificará este true y el atleta no quedará apto.
	            }
	            
	        }
	        //Fin del bucle for por ende la prueba y evaluación diaria.

	        
	        double promedioMinutos =  totalTiempo / totalDias; //Variable que obtendrá el promedio de minutos para con el saber si está apto o no.
	        
	        //mayorVienteMinutos dede dar false.
	        //menorQuinceMinutos debe dar true 
	        //promedioAprobado debe dar true //Eliminamos esto al final.
	        
	        //If que evaluará las 3 condiciones (si hizo una vez menos de 15, si nunca hizo más de 20 y si el promedio es 18 o menos).
	        if (mayorVeinteMinutos == false && menorQuinceMinutos == true && promedioMinutos <= 18) //Si apto es true y el promedio del tiempo del circuito es 18 o menos el atleta estará apto. 
	        {
	            System.out.println("El atleta es apto para la competencia.");
	            System.out.println("Promedio de tiempo: " + promedioMinutos + " minutos.");
	            System.out.println("Día con menor tiempo: " + menorTiempoDia);
	        } 
	        else //Si alguna de esas 3 variables tiene un valor booleano != a los indicados en la condición del if, se ejecutará el siguiente bloque de código.
	        {
	            System.out.println("El atleta no es apto para la competencia.");
	        }
	    }
}
