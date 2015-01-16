/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esercizio_2;
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
    public void scriviFile(String nomeFile){
        PrintWriter out=null;
        try{
            out=new PrintWriter(new FileWriter(nomeFile),true);
            int inviato;
            int pari=0;
            for(Elemento e=testa;e!=null;e=e.successivo){
                if(e.valore%2==0){
                    inviato=e.valore;
                    pari++;
                    out.println(inviato);
                }
            }
            out.println(pari);
        }catch(FileNotFoundException ex){
            ex.printStackTrace();
        }catch(IOException ex){
            ex.printStackTrace();
        }finally{
            if(out!=null){
                out.close();
            }
        }
    }
}
