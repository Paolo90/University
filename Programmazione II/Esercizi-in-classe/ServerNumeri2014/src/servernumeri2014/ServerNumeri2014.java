/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servernumeri2014;
import java.net.*;
import java.io.*;
/**
 *
 * @author paolo
 */
public class ServerNumeri2014 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            ServerSocket server=new ServerSocket(2001);
            Accumulatore a=new Accumulatore();
            while(true){
                Socket client=server.accept();
                ThreadServerNumeri t=new ThreadServerNumeri(client,a);
                t.start();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
