/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package letturadatastiera;

/**
 *
 * @author paolo
 */
import java.util.*; //scanner
import java.io.*; //BufferedReader
public class LetturaDaTastiera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in); // System.in flusso predefinito. Scanner \in java.util
        // va importata
        //BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        //InputStream trasforma il flusso in un flusso di caratteri
        //Bufferedreader consente di leggere una stringa per intero
        System.out.print("Dammi il primo numero ");
        double x=s.nextDouble(); //prende il flusso di dati e legge prossimo valore double
        System.out.print("Dammi il secondo numero ");
        double y=s.nextDouble(); //prende il flusso di dati e legge prossimo valore double
        System.out.print("La somma è uguale a " + (x+y));
         //input numeri tipo 4,5 non 4.5
        
    }
    
}
