package POO;

public class Persona {
    private static int contadorPersonas = 0;
    private int idPersona;
    private String nombre;
    private String apellido;
    private String email;

    public Persona(String nombre, String apellido, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        // Incrementar el atributo static
//        fundamentos.Persona.contadorPersonas++;
        //Asiganamos el id unico con ayuda de la variable estatica
        this.idPersona = ++Persona.contadorPersonas;
    }

    @Override
    public String toString() {
        return "ID: " + this.idPersona + ", Nombre: " + this.nombre + ", Apellido: " + this.apellido + ", Email: " + this.email + ", Direccion de memoria" + super.toString();
    }

//    public void mostrarPersona() {
//        System.out.println("Nombre: " + this.nombre);
//        System.out.println("Apellido: " + this.apellido);
//        System.out.println("Email: " + this.email);
//    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public static int getContadorPersonas(){
        return Persona.contadorPersonas;
    }
}
