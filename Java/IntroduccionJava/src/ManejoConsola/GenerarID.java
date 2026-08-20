package ManejoConsola;

import java.util.Random;
import java.util.Scanner;

public class GenerarID {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();

        //Entradas
        System.out.print("Ingrese su nombre: ");
        var nombre = entrada.nextLine();
        System.out.print("Ingrese su apellido: ");
        var apellido = entrada.nextLine();
        System.out.println("Año de nacimiento");
        var anoNacimiento = entrada.nextLine();

        //Numero random
        var random = aleatorio.nextInt(9999) + 1;

        // Numero formateado
        var numeroFormateado = String.format("%04d", random);
        System.out.println("numeroFormateado = " + numeroFormateado);

        // Mayusculas y dos ultimos
        var nombreMayusculaPrimeras = nombre.substring(0,2).toUpperCase();
        var apellidoMayusculaPrimeras = apellido.substring(0,2).toUpperCase();
        var ultimoAnoNacimiento = anoNacimiento.substring(anoNacimiento.length() - 2);

        var idPersona = new StringBuffer();
        idPersona.append(nombreMayusculaPrimeras)
                .append(apellidoMayusculaPrimeras)
                .append(ultimoAnoNacimiento)
                .append(numeroFormateado);

        System.out.println("""
                Hola %s: \s
                \tTu numero de identificacion (ID) generado por el sistema es: %s
                Felicidades!
                """.formatted(nombre, idPersona));






    }
}
