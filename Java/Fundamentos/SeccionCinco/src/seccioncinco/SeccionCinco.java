package seccioncinco;

import java.util.Scanner;

public class SeccionCinco {

    public static void main(String[] args) {

        /*Clase35 SENTENCIA DE CONTROL IF-ELSE EN JAVA
        
       //Ejemplo 1
        var condicion = false;
        
        if (condicion) {
            System.out.println("Condicion verdadera");
        }else{
            System.out.println("Condicion falsa");
        }
         */
 /*Clase36 EJERCICIO IF-ELSE EN JAVA

        var numero = 2;
        var numeroTexto = "Numero desconocido";

        if (numero == 1) {
            numeroTexto = "Numero uno";
        } else if (numero == 2) {
            numeroTexto = "Numero dos";
        } else if (numero == 3) {
            numeroTexto = "Numero tres";
        } else if (numero == 4) {
            numeroTexto = "Numero cuatro";
        } else {
            System.out.println("Numero no encontrado");
        }
        System.out.println("Numerotexto = " + numeroTexto);
         */
 /*Clase37 CUALCULO ESTACION DEL AÑO CON IF-ELSE
 
        var mes = 0;
        var estacion = "Estacion desconocida";
        
        Scanner estado = new Scanner (System .in);
        
        System.out.println("Escribe el numero del mes del año");
        mes = Integer.parseInt(estado.nextLine());

        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "Invierno";
        } else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "Primavera";
        } else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "Verano";
        }else if (mes == 9 || mes == 10 || mes == 11){
            estacion = "Otonio";
        }else System.out.println("estacion = " + estacion);
        System.out.println("estacion = " + estacion);
         */
 /*Clase38 SENTENCIA DE CONTROL SWITCH EN JAVA
    
        var numero = 2 ;
        var numeroTexto = "Valor desconocido";
        
        switch (numero){
            
            case 1: 
                numeroTexto = "Numero Uno";
                break;
            case 2 : 
                numeroTexto = "Numero Dos";
                break;
            case 3 : 
                numeroTexto = "Numero Tres";
                break;
            case 4 :
                numeroTexto = "Numero Cuatro";
                break;
            default : numeroTexto = "Caso no encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto);
         */
 /*Clase39 CALCULO ESTACION DEL AÑO CON SWITCH
 
        var mes = 0;
        var estacion = "Estacion desconocida";
        Scanner valor = new Scanner (System.in);
        
        System.out.println("Escribe el el numero del mes en el que te encuentras y te dire"
                + " la estacion del año en la que te encuentras");
        mes = Integer.parseInt(valor.nextLine());
        
        switch (mes){
            case 1 : case 2 : case 12:
                System.out.println("Invierno");
                break;
            case 3 : case 4 : case 5:
                System.out.println("Primavera");
                break;
            case 6 : case 7 : case 8 :
                System.out.println("Verano");
                break;
            case 9 : case 10 : case 11 :
                System.out.println("Otoño");
                break;
        }
         */
 
 /*Tarea6 y Clase40 SISTEMA DE CALIFICACIONES
 
        float calificacion = 10;
        Scanner lectorCalificacion = new Scanner(System.in);

        System.out.println("Proporciona un numero entre el 0 y 10");
        calificacion = Float.parseFloat(lectorCalificacion.nextLine());

        if (calificacion >= 9 && calificacion <= 10) {
            System.out.println("A");
        } else {
            if (calificacion >= 8 && calificacion < 9) {
                System.out.println("B");
            } else {
                if (calificacion >= 7 && calificacion < 8) {
                    System.out.println("C");
                } else {
                    if (calificacion >= 6 && calificacion < 7) {
                        System.out.println("D");
                    } else {
                        if (calificacion >= 0 && calificacion < 6) {
                            System.out.println("F");
                        }else {
                            System.out.println("Valor desconocido");
                        }
                    }
                }
            }
        }
        */
    }
}
