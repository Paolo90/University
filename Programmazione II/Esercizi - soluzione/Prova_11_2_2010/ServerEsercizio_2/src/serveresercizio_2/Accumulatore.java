/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serveresercizio_2;

/**
 *Il metodo getPari() deve essere sincronizzato perché non voglio che legga mentre la lista viene
 * modificata. Dato che tutti i thread accedono alla lista, voglio che lo facciano in modo
 * sincronizzato. 
 */
public class Accumulatore {
    Lista l; // lista vuota
    Accumulatore(Lista l){
        this.l=l;
    }
    public synchronized void setElemento(Thread t){
        l.testa=new Elemento(t.getName(),l.testa);
    }
    public synchronized void setPari(){
        l.testa.totValoriPari++;
    }
    public synchronized void getPari(){
        for(Elemento e=l.testa;e!=null;e=e.next){
            System.out.println("Il thread "+e.nomeThread+" manda "+e.totValoriPari+" valori pari");
        }
    }
}
