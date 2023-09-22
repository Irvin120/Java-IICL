package mundopc;

import com.gm.mundopc.*;


public class MundoPC {
    public static void main(String[] args) {
        
        /*TODOS ESTOS OBJETOS SE CREAN GRACIAS A LOS CONSTRUCTORES NO A LOS 
        METODOS*/

        Raton raton1 = new Raton ("USB","Envidia");
        Raton raton2 = new Raton("Inalambrico USB", "HP");
        
        Teclado teclado1 = new Teclado("USB", "ACER PREDATOR");
        Teclado teclado2 = new Teclado("Inalambrico USB", "HP" );
        
        Monitor monitor1 = new Monitor("Acer", 44);
        Monitor monitor2 = new Monitor("HP", 20);
        
        Computadora computadora1 = new Computadora("ZTX", monitor1, teclado1, raton1);
        
            
      //Practicamente se inicia una nueva orden con un nuevo id
        Orden orden1 = new Orden ();
        
        
        
        /*Hacemos la orden de los objetos (Computadora) gracias a las
        Metodos*/
        
        orden1.agregarComputadora(computadora1);
        orden1.mostrarOrden();
        
    }
    
}
