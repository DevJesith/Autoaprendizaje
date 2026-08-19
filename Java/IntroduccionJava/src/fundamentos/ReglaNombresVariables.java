package fundamentos;

public class ReglaNombresVariables {
    public static void main(String[] args) {
        // Reglas nombres variables
        String nombreCompleto = "Jose"; // Correcto y buenas practicas
        System.out.println("nombreCompleto = " + nombreCompleto);
        String NombreCompleto = "Jose 2"; // Correcto, no aplica las buenas practicas
        System.out.println("NombreCompleto = " + NombreCompleto);
//        String nombre-cliente = "Juan"; // Incorrecto
        String nombre_cliente = "Jose"; // Correcto, no aplica buenas ´racticas
        System.out.println("nombre_cliente = " + nombre_cliente);
        String _apellido = "Perez"; // Correcto y aceptable
        String $apellido = "Juarez"; //Correcto y aceptable
        int totPzs = 10; //Correcto, no aplica buenas practicas
        int totalPiezas = 10; // Correcto, aplica las buenas practicas
        boolean casado = true; //Correcto, aun puede mejorar
        boolean esCasado = true; // Correcto, y aplica buenas practicas
        boolean isCasado = true; // Correcto y aplica buenas practicas

    }
}
