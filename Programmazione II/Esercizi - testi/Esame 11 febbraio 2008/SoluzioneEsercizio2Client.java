
import java.io.*;
import java.net.*;

public class Massimo {
    
    private static final int PORTNUM = 8100;
        
    public static void main(String[] args) {
        
        Socket socket = null;
        BufferedReader input = null;
        String address;
        
        if (args.length != 1) {
            System.out.println("Usage: java Massimo <address>");
            return;
        }
        else 
            address = args[0];
        
        try {
            socket = new Socket(address, PORTNUM);
            input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        }
        catch (IOException e)   {
            System.err.println("Errore: non e' possibile stabilire la connessione");
            System.exit(1);
        }
        
        try {
            int massimo = -1;
            boolean finito = false;
            String entrata;
            int numero;
            
            while (finito == false) {
                entrata = input.readLine();
                if (entrata.trim().equals("BYE"))
                    finito = true;
                else    {
                    System.out.println(entrata);
                    numero = Integer.parseInt(entrata);
                    if  (numero > massimo)  massimo = numero;
                }
            }
            
            System.out.println("il massimo dei numeri ricevuti dal server e' " + massimo);
            input.close();
            socket.close();
        }
        catch (IOException e)   {
            System.err.println("Errore durante la comunicazione col server");
        }
    }
}
