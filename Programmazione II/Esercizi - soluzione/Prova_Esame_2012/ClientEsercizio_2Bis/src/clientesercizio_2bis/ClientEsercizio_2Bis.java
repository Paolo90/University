/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clientesercizio_2bis;
import java.io.*;
import java.net.*;
/**
 *
 * @author paolo
 */
public class ClientEsercizio_2Bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Socket server=null;
        DataOutputStream out=null;
        try{
            server=new Socket("localhost",5000);
            out=new DataOutputStream(server.getOutputStream());
            int random;
            for(int i=1;i<=5;i++){
                random=(int)(Math.random()*15);
                System.out.println("Inviato il numero "+random);
                out.writeInt(random);
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
