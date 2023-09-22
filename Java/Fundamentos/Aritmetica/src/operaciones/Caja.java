package operaciones;

public class Caja {

    int ancho;
    int alto;
    int profundo;

    public Caja() {
        System.out.println("Ejecucion de constructor vacio");
    }

    public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
        System.out.println("Ejecucion de constructor con argumentos");
    }

    public int calcularVolumen() {
        return ancho * alto * profundo;
    }

}
