package esercizio_1;
import java.util.*;
public class Agenzia{
	Abitazione V[];
	Agenzia(int n, int m){
		V=new Abitazione[n+m];
		Random r=new Random();
		for(int i=0;i<n;i++){
			V[i]=new Castello(Math.random()*2500+500, (int)(Math.random()*35)+1, (int)(Math.random()*15));
		}
		for(int j=n;j<m+n;j++){
			V[j]=new Casa(Math.random()*500+100,(int)(Math.random()*7)+1, r.nextBoolean());
		}
	}
	double cumulaValutazioni(double n){
		double cumula=0;
		double temp;
		for(int j=0;j<V.length;j++){
			temp=V[j].valuta();
			if(temp >n)
				cumula+=temp;
		}
		return cumula;
	}
}
