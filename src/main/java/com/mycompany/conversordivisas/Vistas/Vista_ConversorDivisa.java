/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.conversordivisas.Vistas;

import com.mycompany.conversordivisas.ApiCall;
import java.awt.Desktop;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author josep
 */
public class Vista_ConversorDivisa extends javax.swing.JFrame {

    ApiCall apiConsulta = new ApiCall();
    ArrayList<String> arrayCodes = new ArrayList<>();

    public Vista_ConversorDivisa() {
        initComponents();
        customJFrameElements();
        llenarComboBoxConCodigosDivisas();
    }

    public void llenarComboBoxConCodigosDivisas() {
        try {
            arrayCodes = apiConsulta.obtenerArrayListDeDivisas();
        } catch (Exception e) {
            e.getStackTrace();
        }

        for (String codes : arrayCodes) {
            divisaActualCB.addItem(codes);
            divisaConvertirCB.addItem(codes);
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
        divisaActualCB = new javax.swing.JComboBox<>();
        divisaConvertirCB = new javax.swing.JComboBox<>();
        montoConvertidoTF = new javax.swing.JTextField();
        montoConvertirTF = new javax.swing.JTextField();
        aluraImgLB = new javax.swing.JLabel();
        footerLB = new javax.swing.JLabel();
        convTemperatura = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        conversorPanel.setBackground(new java.awt.Color(255, 255, 255));

        tituloLabel.setBackground(new java.awt.Color(0, 0, 0));
        tituloLabel.setFont(new java.awt.Font("Comic Sans MS", 3, 36)); // NOI18N
        tituloLabel.setForeground(new java.awt.Color(0, 0, 0));
        tituloLabel.setText("Conversor de Divisas");

        convertirBTT.setText("Convertir");
        convertirBTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertirBTTActionPerformed(evt);
            }
        });

        montoConvertidoTF.setEditable(false);
        montoConvertidoTF.setText("monto");

        montoConvertirTF.setText("0.51");
        montoConvertirTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                montoConvertirTFKeyTyped(evt);
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

        convTemperatura.setText("Conversor Temperatura");
        convTemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convTemperaturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout conversorPanelLayout = new javax.swing.GroupLayout(conversorPanel);
        conversorPanel.setLayout(conversorPanelLayout);
        conversorPanelLayout.setHorizontalGroup(
            conversorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conversorPanelLayout.createSequentialGroup()
                .addGroup(conversorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(conversorPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(footerLB, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(conversorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, conversorPanelLayout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addGroup(conversorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(divisaActualCB, 0, 217, Short.MAX_VALUE)
                                .addComponent(divisaConvertirCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(34, 34, 34)
                            .addGroup(conversorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(montoConvertirTF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(montoConvertidoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(convertirBTT, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, conversorPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(aluraImgLB, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(conversorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tituloLabel)
                                .addComponent(convTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addComponent(convTemperatura)
                        .addGap(32, 32, 32)
                        .addComponent(tituloLabel)))
                .addGap(26, 26, 26)
                .addGroup(conversorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(divisaActualCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(montoConvertirTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(convertirBTT))
                .addGap(60, 60, 60)
                .addGroup(conversorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(divisaConvertirCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(montoConvertidoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(footerLB, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void montoConvertirTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_montoConvertirTFKeyTyped
        char caracter = evt.getKeyChar();

        if ((caracter < '0' || caracter > '9')
            && (caracter != KeyEvent.VK_BACK_SPACE)
            && (caracter != '.' || montoConvertirTF.getText().contains("."))) {
            evt.consume();
        }
    }//GEN-LAST:event_montoConvertirTFKeyTyped

    private void convertirBTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertirBTTActionPerformed
        String montoConvertido = " ";
        String divisaActual = " ";
        String divisaFinal = " ";
        double monto = 0;

        divisaActual = ((String) divisaActualCB.getSelectedItem()).substring(0, 3);
        divisaFinal = ((String) divisaConvertirCB.getSelectedItem()).substring(0, 3);
        
        //VALIDACIONES
        if (!validarJTexFieldConValorIngresado()) return;
        if (!validarDiferentesDivisas(divisaActual, divisaFinal)) return;
        if (!validarMontoTipoDoubleYPositivo()) return;

        monto = Double.parseDouble(montoConvertirTF.getText());

        try {
            montoConvertido = Double.toString(apiConsulta.convertirDivisa(divisaActual, divisaFinal, monto));
            System.out.println("monto converitdo: " + montoConvertido);
        } catch (IOException ex) {
            Logger.getLogger(Vista_ConversorDivisa.class.getName()).log(Level.SEVERE, null, ex);
        }

        montoConvertidoTF.setText(montoConvertido);
    }//GEN-LAST:event_convertirBTTActionPerformed

    private void convTemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convTemperaturaActionPerformed
        Vista_ConversorTemperatura convTempFrame = new  Vista_ConversorTemperatura();
        dispose();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        convTempFrame.setVisible(true);
    }//GEN-LAST:event_convTemperaturaActionPerformed

    private void footerLBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_footerLBMouseClicked
        try {
            Desktop.getDesktop().browse(new URI("https://www.linkedin.com/in/joseph-jbs"));
            Desktop.getDesktop().browse(new URI("https://github.com/JosephJBS"));
        } catch (IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_footerLBMouseClicked

    private void aluraImgLBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aluraImgLBMouseClicked
        try {
            Desktop.getDesktop().browse(new URI("https://www.oracle.com/ar/education/oracle-next-education/"));
        } catch (IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_aluraImgLBMouseClicked

    public boolean validarJTexFieldConValorIngresado() {
        System.out.println("Se valida valor ingresado por interfaz grafica");
        if (montoConvertirTF.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane,
                    "¡Ingrese un valor!",
                    "Info",
                    JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        return true;
    }

    public boolean validarDiferentesDivisas(String divisaActual, String divisaFinal) {
        System.out.println("Se validan divisas diferentes");
        if (divisaActual.equals(divisaFinal)) {
            JOptionPane.showMessageDialog(rootPane,
                    "¡Las divisas deben ser diferentes!",
                    "Info",
                    JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        return true;
    }

    public boolean validarMontoTipoDoubleYPositivo() {
        double monto;
        System.out.println("Se valida que se digite un número");
        try {
            monto = Double.parseDouble(montoConvertirTF.getText());
            validarMontoPositivo(monto);
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

    public void validarMontoPositivo(double monto) {
        System.out.println("Se valida que el monto ingresado sea positivo");
        if (monto <= 0) {
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
    private javax.swing.JLabel aluraImgLB;
    private javax.swing.JButton convTemperatura;
    private javax.swing.JPanel conversorPanel;
    private javax.swing.JButton convertirBTT;
    private javax.swing.JComboBox<String> divisaActualCB;
    private javax.swing.JComboBox<String> divisaConvertirCB;
    private javax.swing.JLabel footerLB;
    private javax.swing.JTextField montoConvertidoTF;
    private javax.swing.JTextField montoConvertirTF;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}
