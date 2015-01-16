package esame2012esercizio1;

/**
 *
 * @author Marco Matteocci
 */
public abstract class Vacanza {
    
    int numeroPartecipanti;
    String meta;
    
    public Vacanza(int numeroPartecipanti, String meta) {
        this.numeroPartecipanti = numeroPartecipanti;
        this.meta = meta;
    }
    
    abstract double costo();
    abstract void stampa();     // non richiesto dall'esercizio, utile per fare controllo
        

}
