/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clientesercizio_1;
import java.io.*;
import java.net.*;
/**
 *
 * @author paolo
 */
public class ClientEsercizio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            Socket server=new Socket("localhost",5000);
            BufferedReader in=new BufferedReader(new InputStreamReader(server.getInputStream()));
            int ricevuti=0;
            int sommaParziale=0;
            String letto;
            int valoreLetto;
            while(!((letto=in.readLine()).equals("BYE"))){
                System.out.println("Ricevuto il numero "+letto);
                try{
                    valoreLetto=Integer.parseInt(letto);
                    sommaParziale+=valoreLetto;
                    ricevuti++;
                }catch(NumberFormatException e){
                    e.printStackTrace();
                    System.exit(1);
                }
            }
            System.out.println("Riicevuti: "+ricevuti+" Somma: "+sommaParziale);
            if(ricevuti==0){
                System.out.println("Nessun valore ricevuto");
            }else{
                System.out.println("La media dei valori ricevuti è: "+(double)sommaParziale/ricevuti);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
