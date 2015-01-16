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
    private Socket incoming;
    //private Accumulatore c;
    int SommaFinale=0;
    ThreadServer(Socket incoming){
        this.incoming=incoming;
    }
    public void run(){
        BufferedReader in=null;
        PrintWriter out=null;
        int random=(int)(Math.random()*5)+1;
        System.out.println("Mando al client il numero "+random);
        try{
            in=new BufferedReader(new InputStreamReader(incoming.getInputStream()));
            out=new PrintWriter(incoming.getOutputStream(),true);
            out.println(String.valueOf(random));
            SommaFinale+=Integer.parseInt(in.readLine());
            System.out.println(SommaFinale);
            in.close();
            out.close();
        }catch(IOException e){
            System.err.println(e);
            System.exit(1);
        }
    }
}