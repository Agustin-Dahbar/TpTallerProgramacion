package trabajopractico;

import java.util.Scanner;

public class Tp25 {
	
	public static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instrucción en la que le pedimos entradas al usuario.
        System.out.println("Ingrese el alto de la matriz:");
        int alto = scanner.nextInt();

        System.out.println("Ingrese el ancho de la matriz:");
        int ancho = scanner.nextInt();

        // Título antes de dibujar la matriz.
        System.out.println("Matriz de cruces:");

        // Iteramos sobre las filas de la matriz (esto es determinado por la variable usada en la condición (alto)).
        for (int i = 0; i < alto; i++) 
        {
            for (int j = 0; j < ancho; j++) // Iteramos sobre las columnas de la matriz (ancho)
            {
                // Verificar si estamos en una posición donde se debe imprimir una cruz. Este if-else iterará por todas las columnas de cada fila.
            	//Es decir se ejecutará ancho.altura de veces. Ej 6 altura 4 anchura. 24 veces. Iterá por cada columna (4) de cada fila (6)
                if (i == alto / 2 || j == ancho / 2) 
                {
                    System.out.print("X "); // Imprimir una cruz
                } 
                else 
                {
                    System.out.print("  "); // Imprimir un espacio en blanco
                }
            }
            System.out.println(); // Salto de línea al final de cada fila
        }
        //El bucle externo iterará ÚNICAMENTE por cada fila, no por las columnas, mientras que el bucle interno iterará por todas las columnas de 
        //cada fila, es decir, si la altura es 6 y la anchura 4, el bucle externo iterará esas 6 veces (cada fila), mientras que el interno 24 veces 
        //las 4 columnas por cada fila. Cada vez que comenzamos con una nueva fila, el valor de j (var privada del bucle interno) se reinicia a 0
        //para poder volver a dibujar sobre esa fila. En este caso ya que ancho vale 4 y su division en 2 nos da 2, por la parte de J solo se pintará
        //al estar en la posicion indexada 2, que sería la tercer posición naturalmente hablando. Excepto en el caso en el que se cumpla por el 
        //lado de la I (la var del bucle externo) el resto de filas se imprimirán todas iguales ya que coincidirán en que su true se dió por la misma
        // variable (j) en este caso, la del bucle externo. 
        //En el caso en el que indiquemos 6 de altura y 4 de anchura, la fila que se pintará toda al completo (todas sus columnas) será la ubicada
        // en el índice 3, 4ta posición naturalmente hablando ya que (i == 3). El resto de filas tendrán impreso la misma columna (la indexada en 2)
        
	}

}


//public static void main(String[] args) 
//{
	//System.out.println("Expresado en metros ingresa: el alto y ancho de una matriz de cruces"); double alto = scanner.nextInt(); double ancho = scanner.nextInt();	
//}