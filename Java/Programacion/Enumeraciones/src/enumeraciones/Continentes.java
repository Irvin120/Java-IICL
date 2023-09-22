package enumeraciones;


public enum Continentes {
    AFRICA(40),
    EUROPA(5),
    ASIA(1),
    AMERICA(2),
    OCAENIA(8);
    
    private final int paises;
    Continentes(int paises){
    this.paises = paises;
    }

    public int getPaises() {
        return paises;
    }
    
}
