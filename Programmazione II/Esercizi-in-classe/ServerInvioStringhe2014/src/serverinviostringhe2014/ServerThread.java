/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serverinviostringhe2014;
import java.net.*;
import java.io.*;
/**
 *
 * @author paolo
 */
public class ServerThread extends Thread{
    private Socket client;
    ServerThread(Socket client){
        this.client=client;
    }
    public void run(){
        try{
            PrintWriter out = new PrintWriter(client.getOutputStream(),true); // auto - flush
            int N=(int)(Math.random()*100)+1;
            for(int i=1;i<=N;i++){
                out.println("Stringa "+i); // mando i dati al client 
            }
            out.println("BYE");
            //chiudo i flussi
            out.close();
            client.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}