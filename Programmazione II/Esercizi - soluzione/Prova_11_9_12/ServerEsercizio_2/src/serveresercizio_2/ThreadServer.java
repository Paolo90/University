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
        try{
            DataOutputStream out=new DataOutputStream(client.getOutputStream());
            int random=(int)(Math.random()*10);
            System.out.println("Vengono inviati al client "+random+" valori.");
            int sent;
            for(int i=1;i<=random;i++){
                sent=(int)(Math.random()*15);
                System.out.println(sent+" inviato;");
                out.writeInt(sent);
                out.flush();
            }
            System.out.println(-1+" inviato.");
            out.writeInt(-1);
            out.flush();
            out.close();
            client.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
