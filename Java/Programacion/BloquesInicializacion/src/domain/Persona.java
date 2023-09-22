package domain;


public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    /*Bloque de codigo de inicializacion estatico*/
    static{
        /*Solo se ejecuta una vez al iniciar*/
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contadorPersonas;
    }
    /*Bloque de inicializacion no estatico (Dinamico)*/
    {
        /*Se ejecuta cada que se crea un nuevo objeto*/
        System.out.println("Ejecucion de bloque No estatico");
        this.idPersona = Persona.contadorPersonas++;
    
    }
    
    public Persona(){
        System.out.println("Ejecucion del constructor");
    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
}
