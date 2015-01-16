
public class Attaccante extends Giocatore {

    int golSegnati;

    public Attaccante(String nome, int eta, int golSegnati) {
        super(nome, eta);
        this.golSegnati = golSegnati;
    }

    int valore() {
        return 5000000 * golSegnati - 5000 * eta;
    }
}
