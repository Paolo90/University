/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esercizio_3;

/**
 *
 * @author paolo
 */
public class FinestraEsercizio3 extends javax.swing.JFrame {

    /**
     * Creates new form FinestraEsercizio3
     */
    public FinestraEsercizio3() {
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

        Pannello = new javax.swing.JPanel();
        Testo1 = new javax.swing.JTextField();
        Testo2 = new javax.swing.JTextField();
        Etichetta = new javax.swing.JLabel();
        Bottone = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Testo1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Testo2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout PannelloLayout = new javax.swing.GroupLayout(Pannello);
        Pannello.setLayout(PannelloLayout);
        PannelloLayout.setHorizontalGroup(
            PannelloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PannelloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Testo1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addComponent(Testo2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PannelloLayout.setVerticalGroup(
            PannelloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PannelloLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(PannelloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Testo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Testo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        getContentPane().add(Pannello, java.awt.BorderLayout.PAGE_START);

        Etichetta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Etichetta.setText("Clicca il pulsante per vedere l'effetto");
        getContentPane().add(Etichetta, java.awt.BorderLayout.CENTER);

        Bottone.setText("Genera");
        Bottone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottoneActionPerformed(evt);
            }
        });
        getContentPane().add(Bottone, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BottoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottoneActionPerformed
        String s1=Testo1.getText();
        String s2=Testo2.getText();
        try{
            int n=Integer.parseInt(s1);
            int m=Integer.parseInt(s2);
            int prod=m*n;
            Etichetta.setText(prod+"");
        }catch(NumberFormatException e){
            Etichetta.setText("Errore di immissione");
            Testo1.setText("0");
            Testo2.setText("0");
        }
    }//GEN-LAST:event_BottoneActionPerformed

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
            java.util.logging.Logger.getLogger(FinestraEsercizio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinestraEsercizio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinestraEsercizio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinestraEsercizio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinestraEsercizio3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bottone;
    private javax.swing.JLabel Etichetta;
    private javax.swing.JPanel Pannello;
    private javax.swing.JTextField Testo1;
    private javax.swing.JTextField Testo2;
    // End of variables declaration//GEN-END:variables
}
