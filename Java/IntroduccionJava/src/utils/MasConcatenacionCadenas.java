package utils;

public class MasConcatenacionCadenas {
    public static void main(String[] args) {
        // MAS FORMAS DE CONCATENAR CADENAS
        var cadena1 = "Hola";
        var cadena2 = "Saludos";
        var cadena3 = cadena1 + " " + cadena2;
        System.out.println("cadena3 usando + = " + cadena3);

        // Metodo concat
        cadena3 = cadena1.concat(" ").concat(cadena2);
        System.out.println("cadena3 usando concat = " + cadena3);

        // StringBuilder
        var constructorCadenas = new StringBuilder();
//        constructorCadenas.append(cadena1);
//        constructorCadenas.append(" ");
//        constructorCadenas.append(cadena2);
        constructorCadenas.append(cadena1).append(" ").append(cadena2);
        var resultado = constructorCadenas.toString();
        System.out.println("resultado = " + resultado);

        // StringBuffer
        var stringBuffer = new StringBuffer();
        stringBuffer.append(cadena1).append(" ").append(cadena2);
        resultado = stringBuffer.toString();
        System.out.println("resultado stringbuffer = " + resultado);

        // Join
        resultado = String.join(" ", cadena1, cadena2, "Adios");
        System.out.println("resultado Join = " + resultado);
    }
}
