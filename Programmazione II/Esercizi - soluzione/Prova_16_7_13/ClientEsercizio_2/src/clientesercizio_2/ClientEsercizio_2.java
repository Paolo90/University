/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clientesercizio_2;
import java.io.*;
import java.net.*;
/**
 *
 * @author paolo
 * @version 1.0
 */
public class ClientEsercizio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            Socket server=new Socket("localhost",4000);
	    /**
            * Descrive il numero ricevuto dal client
            */	
            int ricevuto;
            /**
            * Descrive il flusso di dati in ingresso
            */
            DataInputStream in=new DataInputStream(server.getInputStream());
            /**
            * Descrive il massimo numero ricevuto dal client
            */
            int massimo=-1; // max=-1 <=> non è stato inviato alcun valore
            /**
            * Descrive quante volte il numero massimo è stato ricevuto dal client
            */
            int ricezioneMassimo=1;
            while((ricevuto=in.readInt())!=-1){
                System.out.println("Ricevuto il numero: "+ricevuto);
                if(ricevuto>massimo){
                    massimo=ricevuto;
                    ricezioneMassimo=1;
                }else if(ricevuto==massimo){
                    ricezioneMassimo++;
                }
            }
            System.out.println("Il massimo valore ricevuto è: "+massimo);
            System.out.println("Il valore massimo è stato ricevuto "+ricezioneMassimo+" volte.");
            in.close();
            server.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
