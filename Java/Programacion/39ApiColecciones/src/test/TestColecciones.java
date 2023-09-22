package test;

import java.util.*;

public class TestColecciones {

    public static void main(String[] args) {
        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
//        imprimir(miLista);

        
        Set miSet = new HashSet();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
//        imprimir(miSet);
        
        Map miMapa = new HashMap();
            miMapa.put("valor1", "Carolina");
            miMapa.put("valor2", "Carlos");
            miMapa.put("valor3", "Juan");
            miMapa.put("valor4", "Will");
            
            //aceder a los elementos del mapa
            
            String elemento = (String) miMapa.get("valor1");
            System.out.println("elemento = " + elemento);
            
            //imprimir los valores de las key
            imprimir(miMapa.keySet());
            //Si queremos imprimir los valores asociados a las llaves
            imprimir(miMapa.values());
            //Retorna las kesy y sus valores
            imprimir(miMapa.entrySet());
    }
    
    public static void imprimir(Collection coleccion){
//        for(Object elemento : coleccion){
//            System.out.println("elemento = " + elemento);   
//        }

        //Funcion flecha o lamban
        coleccion.forEach(elemento ->{
            System.out.println("coleccion = " + elemento);
        });
    }
}
