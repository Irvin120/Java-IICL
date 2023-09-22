package mx.com.gm.peliculas.datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.ArrayList;
import java.util.List;

import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.*;

public class AccesoDatosImpl implements IAccesoDatos {

    @Override
    public boolean existe(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        return archivo.exists();
    }

    @Override
    public List<Pelicula> listar(String nombre) throws LecturaDatosEx {
        File archivo = new File(nombre);
        List<Pelicula> peliculas = new ArrayList<>();
        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();
            while (linea != null) {
                Pelicula pelicula = new Pelicula(linea);
                peliculas.add(pelicula);
                linea = entrada.readLine();
            }
            entrada.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepcion al listar peliculas: " + ex.getMessage());

        } catch (IOException ex) {
            ex.printStackTrace( );
            throw new LecturaDatosEx("Excepcion al listar peliculas: " + ex.getMessage());
            
        }
        
        return peliculas;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx {
        var archivo = new File(nombreArchivo);
        try{
            var salida = new PrintWriter(new FileWriter(archivo, anexar));   
            salida.print(pelicula.toString());
            salida.close();
            System.out.println("Se ha escrito informacion al archivo: " + pelicula );
        }catch (IOException ex){
            ex.printStackTrace();
            throw new EscrituraDatosEx("Excepcion al listar peliculas: " + ex.getMessage());
        }
    }

    @Override
    public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx {
        var archivo = new File(nombreArchivo);
        String resultado = null; //Declarando el valor por defecto del resultado para que en caso de que no se encuentre uno igual ste sea el que se retorne
        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;//Es importante predefinir un valor por defecto de est linea con valor de null ya que est se ocpara mas adelante y alamacenara un valor
            linea = entrada.readLine();//Al hacer esto se nos sugiere usar un catch ya que por cualquier error que suceda este puede detener el funcionamiento de la aplicacion es por ello que se hace el manejo de este posible error para que en caso de que esto llege a pasar elcath responda y ele programa se siga ejecutando de manera correcta.
            var indice = 1; //Este indice se declara ya que posteriormente sera usado para mostra el numero de linea en donde se encuentra la pelicula
            while(linea != null){
                if(buscar != null && buscar.equalsIgnoreCase(linea)){
                    resultado = "Pelicula" + linea +" encontrada en el indice " + indice ;
                    break;
                }
                linea = entrada.readLine();
                indice++;
            }            
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepcion al buscar peliculas: " + ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepcion al buscar peliculas: " + ex.getMessage());
        }
        return resultado;
    }

    @Override
    public void crear(String nombreArchivo) throws AccesoDatosEx {
        var archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Se ha creado el archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new AccesoDatosEx("Error al crear archivo " + ex.getMessage());
        }
    }

    @Override
    public void borrar(String nombreArchivo){
        var archivo = new File(nombreArchivo);
        if(archivo.exists())
            archivo.delete();
        System.out.println("Se ha borrado el archivo");
    }
}
