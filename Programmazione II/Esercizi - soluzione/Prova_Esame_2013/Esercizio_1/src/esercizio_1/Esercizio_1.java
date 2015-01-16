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
        
        Pittura p1=new Pittura("Botticelli", 1530, 250.3);
        double c=p1.costoRestauro();
        System.out.println("Costo restauro "+c);
               
        
        Scultura s1=new Scultura("Michelangelo", 1530, 1720.0);
        double s=s1.costoRestauro();
        System.out.println("Costo restauro " + s);
        
        Museo m1=new Museo(5);
        System.out.println("Costo Massimo = " + m1.costoMassimo());
    }
    
}
