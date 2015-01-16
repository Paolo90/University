/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serveresercizio_2;

/**
 *
 * @author paolo
 */
public class Accumulatore {
    private int somma=0;
    private double media=0;
    private int ricevuti=0;
    public int getSomma(){
        return somma;
    }
    public double getMedia(){
        return media;
    }
    synchronized public void setSomma(int n){
        somma+=n;
    }
    public void setMedia(){
        if(ricevuti>0)
            media=(double)somma/ricevuti;
        else
            System.out.println("Nessun valore ricevuto");
    }
    public void setRicevuti(int n){
        ricevuti+=n;
    }
    public int getRicevuti(){
        return ricevuti;
    }
}
