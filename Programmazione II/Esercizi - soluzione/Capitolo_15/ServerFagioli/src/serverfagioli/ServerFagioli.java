/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serverfagioli;
import java.io.*;
import java.net.*;
/**
 *
 * @author paolo
 */
public class ServerFagioli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            ServerSocket server=new ServerSocket(5000);
            while(true){
                Socket client=server.accept();
                ThreadServer t=new ThreadServer(client);
                t.start();
            }
        }catch(IOException e){
            e.printStackTrace();
        }    
    }
    
}
