package test;


public class TestArreglos {

    public static void main(String[] args) {
    //Arreglo de tipo int con tres espacio        
    int edades[] = new int[3];
        
        edades[0] = 10;
        edades[1] = 11;
        edades[2] = 12;
       
        for(int i=0; i < edades.length; i++){
            System.out.println("Edades= " + i  + ":" + edades[i]);
            
        }
        
    } 
}
