package test;

import operaciones.Operaciones;


public class TestOperaciones {
    public static void main(String[] args) {
        var var1 = Operaciones.sumar(1,4);
        System.out.println("var1 = " + var1);
        
        var var2 = Operaciones.sumar(1,1.2);
        System.out.println("var2 = " + var2);
    }   
}

