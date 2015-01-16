/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clientesercizio_4;
import java.net.*;
import java.io.*;
/**
 *
 * @author paolo
 */
public class ClientEsercizio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String host;
        if(args.length!=1)
            host="localhost";
        else
            host=args[0];
        try{
            Socket server=new Socket(host,5000);
            int random=(int)(Math.random()*20);
            System.out.println("Inviato: "+random);
            PrintWriter out=new PrintWriter(server.getOutputStream(),true);
            out.println(random);
            out.close();
            server.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
