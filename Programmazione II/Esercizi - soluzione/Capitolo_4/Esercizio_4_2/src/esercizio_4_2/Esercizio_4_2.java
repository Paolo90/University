/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esercizio_4_2;

/**
 *
 * @author paolo
 */
public class Esercizio_4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lista l=new Lista(10);
        l.visualizza();
        System.out.println("La somma degli elementi della lista è: " + l.somma());
        System.out.println("La media degli elementi della lista è: " + l.media());
        System.out.println("Il massimo degli elementi della lista è: " + l.massimo());
        System.out.println("Il minimo degli elementi della lista è: " + l.minimo());
        System.out.println("La moda degli elementi della lista è: " + l.moda());
        System.out.println("La posizione di 5 nella lista è: " + l.trovaPosizione(5));
        /*
        * metodi sulla lista ordinata
        */
        l.ordinaLista();
        System.out.println("Questa è la lista ordinata: ");
        l.visualizza();
        System.out.println("La moda degli elementi della lista ordinata è: " + l.modaOrdinata());
        System.out.println("La posizione di 5 nella lista ordinata è: " + l.trovaPosizioneOrdinata(5));
        System.out.println("Il numero di elementi pari nella lista è: " + l.contaPari());
        System.out.println("Il numero degli elementi della lista maggiori di 5 è: " + l.contaMaggiore(5));
        System.out.println("Il numero degli elementi della lista minori di 5 è: " + l.contaMinoreOrdinato(5));
        System.out.println("----------------------------------------");
        /*--------------------------------------------------------------------*/
        Lista l1=new Lista(8);
        Lista l2=new Lista(5);
        l1.ordinaLista();
        l2.ordinaLista();
        l1.visualizza();
        l2.visualizza();
        System.out.println("prova");
        for(Elemento h=l1.testa;h!=null;h=h.successivo){
            System.out.print(h.valore + " ");
        }
        Elemento x=l1.testa;
        Elemento y=l2.testa;
        System.out.println("Ristampa");
        for(Elemento h=x;h!=null;h=h.successivo){
            System.out.print(h.valore + " ");
        }
        for(Elemento h=y;h!=null;h=h.successivo){
            System.out.print(h.valore + " ");
        }
        System.out.println("-----------------------");
        int lunghezza=l1.conta + l2.conta;
        Elemento e=l1.testa;
        while(1 != 0){ // incollo le due liste
            if(e.successivo == null){
                e.successivo=l2.testa;
                break;
            }
            e=e.successivo;
            }
        l1.visualizza();
        l1.conta=lunghezza;
        l1.ordinaLista();
        l1.visualizza();
        int v[]=new int[lunghezza];
        int j=0;
        for(e=l1.testa;e!=null;e=e.successivo){
            v[j]=e.valore;
            j++;
        }
        Elemento ttesta=null;
        for(j=0;j<v.length;j++){
            ttesta=new Elemento(v[j],ttesta);
        }
        for(e=ttesta;e!=null;e=e.successivo){
            System.out.print(e.valore + " ");
        }
        boolean beta=true;
        Elemento f;
        for(e=ttesta;e!=null;e=e.successivo){
            for(f=e.successivo;f!=null;f=f.successivo){
                if(f.valore!=e.valore){
                    e.successivo=f;
                    beta=true;
                    break;
                }
                beta=false;
            }
            if(beta==false)
                e.successivo=null;
        }
        System.out.println(" ");
        System.out.println("L'unione ordinata della lista è: ");
        for(e=ttesta;e!=null;e=e.successivo){
            System.out.print(e.valore +" ");
        } 
        System.out.println(" ");
        /* Ora scriviamo il codice per l'intersezione */
        Elemento capo=null;
        Elemento g;
        boolean b1;
        boolean b2;
        for(e=ttesta;e!=null;e=e.successivo){
            System.out.print("e.valore= "+ e.valore +" ");
            b1=false;
            b2=false;
            for(f=x;f!=null;f=f.successivo){
                System.out.println("f.valore= "+ f.valore +" ");
                if(f.valore==e.valore){
                    b1=true;
                    break;
                }
            }
            if(b1==true){
                for(g=y;g!=null;g=g.successivo){
                    if(g.valore==e.valore){
                        b2=true;
                        break;
                    }
                }
            }    
            if(b1== true && b2==true)
                capo=new Elemento(e.valore,capo);
        }
        System.out.print("l'intersezione ordinata della lista è");
        for(e=capo;e!=null;e=e.successivo){
            System.out.print(e.valore + " ");
        }
        }
    }
