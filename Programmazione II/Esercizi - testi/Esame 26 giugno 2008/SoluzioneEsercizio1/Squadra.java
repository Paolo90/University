
public class Squadra {

    Giocatore[] v;

    public Squadra(int m, int n) {
        v = new Giocatore[m + n];
        for (int i = 0; i < m; i++) {
            v[i] = new Portiere("Portiere " + i, (int) (Math.random() * 30) + 10, (int) (Math.random() * 40));
        }
        for (int i = 0; i < n; i++) {
            v[m + i] = new Attaccante("Attaccante " + i, (int) (Math.random() * 25) + 10, (int) (Math.random() * 50));
        }
    }

    String giocatorePiuValente() {
        if (v.length>0) {
        String nomeTrovato = v[0].nome;
        int tempMax = v[0].valore();
        for (int i = 1; i < v.length; i++) {
            if (v[i].valore() > tempMax) {
                nomeTrovato = v[i].nome;
                tempMax = v[i].valore();
            }

        }
        return nomeTrovato;
        }else {
        return "La squadra non contiene giocatori.";
        }
    }
}
