//Matteo Temperoni


package esercizio2client;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;


public class Client
{
    
    private static final int _Port = 7777;
    
    public static void main(String[] args)
    {
        Socket _socket=null;
        String address="localhost";
        PrintWriter output=null;
        try
        {
            _socket = new Socket(address, _Port);
            output = new PrintWriter(_socket.getOutputStream());
            
            int number = (int)(Math.random()*100);
            
            output.write(String.valueOf(number));
            
            output.close();
            _socket.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
