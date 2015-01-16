/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serveresercizio_2_bis;

import java.net.*;
import java.io.*;

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
            int ricevuto;
            int numeroPari=0;
            BufferedReader in=new BufferedReader(new InputStreamReader(client.getInputStream()));
            String s=in.readLine();
            while(!(s.equals("BYE"))){
                ricevuto=Integer.parseInt(s);
                System.out.println("Ricevuto il numero: "+ricevuto);
                if(ricevuto%2==0)
                    numeroPari++;
                s=in.readLine();
            }
            System.out.println("Sono stati ricevuti dal client "+numeroPari+ " numeri pari");
            in.close();
            client.close();
        }catch(IOException e){
            e.printStackTrace();
        }catch(NumberFormatException e){
            e.printStackTrace();
        }       
    }
}
