
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Squadra s = new Squadra(7, 4);
        //  s.stampaSquadra();
        System.out.println("Il giocatore che vale di piu' e': "+s.giocatorePiuValente());
    }
}
