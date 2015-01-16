class Esempio{
	void blocchi(){
		int a,b;
		a=1;
		b=3;
		{
			int a;
			b=4;
			a=2;
			System.out.println(a); //a=2
			System.out.println(b); //b=4
		}
		System.out.println(a); //a=1
		System.out.println(b); //b=4
	}
//}
//class ApplicazioneEsempio{
	public static void main(String[] args){
		int a,b,c;
		a=0;
		b=1;
		c=2;
		Esempio e;
		e=new Esempio();
		e.blocchi();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
