package threads;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cassioseffrin
 */
public class GeraColecao implements Runnable {

    int id;

    public GeraColecao(int id) {
        this.id = id;
    }

    public void geraImprimeCol() {
        List<Double> lstD = getColecao();
        imprimeColecao(lstD);
    }

    public List<Double> getColecao() {
        ArrayList<Double> ar = new ArrayList<>();
        for (int i = 0; i < 60000; i++) {
            ar.add(Math.random());
        }
        return ar;
    }

    public void imprimeColecao(List<Double> col) {
        int i = 0;
        for (Double d : col) {
            System.out.printf("\nthreadid: %s, %s -> %s ", id, i, d);
            i++;
        }
    }

    @Override
    public void run() {
        List<Double> lstD = getColecao();
        imprimeColecao(lstD);
    }

    public static void main(String a[]) {
//        GeraColecao col1 = new GeraColecao(1);
//        GeraColecao col2 = new GeraColecao(2);
//
//        col1.geraImprimeCol();
//        col1.geraImprimeCol();

        GeraColecao col1 = new GeraColecao(1);
        GeraColecao col2 = new GeraColecao(2);
        Thread t1 = new Thread(col1);
        Thread t2 = new Thread(col2);

        t1.start();
        t2.start();
    }

}
