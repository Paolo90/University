/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serveresercizio_4;
import java.net.*;
import java.io.*;
/**
 *
 * @author paolo
 */
public class ServerEsercizio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            ServerSocket server=new ServerSocket(5000);
            Accumulatore c=new Accumulatore();
            while(true){
                Socket client=server.accept();
                ThreadServer t=new ThreadServer(client,c);
                t.start();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
