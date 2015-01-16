/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clientesercizio_2_bis;
import java.net.*;
import java.io.*;
/**
 *
 * @author paolo
 */
public class ClientEsercizio_2_Bis {

    /**
     * Non è necessario gestire la sincronizzazione perché i thread non modificano
     * un dato comune; il risultato del lavoro di un thread è locale al thread stesso.
     */
    public static void main(String[] args) {
        try{
            Socket server=new Socket("localhost",5000);
            PrintWriter out=new PrintWriter(server.getOutputStream());
            int random=(int)(Math.random()*10)+1;
            int inviato;
            System.out.println("Generato il numero casuale: "+random);
            for(int i=1;i<=random;i++){
                inviato=(int)(Math.random()*15);
                out.println(inviato);
                out.flush();
                System.out.println("Inviato al server il numero: "+inviato);
            }
            out.println("BYE");
            out.flush();
            out.close();
            server.close();
        }catch(IOException e){
            e.printStackTrace();
        }    
    }
    
}
