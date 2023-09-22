package test;

import domain.Persona;

public class TestMatrices {

    public static void main(String[] args) {
        int edades[][] = new int[3][2];
        edades[0][0] = 1;
        edades[0][1] = 2;
        edades[1][0] = 3;
        edades[1][1] = 4;
        edades[2][0] = 5;
        edades[2][1] = 6;

        System.out.println("edades 00 " + edades[0][0]);
        System.out.println("edades 01 " + edades[0][1]);
        System.out.println("edades 10 " + edades[1][0]);
        System.out.println("edades 11 " + edades[1][1]);
        System.out.println("edades 20 " + edades[2][0]);
        System.out.println("edades 21 " + edades[2][1]);

        //Ciclo For para una matriz
        // ren = Renglon
        // col = Columna
        
        String frutas[][] = {{"Coco", "Pera"},{"Fresas", "Uvas"},{"Manzanas", "Platanos"}};
         
        Persona nombre[][] = new Persona[3][2];
        nombre[0][0] = new Persona("Carlos");
        nombre[0][1] = new Persona("Enri");
        nombre[1][0] = new Persona("Gaia");
        nombre[1][1] = new Persona("Marina");
        nombre[2][0] = new Persona("Giorga");
        nombre[2][1] = new Persona("Archie");
        imprimir (nombre);
    }
    
    public static void imprimir (Object matriz[][]){
        for(int ren = 0; ren < matriz.length ; ren++){
            for(int col = 0; col < matriz[ren].length; col++){
                System.out.println("Matriz "+ ren + "," + col + " = " + matriz[ren][col]);
            }
        }
    }
}
