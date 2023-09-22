package test;
import static aritmetica.Aritmetica.division;
import excepciones.OperacionesExepcion;
public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        try {
            resultado = division(10, 0);
        }catch(OperacionesExepcion e)
        {
            System.out.println("Ocurrio un error de tipo OperacionExcepcion");
            System.out.println(e.getMessage());
        }
        catch (Exception e) //e es el nombre que se le da al espacio de almacenamiento de la excepcion
        {
            System.out.println("Ocurrio un error");
            e.printStackTrace(System.out);//Mucha de las veces tenemos mas de un error  entonces imprimimos la pila de excepciones
            //System.out.println(e.getMessage());
        }
        finally{ /*Inedependiente mente de cual sea el resultadp finally siempre se va a ejecutar*/
            System.out.println("Se reviso la division entre cero");
        }
        System.out.println("resultado = " + resultado);
    }
}
/*Se recomienda usar unicamente try and catch de las excepciones que sabemos que realmente pueden suceder*/
/*Se recomienda hacer uso del RuntimeException para excepciones que no sabemos que van a ser seguras de que pasen*/