package paquete1;

class Clase1 {
    //PUBLIC
    /*
    //Variable de tipo publica
    public String atributoPublico = "Atributo Publico";
    //Constructor de tipo publico
    public Clase1(){
        System.out.println("Constructor Publico");
    }
    //Metodo de tipo publico
    public void metodoPublico(){
        System.out.println("Metodo Publico");
    }
     */
    //PROTECTED
    /*
    protected String atributoProtected = "Valor atributo protected";
    protected Clase1(){
        System.out.println("Constructor protected");
    }
    protected void metodoProtected(){
        System.out.println("Metofo protected");
    }
     */

 /*
    //DEFAULT*
    String atributoDefault = "Valor atributo default";
    
    Clase1(){
        System.out.println(" Constructor por default");
    }
    void metodoDefault(){
        System.out.println("Metodo por Default");
    }
     */
    
    private String atributoPrivado = "Valor Atributo Privado";
    
    private Clase1 (){
        System.out.println("Constructor Privado");
    }
    
    public Clase1 (String metodo){
        this();
        System.out.println("Constructor Publico" );
    }
    
    private void metodoPrivado(){
        System.out.println("Metodo Privado");
    }

    public String getAtributoPrivado() {
        return atributoPrivado;
    }

    public void setAtributoPrivado(String atributoPrivado) {
        this.atributoPrivado = atributoPrivado;
    }
    
}


























