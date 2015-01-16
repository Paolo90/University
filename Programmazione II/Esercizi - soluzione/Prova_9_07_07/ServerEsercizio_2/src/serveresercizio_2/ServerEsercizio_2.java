/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serveresercizio_2;
import java.net.*;
import java.io.*;
/**
 *
 * @author paolo
 */
public class ServerEsercizio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServerSocket server=null;
        int n;
        try{
            server=new ServerSocket(5000);
            while(true){
                Socket client=server.accept();
                n=(int)(Math.random()*10);
                ThreadServer t=new ThreadServer(client, n);
                t.start();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
