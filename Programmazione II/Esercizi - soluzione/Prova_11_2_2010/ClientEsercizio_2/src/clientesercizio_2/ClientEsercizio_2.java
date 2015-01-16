/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clientesercizio_2;
import java.net.*;
import java.io.*;
/**
 *
 * @author paolo
 */
public class ClientEsercizio_2 {

    int n;
    ClientEsercizio_2(int n){
        this.n=n;
    }
    public static void main(String[] args) {
        String host;
        if(args.length!=1)
            host="localhost";
        else
            host=args[0];
        try{
            Socket server=new Socket(host,5000);
            int random=(int)(Math.random()*8)+1;
            ClientEsercizio_2 client=new ClientEsercizio_2(random); // non posso scrivere n=client.n perché main è statico
            int[] v=new int[client.n]; // se scrivo n e basta ho errore perché non è definita.
            PrintWriter out=new PrintWriter(server.getOutputStream(),true);
            for(int i=0;i<client.n;i++){
                v[i]=(int)(Math.random()*20)+1;
                out.println(v[i]);
            }
            out.println("BYE");
            out.close();
            server.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
