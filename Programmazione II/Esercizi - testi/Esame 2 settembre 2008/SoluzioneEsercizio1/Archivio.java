package esercizio1;

abstract class Atleta {
    String nome;
    int età;
    Atleta (String a, int b) {
        nome=a;
        età=b;
    }

    abstract double getPremio();
}

class Squadra extends Atleta {
    int partitevinte;
    int ngiocatori;
    Squadra(String name, int e, int p, int n){
        super (name,e);
        partitevinte=p;
        ngiocatori=n;
    }
double getPremio() {
    return (double)partitevinte*1000/ngiocatori;
}
}

class Individuale extends Atleta {
    int vittorie;
    Individuale(String name, int e, int v) {
        super (name,e);
        vittorie=v;
    }
    double getPremio() {
        return vittorie*500;
    }
}
public class Archivio {
    Atleta[]v;
  public Archivio(int N) {
        v=new Atleta [N];
        for (int i=0; i<N/3; i++) {
            v[i]=new Individuale ("Bolt"+i,(int)(Math.random()*40),(int)(Math.random()*100));
            }
        for (int i=N/3; i<v.length; i++) {
            v[i]=new Squadra ("Hamsik"+i,(int)(Math.random()*40),(int)(Math.random()*200),(int)(Math.random()*11));
        } 
    }
    double getSommaPremi() {
        double premi=0;
        for(int i=0; i<v.length; i++) {
            premi=premi+v[i].getPremio();
        }
        return premi;
    }


public static void main (String [] args) {
     Archivio a = new Archivio (18);
     System.out.println(a.getSommaPremi());
}
}