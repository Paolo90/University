/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clientinviostringhe2014;
import java.net.*;
import java.io.*;
/**
 *
 * @author paolo
 */
public class ClientInvioStringhe2014 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String host;
        if(args.length!=1)
            host="localhost";
        else
            host=args[0];
        try{
            Socket server = new Socket(host,2000); // socket che si collega al server
            /* Se scrivo con PrintWriter leggo con BufferedReader o Scanner perché formattano */
            BufferedReader in=new BufferedReader(new InputStreamReader(server.getInputStream()));
            int contaStringhe=0;
            /*while(!in.readLine().equals("BYE")){
                System.out.println(in.readLine());
                contaStringhe++;
            }*/
            String stringaLetta;
            boolean continua=true;
            while(continua){
                stringaLetta=in.readLine();
                if(stringaLetta.equals("BYE"))
                    continua=false;
                else{
                    System.out.println(stringaLetta);
                    contaStringhe++;
                }
            }
            System.out.println("Le stringhe contate sono: "+contaStringhe);
            System.out.println("Connection closed");
            in.close(); // chiudo flusso
            server.close(); // chiudo socket
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}