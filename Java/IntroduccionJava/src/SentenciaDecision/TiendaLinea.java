package SentenciaDecision;

import java.util.Scanner;

public class TiendaLinea {
    public static void main(String[] args) {
        System.out.println("*** Tienda en linea ***");

        var consola = new Scanner(System.in);

        //Variables
        final var MONTO_MINIMO = 1000;
        var descuentoMayorCompra = 0.10;
        var descuentoMiembro = 0.05;
        double respuesta, descuento;

        // Entrada
        System.out.print("Cuanto fue su compra?: ");
        var valorCompra = Double.parseDouble(consola.nextLine());

        System.out.print("Eres miembro de la tienda (true/false)?: ");
        var miembroTienda = Boolean.parseBoolean(consola.nextLine());

        // Operacion
        if (valorCompra >= MONTO_MINIMO) {
            descuento = valorCompra * descuentoMayorCompra;
            respuesta = valorCompra - descuento;


        } else if (miembroTienda) {
            descuento = valorCompra * descuentoMiembro;
            respuesta = valorCompra - descuento;

        } else {
            descuento = valorCompra;
            respuesta = valorCompra - descuento;
        }

        System.out.printf("""
                    El valor de su compra fue de: %.2f
                    El total de su compra es de: %.2f
                    El descuento aplicado fue de: %.2f
                    """, valorCompra, respuesta, descuento);




    }
}
