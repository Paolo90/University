package esercizio_1;
abstract public class Veicoli{
	String colore;
	double potenza;
	Veicoli(String colore, double potenza){
		this.colore=colore;
		this.potenza=potenza;
	}
	abstract double bollo();
}
