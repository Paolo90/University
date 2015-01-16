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
    private Accumulatore accumulatore;
    ThreadServer(Socket client, Accumulatore accumulatore){
        this.client=client;
        this.accumulatore=accumulatore;
    }
    public void run(){
        try{
            DataInputStream in=new DataInputStream(client.getInputStream());
            DataOutputStream out=new DataOutputStream(client.getOutputStream());
            int ricevuto;
            int inviato=accumulatore.getMassimo();
            int maxNow=accumulatore.getMassimo(); // synchro
            while((ricevuto=in.readInt())>0){
                System.out.println("Ricevuto il numero: "+ricevuto);
                if(ricevuto>maxNow){
                    synchronized(accumulatore){accumulatore.setMassimo(ricevuto); // synchro
                    inviato=accumulatore.getMassimo();
                    }
                }
                System.out.println("Inviato il numero: "+inviato+" dal thread "+this.getName());
                out.writeInt(inviato);
                out.flush();
            }
            in.close();
            out.close();
            client.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}