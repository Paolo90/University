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
            int sommaParziale=0;
            int ricevuti=0;
            double media;
            in=new BufferedReader(new InputStreamReader(server.getInputStream()));
            String letto;
            while(!((letto=in.readLine()).equals("BYE"))){
                try{
                    sommaParziale+=Integer.parseInt(letto);
                    ricevuti++;
                }catch(NumberFormatException e){
                    e.printStackTrace();
                }
            }
            if(ricevuti!=0){
                media=(double)sommaParziale/ricevuti;
                System.out.println("La media è "+media);
            }else
                System.out.println("Non è possibile calcolare la media");
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(server!=null){
                try{
                    server.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
            if(in!=null){
                try{
                    in.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
    
}
