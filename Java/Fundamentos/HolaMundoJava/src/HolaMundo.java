
import java.util.Scanner;

//Mi clase en Java

public class HolaMundo {
    
    public static void main(String args[]) {
        
/* CLASE 5
        System.out.println("Hola Mundo desde Java");
         */
 /* CLASE 8 y 9 
        //Definimos variable int
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
        //Modificamos el valor de la variable
        miVariableEntera = 5;
        System.out.println(miVariableEntera);
        
        //Definimos variable String
        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);
        
        miVariableCadena = "Adios";
        System.out.println(miVariableCadena);
         */
 /*Clase 10
        //Var - hace inferencia de tipos de datos en Java
        
        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);
        
        var miVariableCadena2 = "Nueva Cadena";
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
         */
 /*Clase 11
        //Reglas para definir una varaible
        
        //Valores poermitidos
        var miVariable  = 1;
        var _miVariable = 1;
        var $miVariable = 1;
        //No se re recomienda usar utilizar
        var ámivariable = 1;
         */
 /*Clase 12
        //Concatenacion con Java
        var usuario = "Juan";
        var titulo = "Ingneniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        
        var i = 3;
        var j = 4;
        
        System.out.println(i + j);// Se realiza la suma de numeros
        System.out.println(i + j + usuario);//Evaluacion de izq a der realizan suma
        System.out.println(usuario + i + j);//Contexto cadena 
        System.out.println(usuario + (i + j));//Priorizacion de datos
        */
 /*Clase 13
        //Caracteres especiales con Java
        var nombre = "Karla";
        System.out.println("Nueva linea: \n" + nombre ); //Salto de linea
        System.out.println("Tabulador: \t" + nombre); //Tabuladores
        System.out.println("Retroceso: \b" + nombre);//Un retroceso
        System.out.println("Retrocesos: \b\b" + nombre);//Dos retrocesos
        System.out.println("Comilla simple: \'" + nombre + "\'");//Comillas simples
        System.out.println("Comilla doble: \"" + nombre + "\"");//Comillas dobles
        */
 /*Clase 14
        //Clase Scanner en Java
        System.out.println("Escribe tu nombre");
        Scanner consola = new Scanner(System.in);
        var usuario = consola.nextLine();
        System.out.println("usuario = " + usuario);
        System.out.println("Escribe el titulo:");
        var titulo = consola.nextLine();
        System.out.println("Resultado: " + titulo + " " + usuario);
        */
        //Tarea 2
        Scanner datos = new Scanner (System.in);
        System.out.println("Proporciona el titulo:");
        var titulo = datos.nextLine();
        System.out.println("Proporciona el autor:");
        var autor = datos.nextLine();
        System.out.println(titulo + " " + "fue escrito por" + " " + autor);
       
    }
}
