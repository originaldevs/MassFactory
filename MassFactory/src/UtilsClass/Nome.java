package UtilsClass;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kaique.beraguas
 */
public class Nome {
    
    public static String getNome(){

        Random rdn = new Random();
        StringBuilder nomeRetorno = new StringBuilder();
        int tamanhoNome = rdn.nextInt(2)+1;
        List<String> PrimeiroNome = new ArrayList<>();
        String line = "";
        try(BufferedReader str = new BufferedReader(new FileReader("src\\Source\\ArquivoNome.txt"))){
            while ((line = str.readLine()) != null)
            {
                PrimeiroNome.add(line);
            }
        } catch (IOException ex) {
            Logger.getLogger(Nome.class.getName()).log(Level.SEVERE, null, ex);
        }
        nomeRetorno.append(PrimeiroNome.get(rdn.nextInt(PrimeiroNome.size())));

        List<String> SobreNome = new ArrayList<>();
        try(BufferedReader str = new BufferedReader(new FileReader("src\\Source\\ArquivoSobrenome.txt"))){
            while ((line = str.readLine()) != null)
            {
                SobreNome.add(line);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Nome.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Nome.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (int i = 0; i < tamanhoNome; i++)
        {
            nomeRetorno.append(" ");
            nomeRetorno.append(SobreNome.get(rdn.nextInt(SobreNome.size())));
        }
        return nomeRetorno.toString();

    }    
}
