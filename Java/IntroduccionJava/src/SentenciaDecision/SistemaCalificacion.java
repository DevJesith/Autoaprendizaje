package SentenciaDecision;

import java.util.Scanner;

public class SistemaCalificacion {
    public static void main(String[] args) {
        System.out.println("Sistema de calificacion");

        //Entrada
        var consola = new Scanner(System.in);

        System.out.print("Ingrese su calificacion: ");
        var calificacion = Integer.parseInt(consola.nextLine());

        String calificacionLetra;

        if (calificacion >= 9 && calificacion <= 10) {
            calificacionLetra = "A";
        } else if (calificacion >= 8 && calificacion < 9) {
            calificacionLetra = "B";
        } else if (calificacion >= 7 && calificacion < 8) {
            calificacionLetra = "C";
        } else if (calificacion >= 6 && calificacion < 7) {
            calificacionLetra = "D";
        } else if (calificacion >= 0 && calificacion < 6) {
            calificacionLetra = "F";
        } else {
            calificacionLetra = "Valor desconocido";
        }

        System.out.printf("""
                Calificacion numero es: %d
                Calificacion convertida a letra es una: %s
                """, calificacion, calificacionLetra);

    }
}
