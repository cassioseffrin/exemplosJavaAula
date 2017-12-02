package threads;

/**
 *
 * @author cassioseffrin
 */
public class Main {

    public static void main(String a[]) {

        GeraColecao g = new GeraColecao(1);
        GeraColecao g2 = new GeraColecao(2);

        Thread t1 = new Thread(g);
        t1.start();

        Thread t2 = new Thread(g2);
        t2.start();
    }

}
