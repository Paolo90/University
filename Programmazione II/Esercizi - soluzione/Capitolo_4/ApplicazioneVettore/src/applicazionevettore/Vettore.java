/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package applicazionevettore;

/**
 *
 * @author paolo
 */
public class Vettore {
    int[]v;
// costruttore vettore n elementi
	Vettore(int n){
		v=new int[n];
		int i=0;
		for(;i<n;i++){
			v[i]=(int)(Math.random()*10); //numero casuale tra 0 e 10
		}
	}
//metodo visualizza vettore
	void stampa(){
		for(int i=0;i<v.length;i++){
			System.out.print(v[i]);
		}
		System.out.println("\n---------------------------------\n");
	}
//metodo somma elementi	
	int somma_elementi(){
		int S=0;
		for(int i=0;i<v.length;i++){
			S+=v[i];
		}
		System.out.println("La somma è "+ S);
		//System.out.println("La lunghezza è "+ this.v.length);
		return S;
	}
// metodo media aritmetica
	double media_elementi(){
		double M;
		int S=this.somma_elementi();
		M=(double)S/(double)(v.length);
		System.out.println("La media aritmetica è "+ M);
		return M;
	}
// metodo massimo
	int massimo(){
		int M=(this.v)[0];
		for(int i=1;i<v.length;i++){
			if(v[i]>M)
				M=v[i];
		}
		System.out.println("il massimo del vettore è "+M);
		return M;	
	}
// metodo minimo
	int minimo(){
		int M=(this.v)[0];
		for(int i=1;i<v.length;i++){
			if(v[i]<M)
				M=v[i];
		}
		System.out.println("il minimo del vettore è "+M);
		return M;	
	}
//metodo moda
	int moda_vettore(){
		int moda;
		int i;
		int k;
		int[] record=new int[v.length];
                for(i=0;i<v.length;i++){
                    record[i]=0;
                }
		for(i=0;i<v.length;i++){
			record[i]=1;
			for(k=0;k<i;k++){
				if(v[k] == v[i]){
					record[i]++;
				}
			}
		}
                for(i=0;i<v.length;i++){
                    //System.out.print(record[i]);
                }
		moda=record[0];
		int el=v[0];
		for(int j=1;j<record.length;j++){
			if(record[j]>moda){
				moda=record[j];
				el=v[j];
                        }        
		}
		return el;
	}
        
        int modaMigliorata(){ // questo metodo è una versione più efficiente e facile da scrivere
            int i;
            int j;
            int moda=v[0]; // se non inizializzo moda, quando ho un vettore con tutti el diversi non può restituire il valore perché l'if in fondo non viene mai attivato
            int conta_volte=0;
            int t;
            Elemento testa=null;
            for(i=0;i<v.length;i++){
                t=1;
                for(j=i+1;j<v.length;j++){
                    if(v[j]==v[i]){
                        t++; // se faccio così la variabile deve essere inizializzata
                    }
                }
                if(conta_volte<t){
                    conta_volte=t;
                    moda=v[i];
                }else if(conta_volte==t){ //per come è fatto è implicito che siano entrambi !=0
                    testa= new Elemento(moda,testa);
                    moda=v[i];
                }
            }
            testa=new Elemento(moda,testa);
            System.out.println("Ecco la lista di tutte le mode");
            for(Elemento e=testa;e!=null;e=e.next){
                System.out.print(e.valore);
            }
            System.out.println(" ");
            return moda;
        }    
      
        
        void ordina(){ // Bubblesort
        int temp;
        for(int i=0;i<v.length-1;i++){ //ordina dal fondo prendendo le coppie
            for(int j=v.length -1;j>i;j--){
                if(v[j]<v[j-1]){
                    temp=v[j];
                    v[j]=v[j-1];
                    v[j-1]=temp;
                }
            }
        }
    }
        int modaOrdinata(){
            int moda;
            int el=v[0];
            int r;
            int i;
            int[] record=new int[v.length];
            for(i=0;i<v.length;i++){
               record[i]=1;
            }        
            boolean nonTrovato; //mi dice se trovo un elemento diverso da quello fissato
            for(i=0;i<v.length-1;i+=r){
                r=1;
                nonTrovato=true;
                while(nonTrovato){
                     if((i+r)<v.length && v[i]==v[i+r]){ // prima guarda se ci sono le condizioni e poi confronta
                            r++;
                            record[i]++;
                        }else
                            nonTrovato=false;
                    }
            }
            moda=record[0];
		for(int j=1;j<record.length;j++){
			if(record[j]>moda){
				moda=record[j];
				el=v[j];
                        }        
		}		
		return el;
        }
        
        int cercaElemento(int target){
            int p=-1;
            for(int i=0;i<v.length;i++){
                if(v[i]==target)
                    p=i;
            }
            return p;
        }
        
        private int cercaElementoOrdinato(int target,int inizio,int fine){
            int mid=(inizio + fine)/2;
            if(inizio > fine)
                return -1;
            else{
                if(v[mid]==target)
                    return mid;
                else{
                    if(v[mid]<target)
                        return cercaElementoOrdinato(target,mid+1,fine);
                    else
                        return cercaElementoOrdinato(target,inizio,mid-1);
                }
            }
        }
        
        int cercaElementoOrdinato(int target){
            return cercaElementoOrdinato(target,0,v.length -1);
        }
        
        int contaPari(){
            int conta=0;
            for(int i=0;i<v.length;i++){
                if(v[i]%2 ==0)
                    conta++;
            }
            return conta;
        }
        int contaMaggioriDi(int k){
            int conta=0;
            for(int i=0;i<v.length;i++){
                if(v[i]>k)
                    conta++;
            }  
            return conta;
        }
        int contaMinoriOrdinato(int k){
            int conta=0;
            int i=0;
            while(v[i]<k){
                conta++;
                i++;
            }
            return conta;
        }
        Elemento scegli(Elemento testa){
            int j=0;
            testa=new Elemento(v[j],testa);
            for(int i=0;i<v.length-1;i=j){ // sceglie gli elementi di u
                //System.out.println(j);
                for(int k=i+1;k<v.length;k++){
                    if(v[k]!=v[i]){
                        testa=new Elemento(v[k],testa);
                        j=k;
                        break;
                    }
                    j=k;
                }
            }
            return testa;
        }
        
}
