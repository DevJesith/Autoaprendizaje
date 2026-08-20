package POO.Herencia;

public class Animal {

    protected void comer() {
        System.out.println("Como muchas veces al dia");
    }

    protected void dormir() {
        System.out.println("Duermo muchas horas");
    }

    protected void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }


}

class Perro extends Animal {

    @Override
    protected void hacerSonido() {
        System.out.println("El perro hace wauf");
    }
}


class Gato extends Animal{
    @Override
    protected void hacerSonido() {
        System.out.println("El gato hace miau!!!");
    }
}

class PruebaAnimal {


    // Metodo polimorfismo
    static void imprimirSonido(Animal animal){
        animal.hacerSonido();
    }

    public static void main(String[] args) {
        System.out.println("*** Ejemplo de Herencia ***");

        System.out.println("Clase Padre, soy un animal");
        var animal1 = new Animal();
        imprimirSonido(animal1);

        System.out.println("\nClase hija, soy un perro");
        var perro1 = new Perro();
        imprimirSonido(perro1);

        System.out.println("\nClase hija, soy un gato");
        var gato1 = new Gato();
        imprimirSonido(gato1);

    }
}