
package aula02;

import aula02.interfaces.Operacoes;

/**
 * @author cassioseffrin
 */

public class Matematica implements Operacoes {

    @Override
    public float somar(float valor1, float valor2) {
        return valor1+valor2;
    }

    @Override
    public  float subtrair(float valor1, float valor2) {
       return valor1-valor2;
    }

    @Override
    public float multiplicar(float valor1, float valor2) {
        return valor1*valor2;
    }
 
    @Override
    public float dividir(float valor1, float valor2) {
        return valor1/valor2;
    }

    @Override
    public float raiz(float valor1) {
       return (float) Math.sqrt(valor1);
    }
    
    public static float soma(float valor1, float valor2) {
       return (float) Math.sqrt(valor1);
    }
}
