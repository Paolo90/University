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
    Lista(){}
    int minimoLista(){
        int min=0;
        int now;
        for(Elemento e=testa;e!=null;e=e.successivo){
            now=e.valore;
            if(now<min)
                min=now;
        }
        return min;
    }
    void leggiFile(String nomeFile){
        BufferedReader in=null;
        try{
            in=new BufferedReader(new FileReader(nomeFile));
            String letto;
            int valoreInserito;
            while((letto=in.readLine())!=null){
                try{
                    valoreInserito=Integer.parseInt(letto);
                    testa=new Elemento(valoreInserito,testa);
                    System.out.println("Inserito nella lista il valore "+valoreInserito);
                }catch(NumberFormatException exc){
                    System.err.println("Errore nella lettura del file.");
                }
            }
        }catch(FileNotFoundException e){
            System.err.println("File not found");
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(in!=null){
                try{
                    in.close();
                }catch(IOException e){
                    System.err.println("Errore nella chiusura del flusso");
                }
            }
        }
    }
}