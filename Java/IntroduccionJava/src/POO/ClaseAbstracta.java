package POO;

public class ClaseAbstracta {
    public static void main(String[] args) {

        FiguraGeometrica figuraGeometrica = new Rectangulo();
        figuraGeometrica.dibujar();
        figuraGeometrica = new Circulo();
        figuraGeometrica.dibujar();

    }
}

// Clase abstracta - No se puede instanciar una clase abstracta
abstract class FiguraGeometrica{
    public abstract void dibujar();
}

// Clase hija
class Rectangulo extends FiguraGeometrica{


    @Override
    public void dibujar() {
        System.out.println("Se dibujar un Rectangulo");
    }
}

// Clase hija 2
class Circulo extends FiguraGeometrica{

    @Override
    public void dibujar() {
        System.out.println("Se debe dibujar un Circulo");
    }
}
