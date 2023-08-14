/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.conversordivisas.Vistas;

import com.mycompany.conversordivisas.ApiCall;
import java.util.ArrayList;

/**
 *
 * @author josep
 */
public class Vista_ConversorDivisa extends javax.swing.JFrame {
    
    ApiCall apiConsulta= new ApiCall();
    ArrayList<String> arrayCodes = new ArrayList<>();
   
     
    public Vista_ConversorDivisa() {
        initComponents();
        llenarComboBoxConCodigosDivisas();
    }
    
    public void llenarComboBoxConCodigosDivisas(){
        try{
            arrayCodes = apiConsulta.obtenerArrayListDeDivisas();
        }catch(Exception e){
            e.getStackTrace();
        }
        
        System.out.println("aca: "+ arrayCodes);
        for (String codes : arrayCodes){
            divisaActualCB.addItem(codes);
            divisaConvertirCB.addItem(codes);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        conversorPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tituloLabel = new javax.swing.JLabel();
        convertirBTT = new javax.swing.JButton();
        divisaActualCB = new javax.swing.JComboBox<>();
        divisaConvertirCB = new javax.swing.JComboBox<>();
        montoConvertirTF = new javax.swing.JTextField();
        montoConvertidoTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        conversorPanel.setBackground(new java.awt.Color(255, 255, 255));

        tituloLabel.setBackground(new java.awt.Color(0, 0, 0));
        tituloLabel.setForeground(new java.awt.Color(0, 0, 0));
        tituloLabel.setText("Conversor de Divisas");

        convertirBTT.setText("Convertir");
        convertirBTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertirBTTActionPerformed(evt);
            }
        });

        montoConvertirTF.setText("5.4841");

        montoConvertidoTF.setEditable(false);
        montoConvertidoTF.setText("monto");

        javax.swing.GroupLayout conversorPanelLayout = new javax.swing.GroupLayout(conversorPanel);
        conversorPanel.setLayout(conversorPanelLayout);
        conversorPanelLayout.setHorizontalGroup(
            conversorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, conversorPanelLayout.createSequentialGroup()
                .addGap(0, 186, Short.MAX_VALUE)
                .addComponent(tituloLabel)
                .addGap(185, 185, 185))
            .addGroup(conversorPanelLayout.createSequentialGroup()
                .addGroup(conversorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(conversorPanelLayout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel1))
                    .addGroup(conversorPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(conversorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(divisaConvertirCB, 0, 71, Short.MAX_VALUE)
                            .addComponent(divisaActualCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(94, 94, 94)
                        .addGroup(conversorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(montoConvertirTF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(montoConvertidoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(conversorPanelLayout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(convertirBTT)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        conversorPanelLayout.setVerticalGroup(
            conversorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conversorPanelLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloLabel)
                .addGap(66, 66, 66)
                .addGroup(conversorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(divisaActualCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(montoConvertirTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(conversorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(divisaConvertirCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(montoConvertidoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(convertirBTT)
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(conversorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(conversorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void convertirBTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertirBTTActionPerformed
        String uwu = "";
        uwu = montoConvertirTF.getText();
        System.out.println(uwu);
    }//GEN-LAST:event_convertirBTTActionPerformed


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
            java.util.logging.Logger.getLogger(Vista_ConversorDivisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_ConversorDivisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_ConversorDivisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_ConversorDivisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_ConversorDivisa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel conversorPanel;
    private javax.swing.JButton convertirBTT;
    private javax.swing.JComboBox<String> divisaActualCB;
    private javax.swing.JComboBox<String> divisaConvertirCB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField montoConvertidoTF;
    private javax.swing.JTextField montoConvertirTF;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}
