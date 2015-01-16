package esame2012esercizio2bisserver;
import java.net.*;
import java.io.*;
/**
 *
 * @author Marco Matteocci
 */
public class Server {
    
    final static int PORTA = 8800;
    final static String NOMEFILE = "testo.txt";
    
    public static void main(String[] args) {
        
        ServerSocket s = null;
        PrintWriter out = null;
        
        try {
            s = new ServerSocket(PORTA);
            System.out.print("SERVER ONLINE.... ");
            out = new PrintWriter(new FileWriter(NOMEFILE), true);
            
            while(true) {
                Socket client = s.accept();
                System.out.println("ACCETTATO! ");
                
                new ServerThread(client, out).start();
            }
            
        } 
        catch(IOException e) { e.printStackTrace(); }
        finally { 
            if (s!=null)
                 try { s.close(); } catch (IOException e) { e.printStackTrace(); }
            if (out!=null) out.close(); 
        }
        
        
    }

}
