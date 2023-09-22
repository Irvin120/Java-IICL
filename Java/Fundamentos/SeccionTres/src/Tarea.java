
import java.util.Scanner;

public class Tarea {

    public static void main(String args[]) {

        var dato = new Scanner(System.in);
        System.out.println("Proporciona el nombre:");
        var nombre = dato.nextLine();
        System.out.println("Proporciona el id:");
        var id = dato.nextLine();
        System.out.println("Proporciona el precio:");
        var precio = Float.parseFloat(dato.nextLine());
        System.out.println("Proporciona el envio gratuito:");
        var envio = Boolean.parseBoolean(dato.nextLine());
        
        System.out.println(nombre + " " + "#" + id);
        System.out.println("Precio: " + "$" + precio);
        System.out.println("Envio Gratuito: " + envio);
    }
}
