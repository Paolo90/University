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
public class SensoreMouse extends MouseAdapter{
    AppletMouseII theApp;
    // inserisco nel costruttore un riferimento all'applet
    SensoreMouse(AppletMouseII applet){
        theApp=applet;
    }
    // ridefinisco solo i metodi che mi servono
    public void mouseEntered(MouseEvent e){
        theApp.vx=0;
        theApp.vy=0;
        theApp.xpos=e.getX();
        theApp.ypos=e.getY();
    }
    public void mouseExited(MouseEvent e){
        theApp.xpos=e.getX();
        theApp.ypos=e.getY();
        theApp.vx=2;
        theApp.vy=2;
    }
}
