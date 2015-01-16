/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clientnumeri2014;
import java.net.*;
import java.io.*;
/**
 *
 * @author paolo
 */
public class ClientNumeri2014 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            Socket server=new Socket("localhost",2001);
            DataOutputStream out=new DataOutputStream(server.getOutputStream());
            int N=(int)(Math.random()*10);
            System.out.println("Il client manda "+N+" numeri al server");
            for(int i=1;i<=N;i++){
                int n=(int)(Math.random()*10)+1;
                System.out.println("Inviato "+n);
                out.writeInt(n);
                out.flush();
            }
            out.writeInt(-1);
            out.flush();
            out.close();
            server.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
