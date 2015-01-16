
public class Main {

    /**
     * @param args Due interi lunghezzaLista e valoreDiscriminante e una stringa nomeFile che contiene il percorso del file. Se non sono passati, vengono utilizzati valori di default.
     */
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Non sono stati passati parametri, verranno usati quelli di default. Altrimenti passare lunghezzaLista valoreDiscriminante e nomeFile (che contiene il percorso del file)");
            Lista l = new Lista(100);
            l.scriviFile("file.txt", 30);
        } else {
            try {
                Lista l = new Lista(Integer.valueOf(args[0]));
                l.scriviFile(args[2], Integer.valueOf(args[1]));
            } catch (NumberFormatException e) {
                System.err.println("Uno dei dati passati non e' corretto: " + e.getMessage());
            }

        }

    }
}
