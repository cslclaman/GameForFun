/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjjogowar;

import java.awt.Color;
import static java.awt.SystemColor.menu;
import javax.swing.JFrame;
import model.ClassOpt;

/**
 * Version 1.0 Release ChangeLog: 1.0: Versão Inicial e lançada 
 * Version 1.1 Add Results, fix bugs
 * Version 1.2 Add Action points system, fix bugs
 * Version 1.3 Improved AP System, fix bugs
 * Version 1.4 Add Charge atack 
 * Version 1.4.1 Windows centralizad
 * Version 1.4.2 Layout Improvement,put more bugs... :c
 * Version 1.4.3 FIX BUGS!!! and now AP never be less than 0
 * Version 1.5 Add Menu, fix bug
 * Version 1.5.1 Improved Results, Improved Atack and Repair, add Hp Bar
 * To Do List:codigo e add novos modos, fix bugs, restart button, option in option
 * Criação de objetos = (nome da Classe) (nome objeto) = new (Mesmo nome da classe ou ja
 * existente na memoria) Exemplo Jogo jg = new Jogo();
 *
 * @author Abrasil
 */
public class frmMenu extends javax.swing.JFrame {

    /**
     * Creates new form frmMenu
     */
    private ClassOpt opt;
    public frmMenu() {
        initComponents();
        opt = new ClassOpt();
        this.setLocationRelativeTo(null);
        getContentPane().setBackground(Color.ORANGE);
    }

    public ClassOpt getOpt() {
        return opt;
    }

    public void setOpt(ClassOpt opt) {
        this.opt = opt;
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnJogar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnOpt = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu");
        setBackground(new java.awt.Color(0, 255, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnJogar.setBackground(new java.awt.Color(255, 0, 0));
        btnJogar.setFont(new java.awt.Font("Trajan Pro", 3, 24)); // NOI18N
        btnJogar.setText("Jogar");
        btnJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogarActionPerformed(evt);
            }
        });
        getContentPane().add(btnJogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 159, -1));

        jLabel1.setFont(new java.awt.Font("Trajan Pro", 1, 58)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("WAR GAME");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 470, 85));

        btnOpt.setBackground(new java.awt.Color(51, 255, 255));
        btnOpt.setFont(new java.awt.Font("Trajan Pro", 3, 24)); // NOI18N
        btnOpt.setText("Opções");
        btnOpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOptActionPerformed(evt);
            }
        });
        getContentPane().add(btnOpt, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 159, -1));

        btnSair.setBackground(new java.awt.Color(0, 255, 51));
        btnSair.setFont(new java.awt.Font("Trajan Pro", 3, 24)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 159, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Version: 1.5.2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, 80, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGS/atack2.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogarActionPerformed
        System.out.println(opt.getName1());
        frmJogo f = new frmJogo(opt);
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnJogarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnOptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOptActionPerformed
        // TODO add your handling code here:
        
        frmOpt MOpt = new frmOpt(opt,this);
        opt.setName1("Carol");
        MOpt.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnOptActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJogar;
    private javax.swing.JButton btnOpt;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
