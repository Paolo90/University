/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clientimmagine;
import java.io.*;
import java.net.*;
/**
 *
 * @author paolo
 */
public class ClientImmagine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Socket server;
        try{
            server=new Socket("localhost", 5000);
            DataInputStream in=new DataInputStream(server.getInputStream());
            DataOutputStream out=new DataOutputStream(new FileOutputStream("foto.jpeg"));
            byte cbuf[]=new byte[50000]; // circa 50 kB
            int letto=in.read(cbuf);
            while(letto!=-1){
                out.write(cbuf);
                out.flush();
                letto=in.read(cbuf);
            }
            System.out.println("File scaricato con successo.");
            in.close();
            out.close();
            server.close();
        }catch(IOException e){
            e.printStackTrace();
        }    
    }
    
}
