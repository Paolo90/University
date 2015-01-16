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
    private int N;
    ThreadServer(Socket client, int N){
        this.N=N;
        this.client=client;
    }
    public void run(){
        PrintWriter out=null;
        System.out.println(this.getName()+"- N= "+N);
        try{
            out=new PrintWriter(client.getOutputStream(),true);
            int randomInviato;
            for(int i=1;i<=N;i++){
                randomInviato=(int)(Math.random()*999)+1;
                System.out.println("Inviato il numero "+randomInviato+" attraverso "+this.getName());
                out.println(randomInviato);
            }
            out.println("BYE");
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(out!=null)
                out.close();
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
