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
        String host;
        if(args.length!=1)
            host="localhost";
        else
            host=args[0];
        Socket server=null;
        DataInputStream in=null;
        DataOutputStream out=null;
        try{
            server=new Socket(host, 5000);
            in=new DataInputStream(server.getInputStream());
            out=new DataOutputStream(server.getOutputStream());
        }catch(IOException e){
            System.err.println("Errore di connessione");
            System.exit(1);
        }
        try{
            int ricevuto=in.readInt();
            int inviato;
            System.out.println("Ricevuto il numero "+ricevuto+" dal server");
            for(int i=1;i<=ricevuto;i++){
                inviato=(int)(Math.random()*10);
                System.out.println("Inviato il numero "+inviato+" al server");
                out.writeInt(inviato);
                out.flush();
            }
            in.close();
            out.close();
            server.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
