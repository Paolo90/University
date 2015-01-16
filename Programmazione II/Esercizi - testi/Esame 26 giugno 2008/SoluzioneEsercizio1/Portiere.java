
public class Portiere extends Giocatore {

    int rigoriParati;

    public Portiere(String nome, int eta, int rigoriParati) {
        super(nome, eta);
        this.rigoriParati = rigoriParati;
    }

    int valore() {
        return 1000000 * rigoriParati - 1000 * eta;
    }
}
