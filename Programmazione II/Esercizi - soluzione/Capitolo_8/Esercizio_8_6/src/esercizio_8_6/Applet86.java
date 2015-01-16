/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esercizio_8_6;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author paolo
 */
public class Applet86 extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    int n=0;
    public void init() {
       this.setBackground(Color.red);
       SensoreEsterno k=new SensoreEsterno(this);
       addKeyListener(k);
    }
    public void start(){
        repaint();
    }
    public void paint(Graphics g){
        g.drawString("Numero di tasti premuti = "+n, this.getWidth()/2, this.getHeight()/2);
    }
    
}
