package com.gm.mundopc;


public class Monitor {
    
    private int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitor;
     
    private Monitor(){
        idMonitor = ++Monitor.contadorMonitor;
    }
    
    public Monitor(String marca, double tamanio){
        this();
        this.marca = marca;
        this.tamanio = tamanio;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public void setIdMonitor(int idMonitor) {
        this.idMonitor = idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamaño() {
        return tamanio;
    }

    public void setTamaño(double tamaño) {
        this.tamanio = tamaño;
    }

        @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tama\u00f1o=" + tamanio + ", contadorMonitor=" + contadorMonitor + '}';
    }
    
}
