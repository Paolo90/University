/*
 * Main.java
 *
 * Created on 20 gennaio 2009, 9.44
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */


import java.awt.*;
/**
 *
 * @author local
 */
abstract class Elettrodomestici
{  double potenza;
   Color colore;
   public Elettrodomestici(Color colore, double potenza) 
   { this. potenza=potenza;
     this.colore=colore;
   } 
      public abstract double costo();
}   


 class Frigorifero extends Elettrodomestici    
{ int capienza;
   public Frigorifero(Color colore, int capienza, double potenza)
  {     super(colore,potenza);
        this.capienza=capienza;

  }
  public double costo()
  { double mantenimento;
    mantenimento=potenza*capienza;
    return mantenimento;
  }      
}
 class Televisione extends Elettrodomestici
{ int pollici;
  double canone;
  public Televisione(Color colore, int pollici, double canone, double potenza)
  {  super(colore,potenza);
     this.pollici=pollici;
    this.canone=canone;
   
  }   
  public double costo()
  { double mantenimento;
    mantenimento=canone+(potenza*pollici);
    return mantenimento;
  }
 } 
 
class Casa {
    Elettrodomestici []V;
    Casa(int n,int m)
    { V=new Elettrodomestici[n+m];
      for(int i=0;i<n;i++)
       V[i]=new Frigorifero(Color.white,(int)(10*Math.random()), 10*Math.random() );

      for(int i=n;i<n+m;i++)
       V[i]= new Televisione(Color.black,(int)(10*Math.random()), 10*Math.random() , 10*Math.random() );

    } 
    public double somma()
    { double s=0;
      for(int i=0;i<V.length;i++)
          s+=V[i].costo();
      return s;
     
       }
    
}

public class Main {
    public static void main (String[] args) {
	Casa c = new Casa(8, 5);
	System.out.println("totale relativo al mantenimento di tutti gli elettrodomestici: " +c.somma());
	}

}
