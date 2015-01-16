/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serverfagioli;
import java.io.*;
import java.net.*;
//import java.util.Random;
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
            PrintWriter out=new PrintWriter(client.getOutputStream());
            DataInputStream in=new DataInputStream(client.getInputStream());
            //Random r=new Random();
            int random=(int)(Math.random()*10);
            System.out.println("Il numero da indovinare è: "+random);
            int letto;
            String risposta;
            while(true){
                letto=in.readInt();
                if(letto>random){
                    risposta="Too high";
                    System.out.println(risposta);
                    out.println(risposta);
                    out.flush();
                }else if(letto < random){
                    risposta="Too low";
                    System.out.println(risposta);
                    out.println(risposta);
                    out.flush();
                }else{
                    risposta="Got it";
                    System.out.println(risposta);
                    out.println(risposta);
                    out.flush();
                    System.out.println("Chiusura della connessione");
                    in.close();
                    out.close();
                    client.close();
                    break;
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

