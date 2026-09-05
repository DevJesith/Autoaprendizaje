package utils.TemasAvanzados;

import java.io.Serializable;

public class JavaBeans {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Karla");
        persona.setApellido("Lara");
        System.out.println("persona = " + persona);
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());
    }
}

// Esta clase es un JavaBean porque:
// 1. Tiene constructor vacío.
// 2. Sus atributos son privados.
// 3. Usa getters y setters públicos.
// 4. Implementa Serializable (opcional).
// En resumen: es una clase común, pero con reglas
// estandarizadas para que frameworks y herramientas
// puedan usarla fácilmente.


class Persona implements Serializable {
    private String nombre;
    private String apellido;

    public Persona(){}

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

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}