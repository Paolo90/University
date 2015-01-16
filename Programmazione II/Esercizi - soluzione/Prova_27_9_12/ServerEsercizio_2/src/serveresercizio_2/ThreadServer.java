/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serveresercizio_2;
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
        int numeroRicevuto;
        int ricevuti=0;
        int somma;
        double media;
        DataInputStream in=null;
        try{
            in=new DataInputStream(client.getInputStream());
            while((numeroRicevuto=in.readInt())!=-1){
                System.out.println("Ricevuto da "+this.getName()+" il numero "+numeroRicevuto);
                c.setSomma(numeroRicevuto);
                ricevuti++;
            }
            /* In questo punto la trasmissione del client è terminata */
            synchronized(c){
                c.setRicevuti(ricevuti);
                System.out.println("Ricevuti finora "+c.getRicevuti()+" numeri");
                somma=c.getSomma();
                ricevuti=c.getRicevuti();
                c.setMedia();
                media=c.getMedia();
                System.out.println("Somma "+this.getName()+" = "+somma);
                System.out.println("Media "+this.getName()+" = "+media);
                System.out.println("---------------------------------");
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(in!=null){
                try{
                    in.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
            if(client!=null){
                try{
                    client.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
