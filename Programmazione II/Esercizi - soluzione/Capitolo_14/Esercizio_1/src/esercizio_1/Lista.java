/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esercizio_1;
import java.io.*;
/**
 *
 * @author paolo
 */
public class Lista {
    Elemento testa=null;
    Lista(int n){
        for(int i=0;i<n;i++){
            testa=new Elemento((int)(Math.random()*10),testa);
        }
    }
    void scriviFile(String nome, int N){
        int S=0;
        try{
            PrintWriter p=new PrintWriter(new FileWriter(nome));
            for(Elemento e=testa;e!=null;e=e.successivo){
                if(e.valore<N){
                    p.println(e.valore);
                    S+=e.valore;
                }
            }
            p.println("------------------------");
            p.println("La somma di questi valori è: ");
            p.println(S);
            p.close();
        }catch(FileNotFoundException e){
            System.out.println("Errore: file "+nome+" non trovato");
            return;
        }catch(IOException e){
            System.out.println("Errore di apertura");
            return;
        }
    }
}
