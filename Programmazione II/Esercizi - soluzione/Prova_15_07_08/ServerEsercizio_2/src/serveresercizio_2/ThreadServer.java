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
        DataInputStream in=null;
        int valoreLetto;
        try{
            in=new DataInputStream(client.getInputStream());
            valoreLetto=in.readInt();
            System.out.println(this.getName()+" ha ricevuto dal client il numero casuale "+valoreLetto);
            synchronized(c){
                c.setSomma(valoreLetto);
                System.out.println(this.getName()+": la somma fino ad ora è "+c.getSomma());
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(client!=null){
                try{
                    client.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
            if(in!=null){
                try{
                    in.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
