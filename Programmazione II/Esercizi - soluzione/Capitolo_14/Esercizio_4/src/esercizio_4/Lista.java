/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esercizio_4;
import java.io.*;
/**
 * Una classe che rappresenta unaa lista di elementi interi
 * con riferimento al successivo.
 * @see Elemento
 * @author paolo
 */
public class Lista {
    /**
     * Riferimento alla testa della lista
     */
    Elemento testa=null;
    /**
     * Metodo costruttore
     * @param n: il numero di interi che rappresenta il numero di nodi della lista
     */
    Lista(int n){
        for(int i=0;i<n;i++){
            testa=new Elemento((int)(Math.random()*15),testa);
        }
    }    
    public void scriviFile(String nomeFile){
        int attuale;
        int numeroPari=0;
        try{
            PrintWriter out=new PrintWriter(new FileWriter(nomeFile));
            for(Elemento e=testa;e!=null;e=e.successivo){
                attuale=e.valore;
                System.out.println(attuale);
                if(attuale%2==0){
                    numeroPari++;
                    System.out.println(attuale+" scritto sul file "+nomeFile);
                    out.println(attuale);
                    out.flush();
                }
            }
            out.println(numeroPari);
            out.flush();
            out.close();
        }catch(IOException e){
            System.err.println(e);
        }
    }
}
