/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package LetturaFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author local
 */
public class LetturaFile {
       

    static int ricerca(String nome, int n){
        int conta=0;
        BufferedReader file=null;
        try{
            file=new BufferedReader(new FileReader(nome));
            String riga;
            while((riga=file.readLine())!=null){
                int temp;
                temp=Integer.parseInt(riga);
                if(temp==n)
                    conta++;
            }
        }catch(IOException e){
            e.getMessage();            
        }  finally{
            if(file!=null)
                try{
                    file.close();
                }catch(IOException e){
                    e.getMessage();
                }
        }
        return conta;
    }
    
    public static void main(String args[]){        
        System.out.println("Il numero richiestio compare : "+ricerca("esame.txt",10)+" volte");
    }
}
