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
public class AnimaleDomestico extends Animale{
    String nome;
    AnimaleDomestico(String nome, int e){
        super(e); // SONO IN UNA SOTTOCLASSE
        this.nome = nome;
    }

    void mostra(){ //overriding: ridefinisco scrivendo sia nome che età
        System.out.println("mi chiamo "+nome);
        //System.out.println("e ho "+eta+" anni");
        super.mostra(); // faccio le cose che facevo nella sovraclasse
    }

}
