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
    private int n;
    private Socket client;
    ThreadServer(Socket client, int n){
        this.client=client;
        this.n=n;
    }
    public void run(){
        System.out.println("Il numero casuale generato da "+this.getName()+" è: "+n);
        PrintWriter out=null;
        try{
            out=new PrintWriter(client.getOutputStream(),true);
            for(int i=1;i<=n;i++){
                System.out.println(this.getName()+" ha inviato "+i);
                out.println(i);
            }
            out.println("BYE");
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
            if(out!=null)
                out.close();
        }
    }
}
