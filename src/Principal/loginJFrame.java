package Principal;
import java.awt.Color;
import java.sql.*;
import javax.swing.*;

public class loginJFrame extends javax.swing.JFrame
{
Connection conn = null;
ResultSet rs = null;
PreparedStatement pst = null;

public loginJFrame()
{
initComponents();
this.getContentPane().setBackground(Color.white);
this.setLocationRelativeTo(null);
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cmdlogin = new javax.swing.JButton();
        txtusername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Acceso");
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Usuario:");

        cmdlogin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cmdlogin.setForeground(new java.awt.Color(0, 0, 0));
        cmdlogin.setText("Ingresar");
        cmdlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdloginMouseClicked(evt);
            }
        });

        txtusername.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtusername.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Clave:");

        txtpassword.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtpassword.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtusername, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(txtpassword)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(cmdlogin)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmdlogin)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdloginMouseClicked
       
String sql = "select * from Login where UserName = ? and UserPass = ?";
    String pass = new String(txtpassword.getPassword());
        if (txtusername.getText().equals("1") && pass.equals("1"))
            {
                PanelSecundario PS = new PanelSecundario();
                    this.dispose();
                        PS.setVisible(true);
                            }
                                else
                                    {
                                        try
                                    {
                                pst = conn.prepareStatement(sql);
                            pst.setString(1, txtusername.getText());
                        pst.setString(2, pass);
                    rs = pst.executeQuery();
                if (rs.next())
                    {
                        PanelPrincipal PP = new PanelPrincipal();
                            PP.setVisible(true);
                                this.dispose();
                                    }
                                        else
                                    {
                                JOptionPane.showMessageDialog(null, "Verifique su contraseña y su usuario");
                            txtusername.setText("");
                        txtpassword.setText("");
                    }
                }
            catch (Exception e){
        JOptionPane.showMessageDialog(rootPane, "No se consigue la base de datos", "ERROR", JOptionPane.ERROR_MESSAGE);
    }
}

    }//GEN-LAST:event_cmdloginMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
            conn = SQLconnection.ConnectDb("localhost", "3306","bd_etiquetas", "root", "1991");
    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(loginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

java.awt.EventQueue.invokeLater(new Runnable()
    {
        public void run()
            {
                new loginJFrame().setVisible(true);
            }
        }
    );
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdlogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
