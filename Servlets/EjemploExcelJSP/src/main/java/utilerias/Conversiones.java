package utilerias;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Irvin Cueto
 */
public class Conversiones {
    private static final String FORMATO_FECHA = "dd-MM";
    
    public static String format (Date fecha){
        SimpleDateFormat fomateador = new SimpleDateFormat(FORMATO_FECHA);
        
        return fomateador.format(fecha);
    }
    
}
