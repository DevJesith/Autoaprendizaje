package Arreglos;

import java.util.Scanner;

public class PromedioCalifaciones {
    public static void main(String[] args) {

        System.out.println(" *** Promedio de calificaciones ***");

        // Entrada
        var consola = new Scanner(System.in);

        System.out.print("Cuantas calificaciones deseas agregar?: ");
        var cantidadCalificaciones = Integer.parseInt(consola.nextLine());

        var calificacion = new int[cantidadCalificaciones];
        var suma = 0;
        var resultado = 0;


        for (int i = 0; i < cantidadCalificaciones; i++) {
            System.out.print("Calificacion" + "[" + i + "]" + " = " );
            calificacion[i] = Integer.parseInt(consola.nextLine());
        }

        for (int i = 0; i < cantidadCalificaciones; i++) {
            suma += calificacion[i];
        }
        resultado = suma / cantidadCalificaciones;


        System.out.println("Promedio de las calificaiones es: " + resultado);


    }
}
