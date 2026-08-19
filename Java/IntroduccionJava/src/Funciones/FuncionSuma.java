package Funciones;

public class FuncionSuma {

    static int suma(int a, int b){
        var resultado = a + b;
        return resultado;
    }

    public static void main(String[] args) {
        int arg1 = 3, arge2 = 8;
        var resultado_funcion = suma(arg1, arge2);

        System.out.println("La suma es de: " + resultado_funcion);
    }
}
