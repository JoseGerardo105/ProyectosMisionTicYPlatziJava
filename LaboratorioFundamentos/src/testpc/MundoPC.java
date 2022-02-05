package testpc;

import mundopc.*;

public class MundoPC {

    public static void main(String[] args) {
        Raton raton1 = new Raton("USB", "HP");
        Raton raton2 = new Raton("Bluetooth", "Apple");
        Monitor monitor1 = new Monitor("Asus", 15.6);
        Monitor monitor2 = new Monitor("Acer", 14);
        Teclado teclado1 = new Teclado("USB", "LG");
        Teclado teclado2 = new Teclado("MAC", "Bluetooth");
        Computadora computador1 = new Computadora("Macbook pro", monitor2, teclado2, raton2);
        Computadora computador2 = new Computadora("Asus Vivobook", monitor1, teclado1, raton1);
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computador1);
        orden1.agregarComputadora(computador2);
        orden1.mostrarOrden();
        Orden orden2 = new Orden();
        orden2.agregarComputadora(computador1);
        orden2.agregarComputadora(computador2);
        orden2.agregarComputadora(computador1);
        orden2.agregarComputadora(computador2);
        orden2.mostrarOrden();
    }
}
