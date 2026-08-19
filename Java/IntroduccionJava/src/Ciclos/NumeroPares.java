package Ciclos;

public class NumeroPares {
    public static void main(String[] args) {
        System.out.println("*** Numeros Pares del 1 al 20");

        var contador = 1;
        while (contador <= 20){
            if (contador % 3 == 0){
                System.out.println(contador);
            }
            contador++;
        }
    }
}
