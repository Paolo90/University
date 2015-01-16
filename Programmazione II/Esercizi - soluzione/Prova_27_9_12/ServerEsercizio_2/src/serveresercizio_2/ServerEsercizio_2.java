/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serveresercizio_2;
import java.io.*;
import java.net.*;
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
        Accumulatore c=new Accumulatore();
        try{
            server=new ServerSocket(5000);
            System.out.println("Server attivo");
            while(true){
                Socket client=server.accept();
                ThreadServer t=new ThreadServer(client, c);
                t.start();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
