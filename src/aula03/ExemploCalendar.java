package aula03;

import java.util.Calendar;

/**
 *
 * @author cassioseffrin
 */
public class ExemploCalendar {

    public static void main(String arr[]) {
        Calendar dataAtual = Calendar.getInstance();
        Calendar dataNasc = Calendar.getInstance();
        dataNasc.set(1990, 5, 20);
        long idadeMillis = dataAtual.getTimeInMillis() - dataNasc.getTimeInMillis();
        Calendar idade = Calendar.getInstance();
        idade.setTimeInMillis(idadeMillis);
        
        Double result  =  (double) idadeMillis / 365L / 24L / 60L / 60L / 1000L;
        System.out.printf("idade: %.6f", result);
    }

}
