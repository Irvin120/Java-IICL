package com.gm.mundopc;

public class Orden {

    /*El idcomputadora final no viene en el diagrama pero es algo que ya se debe 
    de hacer*/
    private final int idOrden;
    private Computadora computadoras[];
    /*No viene en el video pero es interpretado*/
    private static int contadorOrdenes;
    /*El objetivo de este es saber cuantos objetos de tipo computadora se han
    agregado a el arreglo para hace una iteracion correcta*/
    private int contadorComputadoras;
    /*No viene en el video pero es interpretado*/
    private static final int MAX_COMPUTADORAS = 10;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        /*Hacemos la creacion de una nueva orden con un pedido maximo de 10 
        computadoras que es el valor que tiene nuestra variable final maxComputadoras*/
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];

    }

    public void agregarComputadora(Computadora computadora) {
        /*Vefificamos que el contador de computadora no exeda el maximo de 
        computadoras*/
        if (this.contadorComputadoras < Orden.MAX_COMPUTADORAS) {
            /*Si no hemos exedido el maximo de computadoras entonces pasamos
            a hacer lo siguiente que es nuestro array donde se agregaran las
            computadoras hasta llegar a el limite traducido de otra forma esto
            es igual a "computador[0]= computadora, computadora[1] = computadora,
            computadora[2] = computadora,.....computadora[10]= computadora"*/
            this.computadoras[this.contadorComputadoras++] = computadora;
        } else {
            System.out.println("Has superado el limite");
        }
    }
    
    /*Metodo para mostrar la orden, este no regresa nada ya que todo lo que
     regresa lo regresa en consola*/
    public void mostrarOrden() {
        System.out.println("Orden #:" +this.idOrden );
        System.out.println("Computadoras de la orden #:" + this.idOrden);
        /*Es importante poner el contadorComputadora ya que este toma en 
        cuenta solo las computadoras que fueron agregadas y no toma en cuenta
        el limite de las coputadoras este con el objetivo de no hacer todas
        las iteraciones*/
        for(int i = 0 ; i < this.contadorComputadoras ; i++)
            System.out.println(this.computadoras[i]);

    }

}
