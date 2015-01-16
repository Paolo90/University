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
        Abitazione c=new Casa(600,6,false);
        Abitazione d=new Castello(1500,30,13);
        System.out.println(c.stanze +" "+c.superficie+" "+((Casa)c).pannelliSolari+" "+c.valuta());
        System.out.println(d.stanze +" "+d.superficie+" "+((Castello)d).secoloCostruzione+" "+((Castello)d).valuta());
        
    }
    
}
