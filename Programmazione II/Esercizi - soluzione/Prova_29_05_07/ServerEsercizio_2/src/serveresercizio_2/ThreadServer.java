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
        PrintWriter out=null;
        try{
            out=new PrintWriter(client.getOutputStream());
            int random=(int)(Math.random()*20);
            int inviato;
            for(int i=1;i<=random;i++){
                inviato=(int)(Math.random()*10);
                System.out.println(this.getName()+" ha inviato il numero "+inviato);
                out.println(inviato);
                out.flush();
            }
            out.println("BYE");
            out.flush();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
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
