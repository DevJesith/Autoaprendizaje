package Ciclos;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        System.out.println("*** Calculadora");

        // Entrada
        var consola = new Scanner(System.in);
        double resultado = 0;
        var salir = false;



        while (!salir){

            System.out.print("Dame el valor 1: ");
            var valor1 = Integer.parseInt(consola.nextLine());

            System.out.print("Dame el valor 2: ");
            var valor2 = Integer.parseInt(consola.nextLine());

            System.out.print("""
                    Operaciones que puedes realizar
                    1. Suma
                    2. Resta
                    3. Multiplicacion
                    4. Division
                    5. Salir
                    Escoje una opcion:\s
                    """);

            var seleccion = Integer.parseInt(consola.nextLine());

            switch (seleccion){
                case 1:
                    resultado = valor1 + valor2;
                    System.out.println("La suma es de: " + resultado);
                    break;

                case 2:
                    resultado = valor1 - valor2;
                    System.out.println("La resta es de: " + resultado);
                    break;

                case 3:
                    resultado = valor1 * valor2;
                    System.out.println("La multiplicacion es de: " + resultado);
                    break;

                case 4:
                    if (valor2 != 0){
                        resultado = valor1 / valor2;
                        System.out.println("La division es de: " + resultado);
                    } else {
                        System.out.println("Error: no se puede dividir por cero");
                    }
                    break;

                case 5:
                    salir = true;
                    System.out.println("Saliendo de la calculadora....");
                    break;

                default:
                    System.out.println("Operacion invalida");
                    break;
            }
        }
    }
}
