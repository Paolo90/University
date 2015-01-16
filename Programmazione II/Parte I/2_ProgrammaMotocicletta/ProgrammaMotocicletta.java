class Motocicletta{
	String marca;
	String colore;
	boolean accesa =false;
	void accendi(){
		if(accesa==true){
			System.out.println("La moto è accesa");
		}else{
			accesa=true;
			System.out.println("Ora è accesa");
		}
	}
	void descrivi(){
		System.out.println("La moto è di marca " +marca+ " e di colore " +colore);
		if(accesa==true){
			System.out.println("La moto è accesa");
		}else{
			System.out.println("La moto è spenta");
		}
	}
}
class ProgrammaMotocicletta{
	public static void main(String[] args){
		Motocicletta m;
		Motocicletta m2;
		m=new Motocicletta();
		m.marca="Guzzi";
		m.colore="rosso";
		System.out.println("Descrizione:");
		m.descrivi();
		System.out.println("Accensione");
		m.accendi();
		m2=new Motocicletta();
		m2.marca="Honda";
		m2.colore="nero";
		System.out.println("Descrizione:");
		m2.descrivi();
		System.out.println("Accensione");
		m2.accendi();
	}
}
