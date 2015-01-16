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

    boolean testDivTre(Elemento testa){
        boolean b=false;
        Elemento e=testa;
        while(b==false && e!=null){
            if(e.valore %3 ==0){
                b=true;
            }
            e=e.next;
        }
        return b;
    }
    
    void leggiFile(int n, String nomeFile){
        BufferedReader r=null;
        String s, ss;
        try{
            r=new BufferedReader(new FileReader(nomeFile));
            while((ss = r.readLine())!=null){
                try{
                    int current=Integer.parseInt(ss);
                    if(current>n){
                        testa=new Elemento(testa);
                        testa.valore=current;
                    }
                }catch(NumberFormatException ee){
                    System.out.println(ss+" non è un numero");
                }    
            }
        }catch(FileNotFoundException e){
            System.out.println("File "+nomeFile+" non trovato.");
            return;
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(r!=null){
                try{
                    r.close();
                }catch(IOException e){
                    System.out.println("Errore di input");
                }
            }
        }   
    }
    
    void stampa(){
        for(Elemento e=testa;e!=null;e=e.next){
            System.out.println(e.valore+" ");
        }
    }
}