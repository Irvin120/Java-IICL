package test;

import domain.Empleado;
import domain.Cliente;
import java.util.Date;

public class TestHerencia {
    
    public static void main(String[] args) {
      //  Empleado persona1 = new Empleado("Juan", 5000.0);
      // System.out.println("persona1 = " + persona1);
      
      Cliente cliente1 = new Cliente(new Date(), true, "Lolo",'M', 28, "Calle 4 Oriente N.231");
        System.out.println("cliente1 = " + cliente1);
        
      Empleado Empleado2 = new Empleado("Juan", 5000);
        System.out.println("Empleado2 = " + Empleado2);
      
    }
    
}
