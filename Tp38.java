package trabajopractico;

import java.util.Scanner;

public class Tp38 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Datos que el usuario deberá ingresar para acceder.
        String nombreUsuario = "admin";
        int password = 123456;
        int intentosRealizados = 0; //Este valor incrementará en uno en cada iteración donde el usuario falle credenciales.
        //Al llegar a 3 se bloquearán los intentos.
        
        //Bucle do while.. // Le pedimos al usuario que haga el log in y guardamos sus datos entrados para compararlos con los correctos.
        do 
        {
            System.out.println("Por favor ingresa tu nombre de usuario");
            String nombreUsuarioIngresado = scanner.nextLine();
            
            System.out.println("Ahora ingresa tu contraseña");
            int passwordIngresada = scanner.nextInt();
            scanner.nextLine(); //Limpiamos bufer, el enter del nextInt() generó un caracter de nueva línea que ocasionó problemas.
            
            intentosRealizados++; //Sumamos este intento a la variable que los almacena.
            
            //Bifurcamos en 3 las posibilidades. Los datos son correctos y se sale del bucle. Si no son correctos y aún quedan intentos se muestra el else. Si no son corrcetos y no hay mas intentos se bloquea la cuenta y se sale del while por la condicion == FALSE.
            if (nombreUsuarioIngresado.equals(nombreUsuario) && passwordIngresada == password) 
            {
                System.out.println("Acceso concedido en " + intentosRealizados + " intentos");
                break; // Paramos el bucle do.. while.
            }
            else if(intentosRealizados == 3) 
            {
            	//Si los intentos realizados llegaron a 3 se saldrá del bucle y le mostraremos al usuario: 
                System.out.println("Se ha bloqueado la cuenta por alcanzar el los intentos máximos permitidos.");
                break;                
            }
            else 
            {
                 	//Falló las credenciales, pierde un intento. Si aún tiene intentos, sigue la línea 38.
                    System.out.println("Credenciales inválidas.");
            }
        } 
        while (intentosRealizados == 3); 

        scanner.close(); // Cierra el Scanner al finalizar el programa
    }
}
