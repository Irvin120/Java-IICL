package test;

import domain.Persona;

public class TestJavaBeans {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Torres");
        
        System.out.println("persona = " + persona.toString());
        
        System.out.println("persona nombre= " + persona.getNombre());
        System.out.println("persona apellido = " + persona.getApellido());
    }
    
}
