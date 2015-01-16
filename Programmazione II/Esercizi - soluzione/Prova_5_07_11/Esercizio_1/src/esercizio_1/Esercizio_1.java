/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esercizio_1;

/**
 *
 * @author paolo
 */
public class Esercizio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TennisMan t1;
        t1=new TennisMan("Federer", 32, 150);
        System.out.println(t1.nome + " ha "+t1.eta+" anni e ha vinto "+t1.tornei_vinti+" tornei e ha un punteggio di " +t1.punteggio());
        TennisGirl t2;
        t2 = new TennisGirl("Sharapova",25, 86.47);
        System.out.println(t2.nome + " ha "+t2.eta+" anni e ha una percentuale vittorie di "+t2.percentuale_vittorie+" . Ha un punteggio di " +t2.punteggio());
        Tabellone tab;
        tab = new Tabellone(10);
        System.out.println("Il punteggio massimo del tabellone è "+tab.punteggioMassimo(30));
    }
    
}
