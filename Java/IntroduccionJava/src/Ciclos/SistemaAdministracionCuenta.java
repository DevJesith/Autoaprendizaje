package Ciclos;

import java.util.Scanner;

public class SistemaAdministracionCuenta {
    public static void main(String[] args) {
        System.out.println(" *** Sistema de administracion +++");

        var consola = new Scanner(System.in);

        var salir = false;

        //Iteracion del menu
        while (!salir){
            System.out.print("""
                    Menu:
                    1. Crear cuenta
                    2. Eliminar cuenta
                    3. Salir
                    Escoge una opcion: \s """);
            var opcion = consola.nextInt();

            // Evaluar cada opcion
            switch (opcion) {
                case 1 -> System.out.println("Creando tu cuenta...\n");
                case 2 -> System.out.println("Eliminando tu cuenta...\n");
                case 3 -> {
                    System.out.println("Saliendo del sistema. Hasta pronto");
                    salir = true;
                }
                default -> System.out.println("Opcion invalida...\n");
            }
        }
        System.out.println("Fin del sistema de administracion de cuenta");

    }
}
