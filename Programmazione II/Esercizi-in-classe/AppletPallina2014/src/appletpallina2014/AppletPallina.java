/*
java class
crea nuovo package
poi crea nuova classe applet
    
 */

package appletpallina2014;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*; // gestore eventi

/**
 *
 * @author paolo
 */
public class AppletPallina extends Applet implements Runnable, MouseListener { //usiamo anche i thread e implemento mouselistener usando l'applet come sensore

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    Thread t;
    Pallina palla;
    boolean attivo=false; // dice se il thread è attivo oppure no
    
    public void init() {
        // coloro di giallo per vedere dove sta l'applet
        this.setBackground(Color.yellow); // per impostare una proprietà cerca i metodi con set...
        this.addMouseListener(this); //l'oggetto sensore è l'applet
        // creo il sesore tastiera per utilizzarlo dentro l'applet
        SensoreTastiera k = new SensoreTastiera(this); // l'applet passa se stessa e chiudo il ciclo.
        // Registro questo nuovo sensore
        this.addKeyListener(k);
    }
    
    //dopo aver messo implements mi da errore perché vuole che ridefinisca il metodo run()
    
    @Override
    public void run(){
        palla=new Pallina(0,0,3,4,10,Color.red); // prendo la pallina
        while(true){ //animazione
            repaint();
            palla.sposta(this.getWidth(), this.getHeight());
            try{ // 100 ms = 10 fot/sec
                Thread.sleep(100);
            }catch(InterruptedException e){
                e.printStackTrace(); // scrive l'eventuale messaggio di errore
            }
        }
    }
    // run deve essere associato a un oggetto theread. Definisco thread t;
    // faccio partire l'animazione con start
    public void start(){
        if(t==null){
            t=new Thread(this); // lo uso per eseguire run che è definito in un altra classe. Lo associo nel costruttore all'applet (this)
            t.start(); // richiama il metodo run(). E' un metodo classe thread. run() è di classe Applet
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
    
    // metodo paint che disegna la pallina
    
    public void paint(Graphics g){
        if(palla!=null) // disegno solo se palla esiste
            g.fillOval(palla.x, palla.y, palla.diam, palla.diam); // sottolinea palla perché è dichiarata nel metodo run e non la vede.
        // La dichiaro come una proprietà dell'applet.
        
    }
    
    // clicco destro, insert code, implement method e seleziono tutti i 5 metodi del moose e clicco generate
    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) { // associato alla pressione del tasto
        if(attivo==true)
            t.suspend(); // se c'è una linea che lo cancella vuol dire che è deprecato, cioè è sconsigliato
        else
            t.resume(); // inverso di suspend    
        attivo= !attivo; // se è false diventa true e vicversa in ogni caso
    } // una volta scelto il metodo e il sensore, dobbiamo registrare il sensore nel metodo init()

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
    /*
    Per l'evento da tastiera uso la tastiera come sensore. Definisco la classe sensoreTastiera
    */
    
}
