/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Userlocal
 */
public class FrmPaquetesExpress extends javax.swing.JFrame {

    /**
     * Creates new form FrmPaquetesExpress
     */
    public FrmPaquetesExpress() {
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

        jLblNumReferencia = new javax.swing.JLabel();
        jLblValorPaq = new javax.swing.JLabel();
        jLblTipoPaq = new javax.swing.JLabel();
        jLblDistanciaPaq = new javax.swing.JLabel();
        jTxtNumReferencia = new javax.swing.JTextField();
        jTxtValorPaq = new javax.swing.JTextField();
        jTxtTipoPaq = new javax.swing.JTextField();
        jTxtDistanciaPaq = new javax.swing.JTextField();
        jBtnAceptar = new javax.swing.JButton();
        jBtnLimpiar = new javax.swing.JButton();
        jBtnSalir = new javax.swing.JButton();
        jPanelTransladoPaq = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxAResultado = new javax.swing.JTextArea();
        jLblPesoPaq = new javax.swing.JLabel();
        jTxtPesoPaq = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AppPaquetesExpress");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLblNumReferencia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLblNumReferencia.setText("Numero de Referencia:");

        jLblValorPaq.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLblValorPaq.setText("Valor del Paquete($):");

        jLblTipoPaq.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLblTipoPaq.setText("Tipo de Paquete:");

        jLblDistanciaPaq.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLblDistanciaPaq.setText("Distancia del Translado del paquete(Km):");

        jTxtNumReferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtNumReferenciaActionPerformed(evt);
            }
        });

        jTxtValorPaq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtValorPaqActionPerformed(evt);
            }
        });

        jTxtTipoPaq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtTipoPaqActionPerformed(evt);
            }
        });

        jTxtDistanciaPaq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtDistanciaPaqActionPerformed(evt);
            }
        });

        jBtnAceptar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnAceptar.setForeground(new java.awt.Color(51, 102, 255));
        jBtnAceptar.setText("Aceptar");
        jBtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAceptarActionPerformed(evt);
            }
        });

        jBtnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnLimpiar.setForeground(new java.awt.Color(51, 102, 255));
        jBtnLimpiar.setText("Limpiar");
        jBtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimpiarActionPerformed(evt);
            }
        });

        jBtnSalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBtnSalir.setForeground(new java.awt.Color(51, 102, 255));
        jBtnSalir.setText("Salir");
        jBtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalirActionPerformed(evt);
            }
        });

        jPanelTransladoPaq.setBorder(javax.swing.BorderFactory.createTitledBorder("Translado de Paquetes"));

        jTxAResultado.setColumns(20);
        jTxAResultado.setRows(5);
        jScrollPane1.setViewportView(jTxAResultado);

        javax.swing.GroupLayout jPanelTransladoPaqLayout = new javax.swing.GroupLayout(jPanelTransladoPaq);
        jPanelTransladoPaq.setLayout(jPanelTransladoPaqLayout);
        jPanelTransladoPaqLayout.setHorizontalGroup(
            jPanelTransladoPaqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTransladoPaqLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelTransladoPaqLayout.setVerticalGroup(
            jPanelTransladoPaqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTransladoPaqLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLblPesoPaq.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLblPesoPaq.setText("Peso del Paquete(Kg):");

        jTxtPesoPaq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtPesoPaqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblNumReferencia)
                    .addComponent(jLblValorPaq)
                    .addComponent(jLblTipoPaq)
                    .addComponent(jLblDistanciaPaq)
                    .addComponent(jLblPesoPaq))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtDistanciaPaq, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTxtTipoPaq)
                        .addComponent(jTxtValorPaq)
                        .addComponent(jTxtNumReferencia)
                        .addComponent(jTxtPesoPaq, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)))
                .addGap(149, 149, 149))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanelTransladoPaq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtnAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(jBtnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLblNumReferencia)
                            .addComponent(jTxtNumReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLblValorPaq)
                            .addComponent(jTxtValorPaq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLblTipoPaq)
                            .addComponent(jTxtTipoPaq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLblPesoPaq)
                            .addComponent(jTxtPesoPaq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLblDistanciaPaq, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtDistanciaPaq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(jPanelTransladoPaq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(jBtnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jBtnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jBtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBtnSalirActionPerformed

    private void jBtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAceptarActionPerformed
       String numRef=jTxtNumReferencia.getText();
       double valor=Double.parseDouble(jTxtValorPaq.getText());
       int tipo=Integer.parseInt(jTxtTipoPaq.getText());
       double peso=Double.parseDouble(jTxtPesoPaq.getText());   
       double distancia=Double.parseDouble(jTxtDistanciaPaq.getText()); 
       TransladoPaquete nuevopaquete = new TransladoPaquete();
       nuevopaquete.setNumRefencia(numRef);
       nuevopaquete.setValorPaq(valor);
       nuevopaquete.setTipoPaq(tipo);
       nuevopaquete.setPesoPaq(peso);
       nuevopaquete.setDistanciaPaq(distancia);
       String res=("Paquete:                 "+nuevopaquete.getNumRefencia()+
            "\n**********************************************************"+
            "\nCosto por Peso($):               "+nuevopaquete.costoPeso()+
            "\nCosto por Distancia($):          "+nuevopaquete.costoDistancia()+
            "\nCosto por Tipo de Paquete($):    "+nuevopaquete.costoTipoPaq()+
            "\nCosto por Aduana($):             "+nuevopaquete.costoAduana()+
            "\nSubtotal($):                     "+nuevopaquete.subtotalAPagar()+
            "\nDescuento($):                    "+nuevopaquete.descuento()+
            "\nTotal a Pagar($):                "+nuevopaquete.totalAPagar()+
            "\nTotal en Colones(¢):             "+nuevopaquete.totalColones());
       
       jTxAResultado.setText(res);
       jTxtNumReferencia.requestFocus();
       jBtnLimpiar.setEnabled(true);
       
       
       
       
    }//GEN-LAST:event_jBtnAceptarActionPerformed

    private void jBtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLimpiarActionPerformed
        jTxtNumReferencia.setText("");
        jTxtValorPaq.setText("");
        jTxtTipoPaq.setText("");
        jTxtPesoPaq.setText("");
        jTxtDistanciaPaq.setText("");
        jTxtNumReferencia.requestFocus();
        jTxAResultado.setText("");
        jBtnLimpiar.setEnabled(false);
        jBtnAceptar.setEnabled(false);
    }//GEN-LAST:event_jBtnLimpiarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       jBtnLimpiar.setEnabled(false);
       jBtnAceptar.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void jTxtNumReferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtNumReferenciaActionPerformed
        jTxtValorPaq.requestFocus();
    }//GEN-LAST:event_jTxtNumReferenciaActionPerformed

    private void jTxtValorPaqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtValorPaqActionPerformed
       jTxtTipoPaq.requestFocus();
    }//GEN-LAST:event_jTxtValorPaqActionPerformed

    private void jTxtTipoPaqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtTipoPaqActionPerformed
       jTxtPesoPaq.requestFocus();
    }//GEN-LAST:event_jTxtTipoPaqActionPerformed

    private void jTxtDistanciaPaqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtDistanciaPaqActionPerformed
        jBtnAceptar.setEnabled(true);
        jBtnAceptar.requestFocus(); 
        jBtnAceptar.doClick();
    }//GEN-LAST:event_jTxtDistanciaPaqActionPerformed

    private void jTxtPesoPaqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtPesoPaqActionPerformed
       jTxtDistanciaPaq.requestFocus();
    }//GEN-LAST:event_jTxtPesoPaqActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPaquetesExpress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPaquetesExpress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPaquetesExpress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPaquetesExpress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPaquetesExpress().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAceptar;
    private javax.swing.JButton jBtnLimpiar;
    private javax.swing.JButton jBtnSalir;
    private javax.swing.JLabel jLblDistanciaPaq;
    private javax.swing.JLabel jLblNumReferencia;
    private javax.swing.JLabel jLblPesoPaq;
    private javax.swing.JLabel jLblTipoPaq;
    private javax.swing.JLabel jLblValorPaq;
    private javax.swing.JPanel jPanelTransladoPaq;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTxAResultado;
    private javax.swing.JTextField jTxtDistanciaPaq;
    private javax.swing.JTextField jTxtNumReferencia;
    private javax.swing.JTextField jTxtPesoPaq;
    private javax.swing.JTextField jTxtTipoPaq;
    private javax.swing.JTextField jTxtValorPaq;
    // End of variables declaration//GEN-END:variables
}
