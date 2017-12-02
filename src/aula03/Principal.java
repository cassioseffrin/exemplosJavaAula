package aula03;

import arquivo.Gravar;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author cassioseffrin
 */
public class Principal {

    public static void main(String args[]) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        Pessoa joao = new Pessoa(2, "Joao", new Date(1994, 2, 25), "Masculino", "32.342.343-32", "Rua B");
        Pessoa maria = new Pessoa(1, "Maria", new Date(1994, 2, 25), "Feminino", "32.342.343-32", "Rua A");        
        Set<Pessoa> colecaoPessoa = new TreeSet<>(new Pessoa());
        colecaoPessoa.add(maria); 
        colecaoPessoa.add(joao);
 
       
//        File f = new File("/Users/cassioseffrin/colecaoPessoas.txt");
//        FileOutputStream fos = new FileOutputStream(f);
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        oos.writeObject(colecaoPessoa);
//   
//        
//       
//        FileInputStream fis = new FileInputStream(f);
//        ObjectInputStream ois = new ObjectInputStream(fis);
//        Object col = ois.readObject();
//        Set<Pessoa> colecaoDeserializable = (Set<Pessoa>) col;
//        
//        System.out.println("Tamanho colecao: "+ colecaoDeserializable.size());
//                oos.flush();
//        oos.close();
        for (Pessoa p:colecaoPessoa){
            System.out.println( p);
        }
        


    }

}
