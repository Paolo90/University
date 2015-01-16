/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eserciziofilethread2014;
import java.util.*;
import java.io.*;

/**
 *
 * @author paolo
 */
public class EsercizioFileThread2014 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        try{
        PrintWriter p=new PrintWriter(new FileWriter("/home/paolo/Documents/provajava.txt"),true); //specifico il path
        p.println("ciao");
        p.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        
        Accumulatore accumulatore=new Accumulatore();
        System.out.println("Quanti file vuoi leggere?");
        Scanner tastiera;
        tastiera=new Scanner(System.in);
        int numeroFile=tastiera.nextInt(); //formattazione intera dell'input da tastiera
        LetturaFile[] elencoThread=new LetturaFile[numeroFile];
        for(int i=1;i<=numeroFile;i++){
            //lancia tutti i thread e fuori dal for lancio join
            // quindi per svincolarmi dal numero di thread li metto in un array perché qui so quanti
            // sono e poi lancio join sugli elementi dell'array
            elencoThread[i-1]=new LetturaFile("dati"+i+".txt",accumulatore);
            
        }
        for(int i=0;i<elencoThread.length;i++){ //l'array va scandito tutto. Faccio join dopo che tutti i thread sono stati lanciati
            try{
                elencoThread[i].start();
                elencoThread[i].join();
            }catch(InterruptedException ex){
                ex.printStackTrace();
            }
        }
        System.out.println("La media è: "+accumulatore.media());
    }
    
}
// i file vengono letti dalla cartella principale del progetto netbeans