package com.gm.mundopc;

public class Raton extends DispositivoEntrada{
    private int idRaton;
    private static int contadorRatones;
    
    public Raton(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        idRaton = ++Raton.contadorRatones;
    }

    /*AUI NO SE LLAMO LA INFORMACION DE LA CLASE´PADRE POR LO QUE SE TIENE QUE 
    LLAMAR POR LO QUE SE HACE CON "super.toSting()"*/
    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + super.toString()+ '}';
    }
    
    
}
