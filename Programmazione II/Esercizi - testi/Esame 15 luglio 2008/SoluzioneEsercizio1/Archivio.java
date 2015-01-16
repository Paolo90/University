
public class Archivio
{
    Atleta V[];
    
    public Archivio(){}

    public Archivio(int n)
    {
        V = new Atleta[n];
        
        for(int i = 0; i<n;i++)
        {
            String nome;
            int eta;
            int parametro3; //partite giocate per pallavolisti, vittorie per sprinter
            if(i%2==0)
            {
                nome = "Nome Pallavolista " + i/2;
                eta = (int)(Math.random()*20+14);
                parametro3 = (int)(Math.random()*1000);
                V[i] = new Pallavolista(nome,eta,parametro3);
                 System.out.println(V[i].nome + " di anni " +V[i].eta + ". Partite Giocate: " + ((Pallavolista)V[i]).partite); //Per semplice controllo
            }
            else
            {
                nome = "Nome Sprinter " + i/2;
                eta = (int)(Math.random()*20+14);
                parametro3 = (int)(Math.random()*500);
                V[i] = new Sprinter(nome,eta,parametro3);
                System.out.println(V[i].nome + " di anni " +V[i].eta + ". Vittorie: " + ((Sprinter)V[i]).vittorie); //Per semplice controllo
            }
        }
    }
        
    public double getMediaPremi()
    {
        double risultato=0;
        for (int i = 0; i < V.length ; i++)
        {
            risultato += V[i].Premio();
            System.out.println(V[i].Premio()); //Per semplice controllo
        }
        return risultato/V.length;
    }
}
