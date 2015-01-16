/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esercizio_13_1;
import java.util.*;
/**
 *
 * @author paolo
 */
public class Esercizio_13_1 {

    /**
     * @param args the command line arguments
     */
    public static ThreadPrinter[] Esercizio_13_1(int n){
            ThreadPrinter[] t=new ThreadPrinter[n];
            return t;
    }

    public static void main(String[] args) {
        Random r=new Random();
        System.out.println("Inserisci il numero di thread da creare");
        Scanner tastiera=new Scanner(System.in);
        int n=tastiera.nextInt();
        ThreadPrinter[] t=Esercizio_13_1(n);
        ThreadGroup g=new ThreadGroup("Gruppo genitore");
        for(int i=0;i<t.length;i++){
            t[i]=new ThreadPrinter(g,4,8);
            t[i].start();
            System.out.println("Thread "+i+" creato");
        }
        System.out.println("Interruzione momentanea");
                g.suspend();
                try{Thread.sleep(5000);}catch(Exception e){return;}
                System.out.println("Ripresa esecuzione");
                g.resume();
        for(int i=0;i<t.length;i++){
            try{
                t[i].join();
            }catch(InterruptedException e){
                System.out.println("Interruzione improvvisa");
                return;
            }
        }
        //for(int i=0;i<20;i++)
            System.out.println("Qui l'effetto del join() è terminato e riprendo il main");
    }
    
}
