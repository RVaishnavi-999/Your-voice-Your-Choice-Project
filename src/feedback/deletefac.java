/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feedback;


import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author Lenovo
 */
public class deletefac extends javax.swing.JFrame {
PreparedStatement pst;
Connection con;
ResultSet rs;

    /**
     * Creates new form deletefac
     */
    public deletefac() {
        initComponents();
        combobox();
    }

    public void combobox()
    {
        try
        {
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/student","vaishnavi","vaishu");
            String sql="select * from staff";
           pst=con.prepareStatement(sql);
          rs=pst.executeQuery();
          while(rs.next())
          {
              String add1=rs.getString("id_no");
              jComboBox1.addItem(add1); 
          }   
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null,e.toString());
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        f_name = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        experience = new javax.swing.JTextField();
        email_id = new javax.swing.JTextField();
        contact_no = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel1.setText("DELETE FACULTY");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 210, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 34, 630, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel3.setText("ID NUMBER");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 150, 20));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel4.setText("FIRST NAME");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 150, 20));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel5.setText("BRANCH");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 150, 20));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel6.setText("DEPARTMENT");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 150, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel7.setText("DESIGNATION");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 150, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel8.setText("EXPERIANCE");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 150, 20));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel9.setText("E-MAIL ID");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 150, 20));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel10.setText("CONTACT NUMBER");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 160, 20));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT ID" }));
        jComboBox1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox1PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 160, 30));
        jPanel1.add(f_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 220, 30));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 220, 30));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 220, 30));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 220, 30));
        jPanel1.add(experience, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 220, 30));
        jPanel1.add(email_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 220, 30));
        jPanel1.add(contact_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, 220, 30));

        back.setFont(new java.awt.Font("Tempus Sans ITC", 1, 15)); // NOI18N
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 500, 130, -1));

        clear.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 500, 120, 30));

        delete.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 120, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/feedback/b61f5ca67ca48af01b690db94a9b5413.jpgyellw.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        try
        {
            String url="jdbc:derby://localhost:1527/student";
             String user="vaishnavi";
             String pass="vaishu";
             con=(Connection)DriverManager.getConnection(url,user,pass);
             String query="delete from staff where id_no=?";
             pst = con.prepareStatement(query);
             pst.setString(1,jComboBox1.getSelectedItem().toString());
             pst.execute();
              JOptionPane.showMessageDialog(null,"Deleted successfully");
              
              int index=(int)jComboBox1.getSelectedIndex();
              jComboBox1.removeItemAt(index);
              
              jComboBox1.setSelectedItem("SELECT ID");
              f_name.setText("");
              jTextField2.setText("");
              jTextField3.setText("");
              jTextField4.setText("");
              email_id.setText("");
              contact_no.setText("");
              experience.setText("");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.toString()); 
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        f_name.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        experience.setText("");
        email_id.setText("");
        contact_no.setText("");
        jComboBox1.setSelectedItem("SELECT ID");
        
    }//GEN-LAST:event_clearActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
         new admin_choosetypes().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void jComboBox1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox1PopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        String tmp=(String)jComboBox1.getSelectedItem();
        String sql="select * from staff where id_no=?";
        try
        {
          pst=con.prepareStatement(sql);
          pst.setString(1,tmp);
          rs=pst.executeQuery();
          while(rs.next())
          {
              String add1=rs.getString("fname");
              f_name.setText(add1); 
              String add2=rs.getString("branch");
              jTextField2.setText(add2); 
              String add3=rs.getString("dept");
              jTextField3.setText(add3); 
              String add4=rs.getString("designation");
              jTextField4.setText(add4); 
              String add5=rs.getString("experience");
              experience.setText(add5); 
              String add6=rs.getString("mail");
              email_id.setText(add6); 
              String add7=rs.getString("contact_no");
              contact_no.setText(add7); 
             
          }
        }
          catch(Exception e)
                  {
                  JOptionPane.showMessageDialog(null,e.toString());    
                  }
    }//GEN-LAST:event_jComboBox1PopupMenuWillBecomeInvisible

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
            java.util.logging.Logger.getLogger(deletefac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deletefac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deletefac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deletefac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deletefac().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton clear;
    private javax.swing.JTextField contact_no;
    private javax.swing.JButton delete;
    private javax.swing.JTextField email_id;
    private javax.swing.JTextField experience;
    private javax.swing.JTextField f_name;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
