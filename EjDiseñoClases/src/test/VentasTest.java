package test;

import ventas.Orden;
import ventas.Producto;

public class VentasTest {
    public static void main(String[] args) {
        Orden orden1 = new Orden();
        orden1.agregarProducto(new Producto("Avena", 2000));
        orden1.agregarProducto(new Producto("Maiz",1000));
        orden1.calcularTotal();
        orden1.mostrarOrden();
    }
}
