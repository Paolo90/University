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
        Socket server=null;
        DataOutputStream out=null;
        String host;
        if(args.length!=1)
            host="localhost";
        else
            host=args[0];
        try{
            server=new Socket(host,5000);
            out=new DataOutputStream(server.getOutputStream());
            int N=(int)(Math.random()*20);
            System.out.println("Inviato al server il numero "+N);
            for(int i=1;i<=5;i++){
                out.writeInt(N);
                out.flush();
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(out!=null){
                try{
                    out.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
            if(server!=null){
                try{
                    server.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
    
}
