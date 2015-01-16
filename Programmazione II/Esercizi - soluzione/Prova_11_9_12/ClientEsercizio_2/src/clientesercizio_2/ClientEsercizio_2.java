/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clientesercizio_2;
import java.net.*;
import java.io.*;
/**
 *
 * @author paolo
 */
public class ClientEsercizio_2 {

    /**
     * non è necessario sincronizzare perché non c'è un dato che viene modificato contemporaneamente da
     * più thread. Infatti, se il server invia il dato a ogni client e la modifica riguarda tutti i cleint
     * non c'è bisogno di definire un monitor.
     * In definitiva la sincronizzazione NON è necessria.
     */
    public static void main(String[] args) {
        String host;
        if(args.length!=1)
            host="localhost";
        else
            host=args[0];
        try{
            Socket server=new Socket(host,5000);
            System.out.println("Client running...");
            DataInputStream in=new DataInputStream(server.getInputStream());
            int somma=0;
            int conta=0;
            int received;
            while((received=in.readInt())!=-1){
                System.out.println("Numero ricevuto: "+received);
                somma+=received;
                conta++;
            }
            double media;
            if(conta==0){
                media=0;
                System.out.println("Nessun valore ricevuto.");
            }else{
                media=(double)somma/conta;
                System.out.println("La media dei valori ricevuti dal server è "+media);
            }    
            in.close();
            server.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
