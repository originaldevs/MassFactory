package UtilsClass;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

/**
 *
 * @author kaique.beraguas
 */
public class DataNascimento {
      public static String getDate(int idadeMinima,int idadeMaxima)
        {
            Random rnd = new Random();
            Calendar calendar = new GregorianCalendar();
            
            int maxDay = 29;
            int minDay = 1;
            int minYear = calendar.getWeekYear() - idadeMinima;
            int maxYear = calendar.getWeekYear() - idadeMaxima;
            
            int day = rnd.nextInt(maxDay - minDay)+minDay;
            int month = rnd.nextInt(12)+1;
            int year = rnd.nextInt(minYear - maxYear)+maxYear;
            
            String respDay =  (day > 9)?String.valueOf(day):"0"+ String.valueOf(day); 
            String respMonth =  (month > 9)?String.valueOf(month): "0"+String.valueOf(month);
                       
            return respDay + "-" + respMonth + "-" + String.valueOf(year);
        }
}
