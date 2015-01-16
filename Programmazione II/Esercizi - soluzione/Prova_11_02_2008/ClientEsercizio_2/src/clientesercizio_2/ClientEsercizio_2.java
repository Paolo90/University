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
public class ClientEsercizio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String host;
        BufferedReader in=null;
        Socket server=null;
        if(args.length!=1)
            host="localhost";
        else
            host=args[0];
        try{
            server=new Socket(host,5000);
            in=new BufferedReader(new InputStreamReader(server.getInputStream()));
            String letto;
            int numeroLetto;
            int maxLetto=0;
            while(!((letto=in.readLine()).trim().equals("BYE"))){
                try{
                    numeroLetto=Integer.parseInt(letto);
                    System.out.println("Letto il numero "+numeroLetto);
                    if(numeroLetto>maxLetto)
                        maxLetto=numeroLetto;
                }catch(NumberFormatException e){
                    e.printStackTrace();
                }
            }
            if(maxLetto!=0)
                System.out.println("Il massimo ricevuto è "+maxLetto);
            else
                System.out.println("Impossibile determinare il massimo. Nessun valore ricevuto.");
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(in!=null){
                try{
                    in.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
            if(server!=null){
                try{
                    server.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
    
}
