/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observers;

import java.util.Observable;

/**
 *
 * @author cassioseffrin
 */
public class ProcessoObservado extends Observable{
    private int numero = 0;
    public int getValue() {
        return numero;
    }
    public void setValue(int numero) {
        this.numero = numero;
        setChanged();
        notifyObservers();
    }
}
