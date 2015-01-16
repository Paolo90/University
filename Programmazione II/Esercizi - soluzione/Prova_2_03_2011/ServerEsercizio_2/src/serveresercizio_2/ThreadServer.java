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
        DataInputStream in=null;
        DataOutputStream out=null;
        int N, inviato;
        try{
            in=new DataInputStream(client.getInputStream());
            out=new DataOutputStream(client.getOutputStream());
            N=in.readInt();
            System.out.println(this.getName()+" ha letto il numero casuale "+N);
            for(int i=1;i<=N;i++){
                inviato=(int)(Math.random()*15)+1;
                System.out.println(this.getName()+" ha inviato il numero "+inviato+" al client");
                out.writeInt(inviato);
                out.flush();
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
            if(out!=null){
                try{
                    out.close();
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
