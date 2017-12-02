package aula03;

import java.io.Console;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

/**
 * @author cassioseffrin
 */
public class Idade {

    public static int getIdade(Date dataNasc) {
        Date atual = new Date();
        int idade = 0;
        int anoAtual = atual.getYear() + 1900;
        int anoNasc = dataNasc.getYear();
        idade = anoAtual - anoNasc;
        int mesAtual = atual.getMonth();
        int mesNasc = dataNasc.getMonth();
        int diaAtual = atual.getDate();
        int diaNasc = dataNasc.getDate();
        if (mesNasc > mesAtual) {
            idade = idade - 1;
        } else if (diaNasc >= diaAtual) {
            idade--;
        }
        return idade;
    }

    public static void main(String a[]) {
        Date dataNasc = new Date(1999, 8, 12);
        System.out.println("Idade; " + Idade.getIdade(dataNasc));

        Scanner in = new Scanner(System.in);

        int i = in.nextInt();
        String s = in.next();

        System.out.println("entrada: " + s);
        System.out.println("entrada: " + i);
    }

}
