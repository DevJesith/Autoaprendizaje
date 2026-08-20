package SentenciaDecision;

import java.util.Scanner;

public class SistemaEnvios {
    public static void main(String[] args) {
        System.out.println("*** Sistema de envios ***");

        //fundamentos.Constantes
        final var TARIFA_NACIONAL = 10;
        final var TARIFA_INTERNACIONAL = 20;

        //Entradas
        var consola = new Scanner(System.in);

        System.out.print("Ingrese el pais del destino: ");
        var destino = consola.nextLine().toLowerCase();

        System.out.print("Ingrese el kg del paquete");
        var peso = Double.parseDouble(consola.nextLine());

        double costoTotal = 0.0;

        switch (destino){
            case "internacional":
                costoTotal = TARIFA_INTERNACIONAL * peso;
                break;

            case "nacional":
                costoTotal = TARIFA_NACIONAL * peso;
                break;

            default:
                System.out.println("Debes seleccionar unas de las dos opciones");
                break;
        }

        System.out.printf("""
                El costo de envio a nivel %s del paquete es de: $%.2f
                """, destino, costoTotal);


    }
}
