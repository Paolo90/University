/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package applicazionenumeriinteri;

/**
 *
 * @author User
 */
public class ApplicazioneNumeriInteri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("numero oggetti creati -> "+Numero.quantiOggetti());
        
        
        Numero n = new Numero(43);
        System.out.println(n.valore + " primo? "+n.isPrime());
        Numero m = new Numero(91);
        System.out.println(m.valore + " primo? "+m.isPrime());
        //System.out.println(Numero.restituisciPrimo(200000000000000000L, 210000000000000000L) + " è primo? ");
        
        Numero x;
        x = m;
         System.out.println("x= "+x.valore);
        
         x.valore = 100;
         System.out.println("x= "+x.valore);
           System.out.println("m= "+m.valore);       
        System.out.println("numero oggetti creati -> "+m.quantiOggetti());
     Numero y = new Numero(100);
        
          System.out.println(y instanceof Numero);  
          System.out.println(y instanceof Object);  
          
          Object o=  null;
           System.out.println(o instanceof Numero);  
          System.out.println(o instanceof Object);           
                  o= new Object();
           System.out.println(o instanceof Numero);  
          System.out.println(o instanceof Object); 
         o= new Numero();
           System.out.println(o instanceof Numero);  
          System.out.println(o instanceof Object);     
    //      System.out.println(y instanceof String);  
     
        //  x = null;
        // x.valore = 10;  NON si può fare!!
        /*
        String s = "ciao";
        String s1 = new String("ciao");
        
        int V [] = {1,2,3};
        
        final int numeromesi = 12;
 final int segnizodiacali = numeromesi;
final int magliaportiere = 12; 
*/
        //System.out.println("fattoriale di 5 = "+Numero.fattoriale(5));      
 /*
  * System.out.println("fattoriale di 5 = "+Numero.fattorialeric(5));
        System.out.println("fibo di "+70+" = "+Numero.fibo(70));
  */
          
     System.out.println("2^3 = "+Numero.potenzaRic(1.0000000000000000000001,30000000000L));
     System.out.println("2^3 = "+Numero.potenza(1.0000000000000000000001,30000000000L));
    }
}
