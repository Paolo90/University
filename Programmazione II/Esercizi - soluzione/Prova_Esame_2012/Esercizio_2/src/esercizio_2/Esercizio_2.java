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
        Lista l=new Lista();
        String path="/home/paolo/Documents/esame.txt";
        l.leggiFile(path);
        int min=l.minimoLista();
        System.out.println("Il minimo della lista è "+min);
    }
    
}
