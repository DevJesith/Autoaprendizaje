package POO;

public class Aritmetica {
    private int operando1;
    private int operando2;

    // Constructor vacio
    public Aritmetica(){

    }

    public int getOperando1() {
        return operando1;
    }

    public void setOperando1(int operando1) {
        this.operando1 = operando1;
    }

    public int getOperando2() {
        return operando2;
    }

    public void setOperando2(int operando2) {
        this.operando2 = operando2;
    }

    public Aritmetica(int operando1, int operando2){
        System.out.println("Ejecutando constructor");
        this.operando1 = operando1;
        this.operando2 = operando2;
        System.out.println("Operador this: " + this);
    }

    public void sumar(){
        var resultado = operando1 + operando2;
        System.out.println("Resultado suma: " + resultado);
    }

    public void resta(){
        var resultado = operando1 - operando2;
        System.out.println("Resultado resta: " + resultado);
    }

    public void multiplicacion(){
        var resultado = operando1 * operando2;
        System.out.println("Resultado multiplicacion: " + resultado);
    }


}
