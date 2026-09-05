package Arreglos;

public class Areglos {
    public static void main(String[] args) {
        // Arreglos
        // 1. Declaramos un arreglo
//        int[] enteros;
        // 2. Inicializar
//        enteros = new int[3];

        // Declarar e inicialiazr un arreglo
        //int[] numeros = new int[2]
//        var numeros = new int[2];

//        var enteros = new int[5];
//        //Modificar
//        enteros[0] = 13;
//        enteros[1] = 21;
//        enteros[4] = 62;
//
//        System.out.println("valor 1 = " + enteros[0]);
//        System.out.println("valor 2 = " + enteros[1]);
//        System.out.println("valor 5 = " + enteros[4]);

//        int[] enteros = {100,200,300,400,500};
        var enteros2 = new int[]{100,200,300,400,500};

        // Iterar
        for (int i = 0; i < enteros2.length; i++) {
            System.out.println("Valor " + i + " = " + enteros2[i]);
        }

        //Direccion de memoria
        System.out.println(enteros2);


    }
}
