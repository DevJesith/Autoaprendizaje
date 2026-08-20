package SentenciaDecision;

import java.util.Scanner;

public class SistemaAuth {
    public static void main(String[] args) {
        System.out.println("*** Sistema de autenticacion ***");

        //fundamentos.Constantes
        final var USUARIO_CORRECTO = "admin";
        final var PASSOWRD_CORRECTO = "123";

        //Entradas
        var consola = new Scanner(System.in);

        System.out.print("Ingrese el nombre del usuario: ");
        var usuario = consola.nextLine();

        System.out.print("Ingrese la contraseña del usuario: ");
        var password = consola.nextLine();

        String autenticacion;

        if (usuario.equals(USUARIO_CORRECTO) && password.equals(PASSOWRD_CORRECTO)){
            autenticacion = "Bienvenido al sistema";
        } else if (!usuario.equals(USUARIO_CORRECTO) && password.equals(PASSOWRD_CORRECTO)) {
            autenticacion = "Usuario invalido";
        } else if (usuario.equals(USUARIO_CORRECTO) && !password.equals(PASSOWRD_CORRECTO)) {
            autenticacion = "Contraseña invalida";
        } else {
            autenticacion = "Usuario y Password invalidos";
        }

        System.out.println(autenticacion);
    }
}
