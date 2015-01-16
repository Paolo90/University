/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esercizio_13_1;

/**
 *
 * @author paolo
 */
public class ThreadPrinter extends Thread{
    private int x;
    private int y;
    public ThreadPrinter(ThreadGroup g, int x, int y){
        this.x=x;
        this.y=y;
    }
    public void run(){
        int m,M;
        if(x<=y){
            m=x;
            M=y;
        }else{
            m=y;
            M=x;
        }
        //synchronized(this.getClass()){
            for(int i=m;i<=M;i++){
            System.out.println(i);
        }
        //}
    }
}
