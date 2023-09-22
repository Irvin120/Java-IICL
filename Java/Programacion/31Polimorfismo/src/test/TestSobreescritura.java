package test;

import domain.*;

public class TestSobreescritura {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 5240);
        //System.out.println("empleado = " + empleado.obtenerDetalles());
        imprimir(empleado);

        Gerente gerente = new Gerente("Carlos", 4550, "D12");
        //System.out.println("Gerente1 = " + Gerente1.obtenerDetalles());
        imprimir(gerente);
    }   
    
    public static  void imprimir(Empleado empleado){
        System.out.println("Empleado = "  + empleado.obtenerDetalles());
    }
}

