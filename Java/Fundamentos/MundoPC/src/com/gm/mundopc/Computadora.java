package com.gm.mundopc;


public class Computadora {
    /*El idcomputadora final no viene en el diagrama pero es algo que ya se debe 
    de hacer*/
    private final int idcomputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;    
    //No viene en el diagrama el contadorComputadora pero en el video si
    private static  int contadorComputadora;
    
    
    private Computadora(){
        this.idcomputadora = ++Computadora.contadorComputadora;
    }
    
    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton){
    this();
    this.nombre = nombre;
    this.monitor = monitor;
    this.teclado = teclado;
    this.raton = raton;
    }

    public int getIdcomputadora() {
        return idcomputadora;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    
    @Override
    public String toString() {
        return "Computadora{" + "idcomputadora=" + idcomputadora + ", nombre=" + nombre + ", monitor=" + monitor + ", teclado=" + teclado + ", raton=" + raton + '}';
    }

    
    
    
}
