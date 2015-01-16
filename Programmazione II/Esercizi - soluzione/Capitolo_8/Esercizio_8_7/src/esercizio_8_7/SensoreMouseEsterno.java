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
public class SensoreMouseEsterno extends MouseMotionAdapter{
    
    Applet87 theApp;
    
    SensoreMouseEsterno(Applet87 theApp){
        this.theApp=theApp;
    }
    

    @Override
    public void mouseDragged(MouseEvent e) {
        Elemento el=theApp.scelto;
        if(el!=null){
            el.xpos=e.getX();
            el.ypos=e.getY();
            el.intervalloX=el.xpos+el.s.length()*10;
            el.intervalloY=el.ypos-10;
            theApp.repaint();
        }
    }
 
}
