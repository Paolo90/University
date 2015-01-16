/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esercizioliste14;

/**
 *
 * @author paolo
 */
public class Lista {
    Elemento testa=null; // la lista è individuata dal primo elemento
    // definisco un metodo costruttore
    private int lunghezza=0; // la nascondo per proteggermi da modifiche errate da parte dell'utente
    public Lista(int n){
        // costruisco elemento e lo riempio
        for(int i=0;i<n;i++){
            testa=new Elemento((int)(Math.random()*10),testa);
            // lunghezza++;
            // gli elementi compaiono in ordine inverso perché sposto la testa
            // ad ogni iterazione
        }
        lunghezza=n;
    }
    
    void visualizza(){ // prende in input tutto il blocco (info + rifer)
        Elemento e=testa;
        while(e!=null){ // non stampa l'ultimo se scrivo e.next Per fare con e.next inizializzo un booleano
            System.out.print(e.valore + " ");
            e=e.next;
        }
        System.out.println("");
    }
    
    void visualizzaFor(){ // prende in input tutto il blocco (info + rifer)
        Elemento e=testa;
        for(;e!=null;e=e.next){ // non stampa l'ultimo se scrivo e.next Per fare con e.next inizializzo un booleano
            System.out.print(e.valore + " ");
            //e=e.next;
        }
        System.out.println("");
    }
    
    private void visualizzaR(Elemento e){ // ho bisgno di un parametro che mi dice su quale parte di lista devo lavorare 
        // il parametro è dato in modo tale che la lista sia individuata dal primo elemento
        if(e==null)
            System.out.println("");
        else{
            System.out.print(e.valore + " ");
            visualizzaR(e.next);
        }                  
    }
    
    void visualizzaR(){ 
        visualizzaR(testa);                 
    }
    
    int sommaI(){
        int S=0;
        Elemento e=testa;
        while(e!=null){
            S+=e.valore;
            e=e.next;
        }
        return S;
    }
    
   private int sommaR(Elemento e){
        if(e==null)
            return 0; // se la lista è vuota il risultato è zero
        else{
            return e.valore+sommaR(e.next);
        }
    }
   
   public int sommaR(){
       return sommaR(testa);
   }
   
   //   II parte esercizio
   
   public boolean cercaElemento(int valore){
       Elemento e;
       for(e=testa;e!=null;e=e.next){
           if(e.valore==valore)
               return true;
       }
       return false;
   }
   
   private boolean cercaElementoR(int valore, Elemento primo){ // può essere definito statico perché non agisce sulle proprietà dell'oggetto
       if(primo==null){
           return false;
       }else{
           if(primo.valore==valore)
               return true;
           else
               return cercaElementoR(valore,primo.next);
       }
   }   
       
    public boolean cercaElementoR(int valore){ // non può essere statico perché testa appartiene all'oggetto
        return cercaElementoR(valore,testa);
    }
    
    public int contaElementi(){
        /*
        Elemento e;
        int conta=0;
        for(e=testa;e!=null;e=e.next){
            conta++;
        }
        return conta;
        */
        return lunghezza; // sostituisco un metodo di complessità lineare con uno a complessità costante
    }
    
    private int contaElementiR(Elemento primo){
        if(primo == null){
            return 0;
        }else{
            return (1+contaElementiR(primo.next));
        }
    }
    
    public int contaElementiR(){ // sovraccarico
        return contaElementiR(testa);
    }
    
        public int getLunghezza(){
        return lunghezza;
    }
    
    public void inserisciElemento(int valore){ // il parametro è il nuovo valore da inserire
        Elemento e=new Elemento(valore,testa);        
        testa=e;
        lunghezza++;
    }
    
    public boolean cancellaElemento(int valore){ //metto boolean per trattare il caso in cui l'elemento da cancellare non è presente nella lista
        boolean temp=false; //la cancellazione è avvenuta o no ?
        Elemento e,f;
        while(testa!=null && testa.valore == valore){
            testa=testa.next;
            lunghezza--;
            temp=true; // cancellazione avvenuta !!!
        }
        if(testa!=null){
            for(e=testa;e!=null;e=e.next){ // così sono sicuro che il primo non va cancellato
                /*
                if(e.next.valore == valore){
                    e.next=e.next.next;
                    lunghezza--;
                    temp=true;
                }else{
                    e=e.next;
                }
                */
                f=e;
                while(f.next!=null && f.next.valore == valore){
                    f=f.next;
                    lunghezza--;
                    temp=true;
                }
                e.next=f.next;
            }
        }
        return temp;
    } // ricorreggi
    
    public Lista listaInversa(){
        // creo una lista vuota e ci metto i valori della lista data (quella originale)
        // l'inserimento per testa produce un ordine invertita
        Lista l = new Lista(0);
        for(Elemento e= testa;e!=null;e=e.next){
            l.inserisciElemento(e.valore);
        }
        return l;
    }
    
    public int conta (int n){
        int somma=0;
        for(Elemento e=testa;e!=null;e=e.next){
            if(e.valore % 2 ==0)
                e.valore+=n;
            else
                somma+=e.valore;
        }
        return somma;
    } // complessità lineare: tante operazioni quanti elementi della lista
    
    boolean verifica(int n){
        int pos=1;
        int cont=0; // conta elementi trovati
        Elemento e=testa;
        boolean trovato =false;
        while(e!=null && !trovato){ //cont < n
            if(e.valore==pos)
                cont++;
            if(cont >= n)
                trovato = true;
            else
                pos++;
            e=e.next;
        }
        return trovato;
    } // complessità lineare. Ci fermiamo appena trovata la risposta.
    
    private Lista rovesciaR(Elemento testa){
        if(testa==null)
            return new Lista(0); //non metto null perché devo restituire un oggetto Lista
        else{
            // ordino la restante parte della lista e inserisco in coda il primo elemento
            Lista risultato = rovesciaR(testa.next); // produce una variabile perché ha un valore di ritorno
            risultato.inserisciInCoda(testa.valore);
            return risultato;
        }
    }
    
    public Lista rovesciaR(){
        return rovesciaR(testa);
    }
    
    private void inserisciInCoda(int n, Elemento testa){ // versione ricorsiva
        if(testa.next==null){
            testa.next=new Elemento(n,null); // non ha effetto sull'ambiente esterno se metto testa.
            // se faccio questa operazione su una lista vuota, allora essa rimane vuota. Il passaggio
            // dei parametri non è per riferimento ma per valore. Devo modificare la proprietà. Allora
            //lavoro su testa.next. Se modificavo solo testa modificavo un riferimento e non va bene.
            // In questo modo preservo i collegamenti (se usavo solo testa non li preservavo).
        }else{
            inserisciInCoda(n,testa.next);
        }
    }
    
    public void inserisciInCoda(int n){
        if(testa==null){
            testa=new Elemento(n,testa); // non modifico il parametro testa ma una proprietà dell'oggetto
        }else{
            inserisciInCoda(n,testa);
        }    
    }
    
    public Lista rovesciaR2(Elemento testa, Lista L){ // algoritmo lineare
        if(testa == null)
            return L; //mi attacco a una lista L generica
        else{
            L.inserisciElemento(testa.valore);// inserisco in testa gli elementi (ordine invertito)
            rovesciaR2(testa.next,L);
            return L;
        }
    }
    
    public Lista rovesciaR2(){
        if(testa == null)
            return new Lista(0);
        else{
            return rovesciaR2(testa,new Lista(0)); // inserisco in testa gli elementi della lista originale
        }
    }
   
        
}
