package esame2012esercizio2;

import java.io.*;

/**
 *
 * @author Marco Matteocci
 */
public class Lista {
    
    Elemento testa = null;
    
    Lista() {  }

    int getMinimo(){
        if(testa == null) return 0;
        else {
            Elemento temp = testa.successivo;
            int min = testa.valore;
            
            while(temp!=null) {
                if (temp.valore < min)
                    min = temp.valore;
                temp = temp.successivo;
            }
            return min;
        }
    }
    
    
    void leggiFile(String nomeFile){
        
        BufferedReader in = null;
        String num = null;
        int n = 0;
        
        try {
            in = new BufferedReader(new FileReader(nomeFile));
            while( (num = in.readLine()) != null) {
                n = Integer.parseInt(num);
                System.out.println("Numero Letto: "+n);
                Elemento nuovo = new Elemento(n, testa);
                testa = nuovo;                
            }
        } 
        catch (NumberFormatException e) { System.out.println("Il file non contiene interi!"); }
        catch (FileNotFoundException e) { System.out.println("Il file non e' stato trovato!"); }
        catch (IOException e) { e.printStackTrace(); }
        finally {
            if (in!=null)
                try { in.close(); } catch (IOException e) { e.printStackTrace(); }
        }
    }
    
}
