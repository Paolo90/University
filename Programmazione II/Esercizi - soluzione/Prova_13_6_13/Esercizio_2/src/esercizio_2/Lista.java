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
public class Lista {
    Elemento testa=null;
    Lista(int n){
        for(int i=0;i<n;i++){
            testa=new Elemento(" ",testa);
        }
    }
}
