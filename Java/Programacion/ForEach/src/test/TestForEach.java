package test;
import domain.Persona;

public class TestForEach {

    public static void main(String[] args) {
        
        int edades[] = {2, 5, 6, 8};
        for (int edad : edades) {
            System.out.println("edad = " + edad);
        }
        
        Persona personas[] = {new Persona("Carlos"), new Persona("Luis")};
        for (Persona persona : personas){
            System.out.println("Persona = " + persona);
        }
    }
}
