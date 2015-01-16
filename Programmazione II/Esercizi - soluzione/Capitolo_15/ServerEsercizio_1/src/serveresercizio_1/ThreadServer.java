/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serveresercizio_1;
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
        System.out.println("Generato il numero "+n);
        try{
            PrintWriter out=new PrintWriter(client.getOutputStream(),true);
            if(n>0){
                for(int i=1;i<=n;i++){
                    System.out.println("Inviato il numero "+i);
                    out.println(i);
                }
            }    
            out.println("BYE");
            out.close();
            client.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
