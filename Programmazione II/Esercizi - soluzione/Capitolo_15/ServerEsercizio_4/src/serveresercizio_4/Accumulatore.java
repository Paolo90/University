/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serveresercizio_4;

/**
 *Osservazione: quando richiamerò i metodi di incremento devo stare attento.
 * Infatti, ogni nuovo client istanzia un accumulatore diverso se metto il costruttore dentro il
 * while(true). Per usare l'assegnamento devo mettere il costruttore fuori dal ciclo while(true).
 * Il ciclo in questione sta nella classe ServerEsercizio_4.
 */
public class Accumulatore {
    private int somma=0;
    void incrementa(int increase){
        somma+=increase;
    }
    int getSomma(){
        return somma;
    }
}
