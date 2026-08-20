package POO;

public class pruebaPersona {

    public static void main(String[] args) {
        System.out.println("*** Creacion de Clase y Objetos fundamentos.Persona ***");

        System.out.println("Variable estatica: " + Persona.getContadorPersonas());
        var objeto1 = new Persona("Ashely", "Mejia", "Ashelymejia@gmail.com");
        System.out.println(objeto1); //Aitomaticamente llama el metodo toString()
        System.out.println("Variable estatica: " + Persona.getContadorPersonas());

        var objeto2 = new Persona("Jesith", "Mejia", "Jesithmejia@gmail.com");
        System.out.println(objeto2);
        System.out.println("Variable estatica: " + Persona.getContadorPersonas());


//        //Segundo objeto
//        var objeto2 = new fundamentos.Persona("Jesith", "Mejia", "Jesith@gmail.com");
//        objeto2.mostrarPersona();
    }
}
