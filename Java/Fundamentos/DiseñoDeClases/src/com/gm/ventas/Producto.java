package com.gm.ventas;

public class Producto {
    //Una vez creada esta ya no podra ser modificada
    private final int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProducto;
    
    private Producto(){
       //Incrementa la variable contador producto y asigna el valor al idProducto
       //Inicializa la varivle de idProducto
       //Por cada objeto que se cree se aumentara el idProducto
       this.idProducto  = ++Producto.contadorProducto;
    }
    
    public Producto(String nombre, double precio){
        /*Para hacer la llamada de nuestro consturctor privado e iniciar la 
        variable idProducto tine que tener prioridad al llamarce por lo que 
        tenemos que llamarlo en la primera linea y esto se hace asi "this()"
        */
        this(); 
        this.nombre = nombre; 
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public static int getContadorProducto() {
        return contadorProducto;
    }
    public static void setContadorProducto(int contadorProducto) {
        Producto.contadorProducto = contadorProducto;
    }

    @Override
    public String toString() {
        return "Productos{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
}
