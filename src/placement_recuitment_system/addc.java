/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package placement_recuitment_system;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author nymisha
 */
public class addc extends javax.swing.JFrame {
 private static final String USERNAME= "root";
    private static final String PASSWORD= "";
    private static final String  CSTRING= "jdbc:mysql://localhost:3306/placement_recruitment_system";

    /**
     * Creates new form addc
     */
    public addc() {
        initComponents();
        setSize(650,400);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NO
     * T modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\nymisha\\Desktop\\bk.PNG")); // NOI18N
        jLabel12.setText("jLabel12");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(141, 56, 0, 0);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Student_Usn");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 60, 84, 16);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Student_Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 90, 84, 16);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Phone_no");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 150, 76, 16);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(57, 186, 0, 0);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(210, 50, 320, 22);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(210, 80, 320, 22);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(210, 110, 320, 22);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(210, 140, 320, 22);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gender");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 180, 41, 16);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(210, 170, 320, 22);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(310, 330, 60, 20);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("email_ID");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 120, 50, 16);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("10 & 12 Percentage");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(60, 210, 113, 16);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Address");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(60, 240, 46, 16);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("College Name");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(60, 270, 100, 16);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(210, 200, 320, 22);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(210, 230, 320, 22);
        getContentPane().add(jTextField8);
        jTextField8.setBounds(210, 260, 320, 22);

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("ADD STUDENT DETAILS");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(180, 10, 208, 22);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Select File");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(210, 300, 110, 25);
        getContentPane().add(jTextField9);
        jTextField9.setBounds(330, 300, 210, 22);

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Resume");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(60, 310, 80, 16);

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\nymisha\\Desktop\\bk.PNG")); // NOI18N
        jLabel15.setText("jLabel15");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(0, -70, 720, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         Connection con  ;
         ResultSet rss;
         try {
            
   con = DriverManager.getConnection(CSTRING,USERNAME,PASSWORD);
    System.out.println("connected");
    
       Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
       String s[]=new String[8];
       int a[]=new int[3];
       
           s[0]=jTextField1.getText();
           s[1]=jTextField2.getText();
           s[2]=jTextField3.getText();
           s[3]=jTextField4.getText();
           s[4]=jTextField5.getText();
           s[5]=jTextField6.getText();
           s[6]=jTextField7.getText();
           s[7]=jTextField8.getText();
           
           
           String q="insert into stude_details values('"+s[0]+"','"+s[1]+"','"+s[2]+"',"+s[3]+",'"+s[4]+"',"+s[5]+",'"+s[6]+"','"+s[7]+"')";
           stmt.executeUpdate(q);
           JOptionPane.showMessageDialog(null,"successfully added!!!");
         }catch(SQLException e){
         }
         setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
JFileChooser chooser= new JFileChooser();
chooser.showOpenDialog(null);
File f=chooser.getSelectedFile();
String filename =f.getAbsolutePath();
jTextField9.setText(filename);// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(addc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}