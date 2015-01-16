/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esercizio_6_1;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author paolo
 */
public class AppletScacchiera extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        this.setBackground(Color.cyan);
    }
    public void paint(Graphics g){
        int x0=5;
        int y0=5;
        int lunghQuad=50;
        int numQuad, quadCol;
        int xtemp=x0;
        int ytemp=y0;
        boolean bianco;
        for(numQuad =0;numQuad<8;numQuad++){
            if(numQuad%2==0){
                bianco=true;
            }else{
                bianco=false;
            }
            if(bianco)
                g.setColor(Color.white);
            else
                g.setColor(Color.black);
            g.fillRect(xtemp, ytemp, lunghQuad, lunghQuad);
            for(quadCol=1;quadCol<8;quadCol++){
                //xtemp+=lunghQuad;
                ytemp+=lunghQuad;
                if(bianco){
                    g.setColor(Color.black);
                    bianco=false;
                }else{
                    g.setColor(Color.white);
                    bianco=true;
                }    
                g.fillRect(xtemp, ytemp, lunghQuad, lunghQuad);
            }
            xtemp=x0+(numQuad+1)*lunghQuad;
            ytemp=y0;
        }
    }
}
