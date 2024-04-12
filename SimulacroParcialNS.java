package trabajopractico;

import java.util.Scanner;

public class SimulacroParcialNS 
{
	public static void main(String[] args) 
	{	
		Scanner scanner = new Scanner(System.in);
		
		int diasTotales = 0; //Variable que se evalúa en la condición del while para respetar los 10 días de pruebas.
		double minutosTotales = 0; //Almacenará el total de los minutos para sacar el promedio (uno de los requisitos). 
		//La tipamos con double para aceptar segundos y que el promedio sea lo más exacto posible.
		
		//Variables que representan 2 de los 3 requisitos del atleta para que este apto.
		boolean masDe20Minutos = false; 
		boolean menosDe15Minutos = false;
		
		//Variables de salida final
		double tiempoMinimo = Integer.MAX_VALUE; //La inicializamos con un max value para que cualquier dato ingresado al comienzo sea menor y se cumpla lo que deseamos que es que obtenga el primer valor con el que se compare que serán los minutos ingresados.
		int diaDeRecord = 0; //Almacenaremos númericamente el dia en el que se hizó el tiempo más bajo.
		
		//While externo que ejecutará el programa. Siempre y cuando estemos entre los 10 días de prueba 
		//y el atleta no se haya demorado más de 20 minutos en alguna prueba ya que eso descartaria que este apto.
		while(diasTotales < 10 && !masDe20Minutos) 
		{
			//Instrucciones e ingreso de los minutos que demoró el atleta en la prueba.
			System.out.println("Ingresa los minutos de la prueba realizada para el día " + (diasTotales + 1));
			double minutosPrueba = scanner.nextInt();
			
			//While interno que repetirá el pedido de entrada si los minutos ingresados son incorrectos.
			while(!(minutosPrueba > 0 && minutosPrueba < 100)) //Explicación del ! en la condición del while: 
																	//-La condición dice: Si minutosPrueba es mayor a 0 y menor a 100 es decir entre 1 y 99 inclusives. Pero eso esta predecedido de un ! que indica invertir el caso. Entonces el while se ejecutará cuando NO SUCEDA lo de la condición es decir cuando sea DIFERENTE (!) a la condición que es entre 1 y 99, En resumen, cuando NO SEA entre 1 y 99.
			{
				System.out.println("Por favor ingresa minutos válidos para el dia " + (diasTotales + 1) + " (desde 1 hasta 99)");
				minutosPrueba = scanner.nextInt();
			}
			
			//Si llegamos acá no se ejecuto el while anterior, entonces los minutos son correctos.
			diasTotales++; //Aumentamos el conteo de los días en 1.
			minutosTotales += minutosPrueba; //Sumamos los minutos de la prueba a la suma total de minutos que servirá para obtener el promedio (3er requisito de aptitud)
	
			//Comprobamos si los minutos de esta iteración son los menores ingresados.
			if(minutosPrueba < tiempoMinimo) 
			{
				tiempoMinimo = minutosPrueba; //Asignamos el nuevo tiempo record a la var correspondiente.
				diaDeRecord = diasTotales ; //Obtenemos el dia en el que se hizo el record. 
			}
			
			
			//Ahora averiguaremos 2 de los 3 requisitos.
			if(minutosPrueba < 15) //Si hizo menos de 15 minutos.
			{
				menosDe15Minutos = true;
			}
			else if(minutosPrueba > 20) //Si hizo más de 20 minutos.
			{
				masDe20Minutos = true;
			}
			
			//Necesitamos que menos15 se cumple al menos una vez es decir finalice con TRUE.
			//y que Mas20 nunca suceda y se mantenga en false, ya que inicializamos ambas en FALSE.
		}
		
		//Declaramos el promedio y realizamos su obtención (el último requisito para conocer su aptitud).
		final double PROMEDIO = minutosTotales/(diasTotales); 
		
		//Ya obtenidos todos los datos necesarios hacemos la evaluación de aptitud fuera del while.
		if(menosDe15Minutos && !masDe20Minutos && PROMEDIO <= 18) //Si menosDe15Minutos == true y masDe20Minutos == false (por el ! que indica diferente o inverso) y PROMEDIO menor o igual a 18.
		{
			System.out.println("Esta apto. Su menor tiempo fue " + tiempoMinimo + " minutos y lo logró en el día " + diaDeRecord + ". Su promedio fue de " + PROMEDIO + " minutos" ); //Ahora no necesitamos el -1 ya que esta es la variable que almacenaba el valor habiendo usado el menos uno, es diasTotales a la que se le debe restar un valor.
		}
		else 
		{
			System.out.println("El atleta no es apto.");
		}
		
		//Ahora averiguaremos e imprimiriemos porque no esta apto (estos son detalles, no es necesario)
		if(masDe20Minutos) //Si var es true
		{
			System.out.println("Tardó más de 20 minutos en una prueba");
		}
		if(PROMEDIO > 18) //Si PROMEDIO es mayor 18.
		{
			System.out.println("No cumple con el promedio. Dió " + PROMEDIO + " no podía superar 18");
		}
		if(!menosDe15Minutos) //Si var es false
		{
			System.out.println("Nunca hizo menos de 15 minutos.");
		}
		
		
	}
}
