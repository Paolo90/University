

public class Pallavolista extends Atleta
{
    int partite; //partite giocate
    

    
    public Pallavolista(String nome, int eta, int partite)
    {
        super(nome,eta);
        this.partite = partite;
    }
        
    public long Premio()
    {
        return partite * 100;
    }
    
}
