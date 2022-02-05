package ventas;

public class Producto {

    private final int ID_PRODUCTO;
    private String nombre;
    private double precio;
    private static int contadorProductos;

    private Producto() {
        //Tiene la responsabilidad de ir aumentando el idProducto
        Producto.contadorProductos++;
        this.ID_PRODUCTO = this.contadorProductos;
    }

    public Producto(String nombre, double precio) {
        //Llamada al constructor que nos da el idProducto
        //Para llamar a otro constructor de la misma clase usamos this(parámetros)
        this();
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public int getIdProducto(){
        return this.ID_PRODUCTO;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
    public double getPrecio(){
        return this.precio;
    } 

    @Override
    public String toString() {
        return "Producto{" + "ID_PRODUCTO=" + ID_PRODUCTO + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
    

}
