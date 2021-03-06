/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import Code.ConnectionDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Shavinda
 */
public class addSupplies extends javax.swing.JFrame {

    /**
     * Creates new form SupplyManagement
     */
    public addSupplies() {
        initComponents();
        setLocationRelativeTo(null);
        
        if(DrugManagement.isAdd){
            btn_Update.setEnabled(false);
            btn_Delete.setEnabled(false);
        }
        else{
            btn_Add.setEnabled(false);
            txt_Iid.setEditable(false);
            init();
        }
    }

    private void init(){
        try{
        java.sql.Connection con = ConnectionDB.Connect();
            
            String sql="SELECT * FROM `drugs` WHERE `dName`='" +DrugManagement.name + "';";
            java.sql.Statement state = con.createStatement();
            
            ResultSet rs = state.executeQuery(sql);
            rs.next();
            
            txt_Iid.setText(""+rs.getInt("dId"));
            txt_Iname.setText(rs.getString("dName"));
            txt_Company.setText(rs.getString("dCompany"));
            txt_P_price.setText(""+rs.getFloat("dPprice"));
            txt_S_price.setText(""+rs.getFloat("dSprice"));
            txt_Des.setText(rs.getString("dDes"));
            
            rs.close();
            
            } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, se.getMessage());
            //return null;
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
            //return null;
        }
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_AddSupplies = new javax.swing.JPanel();
        btn_Add = new javax.swing.JButton();
        btn_Delete = new javax.swing.JButton();
        btn_Exit = new javax.swing.JButton();
        btn_Update = new javax.swing.JButton();
        txt_Iname = new javax.swing.JTextField();
        txt_Iid = new javax.swing.JTextField();
        txt_Company = new javax.swing.JTextField();
        txt_S_price = new javax.swing.JTextField();
        txt_P_price = new javax.swing.JTextField();
        txt_Des = new javax.swing.JTextField();
        lbl_Iname = new javax.swing.JLabel();
        lbl_Company = new javax.swing.JLabel();
        lbl_P_Price = new javax.swing.JLabel();
        lbl_S_Price = new javax.swing.JLabel();
        lbl_Des = new javax.swing.JLabel();
        lbl_Iid = new javax.swing.JLabel();
        lbl_BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_AddSupplies.setLayout(null);

        btn_Add.setBackground(new java.awt.Color(204, 204, 255));
        btn_Add.setText("Add");
        btn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddActionPerformed(evt);
            }
        });
        jPanel_AddSupplies.add(btn_Add);
        btn_Add.setBounds(510, 130, 160, 40);

        btn_Delete.setText("Delete");
        btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteActionPerformed(evt);
            }
        });
        jPanel_AddSupplies.add(btn_Delete);
        btn_Delete.setBounds(510, 270, 160, 40);

        btn_Exit.setBackground(new java.awt.Color(153, 0, 0));
        btn_Exit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_Exit.setForeground(new java.awt.Color(255, 255, 255));
        btn_Exit.setText("Exit");
        btn_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExitActionPerformed(evt);
            }
        });
        jPanel_AddSupplies.add(btn_Exit);
        btn_Exit.setBounds(30, 460, 200, 40);

        btn_Update.setText("Update");
        btn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateActionPerformed(evt);
            }
        });
        jPanel_AddSupplies.add(btn_Update);
        btn_Update.setBounds(510, 200, 160, 40);
        jPanel_AddSupplies.add(txt_Iname);
        txt_Iname.setBounds(160, 190, 200, 30);
        jPanel_AddSupplies.add(txt_Iid);
        txt_Iid.setBounds(160, 140, 200, 30);
        jPanel_AddSupplies.add(txt_Company);
        txt_Company.setBounds(160, 240, 200, 30);
        jPanel_AddSupplies.add(txt_S_price);
        txt_S_price.setBounds(160, 340, 200, 30);
        jPanel_AddSupplies.add(txt_P_price);
        txt_P_price.setBounds(160, 290, 200, 30);
        jPanel_AddSupplies.add(txt_Des);
        txt_Des.setBounds(160, 390, 200, 30);

        lbl_Iname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Iname.setText("Item Name    :  ");
        jPanel_AddSupplies.add(lbl_Iname);
        lbl_Iname.setBounds(50, 190, 130, 30);

        lbl_Company.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Company.setText("Company       :  ");
        jPanel_AddSupplies.add(lbl_Company);
        lbl_Company.setBounds(50, 240, 130, 30);

        lbl_P_Price.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_P_Price.setText("Purchase Price:  ");
        jPanel_AddSupplies.add(lbl_P_Price);
        lbl_P_Price.setBounds(50, 290, 120, 30);

        lbl_S_Price.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_S_Price.setText("Sales Price      :  ");
        jPanel_AddSupplies.add(lbl_S_Price);
        lbl_S_Price.setBounds(50, 340, 130, 30);

        lbl_Des.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Des.setText("Description    :  ");
        jPanel_AddSupplies.add(lbl_Des);
        lbl_Des.setBounds(50, 390, 140, 30);

        lbl_Iid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Iid.setText("Item ID         :  ");
        jPanel_AddSupplies.add(lbl_Iid);
        lbl_Iid.setBounds(50, 140, 130, 30);

        lbl_BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/M8.jpg"))); // NOI18N
        jPanel_AddSupplies.add(lbl_BG);
        lbl_BG.setBounds(0, 0, 710, 530);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_AddSupplies, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_AddSupplies, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed
        // TODO add your handling code here:
        try{
            java.sql.Connection con = ConnectionDB.Connect();
            String str="INSERT INTO `drugs` values("+Integer.parseInt(txt_Iid.getText())+",'"+txt_Iname.getText()+"','"+txt_Company.getText()+"',"+
                    Float.parseFloat(txt_P_price.getText())+","+Float.parseFloat(txt_S_price.getText())+
                    ",'"+txt_Des.getText()+"',0,'2017-06-09');";
        
            Statement statement=con.createStatement();
            
            statement.executeUpdate(str);
            statement.close();
            
            JOptionPane.showMessageDialog(null, "Successfull");
        
             } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, se.getMessage());
            //return null;
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
            //return null;
        }
        
        
        
        
        
    }//GEN-LAST:event_btn_AddActionPerformed

    private void btn_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExitActionPerformed
        // TODO add your handling code here:
         this.dispose();
    }//GEN-LAST:event_btn_ExitActionPerformed

    private void btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateActionPerformed
        // TODO add your handling code here:
        
          /*    try{
            java.sql.Connection con = ConnectionDB.Connect();
   
            String query="UPDATE `drugs` SET `dName`='"+txt_Iname.getText()+"',`dCompany`='"+txt_Company.getText()+"',`dPprice`="+Float.parseFloat(txt_P_price.getText())+
                    ",`dSprice`="+Float.parseFloat(txt_S_price.getText())+",`dDes`='"+txt_Des.getText()"'   WHERE `dID`="+Integer.parseInt(txt_Iid.getText())+";";
        
            Statement statement=con.createStatement();
            
            statement.executeUpdate(query);
            statement.close();
            
            JOptionPane.showMessageDialog(null, "Successfull");
        
             } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, se.getMessage());
            //return null;
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
            //return null;
        }
        */
        
    }//GEN-LAST:event_btn_UpdateActionPerformed

    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed
        // TODO add your handling code here:
        
        
                
            try{
            java.sql.Connection con = ConnectionDB.Connect();
   
            String query="DELETE FROM `drugs` WHERE `dID`="+Integer.parseInt(txt_Iid.getText())+";";
        
            Statement statement=con.createStatement();
            
            statement.executeUpdate(query);
            statement.close();
            
            JOptionPane.showMessageDialog(null, "Successfull");
        
             } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, se.getMessage());
            //return null;
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
            //return null;
        }
    }//GEN-LAST:event_btn_DeleteActionPerformed

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
            java.util.logging.Logger.getLogger(addSupplies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addSupplies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addSupplies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addSupplies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addSupplies().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Add;
    private javax.swing.JButton btn_Delete;
    private javax.swing.JButton btn_Exit;
    private javax.swing.JButton btn_Update;
    private javax.swing.JPanel jPanel_AddSupplies;
    private javax.swing.JLabel lbl_BG;
    private javax.swing.JLabel lbl_Company;
    private javax.swing.JLabel lbl_Des;
    private javax.swing.JLabel lbl_Iid;
    private javax.swing.JLabel lbl_Iname;
    private javax.swing.JLabel lbl_P_Price;
    private javax.swing.JLabel lbl_S_Price;
    private javax.swing.JTextField txt_Company;
    private javax.swing.JTextField txt_Des;
    private javax.swing.JTextField txt_Iid;
    private javax.swing.JTextField txt_Iname;
    private javax.swing.JTextField txt_P_price;
    private javax.swing.JTextField txt_S_price;
    // End of variables declaration//GEN-END:variables
}
