/*
MADE IN VENEZUELA
CREATE BY ING. VILLENA DANIEL.
484....
GENERADOR DE ETIQUETAS CON BASE DE DATOS LOCAL.
 */
package Principal;

import Imagenes.ImagenPP;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import java.awt.*;
import java.sql.*;
import net.sf.jasperreports.engine.*;
import java.util.*;


public class PanelPrincipal extends javax.swing.JFrame {
Connection conn = null;
ResultSet rs = null;
PreparedStatement pst = null;

    public PanelPrincipal() {
        initComponents();
        this.getContentPane().setBackground(Color.white);
        this.setLocationRelativeTo(null);
        ImagenPP imagenPP = new ImagenPP();
        this.add(imagenPP, BorderLayout.CENTER);
        this.pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Generador de Etiquetas");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Cantidad de etiquetas:");

        jRadioButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton1.setText("2");
        jRadioButton1.setNextFocusableComponent(jRadioButton2);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton2.setText("4");
        jRadioButton2.setNextFocusableComponent(jRadioButton3);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton3.setText("6");
        jRadioButton3.setNextFocusableComponent(jRadioButton4);
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton4.setText("8");
        jRadioButton4.setNextFocusableComponent(jRadioButton1);
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Codigo SAT:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Orden de fabricación:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Fecha de vencimiento:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Número de paleta:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Gestión de lote:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Descripción del producto:");

        jTextField1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setEnabled(false);
        jTextField1.setNextFocusableComponent(jTextField2);
        jTextField1.setOpaque(false);

        jTextField2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 0, 0));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setEnabled(false);
        jTextField2.setNextFocusableComponent(jTextField3);
        jTextField2.setOpaque(false);

        jTextField3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(0, 0, 0));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setEnabled(false);
        jTextField3.setNextFocusableComponent(jTextField4);
        jTextField3.setOpaque(false);

        jTextField4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(0, 0, 0));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setEnabled(false);
        jTextField4.setNextFocusableComponent(jTextField5);
        jTextField4.setOpaque(false);

        jTextField5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(0, 0, 0));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setEnabled(false);
        jTextField5.setNextFocusableComponent(jTextArea1);
        jTextField5.setOpaque(false);

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Aceptar");
        jButton1.setEnabled(false);
        jButton1.setNextFocusableComponent(jButton2);
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Imprimir");
        jButton2.setEnabled(false);
        jButton2.setNextFocusableComponent(jButton1);
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(3);
        jTextArea1.setTabSize(0);
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setAutoscrolls(false);
        jTextArea1.setNextFocusableComponent(jTextField1);
        jTextArea1.setOpaque(false);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Está es la etiqueta No. 1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                    .addComponent(jTextField4)
                                    .addComponent(jTextField3)
                                    .addComponent(jTextField2)
                                    .addComponent(jTextField1)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(0, 199, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton4)
                        .addGap(39, 39, 39))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(20, 20, 20))
        );

        getAccessibleContext().setAccessibleName("GE_Panel");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private final String logotipo="/Imagenes/DEMO.gif";
    
    public int j = 0; //Inicializo el numero de las tablas
    public int x = 0; //Inicializo para saber que tabla usar
    public int i = 0;
    private int k = 1;
        
    //Coordinacion de tablas
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        k = k + 1;
        String sql = "update etiquetas"+j+"_"+x+" set Codigo_SAT = ?, Orden_Fabricacion = ?, Fecha_Vencimiento = ?, Numero_Paleta = ?, Gestion_Lote = ?, Descripcion_Producto = ?  where ID = ? ";
    try{
        pst = conn.prepareStatement(sql);
        pst.setString(1, jTextField1.getText());
        pst.setString(2, jTextField2.getText());
        pst.setString(3, jTextField3.getText());
        pst.setString(4, jTextField4.getText());
        pst.setString(5, jTextField5.getText());
        pst.setString(6, jTextArea1.getText());
        pst.setString(7, "1");
        pst.executeUpdate();
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextArea1.setText("");
        i = i + 1;
        x = x + 1;
        switch (k) {
            case 2:{
                jLabel8.setText("Está es la etiqueta No. " + k);
                break;}            
            case 3:{
                if (j == 2){
                k = k - 1;}
                jLabel8.setText("Está es la etiqueta No. " + k);
                break;}
            case 4:{
                jLabel8.setText("Está es la etiqueta No. " + k);
                break;} 
            case 5:{
                if (j == 4){
                k = k - 1;}
                jLabel8.setText("Está es la etiqueta No. " + k);
                break;}
            case 6:{
                jLabel8.setText("Está es la etiqueta No. " + k);
                break;} 
            case 7:{
                if (j == 6){
                k = k - 1;}
                jLabel8.setText("Está es la etiqueta No. " + k);    
                break;}
            case 8:{
                jLabel8.setText("Está es la etiqueta No. " + k);
                break;}
            case 9:{
                if (j == 8){
                k = k - 1;}
                jLabel8.setText("Está es la etiqueta No. " + k);    
                break;}
            default:{
                break;}
                }
        switch (i) {
            case 3: {
                i = 0;
                x = 0;
                jTextField1.setEnabled(false);
                jTextField2.setEnabled(false);
                jTextField3.setEnabled(false);
                jTextField4.setEnabled(false);
                jTextField5.setEnabled(false);
                jTextArea1.setEnabled(false);
                jButton1.setEnabled(false);
                jButton2.setEnabled(true);
                break;}
            case 7: {
                i = i + 0;
                x = x + 0;
                jTextField1.setEnabled(false);
                jTextField2.setEnabled(false);
                jTextField3.setEnabled(false);
                jTextField4.setEnabled(false);
                jTextField5.setEnabled(false);
                jTextArea1.setEnabled(false);
                jButton1.setEnabled(false);
                jButton2.setEnabled(true);
                    break;}
            case 13: {
                i = i + 0;
                x = x + 0;
                jTextField1.setEnabled(false);
                jTextField2.setEnabled(false);
                jTextField3.setEnabled(false);
                jTextField4.setEnabled(false);
                jTextField5.setEnabled(false);
                jTextArea1.setEnabled(false);
                jButton1.setEnabled(false);
                jButton2.setEnabled(true);
                    break;}
            case 21: {
                i = i + 0;
                x = x + 0;
                jTextField1.setEnabled(false);
                jTextField2.setEnabled(false);
                jTextField3.setEnabled(false);
                jTextField4.setEnabled(false);
                jTextField5.setEnabled(false);
                jTextArea1.setEnabled(false);
                jButton1.setEnabled(false);
                jButton2.setEnabled(true);
                    break;}
                    default: {break;}
}
    }
    catch (Exception e){
            JOptionPane.showMessageDialog(rootPane, "No se puede integrar datos a la base", "ERROR", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    //Coordinacion de seleccion de formato
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
                j = 2;
                x = 1;
                i = 1;
                k = 1;
                jLabel8.setText("Está es la etiqueta No. " + k);
                
                jRadioButton2.setSelected(false);
                jRadioButton3.setSelected(false);
                jRadioButton4.setSelected(false);
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                jTextField5.setText("");
                jTextArea1.setText("");
                jTextField1.setEnabled(true);
                jTextField2.setEnabled(true);
                jTextField3.setEnabled(true);
                jTextField4.setEnabled(true);
                jTextField5.setEnabled(true);
                jTextArea1.setEnabled(true);
                jButton1.setEnabled(true);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
                j = 4;
                x = 1;
                i = 3;
                k = 1;
                jLabel8.setText("Está es la etiqueta No. " + k);
                
                jRadioButton1.setSelected(false);
                jRadioButton3.setSelected(false);
                jRadioButton4.setSelected(false);
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                jTextField5.setText("");
                jTextArea1.setText("");                
                jTextField1.setEnabled(true);
                jTextField2.setEnabled(true);
                jTextField3.setEnabled(true);
                jTextField4.setEnabled(true);
                jTextField5.setEnabled(true);
                jTextArea1.setEnabled(true);
                jButton1.setEnabled(true);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
                j = 6;
                x = 1;
                i = 7;
                k = 1;
                jLabel8.setText("Está es la etiqueta No. " + k);
                
                jRadioButton1.setSelected(false);
                jRadioButton2.setSelected(false);
                jRadioButton4.setSelected(false);
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                jTextField5.setText("");
                jTextArea1.setText("");                
                jTextField1.setEnabled(true);
                jTextField2.setEnabled(true);
                jTextField3.setEnabled(true);
                jTextField4.setEnabled(true);
                jTextField5.setEnabled(true);
                jTextArea1.setEnabled(true);
                jButton1.setEnabled(true);
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
                j = 8;
                x = 1;
                i = 13;
                k = 1;
                jLabel8.setText("Está es la etiqueta No. " + k);
                
                jRadioButton1.setSelected(false);
                jRadioButton2.setSelected(false);
                jRadioButton3.setSelected(false);
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                jTextField5.setText("");
                jTextArea1.setText("");                
                jTextField1.setEnabled(true);
                jTextField2.setEnabled(true);
                jTextField3.setEnabled(true);
                jTextField4.setEnabled(true);
                jTextField5.setEnabled(true);
                jTextArea1.setEnabled(true);
                jButton1.setEnabled(true);
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
    try {
        JasperReport jr = (JasperReport) JRLoader.loadObject(this.getClass().getResource("/Reportes/Reporte"+j+".jasper"));
                
        Map param1 = new HashMap();
        param1.clear();
            for (int k = 1; k < 9; k++) {
            param1.put("logo"+k, this.getClass().getResourceAsStream(logotipo));
            }
                
        JasperPrint jp = JasperFillManager.fillReport(jr, param1, conn);
        JasperViewer jv = new JasperViewer(jp,false);
        jv.setTitle("GENERANDO "+j+" ETIQUETAS");
        jv.show(); 
        jButton2.setEnabled(false);
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
        jRadioButton4.setSelected(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Imposible visualizar las etiquetas", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conn = SQLconnection.ConnectDb("localhost", "3306","bd_etiquetas", "root", "1991");
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
loginJFrame lJF = new loginJFrame();
lJF.setVisible(true);
    }//GEN-LAST:event_formWindowClosing
   
    /* INICIALIZO EL SOFTWARE */
    public static void main(String args[]) {
        /* SET THE NIMBUS LOOK AND FEEL */

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
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

/* INICIALIZO LA PANTALLA */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelPrincipal().setVisible(true);
            }});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables

}