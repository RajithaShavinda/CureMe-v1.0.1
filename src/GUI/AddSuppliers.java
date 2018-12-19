/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import Code.ConnectionDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Shavinda
 */
public class AddSuppliers extends javax.swing.JFrame {

    /**
     * Creates new form SupplyManagement
     */
    
    
    public AddSuppliers() {
        initComponents();
        setLocationRelativeTo(null);
        
        if(SupplierManagement.isAddS){
            btn_Update.setEnabled(false);
  
        }
        else{
            btn_Add.setEnabled(false);
            init();

        }
    }
    
    
    
    
    
     private void init(){
        try{
        java.sql.Connection con = ConnectionDB.Connect();
            
            String sql="SELECT * FROM `supplier` WHERE `suName`='" +SupplierManagement.nameS+ "';";
            java.sql.Statement state = con.createStatement();
            
            ResultSet rs = state.executeQuery(sql);
            rs.next();
            
       
            txt_Name.setText(rs.getString("suName"));
            txt_Company.setText(rs.getString("suCompany"));
            txt_Phone.setText(rs.getString("suPhone"));
            txt_Des.setText(rs.getString("suDes"));
            
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

        jPanel_Add_Suppliers = new javax.swing.JPanel();
        txt_Name = new javax.swing.JTextField();
        txt_Company = new javax.swing.JTextField();
        txt_Phone = new javax.swing.JTextField();
        txt_Des = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblCompany = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        lblDes = new javax.swing.JLabel();
        btn_Add = new javax.swing.JButton();
        btn_Exit = new javax.swing.JButton();
        btn_Update = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_Add_Suppliers.setLayout(null);
        jPanel_Add_Suppliers.add(txt_Name);
        txt_Name.setBounds(170, 130, 400, 30);
        jPanel_Add_Suppliers.add(txt_Company);
        txt_Company.setBounds(170, 180, 400, 30);
        jPanel_Add_Suppliers.add(txt_Phone);
        txt_Phone.setBounds(170, 230, 400, 30);
        jPanel_Add_Suppliers.add(txt_Des);
        txt_Des.setBounds(170, 280, 400, 70);

        lblName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblName.setText("Name             :  ");
        jPanel_Add_Suppliers.add(lblName);
        lblName.setBounds(60, 130, 130, 30);

        lblCompany.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCompany.setText("Company       :  ");
        jPanel_Add_Suppliers.add(lblCompany);
        lblCompany.setBounds(60, 180, 130, 30);

        lblPhone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPhone.setText("Phone No      :   ");
        jPanel_Add_Suppliers.add(lblPhone);
        lblPhone.setBounds(60, 230, 120, 30);

        lblDes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDes.setText("Description    :  ");
        jPanel_Add_Suppliers.add(lblDes);
        lblDes.setBounds(60, 280, 140, 30);

        btn_Add.setBackground(new java.awt.Color(204, 204, 255));
        btn_Add.setText("Add");
        jPanel_Add_Suppliers.add(btn_Add);
        btn_Add.setBounds(310, 460, 160, 40);

        btn_Exit.setBackground(new java.awt.Color(153, 0, 0));
        btn_Exit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_Exit.setForeground(new java.awt.Color(255, 255, 255));
        btn_Exit.setText("Exit");
        btn_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExitActionPerformed(evt);
            }
        });
        jPanel_Add_Suppliers.add(btn_Exit);
        btn_Exit.setBounds(30, 460, 200, 40);

        btn_Update.setText("Update");
        jPanel_Add_Suppliers.add(btn_Update);
        btn_Update.setBounds(510, 460, 160, 40);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/M8.jpg"))); // NOI18N
        jPanel_Add_Suppliers.add(lblBackground);
        lblBackground.setBounds(-6, -6, 710, 530);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_Add_Suppliers, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_Add_Suppliers, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_ExitActionPerformed

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
            java.util.logging.Logger.getLogger(AddSuppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddSuppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddSuppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddSuppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddSuppliers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Add;
    private javax.swing.JButton btn_Exit;
    private javax.swing.JButton btn_Update;
    private javax.swing.JPanel jPanel_Add_Suppliers;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblCompany;
    private javax.swing.JLabel lblDes;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JTextField txt_Company;
    private javax.swing.JTextField txt_Des;
    private javax.swing.JTextField txt_Name;
    private javax.swing.JTextField txt_Phone;
    // End of variables declaration//GEN-END:variables
}