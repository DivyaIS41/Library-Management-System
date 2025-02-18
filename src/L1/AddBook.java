/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package L1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author divya
 */
public class AddBook extends javax.swing.JFrame {

    /**
     * Creates new form AddBook
     */
    public AddBook() {
        initComponents();
    }
    
    public void clear(){
        txtid.setText("");
        txtname.setText("");
        txtprice.setText("");
        txtpublisher.setText("");
        txtyear.setText("");
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnexit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtprice = new javax.swing.JTextField();
        txtyear = new javax.swing.JTextField();
        txtpublisher = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close icon.png"))); // NOI18N
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        getContentPane().add(btnexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(797, 0, 43, 45));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 51));
        jLabel1.setText("BOOK ID:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 240, 97, 26));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 51));
        jLabel2.setText("PUBLISHER:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 436, 97, 24));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 51));
        jLabel3.setText("BOOK TITLE:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 333, 97, 24));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 51));
        jLabel4.setText("PRICE:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 517, 97, 24));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 51));
        jLabel5.setText("YEAR OF PUBLISH:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 614, -1, 24));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 51));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/isue.jpg"))); // NOI18N
        jLabel6.setText("ADD BOOK DETAILS");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 51, 315, -1));

        txtname.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 292, 39));

        txtid.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 292, 39));

        txtprice.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        getContentPane().add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 510, 292, 39));

        txtyear.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        getContentPane().add(txtyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 600, 292, 39));

        txtpublisher.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        getContentPane().add(txtpublisher, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 292, 39));

        btnsave.setBackground(new java.awt.Color(204, 255, 204));
        btnsave.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnsave.setForeground(new java.awt.Color(102, 0, 51));
        btnsave.setText("SAVE");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 722, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/library_pastel_aesthetic.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 840));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
 dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnexitActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
PreparedStatement pst;
        Connection c=Connect.ConnectToDB();
        if(txtid.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "All Fields are Mandatory!");
                txtid.requestFocus();
        }
        else if(txtname.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "All Fields are Mandatory!");
                txtname.requestFocus();
        }
        else if(txtpublisher.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "All Fields are Mandatory!");
                txtpublisher.requestFocus();
        }
        else if(txtprice.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "All Fields are Mandatory!");
                txtprice.requestFocus();
        }
        else if(txtyear.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "All Fields are Mandatory!");
                txtyear.requestFocus();
        }
        else{
        try {
            pst=c.prepareStatement("insert into library.book(id,name,publisher,price,year,status)values(?,?,?,?,?,?)");
            pst.setString(1, txtid.getText());
            pst.setString(2, txtname.getText());
            pst.setString(3, txtpublisher.getText());
            pst.setString(4, txtprice.getText());
            pst.setString(5, txtyear.getText());
            pst.setString(6, "Not-Issued");
            pst.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "Record Saved","Saved",JOptionPane.INFORMATION_MESSAGE);
            clear();
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } 
            }        // TODO add your handling code here:
    }//GEN-LAST:event_btnsaveActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

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
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnsave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtpublisher;
    private javax.swing.JTextField txtyear;
    // End of variables declaration//GEN-END:variables
}
