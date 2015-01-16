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
public class Magazzino {
    Orologio V[];
    Magazzino(int m, int n){
        V=new Orologio[m+n];
        for(int i=0;i<m;i++){
            V[i]=new Digitale("Marca "+i, Math.random()*60, (int)(Math.random()*6)+1);
        }
        for(int j=m;j<m+n;j++){
            V[j]=new Analogico("Marca "+j, Math.random()*60);
        }
    }
    void mostra(){
        for(int i=0;i<V.length;i++){
            System.out.print(V[i].costo()+" ");
        }
        System.out.println(" ");
    }
    boolean costoComplessivo(){
        double costoAnalogici=0;
        double costoDigitali=0;
        for(int i=0;i<V.length;i++){
            if(V[i] instanceof Analogico)
                costoAnalogici+=V[i].costo();
            else
                costoDigitali+=V[i].costo();
        }
        if(costoAnalogici > costoDigitali)
            return true;
        else
            return false;
    }
}
