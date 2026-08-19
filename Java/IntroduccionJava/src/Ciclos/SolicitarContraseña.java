package Ciclos;

import java.util.Scanner;

public class SolicitarContraseña {
    public static void main(String[] args) {
        System.out.println("*** Solicitar contraseña al menos 6 caracteres ***");

        // Entrada
        var consola = new Scanner(System.in);


        System.out.print("Ingrese la contraseña mayor o igual a 6 caracteres: ");
        var password = consola.nextLine();


        while (password.length() < 6){
            System.out.println("El password no cumple con los requisitos. Debe tener al menos 6 caracteres");

            System.out.print("Ingrese un nuevo valor de password: ");
            password = consola.nextLine();
        }

        System.out.println("El valor de password es valido: " + password);


    }
}
