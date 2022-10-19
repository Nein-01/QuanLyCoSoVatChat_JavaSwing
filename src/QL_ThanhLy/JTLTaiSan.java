/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QL_ThanhLy;

import DangNhap.DangNhap;
import MenuChuongTrinh.ThongTinNhom;
import QL_DanhSachTaiSan.JQLTaiSan;
import QL_DieuChuyen.JQLDieuChuyen;
import QL_MuaSam.JMSThietBi;
import QL_SuaChua.JQLSuaChua;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Administrator
 */
public class JTLTaiSan extends javax.swing.JFrame {
    ArrayList<TSThanhLy> dsTaiSanTL = new ArrayList<>();
    ArrayList<TSThanhLy> dsTLWork = new ArrayList<>();
    int dongchon = -1;
    TSThanhLy tstl = new TSThanhLy();
    SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
    DBEngine db = new DBEngine();
    String fname = "dsTSTL.dat";
    /**
     * Creates new form JTLTaiSan
     */
    public JTLTaiSan() {
        initComponents();
        myInit();
        setTitle("Quản lý thanh lý tài sản");
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
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMaPhieuTL = new javax.swing.JTextField();
        jNgayGui = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jNDeNghi = new javax.swing.JTextField();
        jDonVi = new javax.swing.JTextField();
        jCBKiemTra = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BtnThem = new javax.swing.JButton();
        BtnSua = new javax.swing.JButton();
        BtnHuy = new javax.swing.JButton();
        BtnXoa = new javax.swing.JButton();
        jMTSTL = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jNoiDung = new javax.swing.JTextArea();
        BtnThoat = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        BtnXacNhan = new javax.swing.JButton();
        BtnReset = new javax.swing.JButton();
        jComboTT = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextYKien = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableTSTL = new javax.swing.JTable();
        jComboTTLoc = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Thực hiện"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Mã phiếu TL:");
        jLabel1.setMaximumSize(new java.awt.Dimension(90, 20));
        jLabel1.setMinimumSize(new java.awt.Dimension(80, 20));
        jLabel1.setPreferredSize(new java.awt.Dimension(90, 20));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 90, -1));

        jLabel6.setText("Ngày gửi:");
        jLabel6.setMaximumSize(new java.awt.Dimension(90, 20));
        jLabel6.setMinimumSize(new java.awt.Dimension(80, 20));
        jLabel6.setPreferredSize(new java.awt.Dimension(90, 20));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 90, -1));

        jMaPhieuTL.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel1.add(jMaPhieuTL, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 190, -1));

        jNgayGui.setText("1/1/2000");
        jNgayGui.setToolTipText("Nhập định dạng ngày/tháng/năm");
        jNgayGui.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel1.add(jNgayGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 190, -1));

        jLabel7.setText("Người đề nghị:");
        jLabel7.setMaximumSize(new java.awt.Dimension(90, 20));
        jLabel7.setMinimumSize(new java.awt.Dimension(80, 20));
        jLabel7.setPreferredSize(new java.awt.Dimension(90, 20));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 90, -1));

        jNDeNghi.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel1.add(jNDeNghi, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 190, -1));

        jDonVi.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel1.add(jDonVi, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 190, -1));

        jCBKiemTra.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel1.add(jCBKiemTra, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 190, -1));

        jLabel2.setText("CB kiểm tra:");
        jLabel2.setMaximumSize(new java.awt.Dimension(90, 20));
        jLabel2.setMinimumSize(new java.awt.Dimension(80, 20));
        jLabel2.setPreferredSize(new java.awt.Dimension(90, 20));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 90, -1));

        jLabel3.setText("Đơn vị:");
        jLabel3.setMaximumSize(new java.awt.Dimension(90, 20));
        jLabel3.setMinimumSize(new java.awt.Dimension(80, 20));
        jLabel3.setPreferredSize(new java.awt.Dimension(90, 20));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 90, -1));

        BtnThem.setText("Thêm");
        BtnThem.setMaximumSize(new java.awt.Dimension(100, 100));
        BtnThem.setPreferredSize(new java.awt.Dimension(70, 30));
        BtnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnThemActionPerformed(evt);
            }
        });
        jPanel1.add(BtnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        BtnSua.setText("Sửa");
        BtnSua.setMaximumSize(new java.awt.Dimension(100, 100));
        BtnSua.setPreferredSize(new java.awt.Dimension(70, 30));
        BtnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSuaActionPerformed(evt);
            }
        });
        jPanel1.add(BtnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, -1, -1));

        BtnHuy.setText("Huỷ");
        BtnHuy.setMaximumSize(new java.awt.Dimension(100, 100));
        BtnHuy.setPreferredSize(new java.awt.Dimension(70, 30));
        BtnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHuyActionPerformed(evt);
            }
        });
        jPanel1.add(BtnHuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, -1));

        BtnXoa.setText("Xoá");
        BtnXoa.setMaximumSize(new java.awt.Dimension(100, 100));
        BtnXoa.setPreferredSize(new java.awt.Dimension(70, 30));
        BtnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnXoaActionPerformed(evt);
            }
        });
        jPanel1.add(BtnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, -1, -1));

        jMTSTL.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel1.add(jMTSTL, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 190, -1));

        jLabel5.setText("Tài sản TL:");
        jLabel5.setMaximumSize(new java.awt.Dimension(90, 20));
        jLabel5.setMinimumSize(new java.awt.Dimension(80, 20));
        jLabel5.setPreferredSize(new java.awt.Dimension(90, 20));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 90, -1));

        jLabel8.setText("Nội dung:");
        jLabel8.setMaximumSize(new java.awt.Dimension(90, 20));
        jLabel8.setMinimumSize(new java.awt.Dimension(80, 20));
        jLabel8.setPreferredSize(new java.awt.Dimension(90, 20));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 90, -1));

        jNoiDung.setColumns(20);
        jNoiDung.setRows(5);
        jPanel1.add(jNoiDung, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 190, 50));

        BtnThoat.setText("Thoát");
        BtnThoat.setMaximumSize(new java.awt.Dimension(100, 100));
        BtnThoat.setPreferredSize(new java.awt.Dimension(70, 30));
        BtnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnThoatActionPerformed(evt);
            }
        });
        jPanel1.add(BtnThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 310, 440));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Xét duyệt"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnXacNhan.setText("Xác nhận");
        BtnXacNhan.setPreferredSize(new java.awt.Dimension(70, 30));
        BtnXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnXacNhanActionPerformed(evt);
            }
        });
        jPanel2.add(BtnXacNhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 90, -1));

        BtnReset.setText("Reset");
        BtnReset.setPreferredSize(new java.awt.Dimension(70, 30));
        BtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResetActionPerformed(evt);
            }
        });
        jPanel2.add(BtnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 90, -1));

        jComboTT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboTT.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel2.add(jComboTT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 140, -1));

        jLabel9.setText("Trạng thái:");
        jLabel9.setMaximumSize(new java.awt.Dimension(90, 20));
        jLabel9.setMinimumSize(new java.awt.Dimension(80, 20));
        jLabel9.setPreferredSize(new java.awt.Dimension(90, 20));
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel4.setText("Ý kiến");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jTextYKien.setColumns(20);
        jTextYKien.setRows(5);
        jPanel2.add(jTextYKien, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 460, 160));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Thông tin"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TableTSTL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TableTSTL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableTSTLMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableTSTL);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 720, 180));

        jComboTTLoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboTTLoc.setPreferredSize(new java.awt.Dimension(100, 30));
        jComboTTLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboTTLocActionPerformed(evt);
            }
        });
        jPanel3.add(jComboTTLoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 180, -1));

        jLabel10.setText("Trạng thái:");
        jLabel10.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel10.setPreferredSize(new java.awt.Dimension(90, 25));
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 740, 260));

        jMenu1.setText("Đăng xuất");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Thông tin");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Chức năng");

        jMenuItem1.setText("Mua sắm tài sản");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("Danh sách tài sản");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem3.setText("Điều chuyển tài sản");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("Sửa chữa tài sản");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TableTSTLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableTSTLMouseClicked
        // TODO add your handling code here:
        dongchon = TableTSTL.getSelectedRow();
        if(dongchon !=-1){
            tstl = dsTLWork.get(dongchon);
            jMaPhieuTL.setText(tstl.getMaPhieuTL()+ "");
            jMaPhieuTL.setEnabled(false);
            jNDeNghi.setText(tstl.getnDeNghi() + "");
            jDonVi.setText(tstl.getDonVi() + "");
            jMTSTL.setText(tstl.getMaTSTL()+ "");
            jNoiDung.setText(tstl.getNoiDung()+ "");
            jCBKiemTra.setText(tstl.getCbKT()+ "");
            jNgayGui.setText(tstl.getNgayGui() + "");
            jComboTT.setSelectedItem(tstl.getTrangThai());
            jTextYKien.setText(tstl.getyKien());
            //jComboTTLoc.setSelectedItem(tstl.getTrangThai());
        }
    }//GEN-LAST:event_TableTSTLMouseClicked

    
    private void BtnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnThemActionPerformed
        // TODO add your handling code here:jComboTT.getSelectedItem().toString()
        if(jMaPhieuTL.getText().trim().length()==0||
           jMTSTL.getText().trim().length()==0)
                JOptionPane.showMessageDialog(null, "Mã phiếu và tài sản thanh lý không được để trống!", "Thông báo", JOptionPane.WARNING_MESSAGE);
        else {
            try {            
                tstl = new TSThanhLy(jMaPhieuTL.getText(),jNDeNghi.getText(),jDonVi.getText(),jMTSTL.getText(),
                                  jNoiDung.getText(),jCBKiemTra.getText(),format.parse(jNgayGui.getText()),"Chờ duyệt!");            
                if(dsTaiSanTL.contains(tstl)) 
                    JOptionPane.showMessageDialog(null, "Đã tồn tại mã tài sản, mời nhập lại!\n","Lỗi", JOptionPane.ERROR_MESSAGE);
                else{
                    dsTaiSanTL.add(tstl);
                    loadTableTSTL(dsTaiSanTL);                
                    resetTxt();
                    saveData();
                }            
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, "Hãy kiểm tra dữ liệu, định dạng ngày sinh kiểu MM/dd/yyyy!\n" + ex,"Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_BtnThemActionPerformed

    private void BtnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSuaActionPerformed
        // TODO add your handling code here:
        if(dongchon != -1){
            dongchon = TableTSTL.getSelectedRow();            
            int response = JOptionPane.showConfirmDialog(null, "Bạn có muốn sửa không?", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION){
                try {                    
                    tstl = dsTLWork.get(dongchon);
                    tstl = dsTaiSanTL.get(dsTaiSanTL.indexOf(tstl));
                    tstl.setnDeNghi(jNDeNghi.getText());
                    tstl.setDonVi(jDonVi.getText());
                    tstl.setMaTSTL(jMTSTL.getText());
                    tstl.setNoiDung(jNoiDung.getText());
                    tstl.setCbKT(jCBKiemTra.getText());
                    tstl.setNgayGui(format.parse(jNgayGui.getText()));
                    //tstl.setTrangThai(jComboTT.getSelectedItem().toString());
                    loadTableTSTL(dsTaiSanTL);
                    resetTxt();
                    saveData();
                } catch (ParseException ex) {
                    JOptionPane.showMessageDialog(null, "Hãy kiểm tra dữ liệu, định dạng ngày gửi kiểu MM/dd/yyyy!\n" + ex,"Lỗi", JOptionPane.ERROR_MESSAGE);
                    //Logger.getLogger(JQLTaiSan.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }else
                JOptionPane.showMessageDialog(null, "Cần chọn một bản ghi để sửa!", "Thông báo", JOptionPane.WARNING_MESSAGE);                
    
        
    }//GEN-LAST:event_BtnSuaActionPerformed

    private void BtnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnXoaActionPerformed
        // TODO add your handling code here:
        if (dongchon != -1){
            dongchon = TableTSTL.getSelectedRow();
            tstl = dsTaiSanTL.get(dongchon);
            tstl = dsTaiSanTL.get(dsTaiSanTL.indexOf(tstl));            
            int response = JOptionPane.showConfirmDialog(null, "Bạn có muốn xoá không?", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION){
                try {
                    dsTaiSanTL.remove(tstl);
                    loadTableTSTL(dsTaiSanTL);
                    resetTxt();
                    saveData();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex, "Thông báo", JOptionPane.WARNING_MESSAGE);
                }
            } 
        }else 
            JOptionPane.showMessageDialog(null, "Cần chọn một bản ghi để xóa!", "Thông báo", JOptionPane.WARNING_MESSAGE);
        
    
    }//GEN-LAST:event_BtnXoaActionPerformed

    private void BtnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHuyActionPerformed
        // TODO add your handling code here:
        resetTxt();
    }//GEN-LAST:event_BtnHuyActionPerformed

    private void BtnXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnXacNhanActionPerformed
        // TODO add your handling code here:
        dongchon = TableTSTL.getSelectedRow();
        if(dongchon != -1){                                                                        
                    tstl = dsTLWork.get(dongchon);
                    tstl = dsTaiSanTL.get(dsTaiSanTL.indexOf(tstl));
                    tstl.setTrangThai(jComboTT.getSelectedItem().toString());
                    tstl.setyKien(jTextYKien.getText());
                    loadTableTSTL(dsTLWork);
                    resetTxt();
                    jComboTT.setSelectedIndex(0);
                    jTextYKien.setText("");
                    saveData();                          
        }else
                JOptionPane.showMessageDialog(null, "Cần chọn một bản ghi để xét duyệt!", "Thông báo", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_BtnXacNhanActionPerformed

    private void BtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResetActionPerformed
        // TODO add your handling code here:        
        jComboTT.setSelectedIndex(0);
        jTextYKien.setText("");
    }//GEN-LAST:event_BtnResetActionPerformed

    private void jComboTTLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboTTLocActionPerformed
        // TODO add your handling code here:
        ArrayList<TSThanhLy> dsLoc = new ArrayList<>();
        String itemLoc = jComboTTLoc.getSelectedItem().toString();
        if(itemLoc.equalsIgnoreCase("Tất cả")){
            loadTableTSTL(dsTaiSanTL);
            dsTLWork=dsTaiSanTL;
        }            
        else{
            for(TSThanhLy itm : dsTaiSanTL) 
                if(itm.getTrangThai().equalsIgnoreCase(itemLoc)) dsLoc.add(itm);
            loadTableTSTL(dsLoc);
            dsTLWork=dsLoc;
        }
    }//GEN-LAST:event_jComboTTLocActionPerformed

    private void BtnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnThoatActionPerformed
        // TODO add your handling code here:
        saveData();
        this.dispose();
    }//GEN-LAST:event_BtnThoatActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        DangNhap dnForm = new DangNhap();
        dnForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        ThongTinNhom ttnForm = new ThongTinNhom();
        ttnForm.setVisible(true);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        JMSThietBi qlMSForm = new JMSThietBi();
        qlMSForm.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        JQLTaiSan qlTSForm = new JQLTaiSan();
        qlTSForm.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        JQLDieuChuyen qlDCForm = new JQLDieuChuyen();
        qlDCForm.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        JQLSuaChua qlSCForm = new JQLSuaChua();
        qlSCForm.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(JTLTaiSan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JTLTaiSan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JTLTaiSan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JTLTaiSan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new JTLTaiSan().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnHuy;
    private javax.swing.JButton BtnReset;
    private javax.swing.JButton BtnSua;
    private javax.swing.JButton BtnThem;
    private javax.swing.JButton BtnThoat;
    private javax.swing.JButton BtnXacNhan;
    private javax.swing.JButton BtnXoa;
    private javax.swing.JTable TableTSTL;
    private javax.swing.JTextField jCBKiemTra;
    private javax.swing.JComboBox<String> jComboTT;
    private javax.swing.JComboBox<String> jComboTTLoc;
    private javax.swing.JTextField jDonVi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jMTSTL;
    private javax.swing.JTextField jMaPhieuTL;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JTextField jNDeNghi;
    private javax.swing.JTextField jNgayGui;
    private javax.swing.JTextArea jNoiDung;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextYKien;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
      readData();
      loadTableTSTL(dsTaiSanTL);
      dsTLWork=dsTaiSanTL;
      
      String tt[] = {"Chờ duyệt!","Không duyệt!","Đã duyệt!"};
      jComboTT.setModel(new DefaultComboBoxModel(tt));
      
      jComboTTLoc.setModel(new DefaultComboBoxModel(tt));
      jComboTTLoc.addItem("Tất cả");
      jComboTTLoc.setSelectedItem("Tất cả");
    }

    private void readData() {
        try {
            dsTaiSanTL = (ArrayList<TSThanhLy>) db.docFile(fname);
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Danh sách hiện tại rỗng!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Lỗi đọc dữ liệu:\n" +ex,"Lỗi", JOptionPane.ERROR_MESSAGE);
            //Logger.getLogger(JQLTaiSan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadTableTSTL(ArrayList<TSThanhLy> ds) {
        TableTSTL.setModel(new TableTSThanhLy(ds));
    }

    private void resetTxt() {
       jMaPhieuTL.setText("");
       jNDeNghi.setText("");
       jDonVi.setText("");
       jMTSTL.setText("");
       jNoiDung.setText("");
       jCBKiemTra.setText("");
       jNgayGui.setText("01/01/2022");       
       jMaPhieuTL.setEnabled(true);
       jMaPhieuTL.requestFocus();
       dongchon = -1;
    }

    private void saveData() {
        try {
            db.LuuFile(fname,dsTaiSanTL);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Lỗi lưu dữ liệu:\n" +ex,"Lỗi", JOptionPane.ERROR_MESSAGE);
            //Logger.getLogger(JQLTaiSan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
