package pasoporvalor;


public class PasoPorValor {
    public static void main(String[] args) {
        var x = 10;
        System.out.println("x = " + x);
        
        
        /*Si se quiere llamar un nuevo metodo este tiene que ser del mismo tipo
        static*/
        // x =
        cambioValor(x);/*este valor unicamente esta enviando una copia de su
        valor*/
        System.out.println("x el nuevi valor = " + x );
    }
    
    /*El valor del argumento no puede ser afectado en otro metodo*/
    //Ahora ya regresara un valor de tipo int y no void
    public static void cambioValor (int arg1){
        //return
        arg1 = 15; /*El valor del argumento no afecta a otro metodo externo
        unicamente afecta a todas las variables qeu estan declaradas dentro del 
        mismo*/
    
    }   
    
}
