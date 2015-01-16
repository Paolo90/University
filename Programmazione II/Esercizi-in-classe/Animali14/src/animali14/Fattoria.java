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
public class Fattoria { // struttura dati polimorfa
  Animale recinto[];
  Fattoria(){
      recinto = new Animale[4];
      recinto[0]=new Cane("Rex",5);
      recinto[1]=new Gatto("Silvestro",3);
      recinto[2]=new Gallina(2,2);
      recinto[3]=new Mucca(5,200);
  }
  
  void visitaRecinto(){
      for(int i=0;i<4;i++){
          recinto[i].mostra(); // l'interprete legge il valore di recnto[i] e usa il metodo appropriato (late binding)
          recinto[i].verso(); // ho errore di compilazione se la classe animale non ha il metodo verso
          System.out.println(" ");
      }
  }

}
