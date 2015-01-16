/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esercizio_3;

import java.awt.Color;

/**
 *
 * @author paolo
 */
public class Finestra extends javax.swing.JFrame {

    /**
     * Creates new form Finestra
     */
    public Finestra() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pannello1 = new javax.swing.JPanel();
        Testo1 = new javax.swing.JTextField();
        Testo2 = new javax.swing.JTextField();
        Canvas = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Esercizio 3");

        Testo1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Testo2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Testo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Testo2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Pannello1Layout = new javax.swing.GroupLayout(Pannello1);
        Pannello1.setLayout(Pannello1Layout);
        Pannello1Layout.setHorizontalGroup(
            Pannello1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pannello1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(Testo1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(Testo2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        Pannello1Layout.setVerticalGroup(
            Pannello1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pannello1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(Pannello1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Testo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Testo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        getContentPane().add(Pannello1, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout CanvasLayout = new javax.swing.GroupLayout(Canvas);
        Canvas.setLayout(CanvasLayout);
        CanvasLayout.setHorizontalGroup(
            CanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        CanvasLayout.setVerticalGroup(
            CanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(Canvas, java.awt.BorderLayout.PAGE_END);

        jButton1.setText("Colora");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Testo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Testo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Testo2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String s1, s2;
        s1= Testo1.getText();
        s2= Testo2.getText();
        int n1, n2, somma;
        try{
            n1=Integer.parseInt(s1);
            n2=Integer.parseInt(s2);
            somma=n1+n2;
            if(somma%2==0)
                Canvas.setBackground(Color.red);
            else
                Canvas.setBackground(Color.green);
        }catch(NumberFormatException e){
            System.out.println("Inserire due numeri interi nei campi di testo");
            Canvas.setBackground(Color.yellow);
            Testo1.setText("0");
            Testo2.setText("0");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Finestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Finestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Finestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Finestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Finestra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Canvas;
    private javax.swing.JPanel Pannello1;
    private javax.swing.JTextField Testo1;
    private javax.swing.JTextField Testo2;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
