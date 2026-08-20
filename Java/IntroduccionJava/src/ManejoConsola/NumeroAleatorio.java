package ManejoConsola;

import java.util.Random;

public class NumeroAleatorio {
    public static void main(String[] args) {
        System.out.println("*** Numeros Aleatorios ***");
        var random = new Random();

        // Generar un numero aleatorio entre 0 y 9
        var numeroAleatorio = random.nextInt(10);
        System.out.println("numeroAleatorio 0 y 9 = " + numeroAleatorio);

        // Gnerar un numero aleatorio entre 1 y 10
        numeroAleatorio = random.nextInt(10) + 1;
        System.out.println("numero aleatorio 1 y 10: " + numeroAleatorio);

        //Generar un numero flotante entre 0.0 y 1.0
        var floatAleatorio = random.nextFloat();
        System.out.println("floatAleatorio = " + floatAleatorio);

        // Simular el lanzamiento de un dado (1 y 6)
        var dado = random.nextInt(6) + 1;
        System.out.println("Resultado de lanzar el dado: " + dado);
    }
}
