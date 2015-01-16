/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esercizio_8_5;

import java.applet.Applet;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;
/**
 *
 * @author paolo
 */
public class Applet85 extends Applet implements KeyListener{
    int n=0;
    int m=0;
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void start() {
        this.addKeyListener(this);
        setBackground(Color.red);
        //Label l=new Label("numero tasti premuti",Label.CENTER);
        //l.setBackground(Color.green);
        //add(l);
        setFont(new Font ("Helvetica", Font.BOLD, 14));
        
       // l.addKeyListener(this);
    }
    
    // TODO overwrite start(), stop() and destroy() methods
    public void stop(){
        System.out.println("n= "+n);
        System.out.println("m= "+m);
        System.out.println("Interruzione");
    }
    public void paint(Graphics g){
        g.drawString(String.valueOf(n), 100, 100);
    }
    // metodi della tastiera
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key=e.getKeyCode();
        switch(key){
            case KeyEvent.VK_ENTER:
                n=m;
                break;
            default:
                m++;
        }
        repaint();
        System.out.println(m);
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }   
}