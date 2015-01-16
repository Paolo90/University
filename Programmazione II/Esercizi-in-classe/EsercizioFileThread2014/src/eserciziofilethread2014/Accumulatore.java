/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eserciziofilethread2014;

/**
 *
 * @author paolo
 */
public class Accumulatore {
    private int numeroElementi=0; //uso l'icapsulazione
    private double somma=0; //uso l'icapsulazione
    synchronized public void incremento(double sommaTh, int numeroTh){
        somma+=sommaTh;
        numeroElementi+=numeroTh;
    }
    public double media(){ // deve essere sincronizzato perché non voglio ch un thread mi modifichi uno di quei valori
        if(numeroElementi==0){
            System.out.println("Nessun elemento ");
            return 0; // mentre faccio il calcolo nessun thread modifica gli operandi
        }else{
            return somma/numeroElementi;
        }
    }
}
