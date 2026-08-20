package utils;

public class Cadenas {
    public static void main(String[] args) {
        var cadena1 = "Hola";
        var cadena2 = new String("Mundo");
        var cadena3 = cadena1 + " " + cadena2;

        // Cadena multiple lineas (text block)
        var cadena4 = """
                Este es 
                un texto
                multilinea
                """;

        System.out.println(cadena1);
        System.out.println(cadena2);
        System.out.println(cadena3);
        System.out.println(cadena4);
    }
}
