package UtilsClass;

import java.util.Random;
/**
 *
 * @author kaique.beraguas
 */

public class Cpf {
    public static String getCpf(){
        int soma = 0, resto = 0;
        
        int[] multiplicador1 = { 10, 9, 8, 7, 6, 5, 4, 3, 2 };
        
        int[] multiplicador2 = { 11, 10, 9, 8, 7, 6, 5, 4, 3, 2 };

        Random rnd = new Random();
        String semente = String.valueOf(rnd.nextInt(899999999) + 100000000);
        
        for (int i = 0; i < 9; i++)
            soma +=  Integer.parseInt(String.valueOf(semente.toCharArray()[i])) * multiplicador1[i];

        resto = soma % 11;
        if (resto < 2)
            resto = 0;
        else
            resto = 11 - resto;

        semente = semente + resto;
        soma = 0;

        for (int i = 0; i < 10; i++)
            soma += Integer.parseInt(String.valueOf(semente.toCharArray()[i])) * multiplicador2[i];

        resto = soma % 11;

        if (resto < 2)
            resto = 0;
        else
            resto = 11 - resto;

        semente = semente + resto;
        return semente;
    }
    

    
}
