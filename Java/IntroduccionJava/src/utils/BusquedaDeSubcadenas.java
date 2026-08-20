package utils;

public class BusquedaDeSubcadenas {
    public static void main(String[] args) {
        //Buscar subcadenas
        // IndexOf - Devulve el inidice de la primera aparicion de la subcadena
        var cadena1 = "Hola Mundo";
        // subcadena a bsucar "Hola"
        var inindice = cadena1.indexOf("Hola");
        System.out.println("inindice = " + inindice);
        // lastIndexOf - devuelve el indice de la ultima aparicion
        // Subcadena de Mudno
        var indice2 = cadena1.lastIndexOf("Mundo");
        System.out.println("indice2 = " + indice2);

        //Subcadena no encontrada devuelve -1
        var indice3 = cadena1.indexOf("Java");
        System.out.println("indice3 = " + indice3);
    }
}
