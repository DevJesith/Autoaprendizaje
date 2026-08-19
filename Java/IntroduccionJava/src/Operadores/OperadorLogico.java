package Operadores;

public class OperadorLogico {
    public static void main(String[] args) {
        System.out.println("*** Operadores Logico ***");
        boolean a = true, b = false;

        // and (regresa true si ambos valores son true)
        var resultado = a && b;
        System.out.println("resultado = " + resultado);

        b = true;
        resultado = a && b;
        System.out.println("resultado = " + resultado);

        // or (regresa true si cualquiera de los valores es true)
        boolean c = true, d = false;
        resultado = c || d;
        System.out.println("resultado = " + resultado);

        // operador not ! (invertir el valor logico)
        resultado = !c;
        System.out.println("resultado = " + resultado);
    }
}
