/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servernumeri2014;
import java.net.*;
import java.io.*;
/**
 *
 * @author paolo
 */
public class ThreadServerNumeri extends Thread{
    private Socket client;
    private Accumulatore a;
    ThreadServerNumeri(Socket client, Accumulatore a){
        this.a=a;
        this.client=client;
    }
    public void run(){
        try{
            //i dati sono numeri allora uso DataInputStream e DataOutputStream per non leggere un byte alla
            //volta e scrivere un byte alla volta.
            DataInputStream in=new DataInputStream(client.getInputStream());
            boolean continua=true;
            int somma=0;
            int conta=0;
            int numero=0;
            while((numero=in.readInt())!=-1){ // assegnamento è un operatore che restituisce il valore letto
                System.out.println("Il numero arrivato è "+numero);
                somma+=numero;
                conta++;
            }
            a.incrementa(somma, conta);
            synchronized(a){
                System.out.println("Somma finora: "+a.getSomma());
                System.out.println("Media finora: "+a.getMedia());
            } // vedo la media collegata alla somma. In questo caso i metodi non devono essere sincronizzati    
            in.close();
            client.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
