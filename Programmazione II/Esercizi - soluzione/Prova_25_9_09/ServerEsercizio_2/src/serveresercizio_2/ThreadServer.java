/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serveresercizio_2;
import java.net.*;
import java.io.*;
/**
 *
 * @author paolo
 */
public class ThreadServer extends Thread{
    private Socket client;
    ThreadServer(Socket client){
        this.client=client;
    }
    public void run(){
        try{
            DataInputStream in=new DataInputStream(client.getInputStream());
            DataOutputStream out=new DataOutputStream(client.getOutputStream());
            int ricevuto=in.readInt();
            int inviato;
            System.out.println(this.getName()+" ha ricevuto: "+ricevuto);
            for(int i=1;i<=ricevuto;i++){
                inviato=(int)(Math.random()*10);
                System.out.println(this.getName()+" ha inviato: "+inviato);
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
