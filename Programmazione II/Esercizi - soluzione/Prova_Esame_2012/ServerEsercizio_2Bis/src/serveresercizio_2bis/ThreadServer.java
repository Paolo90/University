/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serveresercizio_2bis;
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
        this.c=c;
        this.client=client;
    }
    public void run(){
        DataInputStream in=null;
        PrintWriter out=null;
        try{
            in=new DataInputStream(client.getInputStream());
            out=new PrintWriter(new FileWriter(c.getNome(),true));
            for(int i=1;i<=5;i++){
                synchronized(c){
                    try{
                        out.println(in.readInt());
                        out.flush();
                    }catch(IOException e){
                        e.printStackTrace();
                    }
                }
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
                out.close();
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