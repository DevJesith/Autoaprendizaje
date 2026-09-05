package utils.TemasAvanzados.excepciones;

public class Arimetica {
    public static int division(int numerador, int denominador) {
        if (denominador == 0) {
            throw new RuntimeException("Division entre Cero");
        } else {
            return numerador / denominador;
        }
    }

    public static void main(String[] args) {
        try {
            var resultado = division(5, 0);
            System.out.println(resultado);
        } catch (Exception e) {
            System.out.println("Ocurrio un error: " + e);
        } finally {
            // El bloque finally SIEMPRE se ejecuta:
            // - Ocurra o no una excepción.
            // - Se usa para liberar recursos o dejar mensajes.
            // En este caso, confirma que se revisó la división.
            System.out.println("Se reviso la division entre cero");
        }
    }
}
