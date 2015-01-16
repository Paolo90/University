package esercizio_1;
public class Azienda{
	Dipendente V[];
	Azienda(int n){
		V=new Dipendente[n];
		int k=n/3;
		for(int i=0;i<k;i++){
			V[i]=new Medico("Medico "+i, (int)(Math.random()*40)+20, (int)(Math.random()*5));
		}
		for(int i=k;i<n;i++){
			V[i]=new Infermiere("Infermiere "+i, (int)(Math.random()*50)+18, (int)(Math.random()*40));
		}
	}
	int getGratifica(int n){
		int S=0;
		int gratificaAttuale;
		for(int i=0;i<V.length;i++){
			if(V[i].eta <n){
				gratificaAttuale=V[i].gratifica();
				S+=gratificaAttuale;
			}
		}
		return S;
	}
}	
