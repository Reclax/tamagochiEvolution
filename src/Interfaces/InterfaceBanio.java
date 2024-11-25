/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import javax.swing.JOptionPane;

/**
 *
 * @author El Jonas
 */
public class InterfaceBanio extends javax.swing.JFrame {

    /**
     * Creates new form InterfaceBanio
     */
    public InterfaceBanio() {
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

        jPanel1 = new javax.swing.JPanel();
        botoncomer = new javax.swing.JButton();
        guardarbotn = new javax.swing.JButton();
        salirboton = new javax.swing.JButton();
        botondormir = new javax.swing.JButton();
        botonjugar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        botonSala = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botoncomer.setBackground(new java.awt.Color(153, 255, 153));
        botoncomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/comericono.png"))); // NOI18N
        botoncomer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botoncomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoncomerActionPerformed(evt);
            }
        });
        jPanel1.add(botoncomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 50, 50));

        guardarbotn.setBackground(new java.awt.Color(102, 255, 153));
        guardarbotn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardaricono.png"))); // NOI18N
        guardarbotn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardarbotn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarbotnActionPerformed(evt);
            }
        });
        jPanel1.add(guardarbotn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 50, 50));

        salirboton.setBackground(new java.awt.Color(255, 102, 102));
        salirboton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerraicono.png"))); // NOI18N
        salirboton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salirboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirbotonActionPerformed(evt);
            }
        });
        jPanel1.add(salirboton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 50, 50));

        botondormir.setBackground(new java.awt.Color(0, 204, 204));
        botondormir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dormiricono.png"))); // NOI18N
        botondormir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botondormir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botondormirActionPerformed(evt);
            }
        });
        jPanel1.add(botondormir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        botonjugar.setBackground(new java.awt.Color(255, 255, 102));
        botonjugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/jugaricono.png"))); // NOI18N
        botonjugar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonjugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonjugarActionPerformed(evt);
            }
        });
        jPanel1.add(botonjugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 50, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recurso 1.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));

        botonSala.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botnsala.png"))); // NOI18N
        botonSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalaActionPerformed(evt);
            }
        });
        jPanel1.add(botonSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 50, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baño.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botoncomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoncomerActionPerformed
        InterfaceCocina c = new InterfaceCocina();
        this.dispose();
        c.setLocationRelativeTo(null);
        c.setVisible(true);
    }//GEN-LAST:event_botoncomerActionPerformed

    private void salirbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirbotonActionPerformed
        JOptionPane.showMessageDialog(null, "Ha cerrado sesion");
        /*aqui poner el metodo de guardar los datos del jugador automatico*/
        Login l = new Login();
        this.dispose();
        l.setLocationRelativeTo(null);
        l.setVisible(true);
    }//GEN-LAST:event_salirbotonActionPerformed

    private void botondormirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botondormirActionPerformed

        InterfaceCuarto c = new InterfaceCuarto();
        this.dispose();
        c.setLocationRelativeTo(null);
        c.setVisible(true);
    }//GEN-LAST:event_botondormirActionPerformed

    private void botonjugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonjugarActionPerformed
        InterfacePatio p = new InterfacePatio();
        this.dispose();
        p.setLocationRelativeTo(null);
        p.setVisible(true);
    }//GEN-LAST:event_botonjugarActionPerformed

    private void botonSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalaActionPerformed
      InterfaceSala s=new InterfaceSala();
        this.dispose();
        s.setLocationRelativeTo(null);
      s.setVisible(true);
    }//GEN-LAST:event_botonSalaActionPerformed

    private void guardarbotnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarbotnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guardarbotnActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonSala;
    public javax.swing.JButton botoncomer;
    private javax.swing.JButton botondormir;
    public javax.swing.JButton botonjugar;
    public javax.swing.JButton guardarbotn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JButton salirboton;
    // End of variables declaration//GEN-END:variables
}
