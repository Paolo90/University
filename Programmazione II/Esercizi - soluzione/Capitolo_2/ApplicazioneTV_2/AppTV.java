class TV{
	String marca;
	int pollici;
	String risoluzione;
	boolean schermo_piatto;
}
class AppTV{
	public static void main(String[] args){
		TV televisore;
		televisore= new TV();
		televisore.marca="Panasonic";
		televisore.pollici=50;
		televisore.schermo_piatto=true;
		System.out.println("Descrizione:");
		System.out.println("Marca: "+ televisore.marca);
		System.out.println("Pollici: "+televisore.pollici);
		if(televisore.schermo_piatto==true)
			System.out.println("Schermo piatto");
		else
			System.out.println("No schermo piatto");
	}
}
