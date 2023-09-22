package paquete1;

import paquete1.ClaseHija;
import paquete1.Clase1;

public class TestModificadoresAcceso {

    public static void main(String[] args) {
        //PUBLIC
        /*Clase1 clase1 = new Clase1();
        System.out.println("numeros = " + clase1.atributoPublico);
        clase1.metodoPublico();
         */

        //PROTECTED CLASE HIJA
        /*
        ClaseHija claseHija = new ClaseHija();
        System.out.println("claseHija = " + claseHija);
         */
        
        /*
        //DEFAULT*
        ClaseHija claseHija = new ClaseHija();
        
        claseHija.atributoDefault = "Modificacion Test";
        System.out.println("atributoDefault = " + claseHija.atributoDefault );
        
        claseHija.metodoDefault();
         */
        
        Clase1 clase1 = new Clase1("Pulico");
        clase1.setAtributoPrivado("Cambio Valor Atributo");
        System.out.println("clase1 = " + clase1.getAtributoPrivado());
        
        ClaseHija clasehija = new ClaseHija();
        System.out.println("clasehija = " + clasehija);
 
    }

}
