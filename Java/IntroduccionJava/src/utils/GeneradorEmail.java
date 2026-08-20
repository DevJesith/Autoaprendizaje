package utils;

public class GeneradorEmail {
    public static void main(String[] args) {
        // Datos
        var nombre = "Ubaldo Acosta Soto";
        var empresa = "Global Mentoring";
        var dominio = "com.mx";
        String resultado;

        // Resultado: email: ubaldo.acosta.soto@globalmentoring.com.mx

        //convertir a minusculas
        var nombreMinuscula = nombre.toLowerCase();
        System.out.println("Nombre minuscula = " + nombreMinuscula);
        var empresaMinuscula = empresa.toLowerCase();
        System.out.println("empresa minuscula = " + empresaMinuscula);

        //Eliminar espacios
        var agregarPuntoNombre = nombreMinuscula.replaceAll(" ", ".");
        System.out.println("resultado nombre = " + agregarPuntoNombre);
        var agregarPuntoEmpresa = empresaMinuscula.replaceAll(" ", ".");
        System.out.println("resultado empresa = " + agregarPuntoEmpresa);

        // Union
        var direccionEmail = new StringBuilder();
        direccionEmail.append(agregarPuntoNombre);
        direccionEmail.append("@");
        direccionEmail.append(agregarPuntoEmpresa);
        direccionEmail.append(".");
        direccionEmail.append(dominio);

        // Resultado
        resultado = direccionEmail.toString();
        System.out.println("resultado dominio email = " + resultado);

    }
}
