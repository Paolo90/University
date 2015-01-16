package esame2012esercizio2bisserver;

import java.net.*;
import java.io.*;

/**
 *
 * @author Marco Matteocci
 */
public class ServerThread extends Thread {
    
    private Socket client;
    PrintWriter out = null;

    ServerThread(Socket client, PrintWriter out) {
        this.client = client;
        this.out = out;
    }

    public void run() {
    
        DataInputStream in = null;

        try {
            in = new DataInputStream(new BufferedInputStream(client.getInputStream())); 
            int a;
           
 //SINCRONIZZO PER TUTTI I NUMERI RICEVUTI DAL CLIENT
                for (int i = 0; i<5; i++) {
                    a = in.readInt();                
                    System.out.println("sono il numero "+a);
                    synchronized(out) {
                        out.println(a);                             
                    }
            }
            
        }
        catch (NumberFormatException e) { System.out.println("Il dato inserito non contiene interi!"); }
        catch (IOException e) { e.printStackTrace(); }
        finally {
            if (in!=null)
                try { in.close(); } catch (IOException e) { e.printStackTrace(); } 
        }
        
    }
    
    

}
