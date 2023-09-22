package test;

import domain.Gerente;

public class TestSobreescritura {
    public static void main(String[] args) {
        Gerente Gerente1 = new Gerente("Carlos", 4550, "D12");
        System.out.println("Gerente1 = " + Gerente1.obtenerDetalles());
    }
    
}
