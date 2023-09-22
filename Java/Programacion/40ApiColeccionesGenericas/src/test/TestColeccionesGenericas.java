package test;

import java.util.*;

public class TestColeccionesGenericas {

    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        String listaElemento = miLista.get(0);
//        System.out.println("listaElemento = " + listaElemento);
//        imprimir(miLista);

        
        Set<String> miSet = new HashSet<>();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
//        imprimir(miSet);
        
        Map<String, String> miMapa = new HashMap<>();
            miMapa.put("valor1", "Carolina");
            miMapa.put("valor2", "Carlos");
            miMapa.put("valor3", "Juan");
            miMapa.put("valor4", "Will");
            miMapa.put("valor4", "Smith");
            //aceder a los elementos del mapa
//            String elemento = (String) miMapa.get("valor1");
//            System.out.println("elemento = " + elemento);
            
            //imprimir los valores de las key
            imprimir(miMapa.keySet());
            //Si queremos imprimir los valores asociados a las llaves
            imprimir(miMapa.values());
            //Retorna las kesy y sus valores
//            imprimir(miMapa.entrySet());
    }
    
    public static void imprimir(Collection<String> coleccion){
//        for(Object elemento : coleccion){
//            System.out.println("elemento = " + elemento);   
//        }

        //Funcion flecha o lamban
        coleccion.forEach(elemento ->{
            System.out.println("coleccion = " + elemento);
        });
    }
}
