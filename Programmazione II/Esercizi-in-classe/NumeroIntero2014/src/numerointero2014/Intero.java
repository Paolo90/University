/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package numerointero2014;

/**
 *
 * @author User
 */
public class Intero {
    int n;
    private static int contaOggetti = 0; //in questo modo la rendo globale
    
    
    public Intero (int n){
       this.n = n; 
       contaOggetti ++;
    }
    
    public static int getContaOggetti(){ // è static perché contaOggetti è static
        return contaOggetti;
    }
    
    public boolean numeroPrimo(){
        
        if(n<=1)
            return false;
        else{
            if(n<=3)
                return true;
            else{
                if(n%2 ==0){ //se il numero è pari e diverso da 2 => non è primo
                    return false;
                }else{ // se un numero è primo allora è dispari
                    int divisore=3;
                    while(divisore <= Math.sqrt(n) && n%divisore !=0){
                        divisore+=2;
                    }
                    if(n%divisore ==0)
                        return false;
                    else
                        return true;
                }
            }
        }
    }
    
    public static double  potenza(double base, long esp){
        double p=1;
        for(long i=1;i<=esp;i++){
            p*=base;     //p= p*base;
        }
        return p;
    }
    
     public static boolean numeroPrimo(int n){ // il compilatore non si confonde
        
        if(n<=1)
            return false;
        else{
            if(n<=3)
                return true;
            else{
                if(n%2 ==0){ //se il numero è pari e diverso da 2 => non è primo
                    return false;
                }else{ // se un numero è primo allora è dispari
                    int divisore=3;
                    while(divisore <= Math.sqrt(n) && n%divisore !=0){
                        divisore+=2;
                    }
                    if(n%divisore ==0)
                        return false;
                    else
                        return true;
                }
            }
        }
    }
     
    public static boolean numeroPrimo(long n){
        
        if(n<=1)
            return false;
        else{
            if(n<=3)
                return true;
            else{
                if(n%2 ==0){ //se il numero è pari e diverso da 2 => non è primo
                    return false;
                }else{ // se un numero è primo allora è dispari
                    long divisore=3;
                    while(divisore <= Math.sqrt(n) && n%divisore !=0){
                        divisore+=2;
                    }
                    if(n%divisore ==0)
                        return false;
                    else
                        return true;
                }
            }
        }
    }
    
    //  II parte
    
    public static long fattorialeI(int n){
        long acc=1;
        for(int i=1;i<=n;i++){
            acc*=i;
        }
        return acc;
    }
    
    public static long fattorialeR(int n){
        if(n==0)
            return 1;
        else
            return n*fattorialeR(n-1);
    }
    
    public static long fiboR(int n){
        if(n==1 || n==2)
            return 1;
        else
            return fiboR(n-1)+fiboR(n-2);
    }
    
    public static long fiboI(int n)  {
        long v[]=new long[n];
        int i;
        for(i=0;i<n;i++)
            v[i]=0;
        for(i=0;i<n;i++){
            if(i==0 || i==1)
                v[i]=1;
            else
                v[i]=v[i-1]+v[i-2];
        }
        return v[n-1];
    }
    
    public static long fiboIOtt(int n){
        if(n==1 || n==2)
            return 1;
        else{
            int i1=1;
            int i2=1;
            for(int k=3;k<=n;k++){
                if(k%2 ==0)
                    i2+=i1;
                else
                    i1+=i2;
            }
            if (n%2==0)
                return i2;
            else
                return i1;
        }
    }
    
    public static double potenzaR(double base, long esp){
        if(esp==0)
            return 1;
        else
            return base*potenzaR(base,esp -1);
    }
    
    public static double potenza2R(double base,long esp){
        if(esp==0)
            return 1;
        else{
            double pot=potenza2R(base,esp/2);
            if(esp%2==0)
                return pot*pot;
            else
                return base*pot*pot;
        }
    }
     
}
