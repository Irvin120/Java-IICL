package test;

import domain.*;

public class TestInstanceOf {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 5240);
        determinarTipo(empleado);
        //Empleado empleado = new Gerente("Carlos", 4550, "D12");
        //determinarTipo(empleado);
    }
    public static  void determinarTipo(Empleado empleado){
        /*Un uso que se le puede hacer a la palabra resevada instanceof
        es que gracias a esta ahora ya sabremos el tipo de dato que estamos 
        controlando por lo que ahora ya se podra hacer una conversion de variable*/
        
        if(empleado instanceof Gerente){
            System.out.println("Es de tipo Gerente");
            
            //Gerente gerente = (Gerente)empleado;
            //System.out.println("Empleado = " + gerente.getDepartamento());
            
            /*Forma corta*/
            ((Gerente)empleado).getDepartamento();
            
            
        }
        else if (empleado instanceof Empleado){
            System.out.println("Es de tipo Empleado");
            
            System.out.println("empleado = " + empleado.getNombre());
        }
        else if (empleado instanceof Object){
            System.out.println("Es de tipo Object");
            empleado.toString();
        }
    }
}

