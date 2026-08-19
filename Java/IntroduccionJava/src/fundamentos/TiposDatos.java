package fundamentos;

public class TiposDatos {
    public static void main(String[] args) {
        // TIpos de Datos en Java
        // Enteros
        byte tipoByte = 127;
        System.out.println("tipoByte = " + tipoByte);
        short tipoShort = 32000;
        System.out.println("tipoShort = " + tipoShort);
        int tipoInt = 2147483647;
        System.out.println("tipoInt = " + tipoInt);
        long tipoLong = 987654321L; //L o l para indicar tipo long
        System.out.println("tipoLong = " + tipoLong);

        // Punto flotante
        float  tipoFloat = 123.45f; // F o f
        System.out.println("tipoFloat = " + tipoFloat);
        double tipoDouble = 3.1315D; // D o d
        System.out.println("tipoDouble = " + tipoDouble);

        // Caracter
        char tipoChar = 'A';
        System.out.println("tipoChar = " + tipoChar);

        // Booleano
        boolean tipoBool = true;
        System.out.println("tipoBool = " + tipoBool);
        boolean tipoBool2 = false;
        System.out.println("tipoBool2 = " + tipoBool2);

        // Tipos Object (Referencia)
        String nombre = null; // Por defecto
        System.out.println("nombre = " + nombre);
        String nombre2 = "Jose";
        System.out.println("nombre2 = " + nombre2);
    }
}
