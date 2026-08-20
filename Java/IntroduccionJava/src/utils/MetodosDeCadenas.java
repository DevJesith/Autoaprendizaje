package utils;

public class MetodosDeCadenas {
    public static void main(String[] args) {
        // Metodos de cadenas
        var cadena1 = "Hola Mundo";

        // Obtener el largo de una cadena
        var longitud = cadena1.length();
        System.out.println("Longitud: " + longitud);

        // Reemplazar caracteres
        var nuevaCadena = cadena1.replace('o', 'a');
        System.out.println("nuevaCadena = " + nuevaCadena);

        // Convertir a mayusculas
        var mayusculas = cadena1.toUpperCase();
        System.out.println("mayusculas = " + mayusculas);

        // Convertir a minusculas
        var minusculas = cadena1.toLowerCase();
        System.out.println("minusculas = " + minusculas);

        // Eliminar espacias al inicio al final
        var cadena2 = "        Leo Reyes        ";
        System.out.println("cadena2 = " + cadena2);
        System.out.println("cadena2 = " + cadena2.trim());
    }
}
