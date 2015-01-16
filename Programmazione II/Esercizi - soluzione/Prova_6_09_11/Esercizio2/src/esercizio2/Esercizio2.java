/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esercizio2;

/**
 *
 * @author paolo
 */
public class Esercizio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista l=new Lista(10);
        Elemento e=l.testa;
        while(e!=null){
            System.out.print(e.n);
            e=e.next;
        }
        System.out.println(" ");
        e=l.elimina(5);
        while(e!=null){
            System.out.print(e.n);
            e=e.next;
        }
        System.out.println(" ");
    }
    
}
