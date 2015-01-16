

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer
{
    public static void main(String[] args)
    {
        try
        {
            Numero tot = new Numero();
            ServerSocket server = new ServerSocket(7777);
            while(true)
            {
                Socket socket = server.accept();
                ThreadServer ts = new ThreadServer(socket, tot);
                ts.start();
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
