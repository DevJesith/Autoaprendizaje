package utils.TemasAvanzados;

import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<String> conjunto = new TreeSet<>();
        conjunto.add("Carlos");
        conjunto.add("Carlos"); // No se permite elemento duplicados
        conjunto.add("Jesith");
        conjunto.add("Janelle");

        System.out.println(conjunto);

        System.out.println("Elementos del Set: ");
        conjunto.forEach(System.out::println);

        //Remove
        conjunto.remove("Janelle");
        System.out.println("\nNuevos elementos del Set: ");
        conjunto.forEach(System.out::println);
    }
}
