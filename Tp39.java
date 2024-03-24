package trabajopractico;

import java.util.ArrayList;
import java.util.Scanner;

public class Tp39 {

	public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);

		//INGRESO DE CANTIDAD DE JUGADORES
		System.out.println("Ingrese la cantidad de jugadores");
		int numeroJugadores = scanner.nextInt();

        while (numeroJugadores < 2) //Bucle while. Se ejecutará si se ingresaron menos de 2 jugadores. 
        {
            System.out.println("Dato incorrecto. Deben ser al menos 2.");
            numeroJugadores = scanner.nextInt(); //Le pedimos al usuario que ingrese la cant de participantes. Hasta que no entre 2 o más se repetirá el bucle ya que se seguirá cumpliendo la condicion.
            scanner.nextLine(); // Limpiamos el buffer
        }

        //Al ya haber ingresado 2 o mas, continuamos con el programa..
        
        // Declaración de listas (en C#) que almacenarán los nombres de los jugadores y sus puntajes finales (que serán la suma de sus 3 puntajes temporales e individuales. Habrá un un nombre y un puntaje por cada jugador.
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Integer> puntajesFinales = new ArrayList<>();
 
        //INGRESO DE NOMBRES DE LOS JUGADORES
        // Asignacion de las listas mediante bucle for. Los nombres los brindará el usuario. Los puntajes finales los inicializamos en 0 para evitar problemas.
        for (int i = 0; i < numeroJugadores; i++)
        {
            System.out.println("Ingrese el nombre del jugador " + (i + 1) + ":"); //Instruccion
            String nombre = scanner.nextLine(); //Entrada del nombre.
            nombres.add(nombre); //Añadimos el nombre entrado a la lista.
            puntajesFinales.add(0); // Inicializamos el primer tiro de cada participante en 0.
        }

        
        // Contador para los tiros al centro.
        int tirosAlCentro = 0;
        
        //BUCLE INTERNO: SE DECLARA LA VARIABLE QUE ALMACENARÁ EL PUNTAJE TOTAL DE CADA JUGADOR. 
        //BUCLE EXTERNO: SE OBTIENEN LOS PUNTAJES DE CADA TIRO SEGUN LA DISTANCIA INGRESADA POR EL USUARIO, ESTOS SE SUMAN PARA GENERAR EL PUNTAJE TOTAL. 
        //BUCLE INTERNO (de nuevo): ESTOS VALORES OBTUVIDOS SE ALMACENAN EN LA LISTA DE PUNTAJES. SE REPETIRÁ ESTE PROCESO PARA CADA PARTICIPANTE
        for (int i = 0; i < numeroJugadores; i++) // Para iterar por todos los elementos de algo la condicion debe ser 0 < nombre
        {
            int puntajeTotalDelJugador  = 0; //Variable que almacenará la suma de los 3 puntajes para cada jugador. Al hacer eso se almacenará en la lista. Se repetirá por cada jugador restante.
            
            // Bucle interno que se ejecuta por cada tiro realizado. Obtiene la puntuacion de cada uno y luego suma las 3 para obtener el total del puntaje de este jugador iterado en el bucle completo.
            for (int j = 0; j < 3; j++) //Se ejecutará 3 veces (3 tiros) para los valores de 0, 1 y 2.
            {
                System.out.println("Ingrese la distancia del tiro " + (j + 1) + " para " + nombres.get(i) + ":"); //Via get() obtenemos el nombre. Es equivalente nombres[i] en C# o JS.
                int distancia = scanner.nextInt();
                scanner.nextLine(); // Limpiamos el buffer

                //Obtenemos el puntaje del tiro segun la distancia mediante un metodo.
                int puntajePorTiro = calcularPuntaje(distancia); //Calculamos el puntaje via un metodo argumentado con la distancia entrada por el usuario.
                puntajeTotalDelJugador += puntajePorTiro; //Sumamos los puntajes individuales por iteracion en la variable que declaró el bucle externo que almacena el total del jugador iterado.

                // int puntajeTotal += calcularPuntaje(distancia); esto nos ahorraría código pero prefiero plantearlo con mayor cantidad de datos
                
                //Sentencia if que identificará los tiros al centro
                if (distancia == 0) // (puntajePorTiro = 500) sería compatible de igual manera, ya que eso indicaría tiro en el centro. 
                {
                    tirosAlCentro++;
                }
            }
            //El bucle externo se ejecutó las 3 veces (una por cada tiro) ya tenemos los puntajes del primer jugador. Ahora se los pushearemos a la lista que almacenará los. 

            puntajesFinales.set(i, puntajeTotalDelJugador); //A la lista 'puntajesFinales' le agregamos los puntajes de cada jugador.
            //Esta linea se encuentra en el bucle externo ya que no queremos almacenar cada puntaje de cada tiro, si no solo los puntajes finales de cada uno de los jugadores. Necesitamos pushearle 3 valores. Cada uno de estos valores se obtiene cada 3 iteraciones del bucle externo (puntaje total de cada jugador)
        }

        //Ya finalizó la primer ejecución del bucle entero (incluyendo ambos) en ella el interno se ejecutó una vez (declaro y asignó la puntuacion del jugador iterado en la primer repetición. 
        //Mientras que el bucle externo se ejecutó 3 veces (una para cada puntuacion de cada tiro), en estas ejecuciones obtuvo y sumo el puntaje de los 3 tiros del mismo y hasta ahora único jugador.
        
        //Ahora se volverá a repetir este bucle por cada jugador restante (3 ejecuciones del bucle externo por cada una del interno) 
        
        
        
        // Encontramos al jugador con el puntaje más alto. Compararemos en un if los puntajes finales de cada jugador (almacenados en la lista de puntajes)
        int indiceGanador = 0; //Almacenamos el indice del ganador para imprimirlo.
        int puntajeMaximo = 0; //Le hacemos un get a la lista que tiene los puntajes finales de todos los jugadores.
        
        //Bucle que comparará los valores de la lista puntajesFinales para identificar al puntaje más alto.
        for (int i = 0; i < numeroJugadores; i++) //Recorremos por todos los jugadores.
        {
            if (puntajesFinales.get(i) > puntajeMaximo) //Mediante indice accederemos a cada valor de la lista que almacena los puntajes de los participantes. El primero iterado se almacenará en la variable puntajeMaximo, el resto se compararán con ese primero almacenado. Quedará el más grande.
            {
                indiceGanador = i; //Si se da true y el puntaje iterado es el máximo, guardamos su indice para usarlo en la impresion del nombre del jugador.
                puntajeMaximo = puntajesFinales.get(i); //Sobreescribimos el valor de puntajeMaximo con el nuevo puntaje mas alto iterado.
            }
        }

        // Mostramos el nombre del ganador y su puntaje
        System.out.println("El ganador del torneo es: " + nombres.get(indiceGanador) + " con un puntaje de " + puntajeMaximo);
        System.out.println("La cantidad total de tiros al centro es: " + tirosAlCentro);

        scanner.close(); 
    }

    // Metodo que calculará el puntaje (linea 57) según la distancia de los tiros.
    public static int calcularPuntaje(int distancia) 
    {
        if (distancia == 0) // Solo 0
        {
            return 500;
        } 
        else if (distancia <= 10) //De 1 a 10.
        {
            return 250;
        } 
        else if (distancia <= 50) //De 11 a 50
        {
            return 100;
        } 
        else //De 51 a infinito. //Fuera del tablero.
        {
            return 0;
        }
    }
}

