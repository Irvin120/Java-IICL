package mx.com.gm.ventas.test;

import com.gm.ventas.Orden;
import com.gm.ventas.Producto;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Coca Cola", 25);
        Producto producto2 = new Producto("Tacos", 65);
        Producto producto3 = new Producto("Cerveza", 25);
        
        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto3);
        orden1.mostrarOrden();
        
        Orden orden2 = new Orden();
        orden2.agregarProducto(producto1);
        orden2.mostrarOrden();
        
    }
    
}
