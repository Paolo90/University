

public abstract class Atleta
{
    protected String nome;
    protected int eta;
    
    public Atleta(){}
        
    public Atleta(String nome, int eta)
    {
        this.nome = nome;
        this.eta = eta;
    }
    
    protected abstract long Premio();
}
