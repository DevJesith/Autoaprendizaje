package Operadores;

import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println("*** Sistema de autenticacion ***");

        final var consola = new Scanner(System.in);

        //Credenciales
        final var USER = "ADMIN";
        final var PASSWORD = "123";

        // Pregunta
        System.out.print("Cual es tu usuario: ");
        var isAdmin = consola.nextLine();

        System.out.print("Cual es tu contraseña: ");
        var isPassowrd = consola.nextLine();

        var isCorrect = isAdmin.equals(USER) && isPassowrd.equals(PASSWORD);

        // lOGIN
        System.out.println(isCorrect ? "Logueado" : "Credenciales incorrecta");




    }
}
