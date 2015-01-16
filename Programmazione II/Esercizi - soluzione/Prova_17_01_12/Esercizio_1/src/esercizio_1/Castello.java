package esercizio_1;
public class Castello extends Abitazione{
	int secoloCostruzione;
	Castello(double superficie, int stanze, int secoloCostruzione){
		super(superficie, stanze);
		this.secoloCostruzione=secoloCostruzione;
	}
	double valuta(){
		return stanze*10000+superficie*1000-secoloCostruzione*10;
	}
}
