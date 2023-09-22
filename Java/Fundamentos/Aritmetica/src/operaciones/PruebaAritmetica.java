package operaciones;

public class PruebaAritmetica {

    public static void main(String[] args) {

//Clase52 EJECUCION PASO A PASO DE UN METODO
        Aritmetica Aritmetica1 = new Aritmetica();
        Aritmetica1.a = 3;
        Aritmetica1.b = 2;
        
        miMetodo();

        Aritmetica Aritmetica2 = new Aritmetica(5, 7);
        System.out.println("Aritmetica2 a:" + Aritmetica2.a);
        System.out.println("Aritmetica2 b:" + Aritmetica2.b);

        /*
        //Retorna un resusultado
        Aritmetica1.sumar();
        
        //Retorna un valor
        int resultado = Aritmetica1.sumarConRetorno();
        System.out.println("resultado desde la prueba = " + resultado);
        
        
        resultado = Aritmetica1.sumarConArgumentos(5, 8);
        System.out.println("resultado usando argumentos = " + resultado);
        
         */
    }

//Clase 57 ALCANCE DE VARIABLES

    public static void miMetodo() {
        //la variable "a" esta fuera del alcance de este metodo ya que 
        //fue definida fuera de este metodo
        //a = 10;
        System.out.println("Otro metodo");

    }

}
