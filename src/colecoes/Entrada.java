package colecoes;

import aula03.Pessoa;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Vector;

public class Entrada {

    public static void main(String a[]) throws FileNotFoundException, IOException, ClassNotFoundException {

        File fentrada = new File("/Users/cassioseffrin/nomes2.txt");
        FileInputStream fis = new FileInputStream(fentrada);
        Scanner scanEntrada = new Scanner(fis);
        String linha="";
        
        ArrayList<String> arr = new ArrayList();
        Vector<String> vector = new Vector();
        HashSet<String> hset = new HashSet();
        
        ArrayList<Pessoa> lstPes = new ArrayList<>();
        while(scanEntrada.hasNextLine()){
          //  vector.add(scanEntrada.nextLine());
            
            lstPes.add(  new Pessoa(scanEntrada.nextLine()));
        }
     
        
         File f = new File("/Users/cassioseffrin/lstPes.txt");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(lstPes);
        oos.flush();
        oos.close();



        FileInputStream fisP = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fisP);
        
        ArrayList<Pessoa> backfromfile = (ArrayList<Pessoa>) ois.readObject();
      //  System.out.println("ois"+v);
      
      
      for (Pessoa p : backfromfile){
          System.out.println("pessoa "+p);
      }
      Pessoa p = new Pessoa();
       if (lstPes.contains(new Pessoa("Odette"))){
         p = Pessoa.getPessoaPorNome(backfromfile, "Odette");
       }
        
         System.out.println("Pessoa odete"+ p);
      
    }

    public void entrada() throws FileNotFoundException, IOException {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Digite um nome: ");
        String nome = scan.next();
        System.out.printf("\nDigite a idade: ");
        int idade = scan.nextInt();

        System.out.println("O nome digitado foi: " + nome);
        System.out.println("A Idade digitada foi: " + idade);

        nome = nome + "\n";

        File arquivo = new File("/Users/cassioseffrin/saida.txt");
        FileOutputStream fos = new FileOutputStream(arquivo, true);
        fos.write(nome.getBytes());
        fos.close();
    }

}
