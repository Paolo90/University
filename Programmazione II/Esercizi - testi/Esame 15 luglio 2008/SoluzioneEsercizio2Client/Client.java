

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;


public class Client
{
    
    private static final int PORT = 7777;
    
    public static void main(String[] args)
    {
        Socket socket=null;
        String address="localhost";
        PrintWriter output=null;
        try
        {
            socket = new Socket(address, PORT);
            output = new PrintWriter(socket.getOutputStream());
            
            int number = (int)(Math.random()*100);
            
            output.write(String.valueOf(number));
            
            output.close();
            socket.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
