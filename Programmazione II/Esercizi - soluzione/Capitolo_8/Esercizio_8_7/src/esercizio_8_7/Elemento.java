/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esercizio_8_7;

/**
 *
 * @author paolo
 */
public class Elemento {
    int xpos, ypos, intervalloX, intervalloY;
    String s;
    Elemento next;
    Elemento(String aS, int aXpos, int aYpos, Elemento aNext){
        s=aS;
        xpos=aXpos;
        ypos=aYpos;
        intervalloX=xpos+s.length()*10;
        intervalloY=ypos-10;
        next=aNext;
    }
}
