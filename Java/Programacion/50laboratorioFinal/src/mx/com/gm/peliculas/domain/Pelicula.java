package mx.com.gm.peliculas.domain;

public class Pelicula {

    //Variable privada
    private String nombre;

    //Constructor publivo vacio
    public Pelicula() {
    }

    public Pelicula(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.nombre ;
    }
}
