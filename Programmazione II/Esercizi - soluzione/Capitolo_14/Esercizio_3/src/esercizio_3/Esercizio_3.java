/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esercizio_3;
import java.io.*;
/**
 *
 * @author paolo
 */
public class Esercizio_3 {
    public static void main(String args[]){
        Lista l=new Lista(10);
        System.out.println("Inserisci il nome del file");
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        try{
            l.scriviFile(b.readLine());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
