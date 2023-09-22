package genericos;
//Definiendo clase que va a recibir un atributo de tipo generico
public class ClaseGenerica<T> {
    
    T objeto;
    
    public ClaseGenerica(T objeto){
        this.objeto = objeto;
    }
     
    public void obtenerTipo(){
        System.out.println("El tipo T es " + objeto.getClass().getSimpleName());
    }
    
}
