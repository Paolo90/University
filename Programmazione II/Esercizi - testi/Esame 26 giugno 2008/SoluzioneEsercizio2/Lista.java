
public class Lista {

    Elemento testa = null;

    public Lista(int n) {
        for (int i = 0; i < n; i++) {
            if (testa == null) {
                testa = new Elemento((int) (Math.random() * 99));
            } else {
                testa = new Elemento((int) (Math.random() * 99), testa);
            }
        }
    }

    void scriviFile(String nomeFile, int n) {
        FileWriter f = null;
        PrintWriter out = null;
        try {
            f = new FileWriter(nomeFile);
            out = new PrintWriter(f);
            System.out.println("Stampo la Lista...");
            int somma = 0;
            for (Elemento e = testa; e != null; e = e.successivo) {
                if (e.valore < n) {
                    out.println(e.valore);
                    somma += e.valore;
                }
            }
            System.out.println("Stampo la somma...");
            out.println(somma);
            System.out.println("Fatto.");
        } catch (FileNotFoundException e) {
            System.err.println("Errore durante l'accesso al file: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Errore di Input/Output: " + e.getMessage());
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (f != null) {
                    f.close();
                }
            } catch (IOException e) {
                System.err.println("Errore di Input/Output: " + e.getMessage());
            }
        }
    }
}

