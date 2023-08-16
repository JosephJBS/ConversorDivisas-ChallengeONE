/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.conversordivisas.Vistas;

import com.mycompany.conversordivisas.ApiCall;
import com.mycompany.conversordivisas.ConversorTemperatura;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author josep
 */
public class Vista_ConversorTemperatura extends javax.swing.JFrame {

    ConversorTemperatura conversorTemperatura = new ConversorTemperatura();
    ArrayList<String> temperaturas = new ArrayList<>();

    public Vista_ConversorTemperatura() {
        initComponents();
        customJFrameElements();
        llenarComboBoxConTemperaturas();
    }

    public void llenarComboBoxConTemperaturas() {
        temperaturas = conversorTemperatura.llenarArrayTemperaturas();
  
        for (String codes : temperaturas) {
            tempActualCB.addItem(codes);
            tempFinalCB.addItem(codes);
        }
    }

    public void customJFrameElements() {
        //Jform
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        conversorPanel = new javax.swing.JPanel();
        tituloLabel = new javax.swing.JLabel();
        convertirBTT = new javax.swing.JButton();
        tempActualCB = new javax.swing.JComboBox<>();
        tempFinalCB = new javax.swing.JComboBox<>();
        tempCalculadaTF = new javax.swing.JTextField();
        tempConvertirTF = new javax.swing.JTextField();
        aluraImgLB = new javax.swing.JLabel();
        footerLB = new javax.swing.JLabel();
        convDivisas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        conversorPanel.setBackground(new java.awt.Color(255, 255, 255));

        tituloLabel.setBackground(new java.awt.Color(0, 0, 0));
        tituloLabel.setFont(new java.awt.Font("Comic Sans MS", 3, 32)); // NOI18N
        tituloLabel.setForeground(new java.awt.Color(0, 0, 0));
        tituloLabel.setText("Conversor de Temperatura");

        convertirBTT.setText("Convertir");
        convertirBTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertirBTTActionPerformed(evt);
            }
        });

        tempCalculadaTF.setEditable(false);
        tempCalculadaTF.setText("temperatura");

        tempConvertirTF.setText("0.51");
        tempConvertirTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tempConvertirTFKeyTyped(evt);
            }
        });

        aluraImgLB.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+ "\\src\\main\\java\\assets\\Alura.png"));
        getContentPane().add(aluraImgLB);
        aluraImgLB.setBounds(0,0,250,200);
        aluraImgLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aluraImgLBMouseClicked(evt);
            }
        });

        footerLB.setBackground(new java.awt.Color(0, 153, 255));
        footerLB.setForeground(new java.awt.Color(153, 153, 255));
        footerLB.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+ "\\src\\main\\java\\assets\\footer.png"));
        footerLB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                footerLBMouseClicked(evt);
            }
        });

        convDivisas.setText("Conversor Divisas");
        convDivisas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convDivisasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout conversorPanelLayout = new javax.swing.GroupLayout(conversorPanel);
        conversorPanel.setLayout(conversorPanelLayout);
        conversorPanelLayout.setHorizontalGroup(
            conversorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conversorPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(conversorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tempFinalCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tempActualCB, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120)
                .addGroup(conversorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tempConvertirTF)
                    .addComponent(tempCalculadaTF, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(convertirBTT, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(conversorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aluraImgLB, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(conversorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(convDivisas, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloLabel)))
            .addComponent(footerLB, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        conversorPanelLayout.setVerticalGroup(
            conversorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conversorPanelLayout.createSequentialGroup()
                .addGroup(conversorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(conversorPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(aluraImgLB, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(conversorPanelLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(convDivisas)
                        .addGap(26, 26, 26)
                        .addComponent(tituloLabel)))
                .addGap(26, 26, 26)
                .addGroup(conversorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tempActualCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tempConvertirTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(convertirBTT))
                .addGap(60, 60, 60)
                .addGroup(conversorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tempFinalCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tempCalculadaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(footerLB, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(conversorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(conversorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void convDivisasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convDivisasActionPerformed
        Vista_ConversorDivisa convDivFrame = new  Vista_ConversorDivisa();
        dispose();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        convDivFrame.setVisible(true);
    }//GEN-LAST:event_convDivisasActionPerformed

    private void tempConvertirTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tempConvertirTFKeyTyped
        char caracter = evt.getKeyChar();

        if ((caracter < '0' || caracter > '9')
            && (caracter != KeyEvent.VK_BACK_SPACE)
            && (caracter != '.' || tempConvertirTF.getText().contains("."))) {
            evt.consume();
        }
    }//GEN-LAST:event_tempConvertirTFKeyTyped

    private void convertirBTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertirBTTActionPerformed
        String temperaturaCalculada = " ";
        String tempActual = " ";
        String tempFinal = " ";
        double temperaturaIngresada = 0;

        tempActual = (String) tempActualCB.getSelectedItem();
        tempFinal = (String) tempFinalCB.getSelectedItem();

        //VALIDACIONES
        if (!validarJTexFieldConValorIngresado())return;
        if (!validarDiferentesTemperaturas(tempActual, tempFinal))return;
        if (!validarValorTipoDoubleYPositivo()) return;

        temperaturaIngresada = Double.parseDouble(tempConvertirTF.getText());

        temperaturaCalculada = Double.
        toString(conversorTemperatura.conversor(tempActual, tempFinal, temperaturaIngresada));
        System.out.println("Temperatura converitdo: " + temperaturaCalculada);

        tempCalculadaTF.setText(temperaturaCalculada);
    }//GEN-LAST:event_convertirBTTActionPerformed

    private void aluraImgLBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aluraImgLBMouseClicked
              try {
            Desktop.getDesktop().browse(new URI("https://www.oracle.com/ar/education/oracle-next-education/"));
        } catch (IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_aluraImgLBMouseClicked

    private void footerLBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_footerLBMouseClicked
        try {
            Desktop.getDesktop().browse(new URI("https://www.linkedin.com/in/joseph-jbs"));
            Desktop.getDesktop().browse(new URI("https://github.com/JosephJBS"));
        } catch (IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_footerLBMouseClicked

    public boolean validarJTexFieldConValorIngresado() {
        System.out.println("Se valida valor ingresado por interfaz grafica");
        if (tempConvertirTF.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane,
                    "¡Ingrese un valor!",
                    "Info",
                    JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        return true;
    }

    public boolean validarDiferentesTemperaturas(String tempActual, String tempFinal) {
        System.out.println("Se validan temperaturas diferentes");
        if (tempActual.equals(tempFinal)) {
            JOptionPane.showMessageDialog(rootPane,
                    "¡Las temperaturas deben ser diferentes!",
                    "Info",
                    JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        return true;
    }

    public boolean validarValorTipoDoubleYPositivo() {
        double temp;
        System.out.println("Se valida que se digite un número");
        try {
            temp = Double.parseDouble(tempConvertirTF.getText());
            validarMontoPositivo(temp);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(rootPane,
                    "¡Debe ingresar solo valores numéricos!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public void validarMontoPositivo(double temp) {
        System.out.println("Se valida que el valor ingresado sea positivo");
        if (temp <= 0) {
            JOptionPane.showMessageDialog(rootPane,
                    "¡Ingrese valores positivos!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
    }

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
            java.util.logging.Logger.getLogger(Vista_ConversorTemperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_ConversorTemperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_ConversorTemperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_ConversorTemperatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_ConversorTemperatura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aluraImgLB;
    private javax.swing.JButton convDivisas;
    private javax.swing.JPanel conversorPanel;
    private javax.swing.JButton convertirBTT;
    private javax.swing.JLabel footerLB;
    private javax.swing.JComboBox<String> tempActualCB;
    private javax.swing.JTextField tempCalculadaTF;
    private javax.swing.JTextField tempConvertirTF;
    private javax.swing.JComboBox<String> tempFinalCB;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}
