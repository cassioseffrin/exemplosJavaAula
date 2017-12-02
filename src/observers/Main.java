 
package observers;

/**
 *
 * @author cassioseffrin
 */
 
    
    public class Main {
    public static void main(String a[]){
        ProcessoObservado processo = new ProcessoObservado();
        Observador observador = new Observador();
        observador.setObservado(processo);
        processo.addObserver(observador);
        processo.setValue(34);
    }
    
}

    

