/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serverimmagine;
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
            DataInputStream in=new DataInputStream(new FileInputStream("/home/paolo/Pictures/pallone.jpeg"));
            DataOutputStream out=new DataOutputStream(client.getOutputStream());
            byte[] cbuf=new byte[50000];
            int letto=in.read(cbuf);
            while(letto!=-1){
                out.write(cbuf);
                out.flush();
                letto=in.read(cbuf);
            }
            System.out.println("File inviato");
            in.close();
            out.close();
            client.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
