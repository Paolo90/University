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
        Socket server=null;
        BufferedReader in=null;
        String host;
        if(args.length!=1)
            host="localhost";
        else
            host=args[0];
        try{
            server=new Socket(host,5000);
            in = new BufferedReader(new InputStreamReader(server.getInputStream()));
            String letto;
            int somma=0;
            while(!((letto=in.readLine()).trim().equals("BYE"))){
                System.out.println("Letto il valore "+letto);
                try{
                    somma+=Integer.parseInt(letto);
                }catch(NumberFormatException e){
                    e.printStackTrace();
                }
                //letto=in.readLine();
            }
            System.out.println("La somma dei valori ricevuti è: "+somma);
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
