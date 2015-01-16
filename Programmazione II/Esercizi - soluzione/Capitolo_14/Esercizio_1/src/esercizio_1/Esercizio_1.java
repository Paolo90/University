/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esercizio_1;
import java.util.*;
import java.io.*;
/**
 *
 * @author paolo
 */
public class Esercizio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista l=new Lista(10);
        System.out.println("Scrivi il nome completo del percorso su cui scrivere i dati ");
        BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
        try{
            String s=r.readLine();
            l.scriviFile(s, 8);
        }catch(IOException e){e.printStackTrace();}
        
    }
    
}
