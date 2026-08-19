package Ciclos;

public class SumaAcumulativa {
    public static void main(String[] args) {
        System.out.println("*** Suma Acumulativa ***");

        final var MAXIMO = 5;
        var acumuladorSuma = 0;
        var numero = 1;

        // Ciclo While
//        //Iterar los valores
//
//        while (numero <= MAXIMO){
//
//            //Imprimir lo que va a sumar
//            System.out.println("(acumuladorSuma + numero) -> " + acumuladorSuma + " + " + numero);
//
//            //Realizar la suma acumulativa
//            acumuladorSuma += numero;
//            numero++;
//
//            //Imprimir la suma parcial acumulada
//            System.out.println("Suma parcial acumulada: " + acumuladorSuma + "\n");
//        }
//        System.out.println("Suma de los primeros " + MAXIMO + " numeros: " + acumuladorSuma);

        //Ciclo Do-While
//        do {
//            //Imprimir lo que va a sumar
//            System.out.println("(acumuladorSuma + numero) -> " + acumuladorSuma + " + " + numero);
//
//            //Realizar la suma acumulativa
//            acumuladorSuma += numero;
//            numero++;
//
//            System.out.println("Suma parcial acumulado: " + acumuladorSuma + "\n");
//        }while (numero <= MAXIMO);
//        System.out.println("Suma ed los primeros " + MAXIMO + " numeros: " + acumuladorSuma);

        //Ciclo For
        for (int i = 1; i <= MAXIMO; i++) {

            //Imprimir lo que va a sumar
            System.out.println("(acumuladorSuma + i) -> " + acumuladorSuma + " + " + i);

            //Realizar la suma acumulativa
            acumuladorSuma += i;

            //Imprimir la suma parcial
            System.out.println("La suma parcial es: " + acumuladorSuma + "\n");

        }
        System.out.println("La suma de los primeros " + MAXIMO + " suma: " + acumuladorSuma);
    }
}
