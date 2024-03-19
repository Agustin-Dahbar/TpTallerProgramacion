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
        do {
            System.out.println("Por favor ingresa tu nombre de usuario");
            String nombreUsuarioIngresado = scanner.nextLine();
            
            System.out.println("Ahora ingresa tu contraseña");
            int passwordIngresada = scanner.nextInt();
            scanner.nextLine();
            
            //Verificamos si los datos ingresados son correctos.
            if (nombreUsuarioIngresado.equals(nombreUsuario) && passwordIngresada == password) 
            {
                System.out.println("Acceso concedido");
                break; // 
            } 
            else 
            {
                intentosRealizados++; //Falló las credenciales, pierde un intento. Si aún tiene intentos, sigue la linea 38.
                    System.out.println("Credenciales inválidas.");
            }
        } while (intentosRealizados < 3);

        //Si los intentos realizados llegaron a 3 se saldrá del bucle y le mostraremos al usuario: 
        System.out.println("Se ha bloqueado la cuenta");
        
        scanner.close(); // Cierra el Scanner al finalizar el programa
    }
}
