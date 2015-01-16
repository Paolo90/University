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
 */
public class Client {
    private static int port=5000;
    public static void main(String args[]){
        String host;
        Socket s=null;
        int N;
        BufferedReader in=null; 
        PrintWriter out=null; 
        if(args.length!=1)
            host="localhost";
        else
            host=args[0];
        try{ 
            s=new Socket(host,port); // creo la connessione che istanzia la richiesta
            in=new BufferedReader(new InputStreamReader(s.getInputStream())); // creo flusso dati
        }catch(IOException e){
            System.err.println(e);
            return;
        }
        /*
        /* A questo punto del programma la connessione è stabilita e il flusso consente
        /* la comunicazione tra il client e il server.
        */
        try{
            N=Integer.parseInt(in.readLine());
        }catch(NumberFormatException e){
            System.out.println("Il numero ricevuto non è intero");
            return;
        }catch(IOException e){
            System.out.println("Errore di input");
            return;
        }
        /*
        /* A questo punto del programma so quanti elementi della lista creare.
        */
        Lista l=new Lista(N);
        System.out.println("La lista generate di "+N+" elementi è: ");
        l.stampa();
        int sommaLista=l.somma();
        System.out.println("Spedisco al server il numero "+sommaLista);
        try{
            out=new PrintWriter(s.getOutputStream());
            out.println(String.valueOf(sommaLista)); // mando una stringa
            out.flush(); // quando si scrive poco bisogna fare il flush
            l=null; System.gc(); in.close(); out.close();
            System.exit(0);
        }catch(IOException e){
            System.err.println(e);
        }    
    }
}