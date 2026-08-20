package utils;

public class IndicesCadena {
    public static void main(String[] args) {
        // Manejo de indices en una cadena
        var cadena1 = "Hola mundo";


        // Recuperar el primer caracter
        var primerCaracter = cadena1.charAt(0); // Recuperar el caracter 'H'
        System.out.println(primerCaracter);
        // Recuperar el ultimo caracter (en la posicion 9)
        var ultimoCaracter = cadena1.charAt(9);
        System.out.println(ultimoCaracter);
        var caracter1 = cadena1.charAt(5);
        System.out.println(caracter1);
    }
}
