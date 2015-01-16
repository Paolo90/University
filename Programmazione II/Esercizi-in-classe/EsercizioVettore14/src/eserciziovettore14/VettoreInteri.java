/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eserciziovettore14;

/**
 *
 * @author paolo
 */
public class VettoreInteri {
    int[] vettore;
    VettoreInteri(int n){
        vettore= new int[n];
        for(int i=0;i<n;i++){
            vettore[i]=(int)(Math.random() *10); // senza cast è un double tra 0 e 100 devo mettere parentesi sennò ho tutti 0
        }
    }
    public void visualizza(){
        System.out.print("[");
        for(int i=0;i<vettore.length;i++){
            if(i<vettore.length -1)
                System.out.print(vettore[i]+",");
            else
                System.out.print(vettore[i]);
        }
        System.out.println("]");
    }
    public double media(){
        int somma=0;
        for(int i=0;i<vettore.length;i++){
            somma+=vettore[i];
        }
        return (double)(somma)/vettore.length; // uno è double allora il risultato è double
    }
    public int ricercaIndice(int elem){
        for(int i=0;i<vettore.length;i++){
            if(vettore[i]==elem)
                return i+1;
        }
        return -1;
    }
    int ricercaConWhile(int elem){
        int i=0;
        boolean nonTrovato=true;
        while(nonTrovato==true && i<vettore.length){
            if(vettore[i]==elem)
                nonTrovato=false;
            i++;    
        }
        if(nonTrovato){
               return -1;
        }else{
            return i;
        }    
    }
    int contaValore(int valore){
        int conteggio=0;
        for(int i=0;i<vettore.length;i++){
            if(vettore[i]==valore)
                conteggio++;
        }
        return conteggio;
    }
    void ordina(){ // Bubblesort
        int temp;
        for(int i=0;i<vettore.length-1;i++){ //ordina dal fondo prendendo le coppie
            for(int j=vettore.length -1;j>i;j--){
                if(vettore[j]<vettore[j-1]){
                    temp=vettore[j];
                    vettore[j]=vettore[j-1];
                    vettore[j-1]=temp;
                }
            }
        }
    }
    int cercaSuOrdinato(int valore){  // RICERCA BINARIA RICOSIVA. parto dalla posizione centrale
        int inizio=0;
        int fine=vettore.length-1;
        int indice=-1;
        int mid;
        boolean nonTrovato=true;
        //guardo a partire dal centro del vettore e a seconda del valore cambio inizio e fine
        while((nonTrovato==true) && (inizio < fine)){ //supponiamo che il vettore non sia banale
            mid=(inizio + fine)/2;
            if(valore == vettore[mid]){
                nonTrovato=false;
                indice=mid;
            }else if(valore < vettore[mid]){ //mid viene troncato
                fine=mid-1;
            }else{
                inizio=mid+1;
            }
        }
        if(nonTrovato==true || (inizio==fine))
            return -1;
        else
            return indice +1;
    }
    
    private int ricercaBinariaRic(int valore,int inizio,int fine){
        if(inizio>fine)
            return -1;
        else{
            int mid=(inizio+fine)/2;
            if(vettore[mid]==valore)
                return mid;
            else{
                if(vettore[mid]<valore)
                    return ricercaBinariaRic(valore,mid+1,fine);
                else
                    return ricercaBinariaRic(valore,inizio,mid-1);
            }
        }
    }
    public int ricercaBinariaRic(int valore){
        return ricercaBinariaRic(valore,0,vettore.length-1);
    }
    
    private void quicks (int v[], int inf, int sup) {
        if (inf < sup){
            int mid = partition(v,inf, sup);
            quicks(v, inf,mid-1);
            quicks(v, mid+1,sup);
        }
    }
    
    public void quicks(){
        quicks(vettore, 0,vettore.length -1); // il metodo prende in input le posizioni
    }
    
    private int partition (int v[], int inizio, int fine) { // Java non è come C che cura la disposizione delle funzioni
        int pivot = v[inizio];
        do{
            while (inizio < fine && v[fine] >= pivot){
                fine--;
            }    
            if (inizio < fine){
                v[inizio]=v[fine];
                while (inizio < fine && v[inizio] <= pivot)
                    inizio++;
                if (inizio < fine)
                    v[fine] = v[inizio];
            }
        }while (inizio<fine);
        v[inizio] = pivot;
        return inizio;
    }
    
    private void quicksOttimizzato (int v[],int inf, int sup) {
        if (inf < sup){
            int mid = partition(v,inf, sup);
            if(mid-1-inf< sup-mid-1){ 
                quicksOttimizzato(v,inf,mid-1);// controlla prima il sottovettore più corto
                quicksOttimizzato(v, mid+1,sup);// e poi quello che resta
            }else{
                quicksOttimizzato(v, mid+1,sup);
                quicksOttimizzato(v,inf,mid-1);
            }
        }
    }
    
    public void quicksOttimizzato(){
        quicksOttimizzato(vettore,0,vettore.length -1);
    }
    
    private void hanoi(int N, String S, String I, String D){ // numero con N il disco più in basso
        if(N==1)
            trasferisci(N,S,D);
        else{
            hanoi(N-1,S,D,I);
            trasferisci(N,S,D);
            hanoi(N-1,I,S,D);
        }
    }
    
    private void trasferisci(int N,String S, String D){
        System.out.println("Sposto il disco " + N + " da " + S + " a " + D);
    }
    
    public void hanoi(int dischi){
        hanoi(dischi,"sorgente","intermedio","fine");
    }
    
    void quicksortNR(int v[]){
        Pila p=new Pila(); // istanzia oggetto senza assegnare i valori agli attributi (pila vuota)
        int inizio, fine, mid;
        p.inserisci(0, v.length-1); // il primo compito è ordinare tutto il vettore
        Elemento e;
        while((e = p.estrai())!=null){ // finché la pila non è vuota, cioè finché ho da fare compiti
            inizio=e.inizio;
            fine=e.fine;
            mid=partition(v,inizio,fine);
            if(inizio < mid-1) // ho un sottovettore sinistro di almeno due elementi
                p.inserisci(inizio,mid-1); // aggiungo un altro compito
            if(mid +1 < fine) // ho un sottovettore destro di almeno due elementi
                p.inserisci(mid+1, fine);
        }
        System.out.println("Lunghezza massima della pila " + p.lunghezzaMassima);
    }
    
    void quicksortNR(){
        quicksortNR(vettore);
    }

    
}
