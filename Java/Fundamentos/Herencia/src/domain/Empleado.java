package domain;


//Con el extends indicamos que es una extencion de la clase Persona
//*Las clases que no definen de que clase extienden extiendes por defecto de la
//clase object pero no se agrega
//Java solo admite erencias simples
//Los constructores no se heredan pero se puede acceder a ellos por la palabra 
//clave super
public class Empleado extends Persona{
     
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;
    
    //Sobrecarga de constructores
    public Empleado(){
        //Aqui se hace un llamado automatico de super(nombre)
        this.idEmpleado = ++Empleado.contadorEmpleado;
    }
    
    //Haremos la cracion de un constructor 
     public Empleado (String nombre, double sueldo){
        //Al hacer esto estamos haciendo un llamado al constructor vacio de 
        //Empleado
         this();
         this.nombre = nombre;
         this.sueldo = sueldo;
     }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    //Para una mejor practica hacemos uso de un StringBuilder que hara lo mismo
    //que el toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{idEmpleado=").append(this.idEmpleado);
        //sb.append(", nombre=").append(this.nombre);
        sb.append(", sueldo=").append(this.sueldo);
        sb.append(",").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
