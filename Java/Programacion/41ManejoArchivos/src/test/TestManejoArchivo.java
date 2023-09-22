package test;

import static manejoarchivo.manejoArchivo.*;

public class TestManejoArchivo {
    public static void main(String[] args) {
        
       //Se crea el archivo en la ruta que se tiene por defecto
       //Windosw "c:\\carpeta\\prueba.txt" El \ es para escapar del caracter de diagonal inversa
       //Linux, Mac "/carpeta/prueba.txt"
        var nombreArchivo = "Prueba.txt";
//        crearArchivo(nombreArchivo);
//        escribirArchivo(nombreArchivo, "Hola desde Java");
        
// Anexar informacion sin que se borre
//    anexarArchivo(nombreArchivo, "Hola desde el anexo de informacion");

//Leer informacion 
        leerArchivo(nombreArchivo);

        
    }
    
}
