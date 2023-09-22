package excepciones;

public class OperacionesExepcion extends Exception{
    public OperacionesExepcion(String mensaje){
        super(mensaje); /*Lo que estamos haciendo es propagarlo hacia la clase de excepcion */
        /*Con esto se define nuestra propia clase de excepcion */
    }
}
