/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esercizio_8_7;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
/**
 *
 * @author paolo
 */
public class Applet87 extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    /*
    String s1="Tizio";
    String s2="Caio";
    String s3="Sempronio";
    
    int xpos1=50, ypos1=50, xpos2=100, ypos2=50, xpos3=100, ypos3=100;
    int intervalloX1=xpos1+s1.length()*10;
    int intervalloX2=xpos2+s2.length()*10;
    int intervalloX3=xpos3+s3.length()*10;
    int intervalloY1=ypos1+10;
    int intervalloY2=ypos2+10;
    int intervalloY3=ypos3+10;
    */
    int scrittaAttiva;
    Elemento testa=null;
    Elemento scelto=null;
    int conta=1;
    public void init() {
        this.setBackground(Color.red);
        SensoreClick c= new SensoreClick(this);
        SensoreMouseEsterno m=new SensoreMouseEsterno(this);
        addMouseListener(c);
        addMouseMotionListener(m);
    }
    
    public void start(){
        repaint();
    }

    public void paint(Graphics g){
        Elemento e=testa;
        while(e!=null){
            g.drawString(e.s, e.xpos, e.ypos);
            e=e.next;
        }
    }
}
