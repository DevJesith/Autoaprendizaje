package Arreglos;

public class Matrices {
    public static void main(String[] args) {
        //Definimos una matriz
//        int[][] matriz = new int[2][3];

//        final var RENGLONES = 2;
//        final var COLUMNAS = 3;
//        var matriz = new int[RENGLONES][COLUMNAS];

        //Modificar los valores de la matriz
//        matriz[0][0] = 100;
//        matriz[0][1] = 200;
//        matriz[0][2] = 300;
//        matriz[1][0] = 400;
//        matriz[1][1] = 500;
//        matriz[1][2] = 600;

//        //Acedemos a los valores
//        System.out.println("Valor 1 [0][0] = " + matriz[0][0]);
//        System.out.println("Valor 2 [0][1] = " + matriz[0][1]);
//        System.out.println("Valor 3 [0][2] = " + matriz[0][2]);
//        System.out.println("Valor 4 [1][0] = " + matriz[1][0]);
//        System.out.println("Valor 5 [1][1] = " + matriz[1][1]);
//        System.out.println("Valor 6 [1][2] = " + matriz[1][2]);

        //iterar una matriz
//        for (int ren = 0; ren < RENGLONES; ren++) {
//            for (int colum = 0; colum < COLUMNAS ; colum++) {
//                System.out.println("Valor[" + ren + "][" + colum + "] = " + matriz[ren][colum] );
//            }
//
//        }

        var matriz = new int[][]{
                {100, 200, 300},
                {400, 500, 600}
        };

        for (int ren = 0; ren < matriz.length; ren++) {
            for (int colum = 0; colum < matriz[ren].length; colum++) {
                System.out.println("Valor[" + ren + "][" + colum + "] = " + matriz[ren][colum] );
            }

        }
    }
}
