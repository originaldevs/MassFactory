package UtilsClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author kaique.beraguas
 */
public class EstadoCivil {
    
    public static String getEstadoCivil(){
        Random rnd = new Random();
        List<String> estados = new ArrayList<>();
        estados.add("Solteiro(a)");
        estados.add("Casado(a)");
        estados.add("Divorciado(a)");
        estados.add("Viuvo(a)");
        
        return estados.get(rnd.nextInt(estados.size())) ;
    }
    
}
