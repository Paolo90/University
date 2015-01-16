/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esercizio_4_2;

/**
 *
 * @author paolo
 */
public class Lista {
    Elemento testa=null;
    int conta=0;
    Lista(int n){
        for(int i=0;i<n;i++){
            testa=new Elemento((int)(Math.random()*10),testa);
            conta++;
        }
    }
    void visualizza(){
        Elemento e=testa;
        for(;e!=null;e=e.successivo){
            System.out.print(e.valore + " ");
        }
        System.out.println(" ");
    }
    
    int somma(){
        Elemento e=testa;
        int S=0;
        for(;e!=null;e=e.successivo){
            S+=e.valore;
        }
        return S;
    }
    
    double media(){
        double media=0;
        int n=0;
        Elemento e=testa;
        for(;e!=null;e=e.successivo){
            media+=e.valore;
            n++;
        }
        media/=n;
        return media;
    }
    
    int massimo(){
        Elemento e=testa;
        int M=e.valore;
        for(e=e.successivo;e!=null;e=e.successivo){
            if(M<e.valore)
                M=e.valore;
        }
        return M;
    }
    
    int minimo(){
        Elemento e=testa;
        int m=e.valore;
        for(e=e.successivo;e!=null;e=e.successivo){
            if(m>e.valore)
                m=e.valore;
        }
        return m;
    }
    
    int moda(){
        Elemento e=testa;
        int v[]=new int[conta];
        Elemento i;
        Elemento j;
        int k=0;
        for(;k<conta;k++){
            v[k]=1;
        }
        k=0;
        for(i=testa;i!=null;i=i.successivo){
            for(j=testa;j!=null;j=j.successivo){
                if(j!=i){
                  if(i.valore==j.valore)
                      v[k]++;
                }
            }
            k++;
        }
        int M=0;
        int t=0;
        for(k=0;k<conta;k++){
            if(M<v[k]){
                M=v[k];
                t=k;
            }    
        }
        k=0;
        for(;e!=null;e=e.successivo){
            if(k==t)
                return e.valore;
            else
                k++;
        }
        return testa.valore;
    }
    
    void ordinaLista(){
        Elemento i;
        int v[]=new int[conta];
        int k=0;
        for(i=testa;i!=null;i=i.successivo){
            v[k]=i.valore;
            k++;
        }
        int j,l;
        int temp;
        for(j=0;j<v.length-1;j++){
            for(l=v.length-1;l>j;l--){
                if(v[l]<v[l-1]){
                    temp=v[l-1];
                    v[l-1]=v[l];
                    v[l]=temp;
                }
            }
        }
        j=0;
        for(i=testa;i!=null;i=i.successivo){
            i.valore=v[j];
            j++;
        }
    }
    
    int modaOrdinata(){
        Elemento e=testa;
        int v[]=new int[conta];
        Elemento i;
        Elemento j;
        int k=0;
        for(;k<conta;k++){
            v[k]=1;
        }
        k=0;
        for(i=testa;i!=null;i=j){
            for(j=i.successivo;j!=null;j=j.successivo){
                if(j.valore == i.valore){
                    v[k]++;
                }else{
                    //nonTrovato=true;
                    k++;
                    break;
                }
            }
        }
        int M=v[0];
        int t=0;
        for(k=0;k<conta;k++){
            if(v[k]>M){
                M=v[k];
                t=k;
            }    
        }
        k=0;
        for(i=testa;i!=null;i=i.successivo){
            if(k==t)
                return i.valore;
            else
                k++;
        }
        return testa.valore;
    }
    
    int trovaPosizione(int k){
        if(k<0 || k>10){
            System.out.println("Errore di range");
            return -1;
        }else{
            int p=0;
            for(Elemento i=testa;i!=null;i=i.successivo){
                if(i.valore==k)
                    return p;
                else
                    p++;
            }
            return -1;
        }
    }
    
    int trovaPosizioneOrdinata(int k){
        int v[]=new int[conta];
        int inizio=0;
        int fine=v.length-1;
        int mid;
        int b=0;
        int t=-1;
        for(Elemento i=testa;i!=null;i=i.successivo){
            v[b]=i.valore;
            b++;
        }
        while(inizio<=fine){ 
            mid=(inizio+fine)/2;
            if(v[mid]==k){
                return mid;
            }else{
                if(v[mid]<k)
                    inizio=mid+1;
                else
                    fine=mid-1;
            }
        }
        return t;
    }
    
    int contaPari(){
        int C=0;
        for(Elemento i=testa;i!=null;i=i.successivo){
            if(i.valore %2 ==0)
                C++;
        }
        return C;
    }
    
    int contaMaggiore(int k){
        int C=0;
        for(Elemento i=testa;i!=null;i=i.successivo){
            if(i.valore > k)
                C++;
        }
        return C;
    }
    
    int contaMinoreOrdinato(int k){
        int C=0;
        int v[]=new int[conta];
        int b=0;
        for(Elemento i=testa;i!=null;i=i.successivo){
            v[b]=i.valore;
            b++;
        }
        int inizio=0;
        int fine=v.length-1;
        int mid;
        while(inizio<=fine){
            mid=(inizio+fine)/2;
            if(v[mid]<k){
                C+=mid-inizio+1;
                inizio=mid+1;
            }else{
                fine=mid-1;
            }
        }
        return C;
    }
    
}
