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
public class ThreadServer extends Thread{
    private Socket client;
    ThreadServer(Socket client){
        this.client=client;
    }
    public void run(){
        int n=(int)(Math.random()*15);
        DataInputStream in=null;
        DataOutputStream out=null;
        int sommaParziale=0;
        int ricevuti=0;
        double media;
        int numeroRicevuto;
        try{
            in=new DataInputStream(client.getInputStream());
            out=new DataOutputStream(client.getOutputStream());
            System.out.println("Inviato il numero "+n+" dal thread "+this.getName());
            out.writeInt(n);
            out.flush();
            for(int i=1;i<=n;i++){ // dico al server di ricevere più numeri possibili
                try{
                    numeroRicevuto=in.readInt();
                    System.out.println(this.getName()+" ha ricevuto dal client il numero "+ numeroRicevuto);
                    sommaParziale+=numeroRicevuto;
                    ricevuti++;
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
            if(ricevuti!=0){
                media=(double)(sommaParziale)/ricevuti;
                System.out.println("Media "+this.getName()+" = "+media);
            }else
                System.out.println(this.getName()+" non ha ricevuto nessun valore dal client");
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
                in.close();
            }catch(IOException e){
            }
            try{
                out.close();
            }catch(IOException e){
            }
            try{
                client.close();
            }catch(IOException e){
            }
        }
    }
}
