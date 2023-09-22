//Clase48 OBJETOS EN JAVA
package clases;

public class PruebaPersona {
    
    public static void main(String[] args) {
        
        //Primera instancia
        Persona persona1;
        persona1 = new Persona();
        persona1.nombre = "Juan";
        persona1.apellido = "Perez";
        persona1.desplegarInformacion();
        System.out.println("persona1 = " + persona1);
        
        //Haciendo la seguna instancia mas ordenanda
        Persona persona2 = new Persona();
        persona2.nombre = "Dalila";
        persona2.apellido = "Montes";
        persona2.desplegarInformacion();
        System.out.println("persona2 = " + persona2);
        
        /*SE CREO UN NUEVO PROYECTO*/

    }
    
}
