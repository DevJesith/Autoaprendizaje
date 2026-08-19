package Ciclos;

public class NumeroImpares {
    public static void main(String[] args) {
        System.out.println("*** Numero impares de 0 a 20");

        var contador = 0;

        do {
            if (contador % 3 == 0){
                System.out.println(contador + " Con do-while");
            }
            contador++;
        }while (contador <= 20);

        while (contador >= 0){
            if (contador % 3 == 0){
                System.out.println(contador + " Con While");
            }
            contador--;
        }
    }
}
