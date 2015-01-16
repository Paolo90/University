class Intero{
	int n;//quanto vale l'intero
	boolean test_primo(int k){		//test se il numero è primo
		int i; 
		boolean test=true;	
		for(i=2;i<k;i++){
			if(k%i==0){
				test=false;
				break;
			}
		}
		if(test==true){
			System.out.println("il numero è primo");
			return true;
		}else{
			System.out.println("il numero NON è primo");
			return false;
		}
	}
	void test_perfetto(int k){		//test se il numero è perfetto
		if(test_primo(k)==true){
			System.out.println("Il numero NON è perfetto"); //il solo divisore proprio è 1
		}else{
			int[] divisori;
			divisori=new int[k];
			int j;
			for(j=0;j<k;j++){ //guardo tutti i numeri minori di k
				divisori[j]=0; //inizializzo il vettore
			}
			divisori[0]=1;
			int p=1;
			j=2;
			for(;j<k;j++){
				if((k%j)==0){
					divisori[p]=j;
					p++;
				}
			}
			int S=0;
			j=0;
			System.out.println("I divisori di "+k +" sono:");
			for(;j<p;j++){ //guardo tutte le entrate da 0 a p-1
				System.out.println(divisori[j]);
				S+=divisori[j];
			}
			if(S==k){
				System.out.println("Il numero è perfetto");
			}else{
				System.out.println("Il numero NON è perfetto");
			}
		}
	}
	void test_radice(int k){
		int i=1;
		for(;i<k;i++){
			if(Math.sqrt(k)==i){
				System.out.println(k+" è il quadrato di "+i);
				return;
			}
		}
		System.out.println(k+" non è il quadrato di nessuno degli interi che lo precedono");
	}
}
class OperaIntero{
	public static void main(String[] args){
		Intero N;
		N=new Intero();
		N.n=4;
		//N.test_primo(N.n);
		N.test_perfetto(N.n);
		N.test_radice(N.n);
	}
}
