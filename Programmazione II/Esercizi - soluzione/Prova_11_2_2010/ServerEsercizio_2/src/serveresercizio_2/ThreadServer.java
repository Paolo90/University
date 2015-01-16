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
    private Accumulatore c;
    ThreadServer(Socket client, Accumulatore c){
        this.client=client;
        this.c=c;
        c.setElemento(this);
    }
    public void run(){
        System.out.println("Thread "+this.getName()+" attivato");
        int ricevuto;
        boolean continua=true;
        String s;
        try{
            BufferedReader in=new BufferedReader(new InputStreamReader(client.getInputStream()));
            while(continua){
                s=in.readLine();
                if(s.equals("BYE"))
                    break;
                ricevuto=Integer.parseInt(s);
                if(ricevuto%2==0){
                    c.setPari();
                    System.out.println("-----------------------");
                    c.getPari();
                    System.out.println("-----------------------");
                }
            }
        }catch(NumberFormatException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
