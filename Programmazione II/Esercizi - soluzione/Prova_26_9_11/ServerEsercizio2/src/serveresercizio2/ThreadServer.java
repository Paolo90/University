/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serveresercizio2;
import java.io.*;
import java.net.*;
/**
 *
 * @author paolo
 */
public class ThreadServer extends Thread{
    private Socket client;
    private Accumulatore accumulatore;
    ThreadServer(Socket client, Accumulatore accumulatore){
        this.client=client;
        this.accumulatore=accumulatore;
    }
    public void run(){
        DataInputStream in=null;
        PrintWriter out=null;
        int ricevuto;
        try{
            in=new DataInputStream(client.getInputStream());
            out=new PrintWriter(new FileWriter(accumulatore.file,true)); // true-- append
            for(int i=1;i<=5;i++){
                try{
                    synchronized(accumulatore){
                        ricevuto=in.readInt();
                        System.out.println("Ricevuto il numero "+ricevuto);
                        out.println(ricevuto);
                        System.out.println("Scritto su file il numero "+ricevuto);
                        out.flush();
                    }
                }catch(FileNotFoundException e){
                    e.printStackTrace();
                }catch(IOException e){
                    System.out.println("Numero non valido");
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(out!=null){
                out.close();        
            }
            if(in!=null){
                try{
                    in.close();
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