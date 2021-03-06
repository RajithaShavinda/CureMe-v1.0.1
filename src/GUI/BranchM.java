/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

/**
 *
 * @author Shavinda
 */
public class BranchM extends javax.swing.JFrame {

    /**
     * Creates new form SupplyManagement
     */
    public BranchM() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Branch = new javax.swing.JPanel();
        lbl_Branch = new javax.swing.JLabel();
        lbl_Password = new javax.swing.JLabel();
        psd_Password = new javax.swing.JPasswordField();
        cbo_Branch = new javax.swing.JComboBox();
        btn_Submit = new javax.swing.JButton();
        btn_Information = new javax.swing.JButton();
        btn_Sales = new javax.swing.JButton();
        btn_Supplies = new javax.swing.JButton();
        btn_Exit = new javax.swing.JButton();
        btn_Stock = new javax.swing.JButton();
        lbl_Exit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_Branch.setLayout(null);

        lbl_Branch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Branch.setText("Branch     :  ");
        jPanel_Branch.add(lbl_Branch);
        lbl_Branch.setBounds(30, 200, 110, 30);

        lbl_Password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Password.setText("Password  :  ");
        jPanel_Branch.add(lbl_Password);
        lbl_Password.setBounds(30, 250, 110, 30);

        psd_Password.setText("asasasas");
        jPanel_Branch.add(psd_Password);
        psd_Password.setBounds(120, 250, 220, 30);

        cbo_Branch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Branch 1", "Item 2", "Item 3", "Item 4" }));
        jPanel_Branch.add(cbo_Branch);
        cbo_Branch.setBounds(120, 200, 220, 30);

        btn_Submit.setBackground(new java.awt.Color(204, 204, 255));
        btn_Submit.setText("Submit");
        jPanel_Branch.add(btn_Submit);
        btn_Submit.setBounds(120, 290, 220, 30);

        btn_Information.setBackground(new java.awt.Color(204, 204, 255));
        btn_Information.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_Information.setForeground(new java.awt.Color(0, 0, 51));
        btn_Information.setText("Information");
        btn_Information.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InformationActionPerformed(evt);
            }
        });
        jPanel_Branch.add(btn_Information);
        btn_Information.setBounds(470, 130, 190, 40);

        btn_Sales.setBackground(new java.awt.Color(204, 204, 255));
        btn_Sales.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_Sales.setForeground(new java.awt.Color(0, 0, 51));
        btn_Sales.setText("Sales");
        jPanel_Branch.add(btn_Sales);
        btn_Sales.setBounds(470, 210, 190, 40);

        btn_Supplies.setBackground(new java.awt.Color(204, 204, 255));
        btn_Supplies.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_Supplies.setForeground(new java.awt.Color(0, 0, 51));
        btn_Supplies.setText("Supplies");
        btn_Supplies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SuppliesActionPerformed(evt);
            }
        });
        jPanel_Branch.add(btn_Supplies);
        btn_Supplies.setBounds(470, 290, 190, 40);

        btn_Exit.setBackground(new java.awt.Color(153, 0, 0));
        btn_Exit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_Exit.setForeground(new java.awt.Color(255, 255, 255));
        btn_Exit.setText("Exit");
        btn_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExitActionPerformed(evt);
            }
        });
        jPanel_Branch.add(btn_Exit);
        btn_Exit.setBounds(20, 470, 190, 40);

        btn_Stock.setBackground(new java.awt.Color(204, 204, 255));
        btn_Stock.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_Stock.setForeground(new java.awt.Color(0, 0, 51));
        btn_Stock.setText("Stock Level");
        jPanel_Branch.add(btn_Stock);
        btn_Stock.setBounds(470, 370, 190, 40);

        lbl_Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/M8.jpg"))); // NOI18N
        jPanel_Branch.add(lbl_Exit);
        lbl_Exit.setBounds(-6, -6, 710, 530);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_Branch, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_Branch, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SuppliesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SuppliesActionPerformed
        // TODO add your handling code here:
        new ShowBranch().setVisible(true);
    }//GEN-LAST:event_btn_SuppliesActionPerformed

    private void btn_InformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InformationActionPerformed
        // TODO add your handling code here:
        new BInformation().setVisible(true);
    }//GEN-LAST:event_btn_InformationActionPerformed

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
            java.util.logging.Logger.getLogger(BranchM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BranchM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BranchM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BranchM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BranchM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Exit;
    private javax.swing.JButton btn_Information;
    private javax.swing.JButton btn_Sales;
    private javax.swing.JButton btn_Stock;
    private javax.swing.JButton btn_Submit;
    private javax.swing.JButton btn_Supplies;
    private javax.swing.JComboBox cbo_Branch;
    private javax.swing.JPanel jPanel_Branch;
    private javax.swing.JLabel lbl_Branch;
    private javax.swing.JLabel lbl_Exit;
    private javax.swing.JLabel lbl_Password;
    private javax.swing.JPasswordField psd_Password;
    // End of variables declaration//GEN-END:variables
}
