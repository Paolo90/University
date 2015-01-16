package esame2012esercizio2bisclient;
import java.io.*;
import java.net.*;
/**
 *
 * @author Marco Matteocci
 */
public class Client {
  
    public static void main(String[] args) {
        
        DataOutputStream out = null;
        int numeroCasuale;
        Socket s = null;
        
        try {
            s = new Socket("localhost", 8800);
            out = new DataOutputStream(new BufferedOutputStream(s.getOutputStream()));
            
            for(int i = 0; i<5; i++) {
                numeroCasuale = (int)(Math.random()*5000);
                out.writeInt(numeroCasuale);                
                out.flush();
            }
        } 
        catch(IOException e) { e.printStackTrace(); }
        finally { 
            if (out!=null)
                 try { out.close(); } catch (IOException e) { e.printStackTrace(); }
        }
        
    }
}
