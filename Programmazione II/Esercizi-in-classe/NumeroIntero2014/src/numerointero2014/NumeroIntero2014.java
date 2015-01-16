/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package numerointero2014;

/**
 *
 * @author User
 */
public class NumeroIntero2014 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(" Oggetti creati =  "+ Intero.getContaOggetti());
        Intero numero;
        numero=new Intero(221);
         System.out.println(" Oggetti creati =  "+ Intero.getContaOggetti());
         
         //numero.contaOggetti=100; //Il private non me la fa usare
        
        Intero numero1 = new Intero(337);
  System.out.println(" Oggetti creati =  "+ Intero.getContaOggetti());
        
        Intero numero2;
    
        System.out.println(numero.n + " è primo? "+ numero.numeroPrimo());
        System.out.println("5^4 ="+ numero.potenza(5, 4));
        
        System.out.println(numero1.n + " è primo? "+ numero1.numeroPrimo());
        System.out.println("2.2^4 ="+ numero1.potenza(2.2, 4));
        
//        System.out.println(numero2.n + " è primo? "+ numero2.numeroPrimo());
        System.out.println("3.3^4 ="+ Intero.potenza(3.3, 4));
        
        System.out.println("107 è primo? "+Intero.numeroPrimo(107));
        
        //  II parte
        
        System.out.println("Il fattoriale iterativo di 5 è "+Intero.fattorialeI(5));
        System.out.println("Il fattoriale ricorsivo di 5 è "+Intero.fattorialeR(5));
        System.out.println("3.3^4 ="+ Intero.potenzaR(3.3, 4));
        System.out.println("3.3^4 ="+ Intero.potenza2R(3.3, 4));
        System.out.println("Il nono numero di fibonacci ricorsivo è "+Intero.fiboR(9));
        System.out.println("Il nono numero di fibonacci iterativo è "+Intero.fiboI(9));
        System.out.println("Il quinto numero di fibonacci iterativo ottimizzato è "+Intero.fiboIOtt(5));
    }
}
