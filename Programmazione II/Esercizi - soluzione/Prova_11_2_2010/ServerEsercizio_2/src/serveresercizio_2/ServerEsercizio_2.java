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
     * Dato che leggo un valore alla volta e non devo ricerdarmeli, non è necessario usare alcuna struttura
     * dati per fare ciò.
     * Il problema vero si ha quando il server deve stampare ogni volta a video il numero di numeri
     * pari inviati da ogni client.
     */
    public static void main(String[] args) {
        Accumulatore c=new Accumulatore(new Lista());
        try{
            ServerSocket server=new ServerSocket(5000);
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
