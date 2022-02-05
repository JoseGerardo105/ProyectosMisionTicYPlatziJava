package ventas;

public class Orden {

    private final int ID_ORDEN;
    private Producto productos[];
    private static int contadorOrdenes;
    private static final int MAX_PRODUCTOS = 10;
    private int contadorProductos = 0;

    public Orden() {
        this.ID_ORDEN = ++Orden.contadorOrdenes;
        productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto) {
        //Validamos que no se sobrepase el número máximo de productos
        if (this.contadorProductos <= MAX_PRODUCTOS) {
            this.productos[this.contadorProductos] = producto;
            this.contadorProductos++;
        } else {
            System.out.println("Se ha superado el máximo de productos " + Orden.MAX_PRODUCTOS);
        }

    }

    public double calcularTotal() {
        double precioTotal = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
            precioTotal += productos[i].getPrecio();
        }
        return precioTotal;
    }

    public void mostrarOrden() {
        String productosOrden = "";
        for (int i = 0; i < contadorProductos; i++) {
            productosOrden += "\n" + (i + 1) + ". " + productos[i].getNombre()+" --> $"+productos[i].getPrecio();
        }
        System.out.println("\nNúmero de orden: " + this.ID_ORDEN
                + "\nCantidad de productos: " + this.contadorProductos
                + "\nProductos de la orden: " + productosOrden
                + "\nPrecio total: $" + calcularTotal());
    }

}
