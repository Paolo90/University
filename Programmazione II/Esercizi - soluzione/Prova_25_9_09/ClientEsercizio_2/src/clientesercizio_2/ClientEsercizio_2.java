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
        int n=(int)(Math.random()*12);
        ClientEsercizio_2 oggettoClient=new ClientEsercizio_2(n);
        n=oggettoClient.n;
        try{
            Socket server=new Socket("localhost",5000);
            DataInputStream in=new DataInputStream(server.getInputStream());
            DataOutputStream out=new DataOutputStream(server.getOutputStream());
            System.out.println("Inviato "+n);
            out.writeInt(n);
            out.flush();
            int ricevuto;
            int contapari=0;
            while(in.available()>0){
                ricevuto=in.readInt();
                if(ricevuto%2==0)
                    contapari++;
                System.out.println("Ricevuto "+ricevuto);
            }
            System.out.println("Ricevuti "+contapari+" numeri pari");
            in.close();
            out.close();
            server.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
