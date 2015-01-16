
public class Numero
{
    int totale = 0;
    public Numero()
    {
        
    }
    synchronized public void StampaTotale(int numero)
    {
        totale += numero;
        System.out.println("Somma numeri: " + totale);
    }
}
