/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esercizio_8_2;
import java.awt.event.*;
/**
 *
 * @author paolo
 */
public class SensoreMovimento extends MouseMotionAdapter{
    AppletMouseII theApp;
    SensoreMovimento(AppletMouseII applet){
        theApp=applet;
    }
    public void mouseMoved(MouseEvent e){
        theApp.xpos=e.getX();
        theApp.ypos=e.getY();
    }
}
