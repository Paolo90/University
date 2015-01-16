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
    ThreadServer(Socket client){
        this.client=client;
    }
    public void run(){
        int N=(int)(Math.random()*10);
        System.out.println("Generato il numero casuale: "+N);
        int inviato;
        try{
            DataOutputStream out=new DataOutputStream(client.getOutputStream());
            if(N==0){
                out.writeInt(-1);
                out.flush();
            }else{
                for(int i=1;i<=N;i++){
                    inviato=(int)(Math.random()*20);
                    System.out.println("Inviato: "+inviato);
                    out.writeInt(inviato);
                    out.flush();
                }
                out.writeInt(-1);
                out.flush();
            }
            out.close();
            client.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
