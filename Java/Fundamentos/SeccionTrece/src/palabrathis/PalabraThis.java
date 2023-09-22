package palabrathis;


public class PalabraThis {
    
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", "Perez");
        System.out.println("persona = " + persona);
        System.out.println("persona nombre:" + persona.nombre);
        System.out.println("persona apellido:" + persona.apellido);
    }
}
class Persona{
    String nombre;
    String apellido;
    
    Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Object persona usando this: " + this );
        new Imprimir().imprimir(this);
    }
}
class Imprimir{
    public Imprimir(){
        super(); // Estes es el contructor de la clase object(Padre) para reservar memoria
    }
    public void imprimir(Persona persona){
        System.out.println("persona = " + persona);
        System.out.println("Imprimir el objeto actual (this)" + this);
    }
}
