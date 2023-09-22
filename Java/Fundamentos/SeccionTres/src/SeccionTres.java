
import java.util.Scanner;


public class SeccionTres {
    
    public static void main(String args[]) {
        
//TIPOS PRIMITIVOS EN JAVA

            //Tipos Enteros: byte = 8bits, short = 16bits, char = 16bits, int = 32bits, long = 64bits
            //Tipos Flotantes: float = 32bits, double = 64bits
            
/*Clase 17 TIPOS NUMERICOS ENTEROS 
            
            //Tipo de dato byte
            byte numerobyte = (byte)129; //Obligando al sistema a convertir a byte (EL VALOR NO ES EXACTO)
            System.out.println("numerobyte = " + numerobyte);
            System.out.println("Valor minimo de byte:" + Byte.MIN_VALUE);
            System.out.println("Valor maximo de byte:" + Byte.MAX_VALUE);
            
            //Tipo de dato short
            short numeroshort = (short)10;//Obligamos al sistema a convertit a short (EL VALOR NO ES EXACTO)
            System.out.println("numeroshort = " + numeroshort);
            System.out.println("Valor minino de short:" + Short.MIN_VALUE);
            System.out.println("Valor maximo de short:" + Short.MAX_VALUE);
            
            //Tipo de dato int
            int numeroint = (int)2147483999L;//Obligamos al sistema a convertit a int (EL VALOR NO ES EXACTO Y SE CONVIERTE A UN DATOS DE TIPO  "long")
            System.out.println("numeroint = " + numeroint);
            System.out.println("Valor minimo de int:" + Integer.MIN_VALUE);
            System.out.println("Valor maximo de int:" + Integer.MAX_VALUE);
            
            //Tipo de dato long
            long numerolong = (long)9223372036854775899F;//Obligamos al sistema a convertit a long (YA HACEMOS USO DE LA CONVERSION A LOS CAMPOS flotantes(float,double) ya que ya se supero el valor maximo que soporta una literal de tipo "entero")
            System.out.println("numerolong = " + numerolong);
            System.out.println("Valor minimo de long:" + Long.MIN_VALUE);
            System.out.println("Valor maximo de long:" + Long.MAX_VALUE);
           */

            
/*Clase 18 TIPOS NUMERICOS FLOTANTES
            //Todo tipo de dato de tipo FLOTANTE pot defecto es de tipo DOUBLE
            
            float numerofloat = (float)3.4028235E38;
            System.out.println("numerofloat = " + numerofloat);
            System.out.println("Valor minimo de float:" + Float.MIN_VALUE);
            System.out.println("Valor maximo de float:" + Float.MAX_VALUE);
            
            double numerodouble = 10;
            System.out.println("numerodouble = " + numerodouble);
            System.out.println("Valor minimo de double:" + Double.MIN_VALUE);
            System.out.println("Valor maximo de double:" + Double.MAX_VALUE);
          */
            
            
/*Clase 19 INFERENCIA DE TIPOS CON VAR Y TIPOS PRIMITIVOS
            
            //Recordando lo de las clases pasadas sobre inferencia de tipos 
            //Cualqueir constante sin punto decimal es por defecto de tipo int
            //Cualquier numero con punto decimla es por defecto de tipo double
            
            var numeroEntero = 10;
            System.out.println("numeroEntero = " + numeroEntero);
            
            var numeroDouble = 10.0;
            System.out.println("numeroDouble = " + numeroDouble);
            
            var numeroFloat = 10.0F;
            System.out.println("numeroFloat = " + numeroFloat);
           */
            

/*Clase 20 TIPOS PRIMITIVOS TIPO CHAR
            //Para hcer uso de los caracteres especiales en java existe la lista de caracteres UNICODE
            //esttos se usan si en el teclado no esta disponible algun caracter
            
            char miCaracter = 'a';
            System.out.println("miCaracter = " + miCaracter);
            
            //Haciendo uso de la lista de caracteres UNICODE
            
            char varChar = '\u0040';
            System.out.println("varChar = " + varChar);
            
            char varCharDecimal = 64;
            System.out.println("varCharDecimal = " + varCharDecimal);
            
            char varCharSimbolo = '@';
            System.out.println("varCharSimbolo = " + varCharSimbolo);
            
            //var
            
            var varChar1 = '\u0040';
            System.out.println("varChar1 = " + varChar1);
            
            var varCharDecimal2 = (char)64;
            System.out.println("varCharDecimal2 = " + varCharDecimal2);
            
            var varCharSimbolo3 = '@';
            System.out.println("varCharSimbolo3 = " + varCharSimbolo3);
            
            //Dato char asignado a un dato de tipo int
            
            int variableEnteraSimbolo = 'a';
            System.out.println("variableEnteraSimbolo = " + variableEnteraSimbolo);
            */

/*Clase 21 TIPOS PRIMITIVOS TIPO BOOLEAN
           //Un variable de tipo boolean almacena unicamente 2 posibles valores True y False
           //Tambien se le conoce como tipos de dato bandera
           
           boolean varBoolean = true;
           System.out.println("varBoolean = " + varBoolean);
           
           if (varBoolean){
               System.out.println("La variable es VERDADERA");
           }
           else{
               System.out.println("La variable es FALSA");
           }
           // EJEMPLO DE ALGORITMO1
           var edad = 18;
           var esAdulto = edad >= 18; //Una variable interpretada como tipo boolean ya que el resultado arrojado es True o False
           
           if(esAdulto){
               System.out.println("Es mayor de edad");
           }
           else{
               System.out.println("Es menor de edad");
           }
           //EJEMPLO DE ALGORITMO1.1
           if(edad >= 18){
               System.out.println("Eres mayor de edad");
           }
           else{
               System.out.println("Eres menor de edad");
           }
           */
/*Clase 22 CONVERSION DE TIPOS PRIMITIVOS EN JAVA*/
           /*
           //Convertir un dato tipo String a un tipo int
           var edad = Integer.parseInt("19") ;//Hacemos uso del METODO "parseInt" el cual se encuentra definido en "LA CLASE INTEGER"
           //Este metodo recibe el valor de una cadena y lo convierte a un tipo entero posterior a eso se asigna a su variable
           System.out.println("edad = " + edad);
           
           //Convertir un dato de tipo String a un tipo Doouble
           var valorPi = Double.parseDouble ("3.1416");
           System.out.println("valorPi = " + valorPi);
           */
           
           /*
           var consola = new Scanner(System.in);
           var edad = Integer.parseInt("19");
           
           System.out.println("Escribe tu edad:");
           edad = Integer.parseInt( consola.nextLine() );//Tomando datos de la siguente lista y convirtiendolos a enteros.
           System.out.println("edad = " + (edad + 1));// Priorizacion de datos
           */
           
           /*
           var edadTexto = String.valueOf(19);//Convirtiendo un int a String
           System.out.println("edadTexto = " + edadTexto);
           
           //Solicitando solo un caracter y asignando al tipo char no funciona directamente 
           var caracter = "Hola".charAt(0); //recuperando un dato de una cadena y convirtiendo a tipo char
           System.out.println("caracter = " + caracter);
           */
           
           
           //TOMANDO EL PRIMER CARACTER DE UN TIPO STRING PARA CONVERTIR A TIPO CHAR
           var scan = new Scanner(System.in);
           System.out.println("Proporciona un caracter");
           var caracterr = scan.nextLine().charAt(1);
           System.out.println("caracterr = " + caracterr);
           
    }   
}
