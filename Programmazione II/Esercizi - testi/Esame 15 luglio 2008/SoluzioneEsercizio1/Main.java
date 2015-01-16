
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Archivio V = new Archivio(7);
        double mediaCompensi = V.getMediaPremi();
        System.out.println("La media dei premi degli atleti e di " + mediaCompensi + " euro.");
    }

}
