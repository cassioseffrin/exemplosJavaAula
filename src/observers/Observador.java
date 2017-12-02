/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observers;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author cassioseffrin
 */
public class Observador implements Observer{
    private ProcessoObservado observado;
    public void setObservado(ProcessoObservado o){
        this.observado=o;
    }
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("algo ocorreu no objeto observado");
        System.out.println("Numero: "+observado.getValue());
    }    
}
