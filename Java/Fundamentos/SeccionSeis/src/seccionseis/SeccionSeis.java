
package seccionseis;

public class SeccionSeis {

    public static void main(String[] args) {
        
/*Clase41 EJERCICIO CICLO WHILE
        //El ciclo while es un ciclo repetitivo basado en los resultados de una
        //expresion logica.El proposito es repetir un bloque de de codigo 
        //mientras una condicion se mantenga verdadera
        
        var contador = 0;
        while (contador < 3){
            System.out.println("contador = " + contador);
            contador++;
        }*/
/*Clase42 EJERCICIO CICLO DO-WHILE
        //A diferencia del ciclo WHILE este se ejecuta por lo menos una vez
        
        var contador = 0;
        
        do{
            System.out.println("contador = " + contador);
            contador++;
        
        }while(contador < 3);
        */
        

/*Clase43 EJERCICIO CICLO FOR

        for(var contador = 0; contador < 3; contador++){
          System.out.println("contador = " + contador);
        }*/
      
/*Clase44 PALABRA BREACK Y CONTINUE EN JAVA*/
        
        //Ejemplo de uso del breack
        /*for(var contador = 0; contador < 3 ; contador++){
            if (contador % 2 == 0){
            System.out.println("contador = " + contador);
            break; //Rompe el proceso y unicamente deja pasar un resultado
            }
        }
        
        //Ejemplo de uso del continue
        for(var contador = 0; contador < 7 ; contador++){
             if (contador % 2 != 0){
                continue;
            }
            System.out.println("contador = " + contador);
        }
        */
        
/*Clase45 USO DE ETIQUETAS LABEL*/
        
         inicio:
         for (var contador = 0 ; contador < 7 ; contador ++){
             if (contador % 2 != 0){
                 continue inicio;//Ir a la linea de codigo de etiqueta
             }
             System.out.println("contador = " + contador);
         }
         
/*Clase46 CLASES EN JAVA*/

        //se crea una nueva clase con un nuevo package clases/Persona.java
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         

    }
}
