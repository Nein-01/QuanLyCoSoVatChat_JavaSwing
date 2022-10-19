/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuChuongTrinh;

import DangNhap.DangNhap;
import QL_DanhSachTaiSan.JQLTaiSan;
import QL_DieuChuyen.JQLDieuChuyen;
import QL_MuaSam.JMSThietBi;
import QL_SuaChua.JQLSuaChua;
import QL_ThanhLy.JTLTaiSan;

/**
 *
 * @author vanqu
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Menu quản trị");
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
        jButtonTLy = new javax.swing.JButton();
        jButtonMua = new javax.swing.JButton();
        jButtonChuyen = new javax.swing.JButton();
        jButtonQLTTTS1 = new javax.swing.JButton();
        jButtonSua1 = new javax.swing.JButton();
        jLabelTitl = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuInfo = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonTLy.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonTLy.setText("Quản lý thanh lý tài sản");
        jButtonTLy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTLyActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonTLy, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 220, 60));

        jButtonMua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonMua.setText("Quản lý mua sắm tài sản");
        jButtonMua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMuaActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonMua, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 220, 60));

        jButtonChuyen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonChuyen.setText("Quản lý điều chuyển tài sản");
        jButtonChuyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChuyenActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonChuyen, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 220, 60));

        jButtonQLTTTS1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonQLTTTS1.setText("Quản lý thông tin tài sản");
        jButtonQLTTTS1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQLTTTS1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonQLTTTS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 220, 60));

        jButtonSua1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonSua1.setText("Quản lý sửa chữa tài sản");
        jButtonSua1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSua1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSua1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 220, 60));

        jLabelTitl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTitl.setText("QUẢN LÝ CƠ SỞ VẬT CHẤT");
        jPanel1.add(jLabelTitl, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 240, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 590, 350));

        jMenu1.setText("Đăng xuất");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenuInfo.setText("Thông tin");
        jMenuInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuInfoMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuInfo);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonQLTTTS1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQLTTTS1ActionPerformed
        // TODO add your handling code here:
        JQLTaiSan qlTSForm = new JQLTaiSan();
        qlTSForm.setVisible(true);
    }//GEN-LAST:event_jButtonQLTTTS1ActionPerformed

    private void jMenuInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuInfoMouseClicked
        // TODO add your handling code here:
        ThongTinNhom ttnForm = new ThongTinNhom();
        ttnForm.setVisible(true);
    }//GEN-LAST:event_jMenuInfoMouseClicked

    private void jButtonMuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMuaActionPerformed
        // TODO add your handling code here:
        JMSThietBi qlMSForm = new JMSThietBi();
        qlMSForm.setVisible(true);
    }//GEN-LAST:event_jButtonMuaActionPerformed

    private void jButtonChuyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChuyenActionPerformed
        // TODO add your handling code here:
        JQLDieuChuyen qlDCForm = new JQLDieuChuyen();
        qlDCForm.setVisible(true);
    }//GEN-LAST:event_jButtonChuyenActionPerformed

    private void jButtonSua1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSua1ActionPerformed
        // TODO add your handling code here:
        JQLSuaChua qlSCForm = new JQLSuaChua();
        qlSCForm.setVisible(true);
    }//GEN-LAST:event_jButtonSua1ActionPerformed

    private void jButtonTLyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTLyActionPerformed
        // TODO add your handling code here:
        JTLTaiSan qlTLForm = new JTLTaiSan();
        qlTLForm.setVisible(true);
    }//GEN-LAST:event_jButtonTLyActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        DangNhap dnForm = new DangNhap();
        dnForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonChuyen;
    private javax.swing.JButton jButtonMua;
    private javax.swing.JButton jButtonQLTTTS1;
    private javax.swing.JButton jButtonSua1;
    private javax.swing.JButton jButtonTLy;
    private javax.swing.JLabel jLabelTitl;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuInfo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
