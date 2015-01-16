
import java.net.*;
import java.io.*;

class ThreadServer extends Thread   {
    
    private Socket incoming;
    private BufferedReader input;
    private PrintWriter output;
    private int N;
    
    public ThreadServer (Socket s, int n)   {
        incoming = s;
        this.N = n;
    }
    
    public void run()   {
        
        try {
            input = new BufferedReader(new InputStreamReader(incoming.getInputStream()));
            output = new PrintWriter(incoming.getOutputStream(),true);
            for (int i=0;i<N;i++)
                output.println((int)(Math.random() * 1000));
            output.println("BYE");
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                incoming.close();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
        
}

public class Networking {
    
    public static void main(String[] args) {
        ServerSocket server;
        
        try {
            server = new ServerSocket(8100);
            while(true) {
                Socket incoming = server.accept();
                ThreadServer t = new ThreadServer(incoming,((int)(Math.random() * 10)));
                t.start();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
