package SentenciaDecision;

import java.util.Scanner;

public class MayorNumeros {
    public static void main(String[] args) {
        System.out.println("*** Saber cual es el mayor de 2 numeros");

        // Entrada
        var consola = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        var n1 = Integer.parseInt(consola.nextLine());

        System.out.print("Ingrese el segundo numero: ");
        var n2 = Integer.parseInt(consola.nextLine());

        var resultado = (n1 > n2) ? "El primer numero es mayor " + n1 : "El segundo numero es mayor " + n2;

        System.out.println(resultado);

    }
}
