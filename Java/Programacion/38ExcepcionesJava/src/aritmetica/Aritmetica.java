package aritmetica;

import excepciones.OperacionesExepcion;

public class Aritmetica {
    public static int division(int numerador, int denominador) throws OperacionesExepcion {
        if(denominador == 0 ){
            throw new OperacionesExepcion("Division entre cero");
        }
        return numerador / denominador;
    }    
}
