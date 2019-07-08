/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package día2;

/**
 *
 * @author Agustín Molina
 */
public class FramePrincipal extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public FramePrincipal() {
        initComponents();
        
              
    }
         
        public float consulta = 0;
        public String combo = "";
        public float peso = 0;
        public float dolar = 0;
        public float euro = 0;
        
        
        
        
        

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtIngreso = new javax.swing.JTextField();
        combDivisa = new javax.swing.JComboBox<>();
        txtDivisa1 = new javax.swing.JTextField();
        txtDivisa2 = new javax.swing.JTextField();
        bntConvertir = new javax.swing.JButton();
        txtDivisa3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MI CONVERSOR ESPECIAL");
        setResizable(false);

        txtIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIngresoActionPerformed(evt);
            }
        });

        combDivisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una Divisa", "Peso Argentino", "Dolar", "Euro" }));
        combDivisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combDivisaActionPerformed(evt);
            }
        });

        txtDivisa1.setEditable(false);
        txtDivisa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDivisa1ActionPerformed(evt);
            }
        });

        txtDivisa2.setEditable(false);
        txtDivisa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDivisa2ActionPerformed(evt);
            }
        });

        bntConvertir.setText("CONVERTIR");
        bntConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntConvertirActionPerformed(evt);
            }
        });

        txtDivisa3.setEditable(false);
        txtDivisa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDivisa3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Pesos Argentinos");

        jLabel2.setText("Dolar");

        jLabel3.setText("Euro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bntConvertir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(combDivisa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDivisa1)
                            .addComponent(txtDivisa2)
                            .addComponent(txtDivisa3))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combDivisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bntConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDivisa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDivisa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDivisa3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combDivisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combDivisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combDivisaActionPerformed

    private void txtIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIngresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIngresoActionPerformed

    private void txtDivisa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDivisa1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDivisa1ActionPerformed

    private void txtDivisa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDivisa2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDivisa2ActionPerformed

    private void txtDivisa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDivisa3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDivisa3ActionPerformed

    private void bntConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntConvertirActionPerformed

        consulta = (int) Float.parseFloat(txtIngreso.getText());
        combo = (String) combDivisa.getSelectedItem();
        
        if (combo=="Peso Argentino"){
            dolar = (float) (consulta*0.053);
            euro = (float) (consulta*0.047);
            peso = consulta;
        }
        else if (combo=="Dolar") {
            dolar = consulta;
            euro = (float) (consulta*0.89);
            peso = (float) (consulta*40.8);
            
        } else if (combo=="Euro") {
            dolar = (float) (consulta*1.12);
            euro = consulta;
            peso = (float) (consulta*47.4);
        }
       
        
        txtDivisa1.setText(String.valueOf(peso));
        txtDivisa2.setText(String.valueOf(dolar));
        txtDivisa3.setText(String.valueOf(euro));
        
                
    }//GEN-LAST:event_bntConvertirActionPerformed

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
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntConvertir;
    private javax.swing.JComboBox<String> combDivisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtDivisa1;
    private javax.swing.JTextField txtDivisa2;
    private javax.swing.JTextField txtDivisa3;
    private javax.swing.JTextField txtIngreso;
    // End of variables declaration//GEN-END:variables
}
