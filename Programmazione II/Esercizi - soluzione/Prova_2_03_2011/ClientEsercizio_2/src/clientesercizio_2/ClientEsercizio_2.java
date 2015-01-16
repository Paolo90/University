/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clientesercizio_2;
import java.io.*;
import java.net.*;
//import java.util.Random;
/**
 *
 * @author paolo
 */
public class ClientEsercizio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N=(int)(Math.random()*10000)+5000;
        System.out.println("Generato il numero casuale "+N);
        Socket server=null;
        DataOutputStream out=null;
        DataInputStream in=null;
        int sommaPari=0;
        int sommaDispari=0;
        int ricevuto;
        try{
            server = new Socket("localhost",5000);
            out=new DataOutputStream(server.getOutputStream());
            out.writeInt(N);
            out.flush();
            in=new DataInputStream(server.getInputStream());
            for(int i=1;i<=N;i++){
                try{ // provo a riceverli tutti
                    ricevuto=in.readInt();
                    System.out.println(ricevuto);
                    if(ricevuto%2==0)
                        sommaPari+=ricevuto;
                    else
                        sommaDispari+=ricevuto;
                }catch(IOException e){
                    System.out.println("Valore non valido. Il loop continua");
                }
            }
            if(sommaPari==0 && sommaDispari==0){
                System.out.println("Nessun valore ricevuto dal server.");
            }else{
                if(sommaPari>sommaDispari)
                    System.out.println("PARI");
                else
                    System.out.println("DISPARI");
            }
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(server!=null){
                try{
                    out.close();
                    in.close();
                    server.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
    
}
