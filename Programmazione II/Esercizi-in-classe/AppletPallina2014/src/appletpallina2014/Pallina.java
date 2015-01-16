/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appletpallina2014;
import java.awt.Color;
/**
 *
 * @author paolo
 */
public class Pallina {
    int x; // posizione x e y
    int y; // i pixel sono interi
    int vx, vy; // velocità
    int diam; // sono pixel
    Color colore; //colore pallina. E' definito nella classe java.awt.Color
    Pallina(int x, int y, int vx, int vy, int diam, Color colore){ // costruttore classe Pallina
        this.x=x;
        this.y=y;
        this.vx=vx;
        this.vy=vy;
        this.diam=diam;
        this.colore=colore;
    }
    void sposta(int lunghezza, int altezza){ //l, alt dell'applet agisce e modifica sulle proprietà dell'oggetto (aggiorna)
        x+=vx;
        y+=vy;
        // rimbalzo
        if(x<=0 || x+diam >= lunghezza){ //magari la pallina è schiacciata. Caso orizzontale
            vx=-vx;
        }
        if(y<=0 || y+diam >=altezza) // caso verticale
            vy=-vy;
    }
}
