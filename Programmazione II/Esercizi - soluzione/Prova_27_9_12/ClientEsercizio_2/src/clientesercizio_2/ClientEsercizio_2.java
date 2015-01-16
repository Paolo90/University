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
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Socket server=null;
        DataOutputStream out=null;
        String host;
        if(args.length!=1)
            host="localhost";
        else
            host=args[0];
        try{
            server=new Socket(host,5000);
            int N=(int)(Math.random()*10);
            System.out.println("Generato il numero casuale "+N);
            out=new DataOutputStream(server.getOutputStream());
            int inviato;
            for(int i=1;i<=N;i++){
                inviato=(int)(Math.random()*15);
                try{
                    out.writeInt(inviato);
                    System.out.println("Inviato al server il numero "+inviato);
                    out.flush();
                }catch(IOException e){
                        System.out.println("Valore non valido. Il loop continua");
                }
            }
            out.writeInt(-1);
            System.out.println("Sequenza terminata");
            out.flush();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(out!=null){
                try{
                    out.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
            if(server!=null){
                try{
                    out.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
