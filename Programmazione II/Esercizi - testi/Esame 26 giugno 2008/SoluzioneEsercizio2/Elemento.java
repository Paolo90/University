
public class Elemento {

    int valore;
    Elemento successivo = null;

    public Elemento(int valore) {
        this.valore = valore;
    }

    public Elemento(int valore, Elemento successivo) {
        this.valore = valore;
        this.successivo = successivo;
    }
}
