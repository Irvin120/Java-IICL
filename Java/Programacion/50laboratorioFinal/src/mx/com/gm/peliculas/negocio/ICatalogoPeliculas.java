package mx.com.gm.peliculas.negocio;

import mx.com.gm.peliculas.excepciones.*;

public interface ICatalogoPeliculas {
    
    String NOMBRE_ARCHIVO = "peliculas.txt";
    
    public void agregarPelicula(String nombrePelicula);
    
    public void listarPelicula();
    
    public void buscarPelicula(String buscar);
    
    public void iniciarCatalogoPeliculas();
    
}
