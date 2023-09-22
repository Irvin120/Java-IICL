package test;

import domain.Persona;

public class TestArreglosObject {
    public static void main(String[] args) {
        Persona personas[] = new Persona[3];
        
        personas[0] = new Persona("Carlos");
        personas[1] = new Persona("Juan");
        personas[2] = new Persona("Clarck");
        
        System.out.println("personas[0]" + personas[0].toString());
        System.out.println("personas[1]" + personas[1]);
        
        for (int i=0; i < personas.length; i++){
            //System.out.println("Persona"+ i + personas[i].toString());
            System.out.println("Persona"+ i + personas[i]);
        }
        
        //Sintaxis resumida para la cracion de arreglos
        /*En un arreglo resumido se sustituyen los [] por {} y dentro se declara
         declaran los datos*/
        
        String frutas[]= {"Pera", "Coco", "Manzana"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("frutas = " + frutas[i]);
            
        }
        
        
    }   
}
