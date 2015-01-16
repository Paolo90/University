/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clientesercizio_2;
import java.io.*;
import java.net.*;
/**
 *
 * @author paolo
 */
public class ClientEsercizio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            Socket server=new Socket("localhost",4000);
            DataInputStream in=new DataInputStream(server.getInputStream());
            DataOutputStream out=new DataOutputStream(server.getOutputStream());
            int inviato, ricevuto;
            inviato=(int)(Math.random()*10)+1;
            System.out.println("Inviato il numero random: "+inviato);
            out.writeInt(inviato);
            out.flush();
            ricevuto=in.readInt();
            System.out.println("Il valore ricevuto dal server è: "+ricevuto);
            in.close();
            out.close();
            server.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
