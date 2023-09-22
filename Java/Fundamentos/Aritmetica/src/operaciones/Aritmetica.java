package operaciones;

//Clase50 CREACION DE METODOS
public class Aritmetica {
    //Definicion de las variables

    int a;
    int b;

    //Creacion de Constructor
    public Aritmetica() {
        System.out.println("Ejecutando Constructor");

    }
 
//Clase56 HACIENDO QUE EL CONSTRUCTOR RECIBA ARGUMENTOS
    //Creando constructor que recibe argumentos
    public Aritmetica(int a, int b){
        this.a = a;
        this.b =b;
        System.out.println("Ejecutanto constructor con arg");
    }

    /*
    //Definicion del metodo
    //public es un modificador de acceso
    public void sumar() {
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }

//Clase51 se crea una nueva clase en el paquete de operaciones llamada prueba
    public int sumarConRetorno() {

        //int resultado a + b;
        //return resultado;
        //La forma mas optima de hacerlo es asi
        return a + b;
    }

    public int sumarConArgumentos(int a, int b) {
        this.a = a;//El argumento a se asinga al atributo this.a
        this.b = b;//El argumento b se asinga al atributo this.b

        return this.sumarConRetorno();
    

    }
*/
}
