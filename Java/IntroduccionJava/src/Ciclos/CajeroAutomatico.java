package Ciclos;

import java.util.Scanner;

public class CajeroAutomatico {

    public static void main(String[] args) {

        System.out.println("*** Cajero Automatico ***");

        // Entrada
        var consola = new Scanner(System.in);
        var cuenta = 1000.00;
        var salir = false;
        double retirar = 0;
        double depositar;

        while (!salir) {

            System.out.print("""
                    \nOperaciones que puedes realizar:
                    1. Consultar Saldo
                    2. Retirar
                    3. Depositar
                    4. Salir
                    Escoge una opcion:\s 
                    """);
            var seleccion = Integer.parseInt(consola.nextLine());

            switch (seleccion) {
                case 1:
                    System.out.printf("Tu saldo actual es: %.2f", cuenta);
                    break;

                case 2:
                    System.out.print("Ingrese el valor a retirar: ");
                    retirar = Double.parseDouble(consola.nextLine());
                    if (cuenta < retirar) {
                        System.out.println("Saldo insuficiente, saldo actual de: " + cuenta);
                    } else {
                        cuenta -= retirar;
                        System.out.println("Usted ha retirado $" + retirar + " y su saldo actual es de: $" + cuenta);
                    }
                    break;

                case 3:
                    System.out.print("Ingresa el monto a depositar: ");
                    depositar = Double.parseDouble(consola.nextLine());
                    cuenta += depositar;

                    System.out.println("Usted ha deposiado el valor de $" + depositar + ", asi que su saldo es de: $" + cuenta);
                    break;

                case 4:
                    System.out.println("Saliendo del sistema...");
                    salir = true;
                    break;

                default:
                    System.out.println("Opcion invalida");
                    break;
            }

        }
        System.out.println("Ha finalizado el proceso");
    }
}
