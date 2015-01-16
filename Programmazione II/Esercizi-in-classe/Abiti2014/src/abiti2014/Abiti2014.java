/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package abiti2014;

/**
 *
 * @author paolo
 */
public class Abiti2014 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Magazzino m=new Magazzino(20);
        System.out.println(m.costoMassimo("Paese 1", 48));
        System.out.println(m.conta(90));
        System.out.println(m.cerca("Paese 1", 48));
    }
    
}
