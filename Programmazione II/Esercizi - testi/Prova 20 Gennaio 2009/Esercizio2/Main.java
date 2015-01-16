public class Main 
{
public static void main(String[] args) {

	Lista l = new Lista(10);

        System.out.print("Lista: ");
        l.visualizza();
	System.out.println("Elementi della lista uguali ad 1: "+l.conta(1));
	}
}