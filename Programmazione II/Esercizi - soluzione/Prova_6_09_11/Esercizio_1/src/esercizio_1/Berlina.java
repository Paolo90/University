package esercizio_1;
public class Berlina extends Veicoli{
	int passeggeri;
	Berlina(String colore, double potenza, int passeggeri){
		super(colore,potenza);
		this.passeggeri=passeggeri;
	}
	double bollo(){
		double costoParziale=potenza*100;
		if(passeggeri<5)
			return costoParziale+300;
		return costoParziale;
	}
}
