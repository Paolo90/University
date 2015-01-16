class AppConversioni{
	public static void main(String[] args){
		Integer m = new Integer(35); // l'intero 35 è un campo dell'oggetto a cui m fa riferimento
		int n = m.intValue(); //definisce un numero intero a partire dal campo dell'oggetto a cui m fa riferimento (unboxing)
		System.out.println(n);
		Integer p = new Integer(5);
		//int n = p+m ; //ERRATO!! Ho definito due volte la stessa variabile nel medesimo blocco
		String s = String.valueOf(35); //converte l'intero [int] 35 nella stringa "35"
		System.out.println(s);
		String s1 = Integer.toString(35); //converte il campo dell'integer 35 nella stringa "35"
		System.out.println(s1);
		// conversioni da stringa a numeri
		int n1 = Integer.parseInt(s1); // converte la stringa s1 in un numero intero col metodo statico parseint
		float x = Float.parseFloat("3.14"); // converte la stringa "3.14" in un float
		double y = Double.parseDouble("3.14"); // converte la stringa "3.14" in un double
		System.out.println(n1);
		System.out.println(x);
		System.out.println(y);
	}	
}
