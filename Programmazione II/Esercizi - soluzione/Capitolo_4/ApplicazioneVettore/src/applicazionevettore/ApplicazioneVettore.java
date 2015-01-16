/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package applicazionevettore;

/**
 *
 * @author paolo
 */
public class ApplicazioneVettore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n=10;
	Vettore Q= new Vettore(n);
	Q.stampa();
	Q.somma_elementi();
	Q.media_elementi();
	Q.massimo();
	Q.minimo();
	System.out.println("La moda è " + Q.moda_vettore());
        System.out.println("La moda è " + Q.modaMigliorata());
        System.out.println("Ci sono " + Q.contaMaggioriDi(5) +" elementi maggiori di 5");
        System.out.println("La posizione di 5 è " + Q.cercaElemento(5));
        Q.ordina();
        Q.stampa();
        System.out.println("La moda del vettore ordinato è "+Q.modaOrdinata());
        System.out.println("La posizione di 5 è " + Q.cercaElementoOrdinato(5));
        System.out.println("Ci sono " + Q.contaMinoriOrdinato(5) + " elementi minori di 5");
        Elemento.conta=0;
        Vettore u=new Vettore(8);
        Vettore w=new Vettore(5);
        u.ordina();
        w.ordina();
        u.stampa();
        w.stampa();
        Elemento testa=null;
        testa=u.scegli(testa);
        testa=w.scegli(testa);
        // Elemento.stampa(testa); stampa l'incollamento delle due scelte
        Vettore uu=new Vettore(Elemento.getconta());
        int j=0;
        for(Elemento e = testa;e!=null;e=e.next){
            uu.v[j]=e.valore;
            j++;
        }
        uu.ordina();
        Elemento.conta=0;
        testa=uu.scegli(null);
        int K=Elemento.getconta();
        Elemento f=testa;
        Elemento ttesta=null;
        for(int i=0;i<K;i++){
            ttesta=new Elemento(f.valore,ttesta);
            f=f.next;
        }
        System.out.println("L'unione ordinata dei due vettori è: ");
        Elemento.stampa(ttesta);
        
        testa=null;
        Elemento testa1=null;
        Elemento testa2=null;
        testa=u.scegli(testa);
        testa1=w.scegli(testa1);
        Elemento e,e1;
        for(e=testa;e!=null;e=e.next){
            for(e1=testa1;e1 != null; e1=e1.next){
                if(e1.valore == e.valore){
                    testa2=new Elemento(e.valore,testa2);
                    break;
                }
            }
        }
        System.out.println("L'intersezione ordinata dei due vettori è: ");
        Elemento.stampa(testa2);
    }
}
