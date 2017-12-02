 
package aula03;

import java.util.Calendar;

/**
 *
 * @author cassioseffrin
 */
public class Calendario {
    
    
    public static void main(String a[]){
        
        Calendar atual = Calendar.getInstance();
        Calendar dataNasc = Calendar.getInstance();

        dataNasc.set(Calendar.YEAR, 1990);
        dataNasc.set(Calendar.MONTH, 7);
        dataNasc.set(Calendar.DATE, 28);
        
        System.out.println("atual: "+atual.getTime()+ " dataNasc: "+dataNasc.getTime());
        int ano1 = atual.get(Calendar.YEAR);
        int ano2 = dataNasc.get(Calendar.YEAR);
        int idade = ano1 - ano2;
        int mes1 = atual.get(Calendar.MONTH);
        int mes2 = dataNasc.get(Calendar.MONTH);
        
        if (mes2 > mes1) {
            idade--;
        } else if (mes1 == mes2) {
            int dia1 = atual.get(Calendar.DAY_OF_MONTH);
            int dia2 = dataNasc.get(Calendar.DAY_OF_MONTH);
            if (dia2 > dia1) {
                idade--;
            }
        }
        System.out.println("Idade: "+idade);
    }
    
}
