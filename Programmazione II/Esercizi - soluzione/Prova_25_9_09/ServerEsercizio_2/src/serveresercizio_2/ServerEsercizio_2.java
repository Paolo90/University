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
     * Non è necessario  gestire la sincronizzazione perché il client invia al thread il numero casuale.
     * Se sincronizzassi i thread sarebbero eseguiti uno alla volta e ciò può essere evitato poiché
     * i thread non vanno a modificare il medesimo oggetto
     **/
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
