/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esercizio_8_6;
import java.awt.event.*;
/**
 *
 * @author paolo
 */
public class SensoreEsterno extends KeyAdapter{
    Applet86 theApp;
    
    SensoreEsterno(Applet86 theApp){
        this.theApp=theApp;
    }
    
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        switch(key){
            case KeyEvent.VK_ENTER:
                theApp.repaint();
                break;
            default:
                theApp.n++;
        }
    }
    
}
