/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package placement_recuitment_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;

/**
 *
 * @author nymisha
 */
public class viewalldetails extends javax.swing.JFrame {
    private static final String USERNAME= "root";
    private static final String PASSWORD= "";
    private static final String  CSTRING= "jdbc:mysql://localhost:3306/placement_recruitment_system";


    /**
     * Creates new form viewalldetails
     */
    public viewalldetails() {
        initComponents();
         setSize(650,400);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("View Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(240, 170, 103, 25);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\nymisha\\Desktop\\bk.PNG")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 640, 350);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
Connection con;
        ResultSet rss,rss1,rss2;
    try {
        con = DriverManager.getConnection(CSTRING,USERNAME,PASSWORD);
    
    System.out.println("connected");
    
    Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
  
    
      String s1="select * from stude_details "; 
  
      
      rss1=stmt.executeQuery(s1);
    
     
   
      rss1.first();
      System.out.println("usn\t\tname\temail\tphone_number\tGender\t10&12percentage\tAddress\tCollege_name");
      while(rss1.next())
      {
      System.out.print(rss1.getString(1)+"\t");
      System.out.print(rss1.getString(2)+"\t");
      System.out.print(rss1.getString(3)+"\t");
      System.out.print(rss1.getInt(4)+"\t\t");
      System.out.print(rss1.getString(5)+"\t\t");
      System.out.print(rss1.getInt(6)+"\t");
      System.out.print(rss1.getString(7)+"\t");
      System.out.print(rss1.getString(8)+"\t\n");
      
      
      }
      
     
     
   
         
      
  
    
    
         }catch(SQLException e){
         System.err.println(e);}
                           
                     setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(viewalldetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewalldetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewalldetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewalldetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewalldetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
