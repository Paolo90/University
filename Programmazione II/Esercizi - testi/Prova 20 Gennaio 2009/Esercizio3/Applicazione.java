// ESERCIZIO 3

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Applicazione extends JFrame implements ActionListener, WindowListener
{
	JTextField f; 
	JButton b;    
	JLabel l;    

	public Applicazione() {
	
		b = new JButton("INCREMENTO");
		b.addActionListener(this);
		
		setLayout(new GridLayout(3,1));
		
		f = new JTextField();
		
		l = new JLabel("0");
		
		setBounds (40, 40, 400, 300);			
			add(b);
			add(l);
                        add(f);
			setVisible(true);
			addWindowListener(this);
	}

public void actionPerformed(ActionEvent e) {


	String testo = f.getText();
	String testolabel = l.getText();
	int numero = 0;
        int numerolabel = 0;
        try {
                numero = Integer.parseInt(testo);
                numerolabel = Integer.parseInt(testolabel);

                } catch (NumberFormatException ecc) { numero=0; numerolabel=0;}

        l.setText("" +(numero+numerolabel));
}

public void windowOpened (WindowEvent e) {}

public void windowClosing (WindowEvent e) {
	dispose();
}

public void windowClosed (WindowEvent e) {}

public void windowIconified (WindowEvent e) {}

public void windowDeiconified (WindowEvent e) {}

public void windowActivated (WindowEvent e) {}

public void windowDeactivated (WindowEvent e) {}


public static void main(String args[]) 
{
                Applicazione finestra;
                finestra = new Applicazione();
                finestra.setVisible(true);
        
        }
}

