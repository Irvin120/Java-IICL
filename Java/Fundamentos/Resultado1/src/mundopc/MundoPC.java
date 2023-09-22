package mundopc;

import com.gm.mundopc.*;


public class MundoPC {
    
    public static void main(String[] args) {
        Monitor moitor1 = new Monitor("SONY", 24);
        Teclado teclado1 = new Teclado("USB", "SONY");
        Raton raton1 = new Raton("Inalambirco", "HP");
        
        Computadora computadora1 = new Computadora("ZTX", moitor1, teclado1, raton1);
        
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadora1);
        orden1.mostrarOrden();
        
        
    }
    
}
