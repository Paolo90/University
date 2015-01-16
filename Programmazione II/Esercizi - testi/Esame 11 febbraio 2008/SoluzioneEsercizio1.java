
abstract class Nave {
    
    String nome;
    
    public Nave (String nome)   {
        this.nome = nome;
    } 
    
    public abstract double CostoIscrizione();
}

class Crociera  extends Nave {
    
    int capienza;
    
    public Crociera (String nome, int capienza) {
        super(nome);
        this.capienza = capienza;
    }
    
    public double CostoIscrizione() {
        return capienza * 100.50;
    }
}

class Trasporto extends Nave    {
    
    double tonnellaggio;
    
    public Trasporto (String nome, double tonnellaggio) {
        super(nome);
        this.tonnellaggio = tonnellaggio;
    }
    
    public double CostoIscrizione ()    {
        return tonnellaggio * 150;
    }
}

class Archivio {
    
    private Nave[] v;
    private final int CAPIENZA_PAS = 300;
    private final int PESO_TON = 500;
    
    public Archivio (final int n)   {
        
        v = new Nave[n];
        for (int i=0;i<(int)(n/2);i++)    
            v[i] = new Crociera("Vacanza" + i,(int)(CAPIENZA_PAS * Math.random()));
        for (int i=(int)(n/2);i<v.length;i++)    
            v[i] = new Trasporto("Percorso" + i,(PESO_TON * Math.random()));
    }   
    
    public boolean presente(double quota)   {
        boolean trovato = false;
        int i = 0;
        
        while ((trovato == false) && (i<v.length))   {
            if (v[i].CostoIscrizione() < quota) trovato = true;
            i++;
        }
        return trovato;
    }   
}

public class ApplicazioneNavi {
    
    public static void main(String[] args) {
        Archivio a = new Archivio((int)(Math.random() * 10));
        if (a.presente(Math.random() * 30000))   System.out.println("La nave e' presente");
        else    System.out.println("La nave non e' presente"); 
    }
    
}
