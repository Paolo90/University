package esame2012esercizio2;
import java.io.*;
/**
 *
 * @author Marco Matteocci
 */
public class Applicazione {

    public static void main(String args[]) {

            String file = null;
            BufferedReader in = null;
            // per effettuare una prova e' stato preparato un file test.txt da leggere.
            try {
                System.out.println("Inserisci  il nome del file da aprire ('file di prova' test.txt): ");
                in = new BufferedReader(new InputStreamReader(System.in));

                file = in.readLine();
                Lista l = new Lista();

                l.leggiFile(file);
                System.out.println("Il valore minimo tra quelli presenti nel file e' "+l.getMinimo());  

            }
            catch(IOException e) { e.printStackTrace(); } 
            finally {
            if (in!=null)
                try { in.close(); } catch (IOException e) { e.printStackTrace(); }
            }

        }

}