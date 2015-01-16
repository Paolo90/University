/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eserciziovettore14;

/*  PILA NEL CONTESTO QUICKSORT NON RICORSIVO
 *  L'utilizzo della pila nel contesto di quicksort non ricorsivo è il seguente:
 *  ammucchio i compiti da svolgere uno sopra l'altro
 *  dove quello in cima (in testa) rappresenta quello con più priorità. Finché la pila non
 *  è banale aumento i compiti da fare su dimensioni più basse e una volta arrivati al caso
 *  terminale risolvo in fila i compiti. 
 * 
 */
public class Pila { // una pila è una lista con metodi di inserimento ed estrazione
    Elemento testa=null;
    int lunghezza=0; // lunghezza attuale della pila
    int lunghezzaMassima=0; // lunghezza massima che la pila assume
    
    void inserisci(int inizio, int fine){ // inserisce un elemento in testa
        testa=new Elemento(inizio,fine,testa);
        lunghezza++;
        if(lunghezza > lunghezzaMassima)
            lunghezzaMassima=lunghezza;
    }
    
    Elemento estrai(){ // estraggo in testa tutto il blocco perché devo leggere due informazioni
        if(testa==null)
            return null;
        else{
            Elemento e=testa; //mi salvo il valore di testa in questa variabile
            testa=testa.next; // sposto il riferimento della testa eliminando il primo elemento
            lunghezza--;
            return e; /* ritorno la posizione della testa originale. Non è stata alterata quando
            ho scritto testa = testa.next perché questa cambia solo il valore di testa ma non di e
            in quanto ricordiamo che java opera con il passaggio per valore e non per riferimento
            */
        }
    }
}
