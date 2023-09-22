 package domain;

public class Rectangulo extends FiguraGeometrica {
    
    public Rectangulo(String tipoFigura){
        super(tipoFigura);
    }
    
    //El metodo se esta implementando por primera vez
    //Cuando se implementa el metodo abstrac se quita la palabra abtrac
    
    @Override
    public void dibujar(){
        System.out.println("Se imprime un  "  + this.getClass().getSimpleName() );
    }
} 
