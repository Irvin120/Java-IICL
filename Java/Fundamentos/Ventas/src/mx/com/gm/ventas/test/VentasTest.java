package mx.com.gm.ventas.test;
import mx.com.gm.ventas.*;

public class VentasTest {
    public static void main(String[] args) {
        //Ejecutanto la prueba de ventas
        Producto producto1 = new Producto("Vino", 150);
        Producto producto2 = new Producto("Hamburguesa", 50);
        Producto producto3 = new Producto ("Alitas", 45);
        
        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto3);
        orden1.mostrarOrden();

        
        
    }
    
}
