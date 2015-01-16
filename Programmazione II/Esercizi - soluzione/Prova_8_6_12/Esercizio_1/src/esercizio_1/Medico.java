package esercizio_1;
public class Medico extends Dipendente{
	int specializzazioni;
	Medico(String nome, int eta, int specializzazioni){
		super(nome, eta);
		this.specializzazioni=specializzazioni;
	}
	int gratifica(){
		return 500+specializzazioni*100;
	}
}
