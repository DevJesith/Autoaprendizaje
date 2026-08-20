package SentenciaDecision;

import java.util.Scanner;

public class EstacionAño {
    public static void main(String[] args) {
        System.out.println("*** Estacion del año ***");

        //Entrada
        var consola = new Scanner(System.in);

        System.out.print("Ingresa el valor numerico del mes: ");
        var mes = Integer.parseInt(consola.nextLine());

//        if (mes == 1 || mes == 2 || mes == 12) {
//            System.out.println("Invierno");
//        } else if (mes == 3 || mes == 4 || mes == 5){
//            System.out.println("Primavera");
//        } else if (mes == 6 || mes == 7 || mes == 8) {
//            System.out.println("Verano");
//        } else if (mes == 9 || mes == 10 || mes == 11) {
//            System.out.println("Otoño");
//        } else {
//            System.out.println("Estacion desconocida");
//        }

        switch (mes){
            case 1 -> System.out.println("Invierno");
            case 2 -> System.out.println("Invierno");
            case 3 -> System.out.println("Primavera");
            case 4 -> System.out.println("Primavera");
            case 5 -> System.out.println("Primavera");
            case 6 -> System.out.println("Verano");
            case 7 -> System.out.println("Verano");
            case 8 -> System.out.println("Verano");
            case 9 -> System.out.println("Otoño");
            case 10 -> System.out.println("Otoño");
            case 11 -> System.out.println("Otoño");
            case 12 -> System.out.println("Invierno");
            default -> System.out.println("Estacion invalida");
        }

        switch (mes){
            case 1, 2, 12 -> System.out.println("Invierno");
            case 3, 4, 5 -> System.out.println("Primavera");
            case 6, 7, 8 -> System.out.println("Verano");
            case 9, 10, 11 -> System.out.println("Otoño");
            default -> System.out.println("Estacion invalida");
        }
    }
}
