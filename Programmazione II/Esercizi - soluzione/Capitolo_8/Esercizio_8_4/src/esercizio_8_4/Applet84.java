/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esercizio_8_4;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Image;
import java.awt.Graphics;

/**
 *
 * @author paolo
 */
public class Applet84 extends Applet implements Runnable{
    Image img;
    Thread th;
    boolean attivo;
    int xpos;
    int ypos;
    int xcentro=150;
    int ycentro=150;
    final int RAGGIO=50;
    double t=0;
    final int SLEEP=100; //costante
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        this.setBackground(Color.white);
        img = getImage(getCodeBase(),"/home/paolo/Pictures/pallone.jpeg");
        SensoreMouseEsterno m=new SensoreMouseEsterno(this);
        this.addMouseListener(m);
    }
    public void run(){
        while(true){
            repaint();
            xpos=(int)(xcentro+RAGGIO*Math.cos(t));
            ypos=(int)(ycentro+RAGGIO*Math.sin(t));
            t+=0.3;
            if(t>=2*Math.PI)
                t=0;
            try{
                Thread.sleep(SLEEP);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public void start(){
        if(th==null){
            th=new Thread(this);
            th.start();
            attivo=true;
        }
    }
    public void stop(){
        if(th!=null){
            attivo=false;
            th.interrupt();
            th=null;
        }
    }
    public void destroy(){
        System.out.println("Sto chudendo l'applet.");
    }
    public void paint(Graphics g){
        if(img!=null)
            g.drawImage(img, xpos, ypos, 30, 30, this);
    }    
}
