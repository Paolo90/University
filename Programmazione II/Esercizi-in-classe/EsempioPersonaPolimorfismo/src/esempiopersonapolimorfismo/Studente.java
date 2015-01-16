/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esempiopersonapolimorfismo;

/**
 *
 * @author paolo
 */
public class Studente extends Persona {
    String facolta;
    int matricola;
    Studente (String name, int age, String f, int m) {
        super(name, age);
        facolta = f;
        matricola = m;
    }
    
    
}
