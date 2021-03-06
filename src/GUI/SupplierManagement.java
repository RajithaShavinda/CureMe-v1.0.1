/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import Code.ConnectionDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shavinda
 */
public class SupplierManagement extends javax.swing.JFrame {

    /**
     * Creates new form SupplyManagement*/
    public static boolean isAddS=true;
    public static String nameS=""; 
    
    public SupplierManagement() {
        initComponents();
        setLocationRelativeTo(null);
        display();
        
        
    }
    
    
    private void display(){
        try{
            
            java.sql.Connection con = ConnectionDB.Connect();
            
            String sql="SELECT * FROM `supplier`";
            
            java.sql.Statement state = con.createStatement();
            
            ResultSet rs = state.executeQuery(sql);
            
  
            DefaultTableModel model = (DefaultTableModel) jTable_SupplierManagement.getModel();

            while (rs.next()) {

            
                model.addRow(new Object[]{ rs.getString("suName"), rs.getString("suCompany"),
                    rs.getString("suEmail"),rs.getString("suPhone"),rs.getString("suDes")});
             
                jTable_SupplierManagement.setModel(model);
            }
            
            
            state.close(); //Statement
            
            rs.close(); // ResultSet
                 

        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, se.getMessage());
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        //---------------------------------------------------------------------
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
        btn_Update = new javax.swing.JButton();
        btn_Add = new javax.swing.JButton();
        btn_Exit = new javax.swing.JButton();
        btn_Delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_SupplierManagement = new javax.swing.JTable();
        lbl_Smanagement = new javax.swing.JLabel();
        lbl_BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        btn_Update.setText("Update");
        btn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Update);
        btn_Update.setBounds(410, 470, 130, 40);

        btn_Add.setBackground(new java.awt.Color(204, 204, 255));
        btn_Add.setText("Add");
        btn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Add);
        btn_Add.setBounds(270, 470, 130, 40);

        btn_Exit.setBackground(new java.awt.Color(153, 0, 0));
        btn_Exit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_Exit.setForeground(new java.awt.Color(255, 255, 255));
        btn_Exit.setText("Exit");
        btn_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExitActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Exit);
        btn_Exit.setBounds(20, 470, 200, 40);

        btn_Delete.setBackground(new java.awt.Color(255, 102, 102));
        btn_Delete.setText("Delete");
        jPanel1.add(btn_Delete);
        btn_Delete.setBounds(560, 470, 130, 40);

        jTable_SupplierManagement.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Company", "Email", "Phone No", "Description"
            }
        ));
        jScrollPane1.setViewportView(jTable_SupplierManagement);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 140, 700, 290);

        lbl_Smanagement.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_Smanagement.setText("Supplier Management");
        jPanel1.add(lbl_Smanagement);
        lbl_Smanagement.setBounds(240, 100, 270, 40);

        lbl_BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/M8.jpg"))); // NOI18N
        jPanel1.add(lbl_BG);
        lbl_BG.setBounds(-6, -6, 710, 530);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed
        // TODO add your handling code here:
        isAddS=true;
        
        new AddSuppliers().setVisible(true);
    }//GEN-LAST:event_btn_AddActionPerformed

    private void btn_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_ExitActionPerformed

    private void btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateActionPerformed
        // TODO add your handling code here:
        isAddS=false;
        int row = -99;
                
              row = jTable_SupplierManagement.getSelectedRow();

              if (row == -99) {

                  JOptionPane.showMessageDialog(null, "Please select an item");
                  
              
              } 
              else{
        nameS=jTable_SupplierManagement.getModel().getValueAt(row, 0).toString();
                  new AddSuppliers().setVisible(true);
         
              }
    }//GEN-LAST:event_btn_UpdateActionPerformed

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
            java.util.logging.Logger.getLogger(SupplierManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SupplierManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SupplierManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SupplierManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SupplierManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Add;
    private javax.swing.JButton btn_Delete;
    private javax.swing.JButton btn_Exit;
    private javax.swing.JButton btn_Update;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_SupplierManagement;
    private javax.swing.JLabel lbl_BG;
    private javax.swing.JLabel lbl_Smanagement;
    // End of variables declaration//GEN-END:variables
}
