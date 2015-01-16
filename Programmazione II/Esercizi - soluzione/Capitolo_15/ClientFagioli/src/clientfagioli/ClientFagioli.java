/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clientfagioli;
import java.io.*;
import java.net.*;
/**
 *
 * @author paolo
 */
public class ClientFagioli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            Socket server=new Socket("localhost",5000);
            DataOutputStream out=new DataOutputStream(server.getOutputStream());
            BufferedReader in=new BufferedReader(new InputStreamReader(server.getInputStream()));
            boolean continua=true;
            int inviato=0; // all'inizio la probabilità che esce 0 è uguale alla probabilità che esca qualsiasi altro numero
            int leftBound=0;
            int rightBound=100;
            out.writeInt(inviato);
            out.flush();
            System.out.println("Inviato il numero 0 al server");
            String ricezione;
            while(continua){
                ricezione=in.readLine();
                System.out.println("Risposta: "+ricezione);
                if(ricezione.equals("Got it"))
                    continua=false;
                else{
                    if(ricezione.equals("Too high")){
                        rightBound=inviato;
                    }else if(ricezione.equals("Too low")){
                        leftBound=inviato;
                    }
                    inviato=(rightBound+leftBound)/2;
                    System.out.println("Inviato il numero "+ inviato +" al server");
                    out.writeInt(inviato);
                    out.flush();
                }
            }
            System.out.println("Hai indovinato! Il numero generato dal server è "+inviato);
            in.close();
            out.close();
            server.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
