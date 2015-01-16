/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serverinviostringhe2014;
import java.net.*;
import java.io.*;
/**
 *
 * @author paolo
 */
public class ServerInvioStringhe2014 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            ServerSocket server=new ServerSocket(2000);
            while(true){
                Socket client=server.accept();
                ServerThread t = new ServerThread(client); // stilisticamente il client glielo passo sempre
                t.start();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}