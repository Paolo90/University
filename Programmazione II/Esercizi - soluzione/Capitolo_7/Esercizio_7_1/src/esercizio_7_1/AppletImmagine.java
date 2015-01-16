/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esercizio_7_1;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

/**
 *
 * @author paolo
 */
public class AppletImmagine extends Applet implements Runnable{

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    Image palla;
    int xpos=5;
    int ypos=5;
    int vx=3;
    int vy=3;
    int iwidth=30;
    int iheight=30;
    Thread t;
    boolean attivo;
    
    public void init() {
        this.setBackground(Color.white);
        palla=getImage(getCodeBase(),"/home/paolo/Pictures/pallone.jpeg");
        iheight=palla.getHeight(this);
        iwidth=palla.getWidth(this);
        System.out.println(iwidth +""+iheight); //-1 perchè non ha caricato img
    }
    public void paint(Graphics g){
        if(palla!=null){
            iheight=palla.getHeight(this);
            iwidth=palla.getWidth(this);
            //System.out.println(iwidth +""+iheight);
            g.drawImage(palla, xpos, ypos, iwidth, iheight, this); // a grandezza ridotta
        }
    }
    public void run(){
        while(true){
            repaint();
            xpos+=vx;
            ypos+=vy;
            if(xpos<=0 || xpos+iwidth>=this.getWidth()){
                vx=-vx;
            }
            if(ypos <=0 || ypos+iheight >=this.getHeight())
                vy=-vy;
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public void start(){
        
        if(t==null){
            t=new Thread(this); // crea il processo associato all'animazione
            t.start(); //richiama il metodo run()
            attivo=true;
        }
    }
    public void stop(){
        if(t!=null){
            t.interrupt();
            t=null;
            attivo=false;
        }
    }
    
    // TODO overwrite start(), stop() and destroy() methods
}
