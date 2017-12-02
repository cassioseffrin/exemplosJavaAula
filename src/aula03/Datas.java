 
package aula03;

import java.time.LocalDate;
import static java.time.LocalDate.now;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author cassioseffrin
 */
public class Datas {

    public static int getIdade(LocalDate nascimento, LocalDate dataAtual) {
        if ((nascimento != null) && (dataAtual != null)) {
            return Period.between(nascimento, dataAtual).getYears();
        } else {
            return 0;
        }
    }

    public static void main(String a[]) {
        LocalDate nascimento = LocalDate.of(1989, 5, 17);

        int atual = Datas.getIdade(nascimento, LocalDate.of(2016, 7, 12));
        System.out.println("" + atual);


    }
}
