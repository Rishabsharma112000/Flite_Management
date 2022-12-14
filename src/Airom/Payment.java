/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Airom;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Rishabh sharma
 */
public class Payment extends javax.swing.JFrame {

    private UserDetails details;
      int ticketNo =  ConnectionHelper.getTickeNo();
    /**
     * Creates new form Payment
     */
    public Payment(UserDetails details) {
        initComponents();
        this.details = details;
      
    }

  public Payment()
  {
        initComponents();
         pnlupi.setVisible(false);
       pnlvisa.setVisible(false);
  }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlupi = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtupi = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtbnkacunt = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtremark = new javax.swing.JTextArea();
        btnpayupi = new javax.swing.JButton();
        lblflitechargeupi = new javax.swing.JLabel();
        pnlvisa = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtholdrname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtcrdno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtcvv = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnpayvisa = new javax.swing.JButton();
        lblflitechargevisa = new javax.swing.JLabel();
        btnhome = new javax.swing.JButton();
        btnprv = new javax.swing.JButton();
        btnupi = new javax.swing.JButton();
        btnvisa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblrequired4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Payment");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlupi.setBackground(new java.awt.Color(204, 204, 255));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("UPI ID");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Bank Account");

        txtbnkacunt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SBI Bank", "Canara Bank", "ICiCI Bank", "Bank of India", "Axis Bank" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Remark");

        txtremark.setColumns(20);
        txtremark.setRows(5);
        jScrollPane1.setViewportView(txtremark);

        btnpayupi.setBackground(new java.awt.Color(0, 255, 0));
        btnpayupi.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnpayupi.setForeground(new java.awt.Color(255, 255, 255));
        btnpayupi.setText("Pay Now");
        btnpayupi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpayupiActionPerformed(evt);
            }
        });

        lblflitechargeupi.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblflitechargeupi.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout pnlupiLayout = new javax.swing.GroupLayout(pnlupi);
        pnlupi.setLayout(pnlupiLayout);
        pnlupiLayout.setHorizontalGroup(
            pnlupiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlupiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlupiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlupiLayout.createSequentialGroup()
                        .addComponent(btnpayupi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(pnlupiLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlupiLayout.createSequentialGroup()
                        .addGroup(pnlupiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                            .addComponent(txtbnkacunt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(24, 24, 24))
                    .addGroup(pnlupiLayout.createSequentialGroup()
                        .addGroup(pnlupiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlupiLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtupi, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(pnlupiLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(lblflitechargeupi, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlupiLayout.setVerticalGroup(
            pnlupiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlupiLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblflitechargeupi, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(pnlupiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtupi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtbnkacunt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnpayupi, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        getContentPane().add(pnlupi, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 370, 480));

        pnlvisa.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Card Holder Name ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Card No");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("CVV");

        txtcvv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcvvActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 8)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("Last 3 Digit");

        btnpayvisa.setBackground(new java.awt.Color(51, 255, 51));
        btnpayvisa.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnpayvisa.setForeground(new java.awt.Color(255, 255, 255));
        btnpayvisa.setText("Pay Now");
        btnpayvisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpayvisaActionPerformed(evt);
            }
        });

        lblflitechargevisa.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblflitechargevisa.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout pnlvisaLayout = new javax.swing.GroupLayout(pnlvisa);
        pnlvisa.setLayout(pnlvisaLayout);
        pnlvisaLayout.setHorizontalGroup(
            pnlvisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlvisaLayout.createSequentialGroup()
                .addGroup(pnlvisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlvisaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlvisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(pnlvisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnpayvisa, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtholdrname, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcrdno, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlvisaLayout.createSequentialGroup()
                                .addComponent(txtcvv, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlvisaLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(lblflitechargevisa, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnlvisaLayout.setVerticalGroup(
            pnlvisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlvisaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblflitechargevisa, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtholdrname, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcrdno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlvisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcvv, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(btnpayvisa)
                .addGap(33, 33, 33))
        );

        getContentPane().add(pnlvisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 370, 470));

        btnhome.setBackground(new java.awt.Color(0, 0, 0));
        btnhome.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnhome.setForeground(new java.awt.Color(255, 255, 255));
        btnhome.setText("Home");
        btnhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 70, -1));

        btnprv.setBackground(new java.awt.Color(51, 51, 51));
        btnprv.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnprv.setForeground(new java.awt.Color(255, 255, 255));
        btnprv.setText("<<");
        btnprv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprvActionPerformed(evt);
            }
        });
        getContentPane().add(btnprv, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, -1));

        btnupi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/upii.jpg"))); // NOI18N
        btnupi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnupiMouseClicked(evt);
            }
        });
        btnupi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupiActionPerformed(evt);
            }
        });
        getContentPane().add(btnupi, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 140, 80));

        btnvisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vm.jpg"))); // NOI18N
        btnvisa.setText("jButton1");
        btnvisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnvisaMouseClicked(evt);
            }
        });
        btnvisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvisaActionPerformed(evt);
            }
        });
        getContentPane().add(btnvisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 210, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/db.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 0, 860, 650));

        lblrequired4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblrequired4.setForeground(new java.awt.Color(255, 0, 0));
        lblrequired4.setText("*");
        getContentPane().add(lblrequired4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(790, 686));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnvisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvisaActionPerformed



        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnvisaActionPerformed

    private void btnprvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprvActionPerformed
new Personalinfo().setVisible(true);
this.dispose();
    }//GEN-LAST:event_btnprvActionPerformed

    private void btnhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhomeActionPerformed
new Home().setVisible(true);
this.dispose();
    }//GEN-LAST:event_btnhomeActionPerformed

    private void btnupiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupiActionPerformed
        
    }//GEN-LAST:event_btnupiActionPerformed

    private void btnvisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnvisaMouseClicked

    pnlvisa.setVisible(true);
    pnlupi.setVisible(false);
    

    }//GEN-LAST:event_btnvisaMouseClicked

    private void btnupiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnupiMouseClicked

    pnlupi.setVisible(true);
    pnlvisa.setVisible(false);

    }//GEN-LAST:event_btnupiMouseClicked

    private void btnpayvisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpayvisaActionPerformed
         String Hname = txtholdrname.getText();
            long Cardno = Long.parseLong(txtcrdno.getText());
            int cvv = Integer.parseInt(txtcvv.getText());
          
         JOptionPane.showMessageDialog(this, "Your Flites is Booked" + " Your Flite No is " + ticketNo);

          
            
        
       

    }//GEN-LAST:event_btnpayvisaActionPerformed

    private void txtcvvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcvvActionPerformed
        
    }//GEN-LAST:event_txtcvvActionPerformed

    private void btnpayupiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpayupiActionPerformed
       String Upi = txtupi.getText();
            String Bank = txtbnkacunt.getSelectedItem().toString();
            String remark = txtremark.getText();
        JOptionPane.showMessageDialog(this, "Your Flites is Booked" + " Your Flite No is " + ticketNo);

            
                    
                   



    }//GEN-LAST:event_btnpayupiActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
//        try{
//            Connection con = ConnectionHelper.getCon();
//            Statement st = con.createStatement();
//            st.executeQuery("select Economy from searchfiltes where Flite_name")
//        }
//    System.out.println(details.Fliteno+"\n"+details.email) ;
    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnhome;
    private javax.swing.JButton btnpayupi;
    private javax.swing.JButton btnpayvisa;
    private javax.swing.JButton btnprv;
    private javax.swing.JButton btnupi;
    private javax.swing.JButton btnvisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblflitechargeupi;
    private javax.swing.JLabel lblflitechargevisa;
    private javax.swing.JLabel lblrequired4;
    private javax.swing.JPanel pnlupi;
    private javax.swing.JPanel pnlvisa;
    private javax.swing.JComboBox<String> txtbnkacunt;
    private javax.swing.JTextField txtcrdno;
    private javax.swing.JTextField txtcvv;
    private javax.swing.JTextField txtholdrname;
    private javax.swing.JTextArea txtremark;
    private javax.swing.JTextField txtupi;
    // End of variables declaration//GEN-END:variables
}
