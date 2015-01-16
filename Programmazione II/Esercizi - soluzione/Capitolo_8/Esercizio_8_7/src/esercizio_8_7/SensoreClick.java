/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esercizio_8_7;
import java.awt.event.*;
/**
 *
 * @author paolo
 */
public class SensoreClick extends MouseAdapter{
    Applet87 theApp;
    SensoreClick(Applet87 theApp){
        this.theApp=theApp;
    }
    public void mouseClicked(MouseEvent e) {
        if(e.getButton()==3){ //corrisponde al tasto destro del mouse
            System.out.println("Tasto destro cliccato");
            theApp.testa=new Elemento("Stringa"+theApp.conta, e.getX(), e.getY(), theApp.testa); 
            theApp.conta++;
            theApp.repaint();
        
            for(Elemento el=theApp.testa;el!=null;el=el.next){
                System.out.println(el.xpos+" "+el.ypos+" "+el.intervalloX+" "+el.intervalloY);
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        theApp.scelto=null;
        if(e.getButton()==1){ //corrisponde al tasto sinistro del mouse
            Elemento el=theApp.testa;
            while(el!=null){
                System.out.println("Tasto sinistro cliccato");
                if(e.getX()>=el.xpos && e.getX()<=el.intervalloX && e.getY()>=el.intervalloY && e.getY()<=el.ypos){
                    theApp.scelto=el;
                    break;
                }else{
                    System.out.println("Al prossimo");
                    el=el.next;
                }
            }
        }
    }
    
    
}
