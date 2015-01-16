/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esercizioliste14;

/**
 *
 * @author paolo
 */
public class EsercizioListe14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista l;
        l=new Lista(15);
        l.visualizza();
        /*
        l.visualizzaFor();
     //   l.visualizzaR(l.testa); // testa è stata definita dal costruttore
        // la testa deve rimanere intatta
        // l'info è dentro l'oggetto quindi uso il doppio metodo come nella teoria
        l.visualizzaR();
        System.out.println("Somma elementi=" + l.sommaI());
        //System.out.println(l.sommaR(l.testa));
        System.out.println("Somma elementi=" + l.sommaR());
        System.out.println("Cerca l'elemento 5 iterativamente " + l.cercaElemento(5));
        // System.out.println("Cerca l'elemento 1 ricorsivamente " + l.cercaElementoR(1,l.testa));
        System.out.println("Cerca l'elemento 1 iterativamente " + l.cercaElementoR(1));
        System.out.println("La lista conta " + l.contaElementi() + " elementi");
        System.out.println("La lista conta (ricorsiva) " + l.contaElementiR() + " elementi");
        System.out.println("La lista conta (metodo costruttore e getLunghezza) " + l.getLunghezza() + " elementi");
        System.out.println("L'elemento 2 è stato cancellato? " + l.cancellaElemento(2)); //agisce sulla lista
        l.visualizza();
        System.out.println("Stampiamo la lista inversa: ");
        Lista l2;
        l2=l.listaInversa();
        l2.visualizza();
        Lista l3;
        */
        System.out.println("conta 3 = " + l.conta(3));
        l.visualizza();
        System.out.println("verifica 2 = " + l.verifica(2));
        Lista l2=l.rovesciaR();
        l2.visualizza();
        Lista lr = l.rovesciaR();
        lr.visualizza();
        Lista lr2 = l.rovesciaR2();
        lr2.visualizza();
    }
    
}
