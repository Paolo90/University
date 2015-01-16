
public abstract class Giocatore {

    String nome;
    int eta;

    public Giocatore(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    abstract int valore();
}
