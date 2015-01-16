/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esercizio_2;

/**
 *
 * @author paolo
 */
public class Esercizio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n=8;
        Lista l=new Lista(n);
        Elemento e;
        int i=0;
        for(e=l.testa;e!=null;e=e.next){
            e.s=args[i];
            System.out.print(e.s + " ");
            i++;
        }
    }
    
}
