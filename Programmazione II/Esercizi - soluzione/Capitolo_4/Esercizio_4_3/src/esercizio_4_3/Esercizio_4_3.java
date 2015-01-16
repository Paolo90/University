/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esercizio_4_3;

/**
 *
 * @author paolo
 */
public class Esercizio_4_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Giocatore g= new Portiere("Abbiati", 35, 0);
        System.out.println("Nome: "+g.nome+", età: "+g.eta+", rigori parati: "+((Portiere)g).rigoriParati);
        Attaccante a=new Attaccante("Pazzini", 30, 12);
        System.out.println("Nome: "+a.nome+", età: "+a.eta+", gol segnati: "+a.golSegnati);
        Squadra Milan=new Squadra(3,6);
        Milan.mostra();
        System.out.println("Giocatore più costoso "+Milan.giocatorePiuCostoso());
    }
    
}
