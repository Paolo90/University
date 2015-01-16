/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esercizio_8_1;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.event.*;
/**
 *
 * @author paolo
 */
public class AppletMouse extends Applet implements Runnable, MouseListener, MouseMotionListener{

    Image palla;
    Thread t;
    boolean attivo;
    int xpos=5;
    int ypos=5;
    int vx=5;
    int vy=5;
    public void init() {
        this.setBackground(Color.green);
        palla=getImage(getCodeBase(),"/home/paolo/Pictures/pallone.jpeg");
        this.addMouseListener(this); // l'ultimo this tra parentesi è il sensore
        this.addMouseMotionListener(this);
    }
     public void paint(Graphics g){
        if(palla!=null)
            g.drawImage(palla,xpos, ypos, 30, 30, this);
    }
    public void run(){
        while(true){
            repaint();
            xpos+=vx;
            ypos+=vy;
            if(xpos<=0 || xpos+30 >= this.getWidth())
                vx=-vx;
            if(ypos<=0 || ypos+30 >= this.getHeight())
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
            t=new Thread(this);
            attivo=true;
            t.start();
        }
    }
    public void stop(){
        if(t!=null){
            t.interrupt();
            attivo=false;
            t=null;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) { // se il mouse sta dentro l'applet
        vx=0;
        vy=0;
        xpos=e.getX();
        ypos=e.getY();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        vx=1;
        vy=1;
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        xpos=e.getX();
        ypos=e.getY();
    }
    
    
    
}
