package test;

//Formam 1 Mandamos a llamar todo lo de la clase Utileria
import mx.com.globalmentoring.Utileria;
//Forma 2 Mandamos a llamar unicamente el metodo que ocupamos
import static mx.com.globalmentoring.Utileria.imprimir;
//Forma 3 SE MANDA A LLAMAR DIRECTAMENTE EN LA LINEA (No se recomienda)

public class TestUtileria {
    public static void main(String[] args) {
        
         //FORMAS EN LAS QUE PODEMOS LLAMAR A UN METODO DE UNA CLASE
         
         //Forma 1
         Utileria.imprimir("Hola 1");
         
         //Forma2
         imprimir("Hola 2");
         
         //Forma 3
         mx.com.globalmentoring.Utileria.imprimir("Hola 3");
         
        
    }
}
