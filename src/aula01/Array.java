 
package aula01;

import java.util.ArrayList;

/**
 * @author cassioseffrin
 */

public class Array{
    
	public ArrayList<Integer> geraColecao(){
                ArrayList<Integer> colecao1 = new ArrayList<>();
		for (int i=0; i<=10; i++){
			 colecao1.add(100+ Double.valueOf(Math.random()*400).intValue());
		}
                colecao1.add(100);
                return colecao1; 
	}	

	public static void main (String a[]){
                Array ar = new Array();
		ArrayList<Integer>  colecao = ar.geraColecao();		
                
                for (Integer valor: colecao){
                    System.out.println("valor: " +valor);
                }
	}
}
