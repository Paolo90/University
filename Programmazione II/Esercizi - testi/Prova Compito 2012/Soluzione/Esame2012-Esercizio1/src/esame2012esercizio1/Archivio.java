package esame2012esercizio1;

/**
 *
 * @author Marco Matteocci
 */
public class Archivio {
    
    Vacanza[] V;
    
    public Archivio(int n, int m) {
        V = new Vacanza[n+m];
        int pa, po, km;
        
        for(int i = 0; i<n; i++) { //crociera
            pa = (int)(Math.abs(Math.random()*300));
            po = (int)(Math.abs(Math.random()*10));
            V[i] = new Crociera(pa, "MetaCrociera"+(i+1), po);
        }
        
        for(int i = n; i<n+m; i++) { //escursione
            pa = (int)(Math.abs(Math.random()*30));
            km = (int)(Math.abs(Math.random()*200));
            V[i] = new Escursioni(pa, "MetaEscursione"+(i-n+1), km);
        }
        
    }
    
     String vediCosto(double c) {
        for(int i = 0; i<V.length; i++) 
            if(V[i].costo() < c)
                return V[i].meta;

        return null;
      }
        
        
     void stampa(){
        for(int i = 0; i<V.length; i++) 
            V[i].stampa();
     }
     

    public static void main(String[] args) {
   
        final int COSTO = 5000;
        final int CROCIERE = 15;
        final int ESCURSIONI = 6;
        Archivio a = new Archivio(CROCIERE, ESCURSIONI);
        System.out.println("L'archivio e' composto da: "+CROCIERE+" CROCIERE e "+ESCURSIONI+" ESCURSIONI");
        a.stampa();
        
        System.out.println("La meta di costo inferiore a "+COSTO+ " e' "+a.vediCosto(COSTO));
        
    }

}
