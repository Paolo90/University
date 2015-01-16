
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class AppGrafica extends JFrame implements ActionListener,WindowListener {
    
    JTextField f;
    JButton b;
    JLabel l;
    
    public AppGrafica() {
        
        b = new JButton("Esamina campo di testo");
        b.addActionListener(this);
        setLayout(new GridLayout(3,1));
        f = new JTextField();
        l = new JLabel("La stringa e' lunga ");
        setBounds(40,40,400,300);
        add(f);
	  add(b);
        add(l);
        setVisible(true);
        addWindowListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        int lunghezza = f.getText().getBytes().length;
        if (lunghezza > 0)  
            l.setText("La stringa e' lunga " + String.valueOf(lunghezza) + "caratteri");
    }
    
    public void windowOpened(WindowEvent e) {}
    
    public void windowClosing(WindowEvent e) {
        dispose();
    }
    
    public void windowClosed (WindowEvent e) {}
    
    public void windowIconified (WindowEvent e) {}
    
    public void windowDeiconified (WindowEvent e) {}
    
    public void windowActivated (WindowEvent e) {}
    
    public void windowDeactivated (WindowEvent e) {}
   
    public static void main(String[] args) {
        AppGrafica a = new AppGrafica();
    }
    
}
