package esame2012esercizio1;

/**
 *
 * @author Marco Matteocci
 */
public class Crociera extends Vacanza {
    
    int numeroPorti;
    
    Crociera(int numeroPartecipanti, String meta, int numeroPorti) {
        super(numeroPartecipanti, meta);
        this.numeroPorti = numeroPorti;
    }
    
    double costo() {
        return numeroPartecipanti*numeroPorti;
    }
    
    void stampa() {
        System.out.println("La crociera "+meta+" ha "+numeroPartecipanti+" partecipanti, e approda su "+numeroPorti+" porti. COSTO TOTALE: "+costo()+" euro.");
    }

}
