package autoboxinunboxin;


public class AutoboxinUnboxin {
    public static void main(String[] args) {
        
        //Clases envolventes/wrapper tipo primitivas
        /*
        int = Integer
        long = Long
        float = Float
        double = Double
        boolean = Boolean
        byte = Byte
        char = Character
        shor = Short
        */
        
        Integer numero = 10;//Autoboxing ya que se esta envolviento un tipo primitivo a un tipo object
        System.out.println("numero = " + numero);
        System.out.println("Entero double = " + numero.doubleValue());
        
        int numero2 = numero; //Unboxing estamos extrayendo el valor del primitivo almacenado en la variavle de tipo objtet
        //Para asginarlo a nuestra variable de tipo primitivo
    }   
}
 