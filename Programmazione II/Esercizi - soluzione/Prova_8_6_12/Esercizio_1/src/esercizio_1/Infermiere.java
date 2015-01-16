package esercizio_1;
public class Infermiere extends Dipendente{
	int anzianita;
	Infermiere(String nome, int eta, int anzianita){
		super(nome,eta);
		this.anzianita=anzianita;
	}
	int gratifica(){
		return 300+anzianita*30;
	}
}
