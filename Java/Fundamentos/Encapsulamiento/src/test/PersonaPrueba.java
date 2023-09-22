package test;


import dominio.Persona;

public class PersonaPrueba {
    
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 5000, true);
        //Imprimiendo el espacio de memoaria 
        System.out.println("Persona1 = " + persona1);
        //Imprimiendo los valores de  mi objeto
//        System.out.println("Nombre: " + persona1.getNombre());
//        System.out.println("Sueldo: " + persona1.getSueldo());
//        System.out.println("Eliminado: " + persona1.isEliminado());
        
        //Cambiando valores de objeto
        
        persona1.setNombre("Carlos");
        persona1.setSueldo(1000);
        persona1.setEliminado(false);
        
             
        System.out.println("Persona1mmmm: " + persona1);
        //Esto es lo mismo que el no ponerlo ya que Java interpreta el metodo tosting 
        //y lo manda a ejecutar sin necesidad de ponerlo explicitamente.
        System.out.println("Persona1: " + persona1.toString());
//        
//        System.out.println("Persona1 = " + persona1);
//        //Imprimiendo los valores de  mi objeto
//        System.out.println("Nombre: " + persona1.getNombre());
//        System.out.println("Sueldo: " + persona1.getSueldo());
//        System.out.println("Eliminado: " + persona1.isEliminado());
    }
    
}
