package UtilsClass;

import java.util.Random;

/**
 *
 * @author kaique.beraguas
 */
public class Telefone {
    public static String getTelefone(){
        Random rnd = new Random();
        int digitos = rnd.nextInt(2)+8;
        String numeroTelefonico = "";
        for (int i = 0; i < digitos; i++)
        {
            numeroTelefonico += rnd.nextInt(10);
        }
        return numeroTelefonico;
    }
}
