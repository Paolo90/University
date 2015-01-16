/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serveresercizio_4;
import java.io.*;
import java.net.*;
/**
 *
 * @author paolo
 */
public class ThreadServer extends Thread{
    private Socket client;
    private Accumulatore c;
    ThreadServer(Socket client, Accumulatore c){
        this.client=client;
        this.c=c;
    }
    public void run(){
        try{
            BufferedReader in=new BufferedReader(new InputStreamReader(client.getInputStream()));
            String read;
            int letto;
            int sommaNow;
            while((read=in.readLine())!=null){
                letto=Integer.parseInt(read);
                System.out.println("Letto il numero: "+letto);
                /*Non voglio che l'operazione di lettura avvenga assieme alle modifiche*/
                synchronized(c){
                c.incrementa(letto);
                sommaNow=c.getSomma();
                System.out.println("La somma attuale è: "+sommaNow);
                }
            }
            in.close();
            client.close();
        }catch(NumberFormatException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
