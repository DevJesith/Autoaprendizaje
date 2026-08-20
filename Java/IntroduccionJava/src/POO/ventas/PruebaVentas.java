package POO.ventas;

public class PruebaVentas {
    public static void main(String[] args) {
        System.out.println("*** Sistema de ventas ***");
        var producto1 = new Productor("Blusa", 30.00);
//        System.out.println(producto1);

        var producto2 = new Productor("Zapatos", 50.00);
//        System.out.println(producto2);

        //Primer orden
        var orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();

        //Seguna orden
        var orden2 = new Orden();
        orden2.agregarProducto(new Productor("Playera", 15.00));
        orden2.agregarProducto(producto1);
        orden2.agregarProducto(producto2);
        orden2.mostrarOrden();
    }
}
