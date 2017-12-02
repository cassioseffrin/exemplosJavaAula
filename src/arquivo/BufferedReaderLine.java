package arquivo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author cassioseffrin
 */
public class BufferedReaderLine {

    public static void main(String a[]) {

        FileInputStream fis = null;
        BufferedReader reader = null;

        try {
            fis = new FileInputStream("/pessoa.txt");
            reader = new BufferedReader(new InputStreamReader(fis));

            System.out.println("lendo arquivos por linhas usando BufferedReader");

            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }

        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        } finally {
            try {
                reader.close();
                fis.close();
            } catch (IOException ex) {
                 
            }
        }
    }
}
