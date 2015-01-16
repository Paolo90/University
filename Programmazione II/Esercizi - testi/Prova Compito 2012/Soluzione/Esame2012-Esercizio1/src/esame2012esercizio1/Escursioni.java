package esame2012esercizio1;

/**
 *
 * @author matteoma
 */
public class Escursioni extends Vacanza {
    
    int kmPercorsi;
    
    public Escursioni(int numeroPartecipanti, String meta, int kmPercorsi) {
        super(numeroPartecipanti, meta);
        this.kmPercorsi = kmPercorsi;
    }
    
    double costo() {
        return numeroPartecipanti + (10*kmPercorsi);
    }
    
    void stampa() {
        System.out.println("L'escursione "+meta+" ha "+numeroPartecipanti+" partecipanti che percorreranno "+kmPercorsi+" km. COSTO TOTALE: "+costo()+" euro.");
    }

}
