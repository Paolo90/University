/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package animali14;

/**
 *
 * @author paolo
 */
public class Animale {
    int eta;
    void mostra(){
        System.out.println("io ho "+eta+" anni");
    }
    Animale (int e){
        eta = e; 
    }
    
    void verso(){
        System.out.println("Sono un animale e sto zitto"); // non viene visto perché chiamo 
        // quelli delle sottoclassi
    }
        
 }
