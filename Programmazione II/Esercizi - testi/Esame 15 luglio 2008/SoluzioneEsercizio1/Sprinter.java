

public class Sprinter extends Atleta
{
    int vittorie;
    
    public Sprinter(){ }

    public Sprinter(String nome, int eta, int vittorie)
    {
        super(nome, eta);
        this.vittorie = vittorie;
    }
    
    
    public long Premio()
    {
        return vittorie * 1000;
    }

}
