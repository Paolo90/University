package esercizio_2;
public class Lista{
	Elemento testa=null;
	int lunghezza=0;
	Elemento ultimo=null;
	Lista(int n){
		for(int i=0;i<n;i++){
			testa=new Elemento((int)(Math.random()*15),testa);
			if(i==0)
				ultimo=testa;
			lunghezza++;
		}
	}
	void inserisci(int n, int x){
		if(n<1){
			System.out.println("Errore, inserisci n >=1 ");
		}else{
			if(n>lunghezza){
				Elemento temp=ultimo;
				ultimo=new Elemento(x,null);
				temp.next=ultimo;
                                lunghezza++;
			}else{
				int pos=1;
				Elemento current=testa;
				Elemento previous=null;
				while(pos<n){
					previous=current;
					current=current.next;
					pos++;	
				}
				Elemento inserito=new Elemento(x,current);
				previous.next=inserito;
                                lunghezza++;
			}
		}
	}
	void mostra(){
		for(Elemento e=testa;e!=null;e=e.next){
			System.out.print(e.value +" ");
		}
		System.out.println(" ");
	}
}
