/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esercizio_4;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author paolo
 */
public class Esercizio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String nomeFile;
        System.out.println("Inserisci il nome del file su cui scrivere");
        try{
            nomeFile=in.readLine();
            Lista l=new Lista(10);
            l.scriviFile(nomeFile);
            in.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
