package POO.prueba;

import POO.Aritmetica;

public class pruebaAritmetica {

    public static void main(String[] args) {
        System.out.println("*** Ejemplo aritmerica ***");
        var aritmetica = new Aritmetica(5,7);
        System.out.println("Atributo operando1: " + aritmetica.getOperando1());
        aritmetica.setOperando1(10);
        aritmetica.setOperando2(15);
        aritmetica.sumar();
        aritmetica.resta();


    }
}
