package test;
import enumeraciones.*;

public class TestEnumeraciones {
    public static void main(String[] args) {
        //System.out.println("Dias: " + Dias.LUNES);
        //indicarDiaSemana(Dias.MIERCOLES);
        
        System.out.println("Continente no. 4: " + Continentes.AMERICA);
        System.out.println("Numero de continentes del 4 continente " + Continentes.AMERICA.getPaises());
        
    }
    
    public static void indicarDiaSemana(Dias dias){
        switch(dias){
            case LUNES : System.out.println("Lunes");
            break;
            case MARTES : System.out.println("Martes");
            default : System.out.println("Dia no encontrado");
        }
        
        
        
    }
}
