package Operadores;

import java.util.Scanner;

public class SistemaDescuentoVIP {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Descuento VIP");

        final var NO_PRODUCTOS_DESCUENTOS = 10;
        var consola = new Scanner(System.in);

        System.out.print("Cuantos productos comprastes?: ");
        var cantidadProductos = Integer.parseInt(consola.nextLine());

        System.out.print("Tienes membresia?: ");
        var tienesMembresia = Boolean.parseBoolean(consola.nextLine());

        var esElegibleDescuento = cantidadProductos >= NO_PRODUCTOS_DESCUENTOS && tienesMembresia;

        System.out.println("tienes acceso al descuento VIP = " + esElegibleDescuento);


    }
}
