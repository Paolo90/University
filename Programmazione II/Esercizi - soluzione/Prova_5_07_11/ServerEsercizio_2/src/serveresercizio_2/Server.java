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
public class Server { //tutti i client accedono al server e modificano la proprietà che mostra la somma
    public static void main(String args[]){
        ServerSocket server;
        try{
            server=new ServerSocket(5000);
            while(true){
                Socket incoming=server.accept();
                ThreadServer t=new ThreadServer(incoming);
                t.start();
            }
        }catch(IOException e){
            e.printStackTrace();
            System.exit(1);
        }
    }
}
