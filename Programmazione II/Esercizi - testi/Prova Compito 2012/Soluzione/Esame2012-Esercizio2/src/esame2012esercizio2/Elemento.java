package esame2012esercizio2;

/**
 *
 * @author Marco Matteocci
 */
public class Elemento {
    
    Elemento successivo = null;
    int valore;
    
    public Elemento(int valore, Elemento successivo) {
        this.valore = valore;
        this.successivo = successivo;
    }

}
