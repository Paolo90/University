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
public class Magazzino {
    Abito V[];
    int k;
    Magazzino(int n){
        V=new Abito[n]; // prima di tutto costruisco il vettore e poi lo riempio
        // non ho problemi perché non richiamo il costruttore di abito ma il costruttore dei vettori
        int i, k;
        for(i=0;i<n/2;i++){
              V[i]=new AbitoCotone((int)(Math.random()*20)+40,"Paese "+i,(int)(Math.random()*8));
        }
        for(;i<n;i++){ //riparte da n/2
            k=(int)(Math.random()*2);
            if(k==0) //posso evitarlo così: (i%2==0?true:false)
                //oppure uso la classe java.util.Random r = new Random();
                //V[i]=new AbitoLana((int)(Math.random()*20)+40,"Paese "+i,r.nextboolean());
                V[i]=new AbitoLana((int)(Math.random()*20)+40,"Paese "+i,false);
            else
                V[i]=new AbitoLana((int)(Math.random()*20)+40,"Paese "+i,true);
        }
    }
    double costoMassimo(String nazione, int taglia){ // sono definite nella sovraclasse allora sono visibili dal compilatore
        double c=0;
        for(int i=0;i<V.length;i++){
            if(V[i].paese.equals(nazione) && V[i].taglia==taglia && V[i].costo() > c){
                c=V[i].costo(); // se V[i].costo() impiega parecchio tempo posso memorizzarla in una variabile
                // il calcolo avviene una volta sola invece di due
            }
        }
        return c;
    }
    int conta(double n){
        int c=0;
        for(int i=0;i<V.length;i++){
            //c=(V[i].costo()>n)?(c++):(c+=0);
            if(V[i].costo()>n)
                c++;
        }
        return c;
    }
    boolean cerca(String nazione, int taglia){
        boolean b=false;
        int i=0;
        while(i<V.length && b==false){ // prima sempre l'esistenza --- !b al posto di b==false
            if(V[i].paese.equals(nazione) && V[i].taglia==taglia)
                b=true;
            else
                i++;
        }
        return b;
    }
}
