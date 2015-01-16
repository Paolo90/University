package esercizio_1;
abstract public class Dipendente{
	String nome;
	int eta;
	Dipendente(String nome, int eta){
		this.nome=nome;
		this.eta=eta;
	}
	abstract int gratifica();
}
