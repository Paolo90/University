/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appletpallina2014;
import java.awt.event.*;
/**
 *
 * @author paolo
 */
public class SensoreTastiera extends KeyAdapter{
    
    AppletPallina applet; // la passo come parametro al costruttore
    
    SensoreTastiera(AppletPallina applet){
        this.applet=applet;
    }
    
    public void keyPressed(KeyEvent e){
        // controllo quale evento è accaduto nel parametro del metodo
        int code = e.getKeyCode(); // dice il codice ascii del tasto premuto
        if(code == KeyEvent.VK_DOWN){
            // prendo la palla che è nella classe AppletPallina
            // il sensore ha bisogno di un riferimento all'applet
            // quindi definisco nel sensore una proprietà che rappresenta l'applet di classe
            // AppletPallina. Solidale al sistema di riferimento
            applet.palla.vy++;
        }else if(code == KeyEvent.VK_UP){
            applet.palla.vy--;
        }
        if(code == KeyEvent.VK_RIGHT){
            applet.palla.vx++;
        }else if(code == KeyEvent.VK_LEFT){
            applet.palla.vx--;
        }
    }
}
