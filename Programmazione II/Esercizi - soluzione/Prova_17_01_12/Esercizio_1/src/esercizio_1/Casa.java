package esercizio_1;
public class Casa extends Abitazione{
	boolean pannelliSolari;
	Casa(double superficie, int stanze, boolean pannelliSolari){
		super(superficie, stanze);
		this.pannelliSolari=pannelliSolari;
	}
	double valuta(){
		double importo= stanze*100 + superficie*3000;
		if(pannelliSolari)
			return importo+10000;
		return importo;
	}
}
