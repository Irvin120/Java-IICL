package domain;
/*Si se hace uso de la palabra final en una clase esta ya no podra tener clases
hijas o ya no podra hacer herencias*/
//public final class Persona {

public class Persona {
    
    /*LA PALABRA FINAL TINENE EN UN METODO TIENE LA FUNCION DE HACER QUE ESTE 
    NO SE PUEDA ALTERAR EN UNA SOBREESCRITURA DEL MISMO*/
    public final void imprimir(){
        System.out.println ("Hola");
    }    
}
