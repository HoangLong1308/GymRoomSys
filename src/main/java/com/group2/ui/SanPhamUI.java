/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group2.ui;

import com.group2.dao.SanPhamDAO;
import com.group2.entity.GioHangSP;
import com.group2.entity.SanPham;
import com.group2.entity.SanPhamMua;
import com.group2.swing.Alert;
import com.group2.swing.CartModel;
import com.group2.swing.EpisodePackModel;
import com.group2.swing.ProductModel;
import com.group2.swing.ScrollBarCustom;
import com.group2.utils.MsgBox;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author HieuHoang
 */
public class SanPhamUI extends javax.swing.JPanel {

    SanPhamDAO spDAO = new SanPhamDAO();
    List<SanPham> list, listClone;

    /**
     * Creates new form SanPhamUI
     */
    public SanPhamUI() {
        initComponents();
        designUI();
        main.setLayout(new MigLayout("wrap 4, insets 20"));
        fillProcduct(cboLoaiSP.getSelectedItem().toString());
//        themTableGioHang();
    }

    public JPanel getMain() {
        return main;
    }

    public void setMain(JPanel main) {
        this.main = main;
    }

    public void addItemSanPham(ProductModel pm) {
        main.add(pm);
    }

    public void fillProcduct(String LoaiSP) {
        main.removeAll();
        list = spDAO.getLoaiSP();
        listClone = new ArrayList<>();

        for (SanPham sp : list) {
            if (LoaiSP.equals("Tất cả") && sp.getSoLuong() > 0) {
                addItemSanPham(new ProductModel(sp, gioHangPanel1));
                listClone.add(sp);
                continue;
            } else if (LoaiSP.equals(sp.getTenLoai()) && sp.getSoLuong() > 0) {
                addItemSanPham(new ProductModel(sp, gioHangPanel1));
                listClone.add(sp);
                continue;
            }
        }
        main.repaint();
    }

    DefaultTableModel model;

//    public void themTableGioHang() {
//        model = (DefaultTableModel) tblSPMua.getModel();
//        model.setRowCount(0);
//        for (SanPhamMua sp : GioHangSP.listSP) {
//            Object row[] = {sp.getMaSP(), sp.getTenSP(), sp.getSoLuong()};
//            model.addRow(row);
//        }
//
//    }
//    public void xoaSP() {
//
//        for (int i = 0; i < GioHangSP.listSP.size(); i++) {
//            if (tblSPMua.getValueAt(tblSPMua.getSelectedRow(), 0).equals(GioHangSP.listSP.get(i).getMaSP())) {
//                GioHangSP.listSP.remove(i);
//            }
//        }
//        themTableGioHang();
//    }
//    public void thayDoiSL() {
//        System.out.println("" + GioHangSP.listSP.get(tblSPMua.getSelectedRow()));
//        Object giatri = tblSPMua.getValueAt(tblSPMua.getSelectedRow(), 2);
//        GioHangSP.listSP.get(tblSPMua.getSelectedRow()).setSoLuong(Integer.parseInt(giatri + ""));
//        themTableGioHang();
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        mnuXoa = new javax.swing.JMenuItem();
        gradientBackGround1 = new com.group2.swing.GradientBackGround();
        jScrollPane1 = new javax.swing.JScrollPane();
        main = new javax.swing.JPanel();
        txtTimSP = new com.group2.swing.TextField();
        button1 = new com.group2.swing.Button();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cboLoaiSP = new com.group2.swing.ComboBoxSuggestion();
        cboLocTheoGia = new com.group2.swing.ComboBoxSuggestion();
        jSeparator1 = new javax.swing.JSeparator();
        gioHangPanel1 = new com.group2.swing.GioHangSPPanel();
        jSeparator2 = new javax.swing.JSeparator();
        button2 = new com.group2.swing.Button();
        jSeparator3 = new javax.swing.JSeparator();

        mnuXoa.setText("Xóa");
        mnuXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuXoaActionPerformed(evt);
            }
        });
        jPopupMenu1.add(mnuXoa);

        setOpaque(false);

        gradientBackGround1.setBorderRadius(10);
        gradientBackGround1.setShadowSize(5);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        main.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 859, Short.MAX_VALUE)
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(main);

        txtTimSP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTimSP.setLabelText("Tên sản phẩm");
        txtTimSP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimSPKeyReleased(evt);
            }
        });

        button1.setBackground(new java.awt.Color(0, 102, 51));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("Lọc");
        button1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(150, 150, 150));
        jLabel5.setText("Giá");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(150, 150, 150));
        jLabel6.setText("Danh mục");

        cboLoaiSP.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tất cả", "Sữa tăng cân", "Sữa tăng cơ", "Phụ kiện thân trên", "Thời trang fitness", "Thực phẩm và tạp hóa thể thao", "Phụ kiện thân dưới", "Vitamin và khoáng chất", "Tăng sức mạnh", "BCAA và Amino Acids" }));
        cboLoaiSP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cboLoaiSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLoaiSPActionPerformed(evt);
            }
        });

        cboLocTheoGia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Giá dưới 500.000đ", "500.000đ - 1.000.000đ", "1.000.000đ - 2.000.000đ", "2.000.000đ - 5.000.000đ", "Giá trên 5.000.000đ" }));
        cboLocTheoGia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cboLocTheoGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLocTheoGiaActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        gioHangPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gioHangPanel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gioHangPanel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gioHangPanel1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                gioHangPanel1MousePressed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        button2.setBackground(new java.awt.Color(0, 51, 204));
        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setText("Quét mã");
        button2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout gradientBackGround1Layout = new javax.swing.GroupLayout(gradientBackGround1);
        gradientBackGround1.setLayout(gradientBackGround1Layout);
        gradientBackGround1Layout.setHorizontalGroup(
            gradientBackGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientBackGround1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gradientBackGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(gradientBackGround1Layout.createSequentialGroup()
                        .addGroup(gradientBackGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gradientBackGround1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cboLoaiSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTimSP, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(gradientBackGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboLocTheoGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(gioHangPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        gradientBackGround1Layout.setVerticalGroup(
            gradientBackGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientBackGround1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(gradientBackGround1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, gradientBackGround1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(6, 6, 6)
                        .addComponent(cboLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtTimSP, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, gradientBackGround1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboLocTheoGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(gioHangPanel1, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button1, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button2, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradientBackGround1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradientBackGround1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed


//        themTableGioHang();
//        updateSLGioHang();
    }//GEN-LAST:event_button3ActionPerformed


    private void mnuXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuXoaActionPerformed
//        xoaSP();
    }//GEN-LAST:event_mnuXoaActionPerformed

    private void txtTimSPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimSPKeyReleased
        cboLoaiSP.setSelectedIndex(0);
        cboLocTheoGia.setSelectedIndex(0);
        main.removeAll();
        list = spDAO.timSanPham("%" + txtTimSP.getText() + "%", "%" + txtTimSP.getText() + "%");
        for (SanPham sp : list) {
            addItemSanPham(new ProductModel(sp, gioHangPanel1));
        }
        main.repaint();
    }//GEN-LAST:event_txtTimSPKeyReleased

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        main.removeAll();

        listClone.clear();
        Integer gia1 = 0, gia2 = 0;
        switch (cboLocTheoGia.getSelectedIndex()) {
            case 0:
                gia1 = 500000;
                gia2 = 0;
                break;
            case 1:
                gia1 = 1000000;
                gia2 = 500000;
                break;
            case 2:
                gia1 = 2000000;
                gia2 = 1000000;
                break;
            case 3:
                gia1 = 5000000;
                gia2 = 2000000;
                break;
            case 4:
                gia1 = 100000000;
                gia2 = 5000000;
                break;
        }

        if (cboLoaiSP.getSelectedItem().equals("Tất cả")) {
            listClone = spDAO.LocSanPhamKhongTheoLoai(txtTimSP.getText(), gia1, gia2);
        } else {
            listClone = spDAO.LocSanPhamTheoLoai(cboLoaiSP.getSelectedItem().toString(),
                    txtTimSP.getText(), gia1, gia2);
        }
        for (SanPham sp : listClone) {
            addItemSanPham(new ProductModel(sp, gioHangPanel1));
        }
        main.repaint();
    }//GEN-LAST:event_button1ActionPerformed

    private void cboLoaiSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboLoaiSPActionPerformed
        // TODO add your handling code here:
        fillProcduct(cboLoaiSP.getSelectedItem().toString());
    }//GEN-LAST:event_cboLoaiSPActionPerformed

    private void cboLocTheoGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboLocTheoGiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboLocTheoGiaActionPerformed

    private void gioHangPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gioHangPanel1MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_gioHangPanel1MouseClicked

    private void gioHangPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gioHangPanel1MouseEntered
        // TODO add your handling code here:


    }//GEN-LAST:event_gioHangPanel1MouseEntered

    private void gioHangPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gioHangPanel1MouseExited
        // TODO add your handling code here:

    }//GEN-LAST:event_gioHangPanel1MouseExited

    private void gioHangPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gioHangPanel1MousePressed
        // TODO add your handling code here:
        if (GioHangSP.listSP.size() == 0) {
            MsgBox.alert(null, "Giỏ hàng trống", "Vui lòng chọn sản phẩm hoặc quét mã!", Alert.AlertType.ERROR);
        } else {
            new HoaDonSanPhamJDailog(gioHangPanel1).setVisible(true);
            fillProcduct(cboLoaiSP.getSelectedItem().toString());

        }

    }//GEN-LAST:event_gioHangPanel1MousePressed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        new QuetMaSPJDailog(gioHangPanel1).setVisible(true);
    }//GEN-LAST:event_button2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.group2.swing.Button button1;
    private com.group2.swing.Button button2;
    private com.group2.swing.ComboBoxSuggestion cboLoaiSP;
    private com.group2.swing.ComboBoxSuggestion cboLocTheoGia;
    private com.group2.swing.GioHangSPPanel gioHangPanel1;
    private com.group2.swing.GradientBackGround gradientBackGround1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel main;
    private javax.swing.JMenuItem mnuXoa;
    private com.group2.swing.TextField txtTimSP;
    // End of variables declaration//GEN-END:variables

    private void designUI() {
        jScrollPane1.setVerticalScrollBar(new ScrollBarCustom());
        jScrollPane1.setHorizontalScrollBar(new ScrollBarCustom());
    }
}
