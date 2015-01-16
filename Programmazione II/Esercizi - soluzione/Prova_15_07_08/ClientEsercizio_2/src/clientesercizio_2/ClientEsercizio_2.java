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
        DataOutputStream out=null;
        try{
            server=new Socket(host,5000);
            out=new DataOutputStream(server.getOutputStream());
            int n=(int)(Math.random()*20);
            System.out.println("Inviato il numero "+n+" al server");
            out.writeInt(n);
            out.flush();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(server!=null){
                try{
                    server.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
            if(out!=null){
                try{
                    out.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
    
}
