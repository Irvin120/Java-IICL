package test;

import domain.Persona;


public class PersonaPrueba {
    
    private int contador;
    
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Juan");
        System.out.println("persona1 = " + persona1);
        
        //Para que se puda llamar un metodo desde un metodo STATIC el metodo 
        //llamado tambien tiene que ser de tipo STATIC
        imprimir(persona1);
        
    }
    
    
    public static void imprimir(Persona persona){
        System.out.println("persona = " + persona);
    }
    
    public int getcontador (){
        imprimir(new Persona ("Gio"));
        return this.contador;
    }
}
