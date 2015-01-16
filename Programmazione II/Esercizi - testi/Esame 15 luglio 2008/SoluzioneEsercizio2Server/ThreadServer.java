


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class ThreadServer extends Thread
{
    Socket socket;
    int n;
    Numero tot;
    
    public ThreadServer(Socket socket, Numero tot)
    {
        this.socket = socket;
        this.tot = tot;
    }
    

    public void run()
    {
        BufferedReader input;
        
        try
        {
            input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            n = Integer.parseInt(input.readLine());
            
            System.out.println("Numero arrivato: " + n);
            tot.StampaTotale(n);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
