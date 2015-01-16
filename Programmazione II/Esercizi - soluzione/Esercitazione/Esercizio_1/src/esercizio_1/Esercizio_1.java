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
        Pietanza c=new Carne("Fettina", 150, 100);
        System.out.println("La pietanza "+c.nome+" conta "+c.calorie+" calorie e ha un peso di "+((Carne)c).peso +" grammi.");
        System.out.println("Costo: "+c.costo());
        Pietanza v=new Verdura("Carciofo", 50, false);
        System.out.println("La pietanza "+v.nome+" conta "+v.calorie+" calorie. Prodotto italiano "+((Verdura)v).prodottoItaliano);
        System.out.println("Costo: "+v.costo());
        System.out.println("-----------------------------");
        Menu m=new Menu(3,4);
        m.mostra();
        System.out.println("Numero pietanze= "+m.trovaCosto(33.68));
    }
    
}
