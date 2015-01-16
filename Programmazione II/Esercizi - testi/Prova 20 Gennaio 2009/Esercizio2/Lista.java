public class Lista {
	Elemento testa = null;
	public Lista(int n) {
		for(int i=0; i<n; i++) {
			if (testa == null) {
			testa = new Elemento((int) (8*Math.random()));
			} else {
			testa = new Elemento((int) (8*Math.random()), testa);
		}
	}
}

void  visualizza () {
	for (Elemento e = testa; e != null; e=e.successivo) 
            System.out.print(" "+e.valore+" ");
        System.out.println(" ");
}
        
        
        
        int  conta (int n) {
	int quanti = 0;
	for (Elemento e = testa; e != null; e=e.successivo) 
            if (e.valore == n) 
                    quanti++;
	return quanti;
}


}