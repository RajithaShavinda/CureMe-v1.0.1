/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;
import  Code.Controller;
/**
 *
 * @author Shavinda
 */
public class main extends javax.swing.JFrame {

    
    Controller cont;
    /**
     * Creates new form main
     */
    public main() {
        initComponents();
        setLocationRelativeTo(null);
        this.cont=Controller.getController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_main = new javax.swing.JPanel();
        btn_Branch = new javax.swing.JButton();
        btn_StockLevel = new javax.swing.JButton();
        btn_Drug = new javax.swing.JButton();
        btn_Exit = new javax.swing.JButton();
        btn_Supplier = new javax.swing.JButton();
        lbl_Background_Image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_main.setLayout(null);

        btn_Branch.setBackground(new java.awt.Color(204, 204, 255));
        btn_Branch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_Branch.setForeground(new java.awt.Color(0, 0, 51));
        btn_Branch.setText("Branch Management");
        btn_Branch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BranchActionPerformed(evt);
            }
        });
        jPanel_main.add(btn_Branch);
        btn_Branch.setBounds(0, 310, 200, 40);

        btn_StockLevel.setBackground(new java.awt.Color(204, 204, 255));
        btn_StockLevel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_StockLevel.setForeground(new java.awt.Color(0, 0, 51));
        btn_StockLevel.setText("Stock Level Management");
        btn_StockLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_StockLevelActionPerformed(evt);
            }
        });
        jPanel_main.add(btn_StockLevel);
        btn_StockLevel.setBounds(0, 390, 200, 40);

        btn_Drug.setBackground(new java.awt.Color(204, 204, 255));
        btn_Drug.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_Drug.setForeground(new java.awt.Color(0, 0, 51));
        btn_Drug.setText("Drug Management");
        btn_Drug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DrugActionPerformed(evt);
            }
        });
        jPanel_main.add(btn_Drug);
        btn_Drug.setBounds(0, 150, 200, 40);

        btn_Exit.setBackground(new java.awt.Color(153, 0, 0));
        btn_Exit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_Exit.setForeground(new java.awt.Color(255, 255, 255));
        btn_Exit.setText("Exit");
        jPanel_main.add(btn_Exit);
        btn_Exit.setBounds(0, 470, 200, 40);

        btn_Supplier.setBackground(new java.awt.Color(204, 204, 255));
        btn_Supplier.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_Supplier.setForeground(new java.awt.Color(0, 0, 51));
        btn_Supplier.setText("Supplier Management");
        btn_Supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SupplierActionPerformed(evt);
            }
        });
        jPanel_main.add(btn_Supplier);
        btn_Supplier.setBounds(0, 230, 200, 40);

        lbl_Background_Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/M2.jpg"))); // NOI18N
        lbl_Background_Image.setText("jLabel1");
        jPanel_main.add(lbl_Background_Image);
        lbl_Background_Image.setBounds(0, -10, 710, 540);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_main, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_main, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_DrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DrugActionPerformed
        // TODO add your handling code here:
        new DrugManagement().setVisible(true);
    }//GEN-LAST:event_btn_DrugActionPerformed

    private void btn_SupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SupplierActionPerformed
        // TODO add your handling code here:
        new SupplierManagement().setVisible(true);
    }//GEN-LAST:event_btn_SupplierActionPerformed

    private void btn_BranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BranchActionPerformed
        // TODO add your handling code here:
        new BranchM().setVisible(true);
    }//GEN-LAST:event_btn_BranchActionPerformed

    private void btn_StockLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_StockLevelActionPerformed
        // TODO add your handling code here:
        new StockLevel().setVisible(true);
    }//GEN-LAST:event_btn_StockLevelActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Branch;
    private javax.swing.JButton btn_Drug;
    private javax.swing.JButton btn_Exit;
    private javax.swing.JButton btn_StockLevel;
    private javax.swing.JButton btn_Supplier;
    private javax.swing.JPanel jPanel_main;
    private javax.swing.JLabel lbl_Background_Image;
    // End of variables declaration//GEN-END:variables
}
