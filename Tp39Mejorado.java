package trabajopractico;

import java.util.Scanner;

public class Tp39Mejorado {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Variables de salida que usaremos en el programa.
        String nombreGanador = ""; //Variable que almacenará el nombre del ganador. 
        int puntajeMaximo = 0; //Variable que almacenará el puntaje máximo.
        int tirosAlCentro = 0; //Variable que almacenará los tiros al centro.
        
        //Instrucción y entrada de cant de jugadores.
        System.out.println("Ingresa la cantidad de jugadores.");
        int numeroJugadores = scanner.nextInt(); //Variable que tendrá la cantidad de jugadores.
        
      //Bucle que se repetirá si el usuario no ingreso al menos 2 participantes.
        while (numeroJugadores < 2) { 
            System.out.println("Datos inválidos. Deben ser al menos 2.");
            numeroJugadores = scanner.nextInt();
            scanner.nextLine(); // Limpiamos el buffer
        }
        //Uso dos entradas y no repito la primera para poder tener 2 salidas de texto diferentes. La instrucción inicial y la respuesta al mal ingreso. Si reducieramos el código se repetiria la misma entrada dentro del while.
        
        
        //Creamos un BUCLE FOR EXTERNO que iterará por los jugadores (es decir, una vez por cada jugador). Para así poder darles un nombre a cada uno y analizar el puntaje de cada uno 
        //para identificar si es el mayor hasta ahora o no.
        for (int i = 0; i < numeroJugadores; i++) 
        {
            System.out.println("Ingrese el nombre del jugador " + (i + 1) + ":");
            String nombre = scanner.nextLine();
            int puntajeTotalDelJugador = 0;
            
           //Creamos un FOR INTERNO que iterará por los tiros de cada jugador (siempre serán 3). Obtendremos el valor de cada tiro para sumarlos a los 3 y saber su puntaje total.
            for (int j = 0; j < 3; j++) 
            {
                System.out.println("Ingrese la distancia del tiro " + (j + 1) + " del jugador " + nombre + ":"); // Le debemos sumar uno a J ya que se inicializó con 0 en su declaración.
                int distancia = scanner.nextInt(); //Indicamos la distancia del tiro con respecto al centro. Este valor entrado por el usuario será el argumento de una función.
                scanner.nextLine(); // Limpiamos el buffer

                int puntajePorTiro = calcularPuntaje(distancia); //Obtenemos el puntaje d cada tiro mediante la función argumentada con la distancia ingresada anteriormente x el usuario.
                puntajeTotalDelJugador += puntajePorTiro; //Sumamos los 3 puntajes de los tiros para obtener el puntaje total del jugador.

                if (distancia == 0) //Sentencia IF que identifica los tiros al centro. 
                {
                    tirosAlCentro++;
                }
            }

            //Habiendo obtenido el puntajeTotalDelJugador volvemos al bucle externo para verificar si es la máxima puntuación hasta ahora..
            if (puntajeTotalDelJugador > puntajeMaximo) 
            {												
                puntajeMaximo = puntajeTotalDelJugador; //Actualizamos el puntaje máximo.
                nombreGanador = nombre; //Actualizamos el nombre del actual ganador.
            }
        }

        //En los bucles hay variables privadas que se declararon allí que son trascendentales para la obtención de los valores que tendrán las variables de salida finales.
        //Ejs: 
        // "distancia" almacenará la distancia del tiro con respecto al centro para obtener un valor de puntuación siendo argumentada en una función.
        //"puntajePorTiro" que almacenará el puntaje de cada tiro obtenido mediante la función y su argumento recién explicados.
        //"puntajeTotalDelJugador" que almacenará la suma de los 3 tiros, es decir sumará todos los valores que obtendrá "puntajePorTiro". Luego comparará esta variable de todos los 
        //jugadores, la mayor írá a "puntajeMaximo"
        //Y luego nombre que almacenará todos los nombres de los jugadores para en el mismo bloque IF en el que se averigua el puntaje maximo, también se averigua el nombre de quien tiene ese puntajeMaximo.
        //Por que nombre esta en el bucle externo y los tiros en el interno? Porque por cada jugador hay un nombre y 3 tiros, esto hace imposible que este en el mismo bucle, cada uno 
        //necesita diferentes repeticiones. Es por eso además que seleccione el bucle for, el ideal para este caso, especialmente para el interno donde se sabe que solo serán 3 ciclos.
        
        //Ya fuera de los bucles devolvemos la información obtenida en ellos (puntajeMaximo y nombreGanador).
        System.out.println("El ganador del torneo es: " + nombreGanador + " con un puntaje de " + puntajeMaximo);
        System.out.println("La cantidad total de tiros al centro es: " + tirosAlCentro);
        scanner.close();
    }

    //Función que llamamos para que averigue el puntaje de cada tiro. Es llamada 3 veces, sumamos sus 3 returns para almacenar el resultado en puntajeTotalDelJugador.
    public static int calcularPuntaje(int distancia) 
    {
        if (distancia == 0) 
        {
            return 500;
        } 
        else if (distancia <= 10) 
        {
            return 250;
        } 
        else if (distancia <= 50) 
        {
            return 100;
        } 
        else 
        {
            return 0;
        }
    }
}
