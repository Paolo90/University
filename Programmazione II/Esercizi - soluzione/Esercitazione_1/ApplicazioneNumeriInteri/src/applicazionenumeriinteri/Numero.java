/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package applicazionenumeriinteri;

/**
 *
 * @author User
 */
public class Numero {
    int valore;
    static int oggetticreati = 0;
    
    Numero(int valore){
        this.valore = valore;
        oggetticreati++;
    }
    
    
    Numero(){
        this.valore = 0;
        oggetticreati++;
    }
    
    static int quantiOggetti()
    {
        return oggetticreati;
    }
    
   void raddoppia(){
        valore *=2;
    }
    
    
    boolean isPrime(){
     if (valore <=2) 
         return true;
     else
     if (valore %2 ==0)
         return false;
     else
     {
     int divisore = 3;
     boolean nontrovato = true;
     
     while( (nontrovato == true) && (divisore <= Math.sqrt(valore))){
         if (valore %divisore ==0){
             nontrovato = false;
         }
         else{
             divisore+=2;
         }
     }
       return nontrovato;  
     }  
        
    }
 
     static boolean isPrime(long valore){
     if (valore <=2) 
         return true;
     else
     if (valore %2 ==0)
         return false;
     else
     {
     long divisore = 3;
     boolean nontrovato = true;
     
     while( (nontrovato == true) && (divisore <= Math.sqrt(valore))){
         if (valore %divisore ==0){
             nontrovato = false;
         }
         else{
             divisore+=2;
         }
     }
       return nontrovato;  
     }  
        
    }
  
    
    
   static long restituisciPrimo(long minimo, long massimo){    
       for (long i = minimo; i <= massimo; i++){
                if (isPrime(i))
                    return i;
           }
           return 0;
            
   }
   
  static long fattoriale (int n){
      long acc = 1;
      for (int i = 1; i <= n ; i++)
          acc *= i;
      return acc;
      
  }
  
  static long fattorialeric (int n){
      if (n ==0)
          return 1;
      else
          return n*fattorialeric(n-1);
      
  }
  
static long fibo(int n){
    if (n <= 2)
        return 1;
    else
        return fibo(n-1)+fibo(n-2);
}
      
static double potenza(double base, long esponente){
    double acc= 1;
    for (long i = 0; i < esponente; i++)
        acc *= base;
    return acc;
}  

      
static double potenzaRic(double base, long esponente){
    if (esponente == 0 )
        return 1;
    else if (esponente % 2 == 0 )
        return potenzaRic(base*base,esponente/2);
    else return base*potenzaRic(base*base,esponente/2);
}  


}
