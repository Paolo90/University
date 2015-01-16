/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esercizio_8_4;
import java.awt.event.*;
/**
 *
 * @author paolo
 */
public class SensoreMouseEsterno extends MouseAdapter{
    Applet84 theApp;
    SensoreMouseEsterno(Applet84 theApp){
        this.theApp=theApp;
    }
    public void mouseClicked(MouseEvent e){
        theApp.xcentro=e.getX();
        theApp.ycentro=e.getY();
    }
}
