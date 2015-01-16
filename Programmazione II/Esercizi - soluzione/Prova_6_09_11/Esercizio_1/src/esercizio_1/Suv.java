package esercizio_1;
public class Suv extends Veicoli{
	boolean benzina;
	Suv(String colore, double potenza, boolean benzina){
		super(colore,potenza);
		this.benzina=benzina;
	}
	double bollo(){
		double costoParziale=potenza*200;
		if(!benzina)
			return costoParziale+100;
		return costoParziale;
	}
}
