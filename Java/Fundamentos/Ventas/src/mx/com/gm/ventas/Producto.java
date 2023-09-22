package mx.com.gm.ventas;

public class Producto {
    private int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;
    
    //Inicializa la variavle de contadorProducto
    private Producto(){
        this.idProducto = ++Producto.contadorProductos;
    }
    
    public Producto(String nombre, double precio){
        this();
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public int getIdProducto(){
        return idProducto;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public double getPrecio(){
        return precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
}
