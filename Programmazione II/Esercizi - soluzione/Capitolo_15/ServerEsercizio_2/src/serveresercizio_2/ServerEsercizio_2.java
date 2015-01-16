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
        BufferedReader tastiera=null;
        try{
            ServerSocket server=new ServerSocket(5000);
            String nome;
            while(true){
                Socket client=server.accept();
                System.out.println("Inserisci il nome del file da leggere");
                tastiera=new BufferedReader(new InputStreamReader(System.in));
                nome=tastiera.readLine();
                System.out.println(nome);
                ThreadServer t=new ThreadServer(client, nome);
                t.start();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
