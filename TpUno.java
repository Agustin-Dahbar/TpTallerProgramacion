package trabajopractico;

import java.util.Scanner; //Referencia para poder utilizar la clase Scanner ya que no esta declarada aquí.
						//De esta clase heredaremos el metodo a usar. Este metodo se declaro dentro de ella.
public class TpUno {

	//Creamos una objeto Scanner instanciando su clase.
	public static final Scanner scanner = new Scanner(System.in); 
	
	
	public static void main(String[] args) 
	{
		
		//Instrucción para el usuario.
		System.out.println("Ingresa tu nombre por favor..");
		
		// Mediante la funcion nextLine le permitimos al usuario ingresar su nombre.
		//El nombre que ingrese se almacenará en la variable nombre que se declarará .
		String nombre = scanner.nextLine();
		
		//Imprimimos la variable nombre (que almacena la entrada del usuario) 
		System.out.println("Bienvenido " + nombre); 
	}
	
	
}
