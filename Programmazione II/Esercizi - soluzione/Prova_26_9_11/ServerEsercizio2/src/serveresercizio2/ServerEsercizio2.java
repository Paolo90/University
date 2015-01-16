/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serveresercizio2;
import java.io.*;
import java.net.*;
/**
 *
 * @author paolo
 */
public class ServerEsercizio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServerSocket server=null;
        Accumulatore accumulatore=new Accumulatore();
        try{
            server=new ServerSocket(5000);
            System.out.println("Server attivo");
            while(true){
                Socket client=server.accept();
                System.out.println("Connessione stabilita");
                ThreadServer t=new ThreadServer(client, accumulatore);
                t.start();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
