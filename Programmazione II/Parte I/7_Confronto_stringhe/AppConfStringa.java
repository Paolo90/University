class AppConfStringa{
	public static void main(String[] args){
		String s1, s2;
		boolean b,b1,b2;
		s1="ciao";
		s2=s1;
		b=(s1==s2);
		System.out.println(b);
		s2=new String(s1);
		b1=(s1==s2);
		System.out.println(b1);
		b2=s1.equals(s2);
		System.out.println(b2);
	}
}
