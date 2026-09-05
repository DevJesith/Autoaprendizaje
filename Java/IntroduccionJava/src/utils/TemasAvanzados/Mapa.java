package utils.TemasAvanzados;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<String, String> persona = new HashMap<>();
        persona.put("Nombre", "Diego");
        persona.put("Apellido", "Flores");
        persona.put("Edad", "31");
        persona.put("Edad", "31"); // No se permite duplicado

        System.out.println(persona);

        System.out.println("Valores del mapa: ");
        persona.entrySet().forEach(System.out::println);

        persona.put("Edad", "35"); // Modificar el valor ed la llave existente
        persona.remove("Apellido");
        System.out.println("\nNuevos valores del mapa: ");
        persona.entrySet().forEach(System.out::println);

        //Iterar sobre los elementos del mapa por separado
        System.out.println("\nIterando los elementos (llave, valor): ");
        persona.forEach((llave, valor)-> {
            System.out.println("Llave: " + llave + ", Valor: " + valor);
        });
    }
}
