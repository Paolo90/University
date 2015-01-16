package esercizio_1;
import java.util.Random;

public class Concessionaria{ // apro 1
	Veicoli[] V;
	Concessionaria(int n, int m){
		V=new Veicoli[n+m];
		Random r=new Random();
		for(int i=0;i<n;i++){
			V[i]=new Berlina("Colore "+i, Math.random()*300 +150, (int)(Math.random()*5)+1);
		}
		for(int i=n;i<m+n;i++){
			V[i]=new Suv("Colore "+i, Math.random()*300 +200, r.nextBoolean());
		}
	}
	double getMediaBolli(double n){
		double S=0; // vaiabile accumulatrice
		double bolloAttuale;
		double media;
		int conta=0;
		for(int i=0;i<V.length;i++){
			bolloAttuale=V[i].bollo();
			if(bolloAttuale >n){
				S+=bolloAttuale;
				conta++;
			}
		}
		media=S/conta;
		return media;
	}
}			
