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
public class Museo {
    Opera museo[];
    Museo(int n){
        museo=new Opera[n];
        int p=n/3*2;
        int i;
        for(i=0;i<p;i++){
            museo[i]=new Pittura("Autore ", (int)(Math.random()*2014), Math.random()*500);
            System.out.println("Anno " + museo[i].anno);
            System.out.println("Autore " + museo[i].autore);
            System.out.println("Superficie " + ((Pittura)museo[i]).superficie);
            System.out.println("Costo " + museo[i].costoRestauro());
        }
        for(;i<n;i++){
            museo[i]=new Scultura("Autore ", (int)(Math.random()*2014), Math.random()*1000);
            System.out.println("Anno " + museo[i].anno);
            System.out.println("Autore " + museo[i].autore);
            System.out.println("Peso " + ((Scultura)museo[i]).peso);
            System.out.println("Costo " + museo[i].costoRestauro());
        }
    }
    
    double costoMassimo(){
        double C=0;
        for(int i=0;i<museo.length;i++){
            double costo_attuale= museo[i].costoRestauro();
            if(costo_attuale > C)
                C=costo_attuale;
        }
        return C;
    }
}
