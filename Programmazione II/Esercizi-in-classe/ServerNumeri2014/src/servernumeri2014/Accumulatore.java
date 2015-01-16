/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servernumeri2014;

/**
 *
 * @author paolo
 */
public class Accumulatore {
    private int somma=0;
    private int contatore=0;
    synchronized void incrementa(int sommaParziale, int ricevuti){
        somma+=sommaParziale;
        contatore+=ricevuti; // per garantire il parallelismo mando direttamente il pacchetto per accedere al dato sincronizzato il meno possibile perché si creano colli di bottiglia
    }
    int getSomma(){
        return somma;
    }
    double getMedia(){
        if(contatore==0){
            System.out.println("Nessun elemento");
            return 0;
        }else{
            return (double)somma/contatore;
        }
    }
}