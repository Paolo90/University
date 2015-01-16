/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esercizio_3;
import java.util.*;
import java.io.*;
/**
 *
 * @author paolo
 */
public class Lista {
    Elemento testa=null;
    Lista(int n){
        for(int i=0;i<n;i++){
            testa=new Elemento((int)(Math.random()*15),testa);
        }
    }
    void scriviFile(String nome){
        PrintWriter p=null;
        try{
            p=new PrintWriter(new FileWriter(nome));
            int S=0;
            for(Elemento e=testa;e!=null;e=e.successivo){
                p.println(e.valore);
                S+=e.valore;
            }
            p.println("------------------------");
            if(Elemento.numeroElementi!=0){
                p.println("La media è: "+(double)S/Elemento.numeroElementi);
            }else
                System.out.println("Nessun nodo nella lista. Impossibile calcolare la media.");
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(p!=null)
                p.close();
        }
    }
}
