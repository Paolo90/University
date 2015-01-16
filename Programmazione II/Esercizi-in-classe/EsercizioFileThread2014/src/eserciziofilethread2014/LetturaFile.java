/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eserciziofilethread2014;
import java.io.*;
/**
 *
 * @author paolo
 */
public class LetturaFile extends Thread{
    String nomeFile;
    Accumulatore c; //=null all'inizio
    LetturaFile(String nomeFile, Accumulatore c){
        this.nomeFile=nomeFile;
        this.c=c;
    }
    public void run(){ // istruzioni del thread
        BufferedReader in=null; // assegno dentro try-catch
        try{ // serve per aprire il file
            in =new BufferedReader(new FileReader(nomeFile));
        }catch(FileNotFoundException e){
            System.out.println(""+nomeFile +" non esiste.");
            return; // se non lo metto il programma va avanti e io voglio che invece si fermi il programma
        }catch(IOException e){
            System.out.println("Errore lettura");
            return;
        }
        try{ // serve per leggere il file
            double accumulatore=0;
            int contatore=0;
            String linea=null;
            while((linea=in.readLine())!=null){ //leggo tutto il file. L'assegnamento è un operatore
                System.out.println("Linea = "+linea);
                //contatore++;
                try{
                accumulatore+=Double.parseDouble(linea); // se non converto, non incremento e perdo i numeri precedenti perché attivo il finally
                contatore++;
                }catch(NumberFormatException e){
                    //e.printStackTrace();
                    System.out.println(linea + " non è un numero");
                }
            } // quando arrivo qui ho finito di leggere il file. Ora aggiorno i valori
            c.incremento(accumulatore, contatore);
            System.out.println(accumulatore+", "+contatore+", "+c.media());
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
                in.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
