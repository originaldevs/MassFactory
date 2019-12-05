package UtilsClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author kaique.beraguas
 */
public class Escolaridade {
    
    public static String getEscolaridade(){
        
        Random rnd = new Random();
        List<String> estados = new ArrayList<>();
        estados.add("Fundamental");
        estados.add("Medio");
        estados.add("Tecnico");
        estados.add("Superior Incompleto");
        estados.add("Superior completo");                 
        return estados.get(rnd.nextInt(estados.size())) ;
    }
    
}
