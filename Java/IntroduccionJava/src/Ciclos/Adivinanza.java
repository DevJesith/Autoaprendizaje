package Ciclos;

import java.util.Random;
import java.util.Scanner;

public class Adivinanza {
    public static void main(String[] args) {
        System.out.println("*** Juego de adivinanza ***");

        //Entrada
        var consola = new Scanner(System.in);
        var random = new Random();
        var numeroRandom = random.nextInt(50) + 1;
        var limite = 0;
        var numeroIntento = 10;

        System.out.print("Ingrese el numero: ");
        var numero = Integer.parseInt(consola.nextLine());

        while (numero != numeroRandom && limite < numeroIntento ){
            if (numero >= numeroRandom){
                System.out.print("El numero que ingresaste es mayor, vuelve intentarlo: ");
                numero = Integer.parseInt(consola.nextLine());
            } else {
                System.out.print("El numero que ingresaste es menor, vuelve intentarlo: ");
                numero = Integer.parseInt(consola.nextLine());
            }
            limite++;
        }

        if (numero == numeroRandom){
            System.out.println("Felicitaciones, pudiste adivinar el numero: " + numeroRandom);
        } else {
            System.out.println("Lo siento, has agotado tus intentos: " + numeroIntento);
            System.out.println("El numero secreto era: " + numeroRandom);
        }
    }
}
