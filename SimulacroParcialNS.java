package trabajopractico;

import java.util.Scanner;

public class SimulacroParcialNS 
{
	public static void main(String[] args) 
	{	
		Scanner scanner = new Scanner(System.in);
		
		int diasTotales = 1; //Variable que se evalúa en la condición del while para respetar los 10 días de pruebas.
		double minutosTotales = 0; //Almacenará el total de los minutos para sacar el promedio (uno de los requisitos). 
		//La tipamos con double para aceptar segundos y que el promedio sea lo más exacto posible.
		
		//Variables que representan los 3 requisitos del atleta para que este apto.
		boolean masDe20Minutos = false; 
		boolean menosDe15Minutos = false;
		final double PROMEDIO;
		
		//Variables de salida final
		int tiempoMinimo = Integer.MAX_VALUE; //La inicializamos con un max value para que cualquier dato ingresado al comienzo sea menor y se cumpla lo que deseamos que es que obtenga el primer valor con el que se compare que serán los minutos ingresados.
		int diaDeRecord = 0; //Almacenaremos númericamente el dia en el que se hizó el tiempo más bajo.
		
		//While que ejecutará el programa. Siempre y cuando estemos entre los 10 días de prueba 
		//y el atleta no se haya demorado más de 20 minutos en alguna prueba ya que eso descartaria que este apto.
		while(diasTotales <= 10 && masDe20Minutos == false) 
		{
			//Instrucciones e ingreso de los minutos que demoró el atleta en la prueba.
			System.out.println("Ingresa los minutos de la prueba realizada para el día " + diasTotales);
			int minutosPrueba = scanner.nextInt();
			
			//While que repetirá el pedido de entrada si los minutos ingresados son incorrectos.
			while(!(minutosPrueba > 0 && minutosPrueba < 100)) //Explicación del ! en la condición del while: 
																	//-La condición dice: Si minutosPrueba es mayor a 0 y menor a 100 es decir entre 1 y 99 inclusives. Pero eso esta predecedido de un ! que indica invertir el caso. Entonces el while se ejecutará cuando NO SUCEDA lo de la condición es decir cuando sea DIFERENTE (!) a la condición que es entre 1 y 99, En resumen, cuando NO SEA entre 1 y 99.
			{
				System.out.println("Por favor ingresa minutos válidos para el dia" + diasTotales + " (desde 1 hasta 99)");
				minutosPrueba = scanner.nextInt();
			}
			
			//Si llegamos acá no se ejecuto el while anterior, entonces los minutos son correctos.
			diasTotales++; //Aumentamos el conteo de los días en 1.
			minutosTotales += minutosPrueba; //Sumamos los minutos de la prueba a la suma total de minutos que servirá para obtener el promedio (3er requisito de aptitud)
	
			//Comprobamos si los minutos de esta iteración son los menores ingresados.
			if(minutosPrueba < tiempoMinimo) 
			{
				tiempoMinimo = minutosPrueba; //Asignamos el nuevo tiempo record a la var correspondiente.
				diaDeRecord = diasTotales -1; //Obtenemos el dia en el que se hizo el record. Le restamos uno porque diasTotales vale un valor más del que deberia, ya que su aumento en uno (línea 42 provocó que ahora tenga un valor extra, ya que habiamos decidido inicializarlo en uno para que la salida de cada pedido de dia pueda devolvernos inicialmente el día en el que estamos. Por eso es necesaria la resta.
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
		
		//Realizamos la obtención del promedio.
		PROMEDIO = minutosTotales/(diasTotales -1); //Recordemos, diasTotales tiene un valor más del debido debido a mi inicialización en 1 para lograr el número impreso en consola en cada pedido, por eso al hacer la suma necesaria queda con un valor extra y requerimos de la resta.
		
		//Ya obtenidos todos los datos necesarios hacemos la evaluación final fuera del while.
		if(menosDe15Minutos == true && masDe20Minutos == false && PROMEDIO <= 18) 
		{
			System.out.println("Esta apto. Su menor tiempo fue " + tiempoMinimo + " y lo logró en el día " + diaDeRecord + ". Su promedio fue de " + PROMEDIO+ " minutos" ); //Ahora no necesitamos el -1 ya que esta es la variable que almacenaba el valor habiendo usado el menos uno, es diasTotales a la que se le debe restar un valor.
		}
		else 
		{
			System.out.println("El atleta no es apto.");
		}
		
		//Ahora averiguaremos e imprimiriemos porque no esta apto (estos son detalles, no es necesario)
		if(masDe20Minutos == true) 
		{
			System.out.println("Tardó más de 20 minutos en una prueba");
		}
		if(PROMEDIO > 18) 
		{
			System.out.println("No cumple con el promedio");
		}
		if(menosDe15Minutos == false) 
		{
			System.out.println("Nunca hizo menos de 15 minutos.");
		}
		
		
	}
}
