package mx.com.gm.ventas;

public class Orden {

    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;

    public Orden() {
        //Inicializa el id
        this.idOrden = ++Orden.contadorOrdenes;
        //Declaramos tamaño de arreglo de productos
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto) {
        if (contadorProductos < Orden.MAX_PRODUCTOS) {
            this.productos[this.contadorProductos++] = producto;
        }else{
            System.out.println("Se ha superado el maximo de los productos" + Orden.MAX_PRODUCTOS);
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < contadorProductos; i++) {
            total =+ this.productos[i].getPrecio();
        }
        return total;
    }

    public void mostrarOrden() {
        System.out.println(idOrden);
        System.out.println("Total de la orden:" + this.calcularTotal());
        System.out.println("Productos de la orden");
        for (int i = 0; i < contadorProductos; i++) {
            System.out.println(this.productos[i]);
            
        }

    }

}
