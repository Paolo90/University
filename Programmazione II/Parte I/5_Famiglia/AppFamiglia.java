class Famiglia{
	static String Cognome="Rossi";
	String Nome;
	int eta;
}
class AppFamiglia{
	public static void main(String[] args){
		Famiglia f1;
		f1=new Famiglia();
		Famiglia f2;
		f2=new Famiglia();
		f1.Nome="Stefano";
		f1.eta=20;
		f2.Nome="Maria";
		f2.eta=23;
		System.out.println("Descrizione:");
		System.out.println("------------------------");
		System.out.println("Cognome: "+f1.Cognome);
		System.out.println("Nome: "+f1.Nome);
		System.out.println("Età: "+f1.eta);
		System.out.println("Descrizione:");
		System.out.println("------------------------");
		System.out.println("Cognome: "+f2.Cognome);
		System.out.println("Nome: "+f2.Nome);
		System.out.println("Età: "+f2.eta);
	}
}
