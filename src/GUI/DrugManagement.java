/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import Code.ConnectionDB;
import Code.Drugs;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shavinda
 */
public class DrugManagement extends javax.swing.JFrame {

    /**
     * Creates new form DrugManagement
     */
    public static boolean isAdd=true;
    public static String name="";
            
    Drugs drug;
    private float total=0;
    
    public DrugManagement() {
        initComponents();
        setLocationRelativeTo(null);
        
         txt_SALEname.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
              
            }

            @Override
            public void keyPressed(KeyEvent e) {
                 DefaultTableModel dm = (DefaultTableModel) jTable1.getModel();
             dm.getDataVector().removeAllElements();
            dm.fireTableDataChanged();
              setList(dm);
             
            }

            @Override
            public void keyReleased(KeyEvent e) {
              
            }
        });
         
         
         txt_ItemName.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
              
            }

            @Override
            public void keyPressed(KeyEvent e) {
                 DefaultTableModel dm1 = (DefaultTableModel) jTable1.getModel();
             dm1.getDataVector().removeAllElements();
            dm1.fireTableDataChanged(); 
              setList(dm1);
             
            }

            @Override
            public void keyReleased(KeyEvent e) {
              
            }
        });
         
    }

    
    
         private Drugs Search(String item, float quantity){
        try{
            float q;
            
            java.sql.Connection con = ConnectionDB.Connect();
            
            String sql="SELECT `dID`, `dName`, `dSprice`, `dQuantity` FROM `drugs` WHERE `dName`='"+item+"'";
            
            java.sql.Statement state = con.createStatement();
            
            ResultSet rs = state.executeQuery(sql);
            
  
            DefaultTableModel model = (DefaultTableModel) jTable_DrugManagement.getModel();

            rs.next();
            
            q=rs.getFloat("dQuantity");
            
            if(q>=quantity){
                lbl_available.setText("Availability   :  Available");
                btn_Add.setEnabled(true);
            }
            else{
                 lbl_available.setText("Availability   : NOT AVAILABLE");
                 btn_Add.setEnabled(false);
            }
            
            Drugs d=new Drugs(rs.getInt("dID"), rs.getString("dName"), "", 0, rs.getFloat("dSprice"), rs.getFloat("dQuantity"), "", "", "", 0);
         
               
            state.close(); //Statement
            
            rs.close(); // ResultSet
                 
            return d;

        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, se.getMessage());
            return null;
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
           return null;
        }
        //---------------------------------------------------------------------
        
         }
        
         
         
         
         
         
         
        private void setList(DefaultTableModel model){
            try{
             
            java.sql.Connection con = ConnectionDB.Connect();
            String txt=txt_SALEname.getText();
            
            String sql="SELECT `dName` FROM `drugs` WHERE `dName` like '%" + txt + "%'";
            
            java.sql.Statement state = con.createStatement();
            
            ResultSet rs = state.executeQuery(sql);
            
           

            while (rs.next()) {

            
                model.addRow(new Object[]{rs.getString("dName")});
             
                jTable1.setModel(model);
            }
            
            
            state.close(); //Statement
            
            rs.close(); // ResultSet
            
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

        jPanel_DrugManagement = new javax.swing.JPanel();
        lbl_Date = new javax.swing.JLabel();
        lbl_available = new javax.swing.JLabel();
        lbl_Rno = new javax.swing.JLabel();
        lbl_TotalAmount = new javax.swing.JLabel();
        lbl_final = new javax.swing.JLabel();
        lbl_TotalAmount2 = new javax.swing.JLabel();
        lbl_SALEname = new javax.swing.JLabel();
        lbl_SALEquantity = new javax.swing.JLabel();
        txt_amount = new javax.swing.JTextField();
        txt_totalAmount = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txt_SALEquantity = new javax.swing.JTextField();
        txt_SALEname = new javax.swing.JTextField();
        btn_Add = new javax.swing.JButton();
        btn_Purchase = new javax.swing.JButton();
        btn_SALEsearch = new javax.swing.JButton();
        btn_Cancel = new javax.swing.JButton();
        btn_Clear = new javax.swing.JButton();
        btn_Exit = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_DrugManagement = new javax.swing.JTable();
        jPanel_Supplies = new javax.swing.JPanel();
        lbl_Name = new javax.swing.JLabel();
        lbl_Quantity = new javax.swing.JLabel();
        txt_ItemQuantity = new javax.swing.JTextField();
        txt_ItemName = new javax.swing.JTextField();
        btn_ItemsUpdate = new javax.swing.JButton();
        btn_ItemsNew = new javax.swing.JButton();
        btn_AddItems = new javax.swing.JButton();
        lbl_BGsupplies = new javax.swing.JLabel();
        lbl_BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 700));

        jPanel_DrugManagement.setLayout(null);

        lbl_Date.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_Date.setText("12/05/2017");
        jPanel_DrugManagement.add(lbl_Date);
        lbl_Date.setBounds(510, 90, 150, 30);

        lbl_available.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_available.setText("Availability   :  -");
        jPanel_DrugManagement.add(lbl_available);
        lbl_available.setBounds(40, 250, 220, 30);

        lbl_Rno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Rno.setText("Receipt No :  1001");
        jPanel_DrugManagement.add(lbl_Rno);
        lbl_Rno.setBounds(40, 130, 180, 30);

        lbl_TotalAmount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_TotalAmount.setText("Amount          : ");
        jPanel_DrugManagement.add(lbl_TotalAmount);
        lbl_TotalAmount.setBounds(700, 530, 140, 30);

        lbl_final.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_final.setText("Total Amount   : ");
        jPanel_DrugManagement.add(lbl_final);
        lbl_final.setBounds(650, 620, 350, 30);

        lbl_TotalAmount2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_TotalAmount2.setText("Total Amount   : ");
        jPanel_DrugManagement.add(lbl_TotalAmount2);
        lbl_TotalAmount2.setBounds(690, 490, 140, 30);

        lbl_SALEname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_SALEname.setText("Item Name :  ");
        jPanel_DrugManagement.add(lbl_SALEname);
        lbl_SALEname.setBounds(40, 170, 110, 30);

        lbl_SALEquantity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_SALEquantity.setText("Quantity     :  ");
        jPanel_DrugManagement.add(lbl_SALEquantity);
        lbl_SALEquantity.setBounds(40, 210, 110, 30);
        jPanel_DrugManagement.add(txt_amount);
        txt_amount.setBounds(800, 530, 180, 30);

        txt_totalAmount.setEditable(false);
        jPanel_DrugManagement.add(txt_totalAmount);
        txt_totalAmount.setBounds(800, 490, 180, 30);
        jPanel_DrugManagement.add(jSeparator1);
        jSeparator1.setBounds(0, 320, 1020, 10);
        jPanel_DrugManagement.add(jSeparator2);
        jSeparator2.setBounds(0, 120, 1020, 10);
        jPanel_DrugManagement.add(txt_SALEquantity);
        txt_SALEquantity.setBounds(130, 210, 140, 30);

        txt_SALEname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SALEnameActionPerformed(evt);
            }
        });
        jPanel_DrugManagement.add(txt_SALEname);
        txt_SALEname.setBounds(130, 170, 230, 30);

        btn_Add.setText("Add");
        btn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddActionPerformed(evt);
            }
        });
        jPanel_DrugManagement.add(btn_Add);
        btn_Add.setBounds(190, 280, 80, 30);

        btn_Purchase.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_Purchase.setText("Purchase");
        btn_Purchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PurchaseActionPerformed(evt);
            }
        });
        jPanel_DrugManagement.add(btn_Purchase);
        btn_Purchase.setBounds(800, 570, 180, 40);

        btn_SALEsearch.setText("Search");
        btn_SALEsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SALEsearchActionPerformed(evt);
            }
        });
        jPanel_DrugManagement.add(btn_SALEsearch);
        btn_SALEsearch.setBounds(280, 210, 80, 30);

        btn_Cancel.setText("Cancel");
        btn_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelActionPerformed(evt);
            }
        });
        jPanel_DrugManagement.add(btn_Cancel);
        btn_Cancel.setBounds(20, 500, 200, 40);

        btn_Clear.setText("Clear");
        btn_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ClearActionPerformed(evt);
            }
        });
        jPanel_DrugManagement.add(btn_Clear);
        btn_Clear.setBounds(280, 280, 80, 30);

        btn_Exit.setBackground(new java.awt.Color(153, 0, 0));
        btn_Exit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_Exit.setForeground(new java.awt.Color(255, 255, 255));
        btn_Exit.setText("Exit");
        btn_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExitActionPerformed(evt);
            }
        });
        jPanel_DrugManagement.add(btn_Exit);
        btn_Exit.setBounds(20, 560, 200, 50);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Select the Item"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setHeaderValue("Select the Item");
        }

        jPanel_DrugManagement.add(jScrollPane3);
        jScrollPane3.setBounds(380, 120, 130, 190);

        jTable_DrugManagement.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item ID", "Item Name", "Price", "Quantity", "Amount"
            }
        ));
        jScrollPane1.setViewportView(jTable_DrugManagement);

        jPanel_DrugManagement.add(jScrollPane1);
        jScrollPane1.setBounds(0, 320, 1020, 160);

        jPanel_Supplies.setBackground(new java.awt.Color(204, 204, 255));
        jPanel_Supplies.setLayout(null);

        lbl_Name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Name.setText("Item Name :  ");
        jPanel_Supplies.add(lbl_Name);
        lbl_Name.setBounds(30, 30, 110, 20);

        lbl_Quantity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Quantity.setText("Quantity:  ");
        jPanel_Supplies.add(lbl_Quantity);
        lbl_Quantity.setBounds(210, 30, 110, 20);
        jPanel_Supplies.add(txt_ItemQuantity);
        txt_ItemQuantity.setBounds(210, 50, 120, 30);
        jPanel_Supplies.add(txt_ItemName);
        txt_ItemName.setBounds(30, 50, 160, 30);

        btn_ItemsUpdate.setText("Update");
        btn_ItemsUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ItemsUpdateActionPerformed(evt);
            }
        });
        jPanel_Supplies.add(btn_ItemsUpdate);
        btn_ItemsUpdate.setBounds(370, 90, 120, 30);

        btn_ItemsNew.setText("New");
        btn_ItemsNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ItemsNewActionPerformed(evt);
            }
        });
        jPanel_Supplies.add(btn_ItemsNew);
        btn_ItemsNew.setBounds(370, 50, 120, 30);

        btn_AddItems.setBackground(new java.awt.Color(204, 204, 255));
        btn_AddItems.setText("Add");
        btn_AddItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddItemsActionPerformed(evt);
            }
        });
        jPanel_Supplies.add(btn_AddItems);
        btn_AddItems.setBounds(210, 90, 120, 30);

        lbl_BGsupplies.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/m7.jpg"))); // NOI18N
        jPanel_Supplies.add(lbl_BGsupplies);
        lbl_BGsupplies.setBounds(0, 0, 510, 200);

        jPanel_DrugManagement.add(jPanel_Supplies);
        jPanel_Supplies.setBounds(510, 120, 510, 200);

        lbl_BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/dms.jpg"))); // NOI18N
        lbl_BG.setMaximumSize(new java.awt.Dimension(1030, 700));
        lbl_BG.setMinimumSize(new java.awt.Dimension(1030, 700));
        lbl_BG.setPreferredSize(new java.awt.Dimension(1030, 700));
        jPanel_DrugManagement.add(lbl_BG);
        lbl_BG.setBounds(0, -160, 1040, 1080);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_DrugManagement, javax.swing.GroupLayout.DEFAULT_SIZE, 1021, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_DrugManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ItemsNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ItemsNewActionPerformed
        // TODO add your handling code here:
        isAdd=true;
        new addSupplies().setVisible(true);
    }//GEN-LAST:event_btn_ItemsNewActionPerformed

    private void btn_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_ExitActionPerformed

    private void btn_SALEsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SALEsearchActionPerformed
        // TODO add your handling code here:
        
                int row = -99;
                String str="";
              row = jTable1.getSelectedRow();

              if (row == -99) {

                  JOptionPane.showMessageDialog(null, "Please select an item");
                  
              
              } 
              else{
                  if(txt_SALEquantity.getText().equals("")){
                      JOptionPane.showMessageDialog(null, "Please enter the quantity");
                  }else{
              
              str=jTable1.getModel().getValueAt(row, 0).toString();
        
               drug=Search(str,Float.parseFloat(txt_SALEquantity.getText()));
                  }
              }
        
    }//GEN-LAST:event_btn_SALEsearchActionPerformed

    private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed
        // TODO add your handling code here:
        float q=Float.parseFloat(txt_SALEquantity.getText());
        float price=drug.getSprice();
        float amount=q*price;
        total+=amount;
        DefaultTableModel model = (DefaultTableModel) jTable_DrugManagement.getModel();

           

            
                model.addRow(new Object[]{drug.getId(), drug.getName(), drug.getSprice(),q,amount});
               
                jTable_DrugManagement.setModel(model);
        
        txt_SALEname.setText("");
        txt_SALEquantity.setText("");
        txt_totalAmount.setText("Rs."+total);
        
        
        
    }//GEN-LAST:event_btn_AddActionPerformed

    private void btn_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClearActionPerformed
        // TODO add your handling code here:
        txt_SALEname.setText("");
        txt_SALEquantity.setText("");
    }//GEN-LAST:event_btn_ClearActionPerformed

    private void btn_PurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PurchaseActionPerformed
        // TODO add your handling code here:
        float customer=Integer.parseInt(txt_amount.getText().toString());
        float finalA=customer-total;
        lbl_final.setText("Successfully purchased!! Balance : Rs."+finalA);
    }//GEN-LAST:event_btn_PurchaseActionPerformed

    private void btn_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelActionPerformed
        // TODO add your handling code here:
         txt_totalAmount.setText("Rs."+total);
    }//GEN-LAST:event_btn_CancelActionPerformed

    private void btn_AddItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddItemsActionPerformed
        // TODO add your handling code here:
        
         int row = -99;
         float quantity=0;
                String str="";
              row = jTable1.getSelectedRow();

              if (row == -99) {

                  JOptionPane.showMessageDialog(null, "Please select an item");
                  
              
              } 
              else{
                  if(txt_ItemQuantity.getText().equals("")){
                      JOptionPane.showMessageDialog(null, "Please enter the quantity");
                  }else{
              
              str=jTable1.getModel().getValueAt(row, 0).toString();
        
              
              
              try{
            java.sql.Connection con = ConnectionDB.Connect();
            
            String sql="SELECT * FROM `drugs` WHERE `dName`='" + str + "';";
            java.sql.Statement state = con.createStatement();
            
            ResultSet rs = state.executeQuery(sql);
            rs.next();
            
            quantity=rs.getFloat("dQuantity");
            quantity+=Float.parseFloat(txt_ItemQuantity.getText());
            
            
            String query="UPDATE `drugs` SET `dQuantity`="+quantity+" WHERE `dName`='"+str+"';";
        
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
              
              
              
              
               
              
                  }
              }
    }//GEN-LAST:event_btn_AddItemsActionPerformed

    private void btn_ItemsUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ItemsUpdateActionPerformed
        // TODO add your handling code here:
        isAdd=false;
        
         int row = jTable1.getSelectedRow();
         name=jTable1.getModel().getValueAt(row, 0).toString();
          new addSupplies().setVisible(true);
    }//GEN-LAST:event_btn_ItemsUpdateActionPerformed

    private void txt_SALEnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SALEnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SALEnameActionPerformed

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
            java.util.logging.Logger.getLogger(DrugManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DrugManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DrugManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DrugManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DrugManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Add;
    private javax.swing.JButton btn_AddItems;
    private javax.swing.JButton btn_Cancel;
    private javax.swing.JButton btn_Clear;
    private javax.swing.JButton btn_Exit;
    private javax.swing.JButton btn_ItemsNew;
    private javax.swing.JButton btn_ItemsUpdate;
    private javax.swing.JButton btn_Purchase;
    private javax.swing.JButton btn_SALEsearch;
    private javax.swing.JPanel jPanel_DrugManagement;
    private javax.swing.JPanel jPanel_Supplies;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable_DrugManagement;
    private javax.swing.JLabel lbl_BG;
    private javax.swing.JLabel lbl_BGsupplies;
    private javax.swing.JLabel lbl_Date;
    private javax.swing.JLabel lbl_Name;
    private javax.swing.JLabel lbl_Quantity;
    private javax.swing.JLabel lbl_Rno;
    private javax.swing.JLabel lbl_SALEname;
    private javax.swing.JLabel lbl_SALEquantity;
    private javax.swing.JLabel lbl_TotalAmount;
    private javax.swing.JLabel lbl_TotalAmount2;
    private javax.swing.JLabel lbl_available;
    private javax.swing.JLabel lbl_final;
    private javax.swing.JTextField txt_ItemName;
    private javax.swing.JTextField txt_ItemQuantity;
    private javax.swing.JTextField txt_SALEname;
    private javax.swing.JTextField txt_SALEquantity;
    private javax.swing.JTextField txt_amount;
    private javax.swing.JTextField txt_totalAmount;
    // End of variables declaration//GEN-END:variables
}
