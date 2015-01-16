class Auto{
	int cavalli;
	double massa;
	String colore;
	String marca;
	boolean ecologica;
}
class ApplicazioneAuto{
	public static void main(String[] args){
		Auto a1;
		a1=new Auto();
		a1.cavalli=100;
		a1.massa=1500.0;
		a1.marca="Maserati";
		a1.colore="Blu";
		a1.ecologica=false;
		System.out.println("Descrizione:");
		System.out.println("Cavalli: "+ a1.cavalli);
		System.out.println("Massa: " +a1.massa);
		System.out.println("Colore: "+a1.colore);
		System.out.println("Marca: "+a1.marca);
		if(a1.ecologica==true)
			System.out.println("Auto ecologica");
		else
			System.out.println("Auto inquinante");
	}
}
