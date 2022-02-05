package mundopc;

public class Orden {

    private int idOrden;
    private static int contadorOrdenes;
    private Computadora[] computadoras;
    private int contadorComputadoras;
    private final int MAX_COMPUTADORAS = 4;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        computadoras = new Computadora[MAX_COMPUTADORAS];
    }

    public void agregarComputadora(Computadora computadora) {
        if (this.contadorComputadoras < this.MAX_COMPUTADORAS) {
            computadoras[contadorComputadoras++] = computadora;
        } else {
            System.err.println("Error, se ha superado el máximo de computadoras: (" + this.MAX_COMPUTADORAS + ")");
        }
    }

    public void mostrarOrden() {
        String detallesComputadoras = "";
        for (int i = 0; i < contadorComputadoras; i++) {
            detallesComputadoras += "\nID computadora: " + (i + 1) + ". "
                    + "\nMonitor: " + computadoras[i].getMonitor()
                    + "\n---Dispositivos de entrada---"
                    + "\n" + computadoras[i].getRaton()
                    + "\n" + computadoras[i].getTeclado();
        }
        System.out.println("\nID de la orden: " + this.idOrden
                + "\nNúmero de computadoras de la orden: " + this.contadorComputadoras
                + "\nDetalles de las computadoras:"
                + detallesComputadoras);
    }
}
