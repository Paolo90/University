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
public class Menu {
    Pietanza V[];
    boolean b;
    Menu(int n, int m){
        V=new Pietanza[m+n];
        for(int i=0;i<m+n;i++){
            if(i<n)
                V[i]=new Carne("Carne "+i, (int)(Math.random()*200), (int)(Math.random()*350));
            else{
                double l=(int)(Math.random()*2);
                if(l==0)
                    b=false;
                else
                    b=true;
                V[i]=new Verdura("Verdura "+i, (int)(Math.random()*75),b);
            }    
        }
    }
    int trovaCosto(double c){
        int conta=0;
        for(int i=0;i<V.length;i++){
            if(V[i].costo()<c)
                conta++;
        }
        return conta;
    }
    void mostra(){
        for(int i=0;i<V.length;i++){
            System.out.println("Nome: "+V[i].nome);
            System.out.println("Calorie: "+ V[i].calorie);
            if(V[i] instanceof Carne)
                System.out.println("Peso: "+((Carne)V[i]).peso);
            else
                System.out.println("Prodotto italiano? "+((Verdura)V[i]).prodottoItaliano);
            System.out.println("Costo: "+V[i].costo());
        }
    }
}
